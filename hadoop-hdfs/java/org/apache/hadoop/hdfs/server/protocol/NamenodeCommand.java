package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Base class for name-node command.
 * Issued by the name-node to notify other name-nodes what should be done.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class NamenodeCommand extends ServerCommand {
  public NamenodeCommand(int action) {
    super(action);
  }
}
