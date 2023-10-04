package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Class to contain Lastblock and HdfsFileStatus for the Append operation
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class LastBlockWithStatus {

  private final LocatedBlock lastBlock;

  private final HdfsFileStatus fileStatus;

  public LastBlockWithStatus(LocatedBlock lastBlock,
      HdfsFileStatus fileStatus) {
    this.lastBlock = lastBlock;
    this.fileStatus = fileStatus;
  }

  public LocatedBlock getLastBlock() {
    return lastBlock;
  }

  public HdfsFileStatus getFileStatus() {
    return fileStatus;
  }
}
