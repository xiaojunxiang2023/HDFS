package org.apache.hadoop.hdfs.server.namenode.sps;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.hdfs.protocol.Block;

/**
 * Interface for notifying about block movement attempt completion.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public interface BlockMovementListener {

  /**
   * This method used to notify to the SPS about block movement attempt
   * finished. Then SPS will re-check whether it needs retry or not.
   *
   * @param moveAttemptFinishedBlks
   *          -list of movement attempt finished blocks
   */
  void notifyMovementTriedBlocks(Block[] moveAttemptFinishedBlks);
}