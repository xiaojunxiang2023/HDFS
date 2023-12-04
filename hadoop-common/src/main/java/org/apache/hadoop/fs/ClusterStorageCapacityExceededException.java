package org.apache.hadoop.fs;

import java.io.IOException;

/**
 * Exception raised by HDFS indicating that storage capacity in the
 * cluster filesystem is exceeded. See also
 * https://issues.apache.org/jira/browse/MAPREDUCE-7148.
 */
// MapReduce也可见
public class ClusterStorageCapacityExceededException extends IOException {
  private static final long serialVersionUID = 1L;

  public ClusterStorageCapacityExceededException() {
    super();
  }

  public ClusterStorageCapacityExceededException(String message) {
    super(message);
  }

  public ClusterStorageCapacityExceededException(String message,
                                                 Throwable cause) {
    super(message, cause);
  }

  public ClusterStorageCapacityExceededException(Throwable cause) {
    super(cause);
  }
}