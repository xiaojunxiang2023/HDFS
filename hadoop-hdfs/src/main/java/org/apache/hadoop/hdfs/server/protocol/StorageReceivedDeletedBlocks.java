package org.apache.hadoop.hdfs.server.protocol;

import java.util.Arrays;

/**
 * Report of block received and deleted per Datanode
 * storage.
 */
public class StorageReceivedDeletedBlocks {
  final DatanodeStorage storage;
  private final ReceivedDeletedBlockInfo[] blocks;

  /**
   * @deprecated Use {@link #getStorage()} instead
   */
  @Deprecated
  public String getStorageID() {
    return storage.getStorageID();
  }

  public DatanodeStorage getStorage() {
    return storage;
  }

  public ReceivedDeletedBlockInfo[] getBlocks() {
    return blocks;
  }

  /**
   * @deprecated Use {@link #StorageReceivedDeletedBlocks(
   *DatanodeStorage, ReceivedDeletedBlockInfo[])} instead
   */
  @Deprecated
  public StorageReceivedDeletedBlocks(final String storageID,
                                      final ReceivedDeletedBlockInfo[] blocks) {
    this.storage = new DatanodeStorage(storageID);
    this.blocks = blocks;
  }

  public StorageReceivedDeletedBlocks(final DatanodeStorage storage,
                                      final ReceivedDeletedBlockInfo[] blocks) {
    this.storage = storage;
    this.blocks = blocks;
  }

  @Override
  public String toString() {
    return storage + Arrays.toString(blocks);
  }
}
