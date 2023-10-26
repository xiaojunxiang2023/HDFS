package org.apache.hadoop.security;

import java.io.IOException;
import java.util.List;
import org.apache.hadoop.fs.CommonConfigurationKeysPublic;

/**
 * An interface for the implementation of {@literal <}userId,
 * userName{@literal >} mapping and {@literal <}groupId, groupName{@literal >}
 * mapping.
 */
public interface IdMappingServiceProvider {

  // Return uid for given user name
  public int getUid(String user) throws IOException;

  // Return gid for given group name
  public int getGid(String group) throws IOException;

  // Return user name for given user id uid, if not found, return 
  // <unknown> passed to this method
  public String getUserName(int uid, String unknown);

  // Return group name for given groupd id gid, if not found, return 
  // <unknown> passed to this method
  public String getGroupName(int gid, String unknown);
  
  // Return uid for given user name.
  // When can't map user, return user name's string hashcode
  public int getUidAllowingUnknown(String user);

  // Return gid for given group name.
  // When can't map group, return group name's string hashcode
  public int getGidAllowingUnknown(String group);
}
