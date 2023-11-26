package org.apache.hadoop.ipc;

import java.io.IOException;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.io.retry.Idempotent;
import org.apache.hadoop.security.KerberosInfo;

/**
 * Protocol which is used to refresh the call queue in use currently.
 */
@KerberosInfo(
    serverPrincipal=CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_USER_NAME_KEY)
public interface RefreshCallQueueProtocol {
  
  /**
   * Version 1: Initial version
   */
  public static final long versionID = 1L;

  /**
   * Refresh the callqueue.
   * @throws IOException
   */
  @Idempotent
  void refreshCallQueue() throws IOException;
}
