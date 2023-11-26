package org.apache.hadoop.hdfs.server.datanode;

import java.io.IOException;

import org.apache.hadoop.hdfs.protocol.ExtendedBlock;

/**
 * Exception indicating that DataNode does not have a replica
 * that matches the target block.
 */
public class ReplicaNotFoundException extends IOException {
  private static final long serialVersionUID = 1L;
  public final static String NON_RBW_REPLICA =
      "Cannot recover a non-RBW replica ";
  public final static String UNFINALIZED_REPLICA =
      "Cannot append to an unfinalized replica ";
  public final static String UNFINALIZED_AND_NONRBW_REPLICA =
      "Cannot recover append/close to a replica that's not FINALIZED and not RBW"
          + " ";
  public final static String NON_EXISTENT_REPLICA =
      "Replica does not exist ";
  public final static String UNEXPECTED_GS_REPLICA =
      "Cannot append to a replica with unexpected generation stamp ";
  public final static String POSSIBLE_ROOT_CAUSE_MSG =
      ". The block may have been removed recently by the balancer " +
      "or by intentionally reducing the replication factor. " +
      "This condition is usually harmless. To be certain, please check the " +
      "preceding datanode log messages for signs of a more serious issue.";


  public ReplicaNotFoundException() {
    super();
  }

  public ReplicaNotFoundException(ExtendedBlock b) {
    super("Replica not found for " + b + POSSIBLE_ROOT_CAUSE_MSG);
  }

  public ReplicaNotFoundException(String msg) {
    super(msg);
  }
}
