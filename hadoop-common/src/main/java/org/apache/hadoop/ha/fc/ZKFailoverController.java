package org.apache.hadoop.ha.fc;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.security.PrivilegedExceptionAction;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

import org.apache.hadoop.ha.*;
import org.apache.hadoop.ha.micro.BadFencingConfigurationException;
import org.apache.hadoop.ha.micro.ServiceFailedException;
import org.apache.hadoop.ha.status.HAServiceProtocol;
import org.apache.hadoop.ha.status.HAServiceStatus;
import org.apache.hadoop.ha.status.HAServiceTarget;
import org.apache.hadoop.util.micro.HadoopIllegalArgumentException;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.UnsupportedFileSystemException;
import org.apache.hadoop.ha.ActiveStandbyElector.ActiveNotFoundException;
import org.apache.hadoop.ha.ActiveStandbyElector.ActiveStandbyElectorCallback;
import org.apache.hadoop.ha.status.HAServiceProtocol.HAServiceState;
import org.apache.hadoop.ha.status.HAServiceProtocol.StateChangeRequestInfo;
import org.apache.hadoop.ha.status.HAServiceProtocol.RequestSource;
import org.apache.hadoop.security.ProviderUtils;
import org.apache.hadoop.util.ZKUtil;
import org.apache.hadoop.util.ZKUtil.ZKAuthInfo;
import org.apache.hadoop.ha.HealthMonitor.State;
import org.apache.hadoop.ipc.Server;
import org.apache.hadoop.security.SecurityUtil;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.security.authorize.PolicyProvider;
import org.apache.hadoop.util.StringUtils;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs.Ids;
import org.apache.zookeeper.data.ACL;

import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.thirdparty.com.google.common.util.concurrent.ThreadFactoryBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 启动时，如果发现父节点不存在，则报错退出 
 *
 * 格式化ZK，如果重新格式化的化，可以交互式选择，也可通过参数：force、interactive     
 * 
 */

/*
   异常状态码:
     格式化出错-2
     父节点不存在报错-3
     没有配置Fencing=4
     禁用了自动 failover=5
 */
  
public abstract class ZKFailoverController {

  static final Logger LOG = LoggerFactory.getLogger(ZKFailoverController.class);
  
  public static final String ZK_QUORUM_KEY = "ha.zookeeper.quorum";
  
  private static final String ZK_SESSION_TIMEOUT_KEY = "ha.zookeeper.session-timeout.ms";
  private static final int ZK_SESSION_TIMEOUT_DEFAULT = 10*1000;
  
  private static final String ZK_PARENT_ZNODE_KEY = "ha.zookeeper.parent-znode";
  static final String ZK_PARENT_ZNODE_DEFAULT = "/hadoop-ha";
  
  public static final String ZK_ACL_KEY = "ha.zookeeper.acl";
  private static final String ZK_ACL_DEFAULT = "world:anyone:rwcda";
  public static final String ZK_AUTH_KEY = "ha.zookeeper.auth";

  protected static final String[] ZKFC_CONF_KEYS = new String[] {
    ZK_QUORUM_KEY,
    ZK_SESSION_TIMEOUT_KEY,
    ZK_PARENT_ZNODE_KEY,
    ZK_ACL_KEY,
    ZK_AUTH_KEY
  };
  
  protected static final String USAGE =
      "Usage: hdfs zkfc [ -formatZK [-force] [-nonInteractive] ]\n"
      + "\t-force: formats the znode if the znode exists.\n"
      + "\t-nonInteractive: formats the znode aborts if the znode exists,\n"
      + "\tunless -force option is specified.";


  // 不能连接 ZooKeeper
  static final int ERR_CODE_NO_ZK = 6;
  
  protected Configuration conf;
  private String zkQuorum;

  
  // ActiveStandbyElector抢锁
  private ActiveStandbyElector elector;
  protected ZKFCRpcServer rpcServer;
  private HealthMonitor healthMonitor;
  
  protected final HAServiceTarget localTarget;
  private volatile HAServiceState serviceState = HAServiceState.INITIALIZING;
  private State lastHealthState = State.INITIALIZING;

