package org.apache.hadoop.hdfs.server.datanode;

import java.io.IOException;

import org.apache.hadoop.hdfs.protocol.ExtendedBlock;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants.ReplicaState;

/**
 * Exception indicating that the replica is in an unexpected state
 */
public class UnexpectedReplicaStateException extends IOException {
  private static final long serialVersionUID = 1L;

  public UnexpectedReplicaStateException() {
    super();
  }

  public UnexpectedReplicaStateException(ExtendedBlock b,
      ReplicaState expectedState) {
    super("Replica " + b + " is not in expected state " + expectedState);
  }
  
  public UnexpectedReplicaStateException(String msg) {
    super(msg);
  }
}
