package org.apache.hadoop.hdfs.server.protocol;

/**
 * Base class for data-node command.
 * Issued by the name-node to notify data-nodes what should be done.
 */
public abstract class DatanodeCommand extends ServerCommand {

  DatanodeCommand(int action) {
    super(action);
  }
}