  private String fatalError = null;

  // ZKFC在此时间内不会进行选举
  private long delayJoiningUntilNanotime = 0;

  private final ScheduledExecutorService delayExecutor =
    Executors.newScheduledThreadPool(1,
        new ThreadFactoryBuilder().setDaemon(true)
            .setNameFormat("ZKFC Delay timer #%d")
            .build());

  private ActiveAttemptRecord lastActiveAttemptRecord;
  private final Object activeAttemptRecordLock = new Object();

  protected ZKFailoverController(Configuration conf, HAServiceTarget localTarget) {
    this.localTarget = localTarget;
    this.conf = conf;
  }
  
  protected abstract byte[] targetToData(HAServiceTarget target);
  protected abstract HAServiceTarget dataToTarget(byte[] data);
  
  protected abstract void loginAsFCUser() throws IOException;
  
  public abstract void checkRpcAdminAccess() throws IOException;
  
  protected abstract InetSocketAddress getRpcAddressToBindTo();
  protected abstract PolicyProvider getPolicyProvider();
  protected abstract List<HAServiceTarget> getAllOtherNodes();

  protected abstract String getScopeInsideParentNode();

  @VisibleForTesting
  public HAServiceState getServiceState() {
    return serviceState;
  }

  public int run(final String[] args) throws Exception {
    loginAsFCUser();
    return SecurityUtil.doAsLoginUserOrFatal(() -> {
      try {
        return doRun(args);
      } catch (Exception e) {
        e.printStackTrace();
      }
      return null;
    });
  }

  // 真正执行的方法
  private int doRun(String[] args)
      throws Exception {
      
    // 初始化ZK
    initZK();

    if (args.length > 0 && "-formatZK".equals(args[0])) {
      // 格式化ZK，创建父节点
      elector.ensureParentZNode();
      return 0;
    }

    initRPC();
    initHM();
    startRPC();
    
    // 循环判断是否具有 fatalError
    mainLoop();

    // Exit...
    rpcServer.stopAndJoin();
    elector.quitElection(true);
    healthMonitor.shutdown();
    healthMonitor.join();
    return 0;
  }

  private void initHM() {
    healthMonitor = new HealthMonitor(conf, localTarget);
    healthMonitor.addCallback(new HealthCallbacks());
    healthMonitor.addServiceStateCallback(new ServiceStateCallBacks());
    healthMonitor.start();
  }

  protected void initRPC() throws IOException {
    InetSocketAddress bindAddr = getRpcAddressToBindTo();
    LOG.info("ZKFC RpcServer binding to {}", bindAddr);
    rpcServer = new ZKFCRpcServer(conf, bindAddr, this, getPolicyProvider());
  }

  protected void startRPC() {
    rpcServer.start();
  }


  private void initZK() throws HadoopIllegalArgumentException, IOException,
      KeeperException {
    zkQuorum = conf.get(ZK_QUORUM_KEY);
    int zkTimeout = conf.getInt(ZK_SESSION_TIMEOUT_KEY,
        ZK_SESSION_TIMEOUT_DEFAULT);
    // Parse ACLs from configuration.
    String zkAclConf = conf.get(ZK_ACL_KEY, ZK_ACL_DEFAULT);
    zkAclConf = ZKUtil.resolveConfIndirection(zkAclConf);
    List<ACL> zkAcls = ZKUtil.parseACLs(zkAclConf);
    if (zkAcls.isEmpty()) {
      zkAcls = Ids.CREATOR_ALL_ACL;
    }
    
    Configuration c = conf;
    try {
      c = ProviderUtils.excludeIncompatibleCredentialProviders(
          conf, FileSystem.getFileSystemClass("hdfs", conf));
    } catch (UnsupportedFileSystemException e) {
      LOG.debug("No filesystem found for the hdfs scheme", e);
    }
    List<ZKAuthInfo> zkAuths = SecurityUtil.getZKAuthInfos(c, ZK_AUTH_KEY);

    // Sanity check configuration.
    Preconditions.checkArgument(zkQuorum != null,
        "Missing required configuration '%s' for ZooKeeper quorum",
        ZK_QUORUM_KEY);
    Preconditions.checkArgument(zkTimeout > 0,
        "Invalid ZK session timeout %s", zkTimeout);
    
    int maxRetryNum = conf.getInt(
        CommonConfigurationKeys.HA_FC_ELECTOR_ZK_OP_RETRIES_KEY,
        CommonConfigurationKeys.HA_FC_ELECTOR_ZK_OP_RETRIES_DEFAULT);
    elector = new ActiveStandbyElector(zkQuorum,
        zkTimeout, getParentZnode(), zkAcls, zkAuths,
        new ElectorCallbacks(), maxRetryNum);
  }
  
