package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.hdfs.server.blockmanagement.BlockInfo;
import org.apache.hadoop.hdfs.server.namenode.INode.BlocksMapUpdateInfo;

import java.io.IOException;

/**
 * Feature for under-construction file.
 */
public class FileUnderConstructionFeature implements INode.Feature {
  private String clientName; // lease holder
  private final String clientMachine;

  public FileUnderConstructionFeature(final String clientName, final String clientMachine) {
    this.clientName = clientName;
    this.clientMachine = clientMachine;
  }

  public String getClientName() {
    return clientName;
  }

  void setClientName(String clientName) {
    this.clientName = clientName;
  }

  public String getClientMachine() {
    return clientMachine;
  }

  /**
   * Update the length for the last block
   *
   * @param lastBlockLength
   *          The length of the last block reported from client
   * @throws IOException
   */
  void updateLengthOfLastBlock(INodeFile f, long lastBlockLength)
      throws IOException {
    BlockInfo lastBlock = f.getLastBlock();
    assert (lastBlock != null) : "The last block for path "
        + f.getFullPathName() + " is null when updating its length";
    assert !lastBlock.isComplete()
        : "The last block for path " + f.getFullPathName()
        + " is not under-construction when updating its length";
    lastBlock.setNumBytes(lastBlockLength);
  }

  /**
   * When deleting a file in the current fs directory, and the file is contained
   * in a snapshot, we should delete the last block if it's under construction
   * and its size is 0.
   */
  void cleanZeroSizeBlock(final INodeFile f,
                          final BlocksMapUpdateInfo collectedBlocks) {
    final BlockInfo[] blocks = f.getBlocks();
    if (blocks != null && blocks.length > 0
        && !blocks[blocks.length - 1].isComplete()) {
      BlockInfo lastUC = blocks[blocks.length - 1];
      if (lastUC.getNumBytes() == 0) {
        // this is a 0-sized block. do not need check its UC state here
        collectedBlocks.addDeleteBlock(lastUC);
        f.removeLastBlock(lastUC);
      }
    }
  }
}
