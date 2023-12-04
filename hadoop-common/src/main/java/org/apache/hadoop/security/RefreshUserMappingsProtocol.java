package org.apache.hadoop.security;

import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.io.retry.Idempotent;

import java.io.IOException;

/**
 * Protocol use 
 *
 */
@KerberosInfo(
    serverPrincipal = CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_USER_NAME_KEY)
// MapReduce也可见
public interface RefreshUserMappingsProtocol {

  /**
   * Version 1: Initial version.
   */
  public static final long versionID = 1L;

  /**
   * Refresh user to group mappings.
   * @throws IOException
   */
  @Idempotent
  public void refreshUserToGroupsMappings() throws IOException;

  /**
   * Refresh superuser proxy group list
   * @throws IOException
   */
  @Idempotent
  public void refreshSuperUserGroupsConfiguration() throws IOException;
}
