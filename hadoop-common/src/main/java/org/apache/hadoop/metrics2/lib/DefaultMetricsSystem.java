package org.apache.hadoop.metrics2.lib;

import org.apache.hadoop.metrics2.MetricsException;
import org.apache.hadoop.metrics2.MetricsSystem;
import org.apache.hadoop.metrics2.impl.MetricsSystemImpl;

import javax.management.ObjectName;
import java.util.concurrent.atomic.AtomicReference;

/**
 * The default metrics system singleton. This class is used by all the daemon
 * processes(such as NameNode, DataNode, JobTracker etc.). During daemon process
 * initialization the processes call {@link DefaultMetricsSystem#init(String)}
 * to initialize the {@link MetricsSystem}.
 */
public enum DefaultMetricsSystem {
  INSTANCE; // the singleton

  private AtomicReference<MetricsSystem> impl =
      new AtomicReference<MetricsSystem>(new MetricsSystemImpl());


  volatile boolean miniClusterMode = false;

  transient final UniqueNames mBeanNames = new UniqueNames();
  transient final UniqueNames sourceNames = new UniqueNames();

  /**
   * Convenience method to initialize the metrics system
   * @param prefix  for the metrics system configuration
   * @return the metrics system instance
   */
  public static MetricsSystem initialize(String prefix) {
    return INSTANCE.init(prefix);
  }

  MetricsSystem init(String prefix) {
    return impl.get().init(prefix);
  }

  /**
   * @return the metrics system object
   */
  public static MetricsSystem instance() {
    return INSTANCE.getImpl();
  }

  /**
   * Shutdown the metrics system
   */
  public static void shutdown() {
    INSTANCE.shutdownInstance();
  }

  void shutdownInstance() {
    boolean last = impl.get().shutdown();
    if (last) synchronized (this) {
      mBeanNames.map.clear();
      sourceNames.map.clear();
    }
  }

  public static MetricsSystem setInstance(MetricsSystem ms) {
    return INSTANCE.setImpl(ms);
  }

  MetricsSystem setImpl(MetricsSystem ms) {
    return impl.getAndSet(ms);
  }

  MetricsSystem getImpl() {
    return impl.get();
  }


  public static void setMiniClusterMode(boolean choice) {
    INSTANCE.miniClusterMode = choice;
  }


  public static boolean inMiniClusterMode() {
    return INSTANCE.miniClusterMode;
  }

  public static ObjectName newMBeanName(String name) {
    return INSTANCE.newObjectName(name);
  }

  public static void removeMBeanName(ObjectName name) {
    INSTANCE.removeObjectName(name.toString());
  }

  public static void removeSourceName(String name) {
    INSTANCE.removeSource(name);
  }

  public static String sourceName(String name, boolean dupOK) {
    return INSTANCE.newSourceName(name, dupOK);
  }

  synchronized ObjectName newObjectName(String name) {
    try {
      if (mBeanNames.map.containsKey(name) && !miniClusterMode) {
        throw new MetricsException(name + " already exists!");
      }
      return new ObjectName(mBeanNames.uniqueName(name));
    } catch (Exception e) {
      throw new MetricsException(e);
    }
  }

  synchronized void removeObjectName(String name) {
    mBeanNames.map.remove(name);
  }

  synchronized void removeSource(String name) {
    sourceNames.map.remove(name);
  }

  synchronized String newSourceName(String name, boolean dupOK) {
    if (sourceNames.map.containsKey(name)) {
      if (dupOK) {
        return name;
      } else if (!miniClusterMode) {
        throw new MetricsException("Metrics source " + name + " already exists!");
      }
    }
    return sourceNames.uniqueName(name);
  }
}
