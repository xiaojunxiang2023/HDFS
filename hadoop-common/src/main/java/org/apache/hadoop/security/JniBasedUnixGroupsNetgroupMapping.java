package org.apache.hadoop.security;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.LinkedList;

import org.apache.hadoop.util.NativeCodeLoader;

import org.apache.hadoop.security.NetgroupCache;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A JNI-based implementation of {@link GroupMappingServiceProvider} 
 * that invokes libC calls to get the group
 * memberships of a given user.
 */
// MapReduce也可见
public class JniBasedUnixGroupsNetgroupMapping
  extends JniBasedUnixGroupsMapping {
  
  private static final Logger LOG = LoggerFactory.getLogger(
    JniBasedUnixGroupsNetgroupMapping.class);

  native String[] getUsersForNetgroupJNI(String group);

  static {
    if (!NativeCodeLoader.isNativeCodeLoaded()) {
      throw new RuntimeException("Bailing out since native library couldn't " +
        "be loaded");
    }
    LOG.debug("Using JniBasedUnixGroupsNetgroupMapping for Netgroup resolution");
  }

  /**
   * Gets unix groups and netgroups for the user.
   *
   * It gets all unix groups as returned by id -Gn but it
   * only returns netgroups that are used in ACLs (there is
   * no way to get all netgroups for a given user, see
   * documentation for getent netgroup)
   */
  @Override
  public List<String> getGroups(String user) throws IOException {
    // parent gets unix groups
    List<String> groups = new LinkedList<String>(super.getGroups(user));
    NetgroupCache.getNetgroups(user, groups);
    return groups;
  }

  /**
   * Refresh the netgroup cache
   */
  @Override
  public void cacheGroupsRefresh() throws IOException {
    List<String> groups = NetgroupCache.getNetgroupNames();
    NetgroupCache.clear();
    cacheGroupsAdd(groups);
  }

  /**
   * Add a group to cache, only netgroups are cached
   *
   * @param groups list of group names to add to cache
   */
  @Override
  public void cacheGroupsAdd(List<String> groups) throws IOException {
    for(String group: groups) {
      if(group.length() == 0) {
        // better safe than sorry (should never happen)
      } else if(group.charAt(0) == '@') {
        if(!NetgroupCache.isCached(group)) {
          NetgroupCache.add(group, getUsersForNetgroup(group));
        }
      } else {
        // unix group, not caching
      }
    }
  }

  /**
   * Calls JNI function to get users for a netgroup, since C functions
   * are not reentrant we need to make this synchronized (see
   * documentation for setnetgrent, getnetgrent and endnetgrent)
   *
   * @param netgroup return users for this netgroup
   * @return list of users for a given netgroup
   */
  protected synchronized List<String> getUsersForNetgroup(String netgroup) {
    String[] users = null;
    try {
      // JNI code does not expect '@' at the beginning of the group name
      users = getUsersForNetgroupJNI(netgroup.substring(1));
    } catch (Exception e) {
      if (LOG.isDebugEnabled()) {
        LOG.debug("Error getting users for netgroup " + netgroup, e);
      } else {
        LOG.info("Error getting users for netgroup " + netgroup + 
            ": " + e.getMessage());
      }
    }
    if (users != null && users.length != 0) {
      return Arrays.asList(users);
    }
    return new LinkedList<String>();
  }
}
