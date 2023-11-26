package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.hdfs.protocol.BlockListAsLongs;

/**
 * Block report for a Datanode storage
 */
public class StorageBlockReport {
  private final DatanodeStorage storage;
  private final BlockListAsLongs blocks;
  
  public StorageBlockReport(DatanodeStorage storage, BlockListAsLongs blocks) {
    this.storage = storage;
    this.blocks = blocks;
  }

  public DatanodeStorage getStorage() {
    return storage;
  }

  public BlockListAsLongs getBlocks() {
    return blocks;
  }
}
