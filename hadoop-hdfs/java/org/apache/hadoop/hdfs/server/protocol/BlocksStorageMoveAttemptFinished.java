package org.apache.hadoop.hdfs.server.protocol;

import java.util.Arrays;

import org.apache.hadoop.hdfs.protocol.Block;

/**
 * This class represents, the blocks for which storage movements has done by
 * datanodes. The movementFinishedBlocks array contains all the blocks that are
 * attempted to do the movement and it could be finished with either success or
 * failure.
 */
public class BlocksStorageMoveAttemptFinished {

  private final Block[] movementFinishedBlocks;

  public BlocksStorageMoveAttemptFinished(Block[] moveAttemptFinishedBlocks) {
    this.movementFinishedBlocks = moveAttemptFinishedBlocks;
  }

  public Block[] getBlocks() {
    return movementFinishedBlocks;
  }

  @Override
  public String toString() {
    return new StringBuilder().append("BlocksStorageMovementFinished(\n  ")
        .append("  blockID: ").append(Arrays.toString(movementFinishedBlocks))
        .append(")").toString();
  }
}
