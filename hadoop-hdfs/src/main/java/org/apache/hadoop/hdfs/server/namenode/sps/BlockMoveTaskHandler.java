package org.apache.hadoop.hdfs.server.namenode.sps;

import org.apache.hadoop.hdfs.server.protocol.BlockStorageMovementCommand.BlockMovingInfo;

import java.io.IOException;

/**
 * Interface for implementing different ways of block moving approaches. One can
 * connect directly to DN and request block move, and other can talk NN to
 * schedule via heart-beats.
 */
public interface BlockMoveTaskHandler {

  /**
   * This is an interface method to handle the move tasks. BlockMovingInfo must
   * contain the required info to move the block, that source location,
   * destination location and storage types.
   */
  void submitMoveTask(BlockMovingInfo blkMovingInfo) throws IOException;

}