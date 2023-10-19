package org.apache.hadoop.fs;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Exception raised by HDFS indicating that storage capacity in the
 * cluster filesystem is exceeded. See also
 * https://issues.apache.org/jira/browse/MAPREDUCE-7148.
 */
@InterfaceAudience.LimitedPrivate({ "HDFS", "MapReduce", "Tez" })
@InterfaceStability.Evolving
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