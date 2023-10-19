package org.apache.hadoop.security.authorize;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.io.retry.Idempotent;
import org.apache.hadoop.security.KerberosInfo;

/**
 * Protocol which is used to refresh the authorization policy in use currently.
 */
@KerberosInfo(
    serverPrincipal=CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_USER_NAME_KEY)
@InterfaceAudience.LimitedPrivate({"HDFS", "MapReduce"})
@InterfaceStability.Evolving
public interface RefreshAuthorizationPolicyProtocol {
  
  /**
   * Version 1: Initial version
   */
  public static final long versionID = 1L;

  /**
   * Refresh the service-level authorization policy in-effect.
   * @throws IOException
   */
  @Idempotent
  void refreshServiceAcl() throws IOException;
}
