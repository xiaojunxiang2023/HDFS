package org.apache.hadoop.security;

import java.io.IOException;
import java.util.List;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.fs.CommonConfigurationKeysPublic;

/**
 * An interface for the implementation of a user-to-groups mapping service
 * used by {@link Groups}.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface GroupMappingServiceProvider {
  public static final String GROUP_MAPPING_CONFIG_PREFIX = CommonConfigurationKeysPublic.HADOOP_SECURITY_GROUP_MAPPING;
  
  /**
   * Get all various group memberships of a given user.
   * Returns EMPTY list in case of non-existing user
   * @param user User's name
   * @return group memberships of user
   * @throws IOException
   */
  public List<String> getGroups(String user) throws IOException;
  /**
   * Refresh the cache of groups and user mapping
   * @throws IOException
   */
  public void cacheGroupsRefresh() throws IOException;
  /**
   * Caches the group user information
   * @param groups list of groups to add to cache
   * @throws IOException
   */
  public void cacheGroupsAdd(List<String> groups) throws IOException;
}
