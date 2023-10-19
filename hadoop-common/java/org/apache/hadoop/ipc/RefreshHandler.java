package org.apache.hadoop.ipc;

import org.apache.hadoop.classification.InterfaceStability;

/**
 * Used to registry custom methods to refresh at runtime.
 */
@InterfaceStability.Unstable
public interface RefreshHandler {
  /**
   * Implement this method to accept refresh requests from the administrator.
   * @param identifier is the identifier you registered earlier
   * @param args contains a list of string args from the administrator
   * @return a RefreshResponse
   */
  RefreshResponse handleRefresh(String identifier, String[] args);
}
