package org.apache.hadoop.hdfs.server.protocol;

/**
 * Base class for name-node command.
 * Issued by the name-node to notify other name-nodes what should be done.
 */
public class NamenodeCommand extends ServerCommand {
  public NamenodeCommand(int action) {
    super(action);
  }
}
