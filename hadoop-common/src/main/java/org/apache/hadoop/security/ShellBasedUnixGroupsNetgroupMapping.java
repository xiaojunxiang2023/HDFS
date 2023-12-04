package org.apache.hadoop.security;

import org.apache.hadoop.util.Shell;
import org.apache.hadoop.util.Shell.ExitCodeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.LinkedList;
import java.util.List;

/**
 * A simple shell-based implementation of {@link GroupMappingServiceProvider}
 * that exec's the <code>groups</code> shell command to fetch the group
 * memberships of a given user.
 */
// MapReduce也可见
public class ShellBasedUnixGroupsNetgroupMapping
    extends ShellBasedUnixGroupsMapping {

  private static final Logger LOG =
      LoggerFactory.getLogger(ShellBasedUnixGroupsNetgroupMapping.class);

  /**
   * Get unix groups (parent) and netgroups for given user
   *
   * @param user get groups and netgroups for this user
   * @return groups and netgroups for user
   */
  @Override
  public List<String> getGroups(String user) throws IOException {
    // parent get unix groups
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
    for (String group : groups) {
      if (group.length() == 0) {
        // better safe than sorry (should never happen)
      } else if (group.charAt(0) == '@') {
        if (!NetgroupCache.isCached(group)) {
          NetgroupCache.add(group, getUsersForNetgroup(group));
        }
      } else {
        // unix group, not caching
      }
    }
  }

  /**
   * Gets users for a netgroup
   *
   * @param netgroup return users for this netgroup
   * @return list of users for a given netgroup
   */
  protected List<String> getUsersForNetgroup(String netgroup)
      throws IOException {

    List<String> users = new LinkedList<String>();

    // returns a string similar to this:
    // group               ( , user, ) ( domain, user1, host.com )
    String usersRaw = execShellGetUserForNetgroup(netgroup);
    // get rid of spaces, makes splitting much easier
    usersRaw = usersRaw.replaceAll(" +", "");
    // remove netgroup name at the beginning of the string
    usersRaw = usersRaw.replaceFirst(
        netgroup.replaceFirst("@", "") + "[()]+",
        "");
    // split string into user infos
    String[] userInfos = usersRaw.split("[()]+");
    for (String userInfo : userInfos) {
      // userInfo: xxx,user,yyy (xxx, yyy can be empty strings)
      // get rid of everything before first and after last comma
      String user = userInfo.replaceFirst("[^,]*,", "");
      user = user.replaceFirst(",.*$", "");
      // voila! got username!
      users.add(user);
    }

    return users;
  }

  /**
   * Calls shell to get users for a netgroup by calling getent
   * netgroup, this is a low level function that just returns string
   * that 
   *
   * @param netgroup get users for this netgroup
   * @return string of users for a given netgroup in getent netgroups format
   */
  protected String execShellGetUserForNetgroup(final String netgroup)
      throws IOException {
    String result = "";
    try {
      // shell command does not expect '@' at the beginning of the group name
      result = Shell.execCommand(
          Shell.getUsersForNetgroupCommand(netgroup.substring(1)));
    } catch (ExitCodeException e) {
      // if we didn't get the group - just return empty list;
      LOG.warn("error getting users for netgroup " + netgroup, e);
    }
    return result;
  }
}
