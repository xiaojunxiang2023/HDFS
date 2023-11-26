package org.apache.hadoop.ipc;
import org.apache.hadoop.security.UserGroupInformation;

/**
 * Interface which allows extracting information necessary to
 * create schedulable identity strings.
 */
public interface Schedulable {
  public UserGroupInformation getUserGroupInformation();

  int getPriorityLevel();
}