  private String getParentZnode() {
    String znode = conf.get(ZK_PARENT_ZNODE_KEY,
        ZK_PARENT_ZNODE_DEFAULT);
    if (!znode.endsWith("/")) {
      znode += "/";
    }
    return znode + getScopeInsideParentNode();
  }

  private synchronized void mainLoop() throws InterruptedException {
    while (fatalError == null) {
      wait();
    }
    throw new RuntimeException("ZK Failover Controller failed: " + fatalError);
  }
  
  private synchronized void fatalError(String err) {
    LOG.error("Fatal error occurred:" + err);
    fatalError = err;
    notifyAll();
  }
  
  private synchronized void becomeActive() throws ServiceFailedException {
    LOG.info("Trying to make " + localTarget + " active...");
    try {
      HAServiceProtocol svc = localTarget.getProxy(
              conf, FailoverController.getRpcTimeoutToNewActive(conf));
      svc.transitionToActive(createReqInfo());
      String msg = "Successfully transitioned " + localTarget +
          " to active state";
      LOG.info(msg);
      serviceState = HAServiceState.ACTIVE;
      recordActiveAttempt(new ActiveAttemptRecord(true, msg));

    } catch (Throwable t) {
      String msg = "Couldn't make " + localTarget + " active";
      LOG.error(msg, t);
      
      recordActiveAttempt(new ActiveAttemptRecord(false, msg + "\n" +
          StringUtils.stringifyException(t)));

      if (t instanceof ServiceFailedException) {
        throw (ServiceFailedException)t;
      } else {
        throw new ServiceFailedException("Couldn't transition to active",
            t);
      }
/*
* TODO:
* we need to make sure that if we get fenced and then quickly restarted,
* none of these calls will retry across the restart boundary
* perhaps the solution is that, whenever the nn starts, it gets a unique
* ID, and when we start becoming active, we record it, and then any future
* calls use the same ID
*/
      
    }
  }

  /**
   * Store the results of the last attempt to become active.
   * This is used so that, during manually initiated failover,
   * we can report back the results of the attempt to become active
   * to the initiator of the failover.
   */
  private void recordActiveAttempt(
      ActiveAttemptRecord record) {
    synchronized (activeAttemptRecordLock) {
      lastActiveAttemptRecord = record;
      activeAttemptRecordLock.notifyAll();
    }
  }

  /**
   * Wait until one of the following events:
   * <ul>
   * <li>Another thread publishes the results of an attempt to become active
   * using {@link #recordActiveAttempt(ActiveAttemptRecord)}</li>
   * <li>The node enters bad health status</li>
   * <li>The specified timeout elapses</li>
   * </ul>
   * 
   * @param timeoutMillis number of millis to wait
   * @param onlyAfterNanoTime accept attempt records only after a given
   * timestamp. Use this parameter to ignore the old attempt records from a
   * previous fail-over attempt.
   * @return the published record, or null if the timeout elapses or the
   * service becomes unhealthy 
   * @throws InterruptedException if the thread is interrupted.
   */
  private ActiveAttemptRecord waitForActiveAttempt(int timeoutMillis,
      long onlyAfterNanoTime) throws InterruptedException {
    long waitUntil = onlyAfterNanoTime + TimeUnit.NANOSECONDS.convert(
        timeoutMillis, TimeUnit.MILLISECONDS);
    
    do {
      // periodically check health state, because entering an
      // unhealthy state could prevent us from ever attempting to
      // become active. We can detect this and respond to the user
      // immediately.
      synchronized (this) {
        if (lastHealthState != State.SERVICE_HEALTHY) {
          // early out if service became unhealthy
          return null;
        }
      }

      synchronized (activeAttemptRecordLock) {
        if ((lastActiveAttemptRecord != null &&
            lastActiveAttemptRecord.nanoTime >= onlyAfterNanoTime)) {
          return lastActiveAttemptRecord;
        }
        // Only wait 1sec so that we periodically recheck the health state
        // above.
        activeAttemptRecordLock.wait(1000);
      }
    } while (System.nanoTime() < waitUntil);
    
    // Timeout elapsed.
    LOG.warn(timeoutMillis + "ms timeout elapsed waiting for an attempt " +
        "to become active");
    return null;
  }

