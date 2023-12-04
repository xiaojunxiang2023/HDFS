package org.apache.hadoop.security;

import org.apache.hadoop.util.NativeCodeLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 * A JNI-based implementation of {@link GroupMappingServiceProvider}
 * that invokes libC calls to get the group
 * memberships of a given user.
 */
// MapReduce也可见
public class JniBasedUnixGroupsMapping implements GroupMappingServiceProvider {

  private static final Logger LOG =
      LoggerFactory.getLogger(JniBasedUnixGroupsMapping.class);

  static {
    if (!NativeCodeLoader.isNativeCodeLoaded()) {
      throw new RuntimeException("Bailing out since native library couldn't " +
          "be loaded");
    }
    anchorNative();
    LOG.debug("Using JniBasedUnixGroupsMapping for Group resolution");
  }

  /**
   * Set up our JNI resources.
   *
   * @throws RuntimeException if setup fails.
   */
  native static void anchorNative();

  /**
   * Get the set of groups associated with a user.
   *
   * @param username           The user name
   *
   * @return The set of groups associated with a user.
   */
  native static String[] getGroupsForUser(String username);

  /**
   * Log an error message about a group.  Used from JNI.
   */
  static private void logError(int groupId, String error) {
    LOG.error("error looking up the name of group " + groupId + ": " + error);
  }

  @Override
  public List<String> getGroups(String user) throws IOException {
    String[] groups = new String[0];
    try {
      groups = getGroupsForUser(user);
    } catch (Exception e) {
      if (LOG.isDebugEnabled()) {
        LOG.debug("Error getting groups for " + user, e);
      } else {
        LOG.info("Error getting groups for " + user + ": " + e.getMessage());
      }
    }
    return Arrays.asList(groups);
  }

  @Override
  public void cacheGroupsRefresh() throws IOException {
    // does nothing in this provider of user to groups mapping
  }

  @Override
  public void cacheGroupsAdd(List<String> groups) throws IOException {
    // does nothing in this provider of user to groups mapping
  }
}
