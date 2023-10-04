package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/****************************************************
 * A BlockIdCommand is an instruction to a datanode 
 * regarding some blocks under its control.
 ****************************************************/
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class BlockIdCommand extends DatanodeCommand {
  final String poolId;
  final long blockIds[];

  /**
   * Create BlockCommand for the given action
   */
  public BlockIdCommand(int action, String poolId, long[] blockIds) {
    super(action);
    this.poolId = poolId;
    this.blockIds= blockIds;
  }
  
  public String getBlockPoolId() {
    return poolId;
  }
  
  public long[] getBlockIds() {
    return blockIds;
  }
}