  private StateChangeRequestInfo createReqInfo() {
    return new StateChangeRequestInfo(RequestSource.REQUEST_BY_ZKFC);
  }

  private synchronized void becomeStandby() {
    LOG.info("ZK Election indicated that " + localTarget +
        " should become standby");
    try {
      int timeout = FailoverController.getGracefulFenceTimeout(conf);
      localTarget.getProxy(conf, timeout).transitionToStandby(createReqInfo());
      LOG.info("Successfully transitioned " + localTarget +
          " to standby state");
    } catch (Exception e) {
      LOG.error("Couldn't transition " + localTarget + " to standby state",
          e);
      // TODO handle this. It's a likely case since we probably got fenced
      // at the same time.
    }
    serviceState = HAServiceState.STANDBY;
  }
  

  private synchronized void fenceOldActive(byte[] data) throws IOException {
    HAServiceTarget target = dataToTarget(data);
    
    try {
      doFence(target);
    } catch (Throwable t) {
      recordActiveAttempt(new ActiveAttemptRecord(false, "Unable to fence old active: " + StringUtils.stringifyException(t)));
      throw t;
    }
  }
  
  private void doFence(HAServiceTarget target) throws IOException {
    LOG.info("Should fence: " + target);
    boolean gracefulWorked = new FailoverController(conf,
        RequestSource.REQUEST_BY_ZKFC).tryGracefulFence(target);
    if (gracefulWorked) {
      // It's possible that it's in standby but just about to go into active,
      // no? Is there some race here?
      LOG.info("Successfully transitioned " + target + " to standby " +
          "state without fencing");
      return;
    }
    
    try {
      target.checkFencingConfigured();
    } catch (BadFencingConfigurationException e) {
      LOG.error("Couldn't fence old active " + target, e);
      recordActiveAttempt(new ActiveAttemptRecord(false, "Unable to fence old active"));
      throw new RuntimeException(e);
    }
    
    if (!target.getFencer().fence(target)) {
      throw new RuntimeException("Unable to fence " + target);
    }
  }


  /**
   * Request from graceful failover to cede active role. Causes
   * this ZKFC to transition its local node to standby, then quit
   * the election for the specified period of time, after which it
   * will rejoin iff it is healthy.
   */
  public void cedeActive(final int millisToCede) throws IOException {
    try {
      UserGroupInformation.getLoginUser().doAs(new PrivilegedExceptionAction<Void>() {
        @Override
        public Void run() throws Exception {
          doCedeActive(millisToCede);
          return null;
        }
      });
    } catch (InterruptedException e) {
      throw new IOException(e);
    }
  }
  
