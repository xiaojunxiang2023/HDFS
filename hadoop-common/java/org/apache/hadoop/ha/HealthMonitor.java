package org.apache.hadoop.ha;

import java.io.IOException;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import org.apache.hadoop.conf.Configuration;
import static org.apache.hadoop.fs.CommonConfigurationKeys.*;

import org.apache.hadoop.ha.HAServiceProtocol.HAServiceState;
import org.apache.hadoop.ha.micro.HealthCheckFailedException;
import org.apache.hadoop.ipc.RemoteException;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.util.Daemon;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HealthMonitor {
  private static final Logger LOG = LoggerFactory.getLogger(
      HealthMonitor.class);

  private final Daemon daemon;
  private final long connectRetryInterval;
  private final long checkIntervalMillis;
  private final long sleepAfterDisconnectMillis;

  private final int rpcConnectRetries;
  private final int rpcTimeout;

  private volatile boolean shouldRun = true;

  private HAServiceProtocol proxy;

  private final HAServiceTarget targetToMonitor;

  private final Configuration conf;
  
  private State state = State.INITIALIZING;

  /**
   * Listeners for state changes
   */
  private final List<Callback> callbacks = Collections.synchronizedList(
          new LinkedList<>());

  private final List<ServiceStateCallback> serviceStateCallbacks = Collections
      .synchronizedList(new LinkedList<>());

  public enum State {
    INITIALIZING,
    SERVICE_NOT_RESPONDING,
    SERVICE_HEALTHY,
    SERVICE_UNHEALTHY,
    HEALTH_MONITOR_FAILED;
  }


  HealthMonitor(Configuration conf, HAServiceTarget target) {
    this.targetToMonitor = target;
    this.conf = conf;
    
    this.sleepAfterDisconnectMillis = conf.getLong(
        HA_HM_SLEEP_AFTER_DISCONNECT_KEY,
        HA_HM_SLEEP_AFTER_DISCONNECT_DEFAULT);
    this.checkIntervalMillis = conf.getLong(
        HA_HM_CHECK_INTERVAL_KEY,
        HA_HM_CHECK_INTERVAL_DEFAULT);
    this.connectRetryInterval = conf.getLong(
        HA_HM_CONNECT_RETRY_INTERVAL_KEY,
        HA_HM_CONNECT_RETRY_INTERVAL_DEFAULT);
    this.rpcConnectRetries = conf.getInt(HA_HM_RPC_CONNECT_MAX_RETRIES_KEY,
        HA_HM_RPC_CONNECT_MAX_RETRIES_DEFAULT);
    this.rpcTimeout = conf.getInt(
        HA_HM_RPC_TIMEOUT_KEY,
        HA_HM_RPC_TIMEOUT_DEFAULT);
    
    this.daemon = new MonitorDaemon();
  }
  
  public void addCallback(Callback cb) {
    this.callbacks.add(cb);
  }

  public synchronized void addServiceStateCallback(ServiceStateCallback cb) {
    this.serviceStateCallbacks.add(cb);
  }

  public void shutdown() {
    LOG.info("Stopping HealthMonitor thread");
    shouldRun = false;
    daemon.interrupt();
  }

  public synchronized HAServiceProtocol getProxy() {
    return proxy;
  }
  
  private void loopUntilConnected() throws InterruptedException {
    tryConnect();
    while (proxy == null) {
      Thread.sleep(connectRetryInterval);
      tryConnect();
    }
  }

  private void tryConnect() {
    Preconditions.checkState(proxy == null);
    
    try {
      synchronized (this) {
        proxy = createProxy();
      }
    } catch (IOException e) {
      LOG.warn("Could not connect to local service at " + targetToMonitor +
          ": " + e.getMessage());
      proxy = null;
      enterState(State.SERVICE_NOT_RESPONDING);
    }
  }
  
  protected HAServiceProtocol createProxy() throws IOException {
    return targetToMonitor.getHealthMonitorProxy(conf, rpcTimeout, rpcConnectRetries);
  }

  private void doHealthChecks() throws InterruptedException {
    while (shouldRun) {
      HAServiceStatus status = null;
      boolean healthy = false;
      try {
        status = proxy.getServiceStatus();
        proxy.monitorHealth();
        healthy = true;
      } catch (Throwable t) {
        if (isHealthCheckFailedException(t)) {
          LOG.warn("Service health check failed for {}", targetToMonitor, t);
          enterState(State.SERVICE_UNHEALTHY);
        } else {
          LOG.warn("Transport-level exception trying to monitor health of {}",
              targetToMonitor, t);
          RPC.stopProxy(proxy);
          proxy = null;
          enterState(State.SERVICE_NOT_RESPONDING);
          Thread.sleep(sleepAfterDisconnectMillis);
          return;
        }
      }
      
      if (status != null) {
        setLastServiceStatus(status);
      }
      if (healthy) {
        enterState(State.SERVICE_HEALTHY);
      }

      Thread.sleep(checkIntervalMillis);
    }
  }

  private boolean isHealthCheckFailedException(Throwable t) {
    return ((t instanceof HealthCheckFailedException) ||
        (t instanceof RemoteException &&
        ((RemoteException)t).unwrapRemoteException(
            HealthCheckFailedException.class) instanceof
            HealthCheckFailedException));
  }

  private synchronized void setLastServiceStatus(HAServiceStatus status) {
    for (ServiceStateCallback cb : serviceStateCallbacks) {
      cb.reportServiceStatus(status);
    }
  }

  private synchronized void enterState(State newState) {
    if (newState != state) {
      LOG.info("Entering state {}", newState);
      state = newState;
      synchronized (callbacks) {
        for (Callback cb : callbacks) {
          cb.enteredState(newState);
        }
      }
    }
  }

  void join() throws InterruptedException {
    daemon.join();
  }

  void start() {
    daemon.start();
  }

  private class MonitorDaemon extends Daemon {
    private MonitorDaemon() {
      super();
      setName("Health Monitor for " + targetToMonitor);
      setUncaughtExceptionHandler(new UncaughtExceptionHandler() {
        @Override
        public void uncaughtException(Thread t, Throwable e) {
          LOG.error("Health monitor failed", e);
          enterState(HealthMonitor.State.HEALTH_MONITOR_FAILED);
        }
      });
    }
    
    @Override
    public void run() {
      while (shouldRun) {
        try { 
          loopUntilConnected();
          doHealthChecks();
        } catch (InterruptedException ie) {
          Preconditions.checkState(!shouldRun,
              "Interrupted but still supposed to run");
        }
      }
    }
  }
  
  /**
   * Callback interface for state change events.
   * 
   * This interface is called from a single thread which also performs
   * the health monitoring. If the callback processing takes a long time,
   * no further health checks will be made during this period, nor will
   * other registered callbacks be called.
   * 
   * If the callback itself throws an unchecked exception, no other
   * callbacks following it will be called, and the health monitor
   * will terminate, entering HEALTH_MONITOR_FAILED state.
   */
  interface Callback {
    void enteredState(State newState);
  }

  /**
   * Callback interface for service states.
   */
  interface ServiceStateCallback {
    void reportServiceStatus(HAServiceStatus status);
  }
}
