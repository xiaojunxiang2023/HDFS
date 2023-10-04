package org.apache.hadoop.hdfs.server.blockmanagement;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.fs.ContentSummary;
import org.apache.hadoop.security.AccessControlException;

/** 
 * This interface is used by the block manager to expose a
 * few characteristics of a collection of Block/BlockUnderConstruction.
 */
@InterfaceAudience.Private
public interface BlockCollection {
  /**
   * Get the last block of the collection.
   */
  BlockInfo getLastBlock();

  /** 
   * Get content summary.
   */
  ContentSummary computeContentSummary(BlockStoragePolicySuite bsps)
      throws AccessControlException;

  /**
   * @return the number of blocks or block groups
   */ 
  int numBlocks();

  /**
   * Get the blocks (striped or contiguous).
   */
  BlockInfo[] getBlocks();

  /**
   * Get preferred block size for the collection 
   * @return preferred block size in bytes
   */
  long getPreferredBlockSize();

  /**
   * Get block replication for the collection.
   * @return block replication value. Return 0 if the file is erasure coded.
   */
  short getPreferredBlockReplication();

  /**
   * @return the storage policy ID.
   */
  byte getStoragePolicyID();

  /**
   * Get the name of the collection.
   */
  String getName();

  /**
   * Set the block (contiguous or striped) at the given index.
   */
  void setBlock(int index, BlockInfo blk);

  /**
   * Convert the last block of the collection to an under-construction block
   * and set the locations.
   */
  void convertLastBlockToUC(BlockInfo lastBlock,
      DatanodeStorageInfo[] targets) throws IOException;

  /**
   * @return whether the block collection is under construction.
   */
  boolean isUnderConstruction();

  /**
   * @return whether the block collection is in striping format
   */
  boolean isStriped();

  /**
   * @return the id for the block collection
   */
  long getId();
}