  private void doCedeActive(int millisToCede) throws IOException {
    int timeout = FailoverController.getGracefulFenceTimeout(conf);

    // Lock elector to maintain lock ordering of elector -> ZKFC
    synchronized (elector) {
      synchronized (this) {
        if (millisToCede <= 0) {
          delayJoiningUntilNanotime = 0;
          recheckElectability();
          return;
        }
  
        LOG.info("Requested by " + UserGroupInformation.getCurrentUser() +
            " at " + Server.getRemoteAddress() + " to cede active role.");
        boolean needFence = false;
        try {
          localTarget.getProxy(conf, timeout).transitionToStandby(createReqInfo());
          LOG.info("Successfully ensured local node is in standby mode");
        } catch (IOException ioe) {
          LOG.warn("Unable to transition local node to standby: " +
              ioe.getLocalizedMessage());
          LOG.warn("Quitting election but indicating that fencing is " +
              "necessary");
          needFence = true;
        }
        delayJoiningUntilNanotime = System.nanoTime() +
            TimeUnit.MILLISECONDS.toNanos(millisToCede);
        elector.quitElection(needFence);
        serviceState = HAServiceState.INITIALIZING;
      }
    }
    recheckElectability();
  }
  
  /**
   * Coordinate a graceful failover to this node.
   * @throws ServiceFailedException if the node fails to become active
   * @throws IOException some other error occurs
   */
  public void gracefulFailoverToYou() throws ServiceFailedException, IOException {
    try {
      UserGroupInformation.getLoginUser().doAs(new PrivilegedExceptionAction<Void>() {
        @Override
        public Void run() throws Exception {
          doGracefulFailover();
          return null;
        }
        
      });
    } catch (InterruptedException e) {
      throw new IOException(e);
    }
  }

  /**
   * Coordinate a graceful failover. This proceeds in several phases:
   * 1) Pre-flight checks: ensure that the local node is healthy, and
   * thus a candidate for failover.
   * 2a) Determine the current active node. If it is the local node, no
   * need to failover - return success.
   * 2b) Get the other nodes
   * 3a) Ask the other nodes to yield from election for a number of seconds
   * 3b) Ask the active node to yield from the election for a number of seconds.
   * 4) Allow the normal election path to run in other threads. Wait until
   * we either become unhealthy or we see an election attempt recorded by
   * the normal code path.
   * 5) Allow the old active to rejoin the election, so a future
   * failback is possible.
   */
  private void doGracefulFailover()
      throws ServiceFailedException, IOException, InterruptedException {
    int timeout = FailoverController.getGracefulFenceTimeout(conf) * 2;
    
    // Phase 1: pre-flight checks
    checkEligibleForFailover();
    
    // Phase 2: determine old/current active node. Check that we're not
    // ourselves active, etc.
    HAServiceTarget oldActive = getCurrentActive();
    if (oldActive == null) {
      // No node is currently active. So, if we aren't already
      // active ourselves by means of a normal election, then there's
      // probably something preventing us from becoming active.
      throw new ServiceFailedException(
          "No other node is currently active.");
    }
    
    if (oldActive.getAddress().equals(localTarget.getAddress())) {
      LOG.info("Local node " + localTarget + " is already active. " +
          "No need to failover. Returning success.");
      return;
    }

    // Phase 2b: get the other nodes
    List<HAServiceTarget> otherNodes = getAllOtherNodes();
    List<ZKFCProtocol> otherZkfcs = new ArrayList<ZKFCProtocol>(otherNodes.size());

    // Phase 3: ask the other nodes to yield from the election.
    long st = System.nanoTime();
    HAServiceTarget activeNode = null;
    for (HAServiceTarget remote : otherNodes) {
      // same location, same node - may not always be == equality
      if (remote.getAddress().equals(oldActive.getAddress())) {
        activeNode = remote;
        continue;
      }
      otherZkfcs.add(cedeRemoteActive(remote, timeout));
    }

    assert
      activeNode != null : "Active node does not match any known remote node";

    // Phase 3b: ask the old active to yield
    otherZkfcs.add(cedeRemoteActive(activeNode, timeout));

    // Phase 4: wait for the normal election to make the local node
    // active.
    ActiveAttemptRecord attempt = waitForActiveAttempt(timeout + 60000, st);
    
    if (attempt == null) {
      // We didn't even make an attempt to become active.
      synchronized(this) {
        if (lastHealthState != State.SERVICE_HEALTHY) {
          throw new ServiceFailedException("Unable to become active. " +
            "Service became unhealthy while trying to failover.");          
        }
      }
      
      throw new ServiceFailedException("Unable to become active. " +
          "Local node did not get an opportunity to do so from ZooKeeper, " +
          "or the local node took too long to transition to active.");
    }

    // Phase 5. At this point, we made some attempt to become active. So we
    // can tell the old active to rejoin if it wants. This allows a quick
    // fail-back if we immediately crash.
    for (ZKFCProtocol zkfc : otherZkfcs) {
      zkfc.cedeActive(-1);
    }

    if (attempt.succeeded) {
      LOG.info("Successfully became active. " + attempt.status);
    } else {
      // Propagate failure
      String msg = "Failed to become active. " + attempt.status;
      throw new ServiceFailedException(msg);
    }
  }

