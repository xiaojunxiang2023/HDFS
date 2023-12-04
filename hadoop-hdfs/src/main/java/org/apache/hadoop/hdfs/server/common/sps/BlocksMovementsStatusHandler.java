package org.apache.hadoop.hdfs.server.common.sps;

/**
 * Blocks movements status handler, which can be used to collect details of the
 * completed block movements.
 */
public interface BlocksMovementsStatusHandler {

  /**
   * Collect all the storage movement attempt finished blocks.
   *
   * @param moveAttemptFinishedBlk
   *          storage movement attempt finished block
   */
  void handle(BlockMovementAttemptFinished moveAttemptFinishedBlk);
}
