package org.apache.hadoop.tools;

import org.apache.hadoop.io.retry.Idempotent;

import java.io.IOException;

/**
 * Protocol implemented by the Name Node and Job Tracker which maps users to
 * groups.
 */
// MapReduce也可见
public interface GetUserMappingsProtocol {

  /**
   * Version 1: Initial version.
   */
  public static final long versionID = 1L;

  /**
   * Get the groups which are mapped to the given user.
   * @param user The user to get the groups for.
   * @return The set of groups the user belongs to.
   * @throws IOException
   */
  @Idempotent
  public String[] getGroupsForUser(String user) throws IOException;
}
