package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;
import org.apache.hadoop.hdfs.server.protocol.JournalInfo;
import org.apache.hadoop.hdfs.server.protocol.NodeRegistration;

/**
 * This exception is thrown when a node that has not previously 
 * registered is trying to access the name node.
 */
public class UnregisteredNodeException extends IOException {
  private static final long serialVersionUID = -5620209396945970810L;

  public UnregisteredNodeException(JournalInfo info) {
    super("Unregistered server: " + info.toString());
  }
  
  public UnregisteredNodeException(NodeRegistration nodeReg) {
    super("Unregistered server: " + nodeReg.toString());
  }

  /**
   * The exception is thrown if a different data-node claims the same
   * storage id as the existing one.
   *  
   * @param nodeID unregistered data-node
   * @param storedNode data-node stored in the system with this storage id
   */
  public UnregisteredNodeException(DatanodeID nodeID, DatanodeInfo storedNode) {
    super("Data node " + nodeID + " is attempting to report storage ID " 
          + nodeID.getDatanodeUuid() + ". Node "
          + storedNode + " is expected to serve this storage.");
  }
}
