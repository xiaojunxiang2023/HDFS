package org.apache.hadoop.ipc;

import java.io.IOException;
import java.util.Collection;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.io.retry.Idempotent;
import org.apache.hadoop.security.KerberosInfo;

/**
 * Protocol which is used to refresh arbitrary things at runtime.
 */
@KerberosInfo(
    serverPrincipal=CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_USER_NAME_KEY)
@InterfaceAudience.Private
@InterfaceStability.Evolving
public interface GenericRefreshProtocol {
  /**
   * Version 1: Initial version.
   */
  public static final long versionID = 1L;

  /**
   * Refresh the resource based on identity passed in.
   * @throws IOException
   */
  @Idempotent
  Collection<RefreshResponse> refresh(String identifier, String[] args)
      throws IOException;
}