  /**
   * Ask the remote zkfc to cede its active status and wait for the specified
   * timeout before attempting to claim leader status.
   * @param remote node to ask
   * @param timeout amount of time to cede
   * @return the {@link ZKFCProtocol} used to talk to the ndoe
   * @throws IOException
   */
  private ZKFCProtocol cedeRemoteActive(HAServiceTarget remote, int timeout)
    throws IOException {
    LOG.info("Asking " + remote + " to cede its active state for "
               + timeout + "ms");
    ZKFCProtocol oldZkfc = remote.getZKFCProxy(conf, timeout);
    oldZkfc.cedeActive(timeout);
    return oldZkfc;
  }

  /**
   * If the local node is an observer or is unhealthy it
   * is not eligible for graceful failover.
   * @throws ServiceFailedException if the node is an observer or unhealthy
   */
  private synchronized void checkEligibleForFailover()
      throws ServiceFailedException {
    // Check health
    if (this.getLastHealthState() != State.SERVICE_HEALTHY) {
      throw new ServiceFailedException(
          localTarget + " is not currently healthy. " +
          "Cannot be failover target");
    }
    if (serviceState == HAServiceState.OBSERVER) {
      throw new ServiceFailedException(
          localTarget + " is in observer state. " +
          "Cannot be failover target");
    }
  }

  /**
   * @return an {@link HAServiceTarget} for the current active node
   * in the cluster, or null if no node is active.
   * @throws IOException if a ZK-related issue occurs
   * @throws InterruptedException if thread is interrupted 
   */
  private HAServiceTarget getCurrentActive()
      throws IOException, InterruptedException {
    synchronized (elector) {
      synchronized (this) {
        byte[] activeData;
        try {
          activeData = elector.getActiveData();
        } catch (ActiveNotFoundException e) {
          return null;
        } catch (KeeperException ke) {
          throw new IOException(
              "Unexpected ZooKeeper issue fetching active node info", ke);
        }
        
        HAServiceTarget oldActive = dataToTarget(activeData);
        return oldActive;
      }
    }
  }

  /**
   * Check the current state of the service, and join the election
   * if it should be in the election.
   */
  private void recheckElectability() {
    // Maintain lock ordering of elector -> ZKFC
    synchronized (elector) {
      synchronized (this) {
        boolean healthy = lastHealthState == State.SERVICE_HEALTHY;
    
        long remainingDelay = delayJoiningUntilNanotime - System.nanoTime(); 
        if (remainingDelay > 0) {
          if (healthy) {
            LOG.info("Would have joined master election, but this node is " +
                "prohibited from doing so for " +
                TimeUnit.NANOSECONDS.toMillis(remainingDelay) + " more ms");
          }
          scheduleRecheck(remainingDelay);
          return;
        }
    
        switch (lastHealthState) {
        case SERVICE_HEALTHY:
          if(serviceState != HAServiceState.OBSERVER) {
            elector.joinElection(targetToData(localTarget));
          }
          if (quitElectionOnBadState) {
            quitElectionOnBadState = false;
          }
          break;
          
        case INITIALIZING:
          LOG.info("Ensuring that " + localTarget + " does not " +
              "participate in active master election");
          elector.quitElection(false);
          serviceState = HAServiceState.INITIALIZING;
          break;
    
        case SERVICE_UNHEALTHY:
        case SERVICE_NOT_RESPONDING:
          LOG.info("Quitting master election for " + localTarget +
              " and marking that fencing is necessary");
          elector.quitElection(true);
          serviceState = HAServiceState.INITIALIZING;
          break;
          
        case HEALTH_MONITOR_FAILED:
          fatalError("Health monitor failed!");
          break;
          
        default:
          throw new IllegalArgumentException("Unhandled state:"
                                               + lastHealthState);
        }
      }
    }
  }
  
