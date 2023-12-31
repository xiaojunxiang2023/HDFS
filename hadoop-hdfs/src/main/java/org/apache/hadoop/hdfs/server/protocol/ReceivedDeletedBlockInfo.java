package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.hdfs.protocol.Block;

/**
 * A data structure to store the blocks in an incremental block report. 
 */
public class ReceivedDeletedBlockInfo {
  Block block;
  BlockStatus status;
  String delHints;

  public enum BlockStatus {
    RECEIVING_BLOCK(1),
    RECEIVED_BLOCK(2),
    DELETED_BLOCK(3);

    private final int code;

    BlockStatus(int code) {
      this.code = code;
    }

    public int getCode() {
      return code;
    }

    public static BlockStatus fromCode(int code) {
      for (BlockStatus bs : BlockStatus.values()) {
        if (bs.code == code) {
          return bs;
        }
      }
      return null;
    }
  }

  public ReceivedDeletedBlockInfo() {
  }

  public ReceivedDeletedBlockInfo(
      Block blk, BlockStatus status, String delHints) {
    this.block = blk;
    this.status = status;
    this.delHints = delHints;
  }

  public Block getBlock() {
    return this.block;
  }

  public void setBlock(Block blk) {
    this.block = blk;
  }

  public String getDelHints() {
    return this.delHints;
  }

  public void setDelHints(String hints) {
    this.delHints = hints;
  }

  public BlockStatus getStatus() {
    return status;
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ReceivedDeletedBlockInfo)) {
      return false;
    }
    ReceivedDeletedBlockInfo other = (ReceivedDeletedBlockInfo) o;
    return this.block.equals(other.getBlock())
        && this.status == other.status
        && this.delHints != null
        && this.delHints.equals(other.delHints);
  }

  @Override
  public int hashCode() {
    assert false : "hashCode not designed";
    return 0;
  }

  public boolean blockEquals(Block b) {
    return this.block.equals(b);
  }

  public boolean isDeletedBlock() {
    return status == BlockStatus.DELETED_BLOCK;
  }

  @Override
  public String toString() {
    return block.toString() + ", status: " + status +
        ", delHint: " + delHints;
  }
}
