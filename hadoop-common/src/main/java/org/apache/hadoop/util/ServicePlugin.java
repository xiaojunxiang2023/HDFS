package org.apache.hadoop.util;

import java.io.Closeable;

/**
 * Service plug-in interface.
 *
 * Service plug-ins may be used to expose functionality of datanodes or
 * namenodes using arbitrary RPC protocols. Plug-ins are instantiated by the
 * service instance, and are notified of service life-cycle events using the
 * methods defined by this class.
 *
 * Service plug-ins are started after the service instance is started, and
 * stopped before the service instance is stopped.
 */
public interface ServicePlugin extends Closeable {

  /**
   * This method is invoked when the service instance has been started.
   *
   * @param service The service instance invoking this method
   */
  void start(Object service);

  /**
   * This method is invoked when the service instance is about to be shut down.
   */
  void stop();
}
