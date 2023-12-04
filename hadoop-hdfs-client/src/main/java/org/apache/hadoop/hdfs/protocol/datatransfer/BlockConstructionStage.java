package org.apache.hadoop.hdfs.protocol.datatransfer;

/** Block Construction Stage */
public enum BlockConstructionStage {
  /** The enumerates are always listed as regular stage followed by the
   * recovery stage.
   * Changing this order will make getRecoveryStage not working.
   */
  // pipeline set up for block append
  PIPELINE_SETUP_APPEND,
  // pipeline set up for failed PIPELINE_SETUP_APPEND recovery
  PIPELINE_SETUP_APPEND_RECOVERY,
  // data streaming
  DATA_STREAMING,
  // pipeline setup for failed data streaming recovery
  PIPELINE_SETUP_STREAMING_RECOVERY,
  // close the block and pipeline
  PIPELINE_CLOSE,
  // Recover a failed PIPELINE_CLOSE
  PIPELINE_CLOSE_RECOVERY,
  // pipeline set up for block creation
  PIPELINE_SETUP_CREATE,
  // transfer RBW for adding datanodes
  TRANSFER_RBW,
  // transfer Finalized for adding datanodes
  TRANSFER_FINALIZED;

  final static private byte RECOVERY_BIT = (byte) 1;

  /**
   * get the recovery stage of this stage
   */
  public BlockConstructionStage getRecoveryStage() {
    if (this == PIPELINE_SETUP_CREATE) {
      throw new IllegalArgumentException("Unexpected blockStage " + this);
    } else {
      return values()[ordinal() | RECOVERY_BIT];
    }
  }
}
