package org.apache.hadoop.hdfs.server.protocol;

/****************************************************
 * A BlockIdCommand is an instruction to a datanode 
 * regarding some blocks under its control.
 ****************************************************/
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
