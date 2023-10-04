package org.apache.hadoop.hdfs.server.federation.resolver;

import java.io.IOException;

/**
 *  Generic methods for managing Router.
 */
public interface RouterGenericManager {
  /**
   * Refresh superuser proxy groups mappings (used in RBF).
   * @return true if the operation was successful.
   * @throws IOException if operation was not successful.
   */
  boolean refreshSuperUserGroupsConfiguration() throws IOException;
}
