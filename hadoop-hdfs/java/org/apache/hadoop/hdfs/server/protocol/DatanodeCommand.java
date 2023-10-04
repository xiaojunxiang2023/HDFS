package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Base class for data-node command.
 * Issued by the name-node to notify data-nodes what should be done.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public abstract class DatanodeCommand extends ServerCommand {

  DatanodeCommand(int action) {
    super(action);
  }
}
