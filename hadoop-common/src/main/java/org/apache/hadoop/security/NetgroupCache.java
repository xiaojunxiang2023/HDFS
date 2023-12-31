package org.apache.hadoop.security;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Class that caches the netgroups and inverts group-to-user map
 * to user-to-group map, primarily intended for use with
 * netgroups (as returned by getent netgrgoup) which only returns
 * group to user mapping.
 */
public class NetgroupCache {
  private static ConcurrentHashMap<String, Set<String>> userToNetgroupsMap =
      new ConcurrentHashMap<String, Set<String>>();

  /**
   * Get netgroups for a given user
   *
   * @param user get groups for this user
   * @param groups put groups into this List
   */
  public static void getNetgroups(final String user,
                                  List<String> groups) {
    Set<String> userGroups = userToNetgroupsMap.get(user);
    //ConcurrentHashMap does not allow null values; 
    //So null value check can be used to check if the key exists
    if (userGroups != null) {
      groups.addAll(userGroups);
    }
  }

  /**
   * Get the list of cached netgroups
   *
   * @return list of cached groups
   */
  public static List<String> getNetgroupNames() {
    return new LinkedList<String>(getGroups());
  }

  private static Set<String> getGroups() {
    Set<String> allGroups = new HashSet<String>();
    for (Set<String> userGroups : userToNetgroupsMap.values()) {
      allGroups.addAll(userGroups);
    }
    return allGroups;
  }

  /**
   * Returns true if a given netgroup is cached
   *
   * @param group check if this group is cached
   * @return true if group is cached, false otherwise
   */
  public static boolean isCached(String group) {
    return getGroups().contains(group);
  }

  /**
   * Clear the cache
   */
  public static void clear() {
    userToNetgroupsMap.clear();
  }

  /**
   * Add group to cache
   *
   * @param group name of the group to add to cache
   * @param users list of users for a given group
   */
  public static void add(String group, List<String> users) {
    for (String user : users) {
      Set<String> userGroups = userToNetgroupsMap.get(user);
      // ConcurrentHashMap does not allow null values; 
      // So null value check can be used to check if the key exists
      if (userGroups == null) {
        //Generate a ConcurrentHashSet (backed by the keyset of the ConcurrentHashMap)
        userGroups =
            Collections.newSetFromMap(new ConcurrentHashMap<String, Boolean>());
        Set<String> currentSet = userToNetgroupsMap.putIfAbsent(user, userGroups);
        if (currentSet != null) {
          userGroups = currentSet;
        }
      }
      userGroups.add(group);
    }
  }
}
