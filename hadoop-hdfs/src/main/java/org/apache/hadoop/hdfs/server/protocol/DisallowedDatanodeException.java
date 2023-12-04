package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.hdfs.protocol.DatanodeID;

import java.io.IOException;


/**
 * This exception is thrown when a datanode tries to register or communicate
 * with the namenode when it does not appear on the list of included nodes, 
 * or has been specifically excluded.
 *
 */
public class DisallowedDatanodeException extends IOException {
  /** for java.io.Serializable */
  private static final long serialVersionUID = 1L;

  public DisallowedDatanodeException(DatanodeID nodeID, String reason) {
    super("Datanode denied communication with namenode because "
        + reason + ": " + nodeID);
  }

  public DisallowedDatanodeException(DatanodeID nodeID) {
    this(nodeID, "the host is not in the include-list");
  }
}