  /**
   * Schedule a call to {@link #recheckElectability()} in the future.
   */
  private void scheduleRecheck(long whenNanos) {
    delayExecutor.schedule(
            () -> {
              try {
                recheckElectability();
              } catch (Throwable t) {
                fatalError("Failed to recheck electability: " +
                    StringUtils.stringifyException(t));
              }
            },
        whenNanos, TimeUnit.NANOSECONDS);
  }

  int serviceStateMismatchCount = 0;
  boolean quitElectionOnBadState = false;

  void verifyChangedServiceState(HAServiceState changedState) {
    synchronized (elector) {
      synchronized (this) {
        if (serviceState == HAServiceState.INITIALIZING) {
          if (quitElectionOnBadState) {
            LOG.debug("rechecking for electability from bad state");
            recheckElectability();
          }
          return;
        }
        if (changedState == HAServiceState.OBSERVER) {
          elector.quitElection(true);
          serviceState = HAServiceState.OBSERVER;
          return;
        }
        if (changedState == serviceState) {
          serviceStateMismatchCount = 0;
          return;
        }
        if (serviceStateMismatchCount == 0) {
          // recheck one more time. As this might be due to parallel transition.
          serviceStateMismatchCount++;
          return;
        }
        // quit the election as the expected state and reported state
        // mismatches.
        LOG.error("Local service " + localTarget
            + " has changed the serviceState to " + changedState
            + ". Expected was " + serviceState
            + ". Quitting election marking fencing necessary.");
        delayJoiningUntilNanotime = System.nanoTime()
            + TimeUnit.MILLISECONDS.toNanos(1000);
        elector.quitElection(true);
        quitElectionOnBadState = true;
        serviceStateMismatchCount = 0;
        serviceState = HAServiceState.INITIALIZING;
      }
    }
  }

  /**
   * @return the last health state passed to the FC
   * by the HealthMonitor.
   */
  protected synchronized State getLastHealthState() {
    return lastHealthState;
  }

  protected synchronized void setLastHealthState(HealthMonitor.State newState) {
    LOG.info("Local service " + localTarget +
        " entered state: " + newState);
    lastHealthState = newState;
  }

  /**
   * Callbacks from elector
   */
  class ElectorCallbacks implements ActiveStandbyElectorCallback {
    @Override
    public void becomeActive() throws ServiceFailedException {
      ZKFailoverController.this.becomeActive();
    }

    @Override
    public void becomeStandby() {
      ZKFailoverController.this.becomeStandby();
    }

    @Override
    public void enterNeutralMode() {
    }

    @Override
    public void notifyFatalError(String errorMessage) {
      fatalError(errorMessage);
    }

    @Override
    public void fenceOldActive(byte[] data) throws IOException {
      ZKFailoverController.this.fenceOldActive(data);
    }
    
    @Override
    public String toString() {
      synchronized (ZKFailoverController.this) {
        return "Elector callbacks for " + localTarget;
      }
    }
  }
  
  class HealthCallbacks implements HealthMonitor.Callback {
    @Override
    public void enteredState(HealthMonitor.State newState) {
      setLastHealthState(newState);
      recheckElectability();
    }
  }

  class ServiceStateCallBacks implements HealthMonitor.ServiceStateCallback {
    @Override
    public void reportServiceStatus(HAServiceStatus status) {
      verifyChangedServiceState(status.getState());
    }
  }

  private static class ActiveAttemptRecord {
    private final boolean succeeded;
    private final String status;
    private final long nanoTime;
    
    public ActiveAttemptRecord(boolean succeeded, String status) {
      this.succeeded = succeeded;
      this.status = status;
      this.nanoTime = System.nanoTime();
    }
  }

}