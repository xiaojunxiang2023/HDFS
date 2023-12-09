package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.fs.ContentSummary;
import org.apache.hadoop.security.AccessControlException;

import java.io.IOException;

public interface BlockCollection {

  BlockInfo getLastBlock();

  ContentSummary computeContentSummary(BlockStoragePolicySuite bsps)
      throws AccessControlException;

  int numBlocks();

  BlockInfo[] getBlocks();

  long getPreferredBlockSize();

  short getPreferredBlockReplication();

  byte getStoragePolicyID();

  String getName();

  void setBlock(int index, BlockInfo blk);

  void convertLastBlockToUC(BlockInfo lastBlock,
                            DatanodeStorageInfo[] targets) throws IOException;

  boolean isUnderConstruction();

  long getId();
}
