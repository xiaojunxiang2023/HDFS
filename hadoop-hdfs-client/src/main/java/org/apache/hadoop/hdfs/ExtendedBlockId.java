package org.apache.hadoop.hdfs;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;

/**
 * An immutable key which identifies a block.
 */
final public class ExtendedBlockId {
  /**
   * The block ID for this block.
   */
  private final long blockId;

  /**
   * The block pool ID for this block.
   */
  private final String bpId;

  public static ExtendedBlockId fromExtendedBlock(ExtendedBlock block) {
    return new ExtendedBlockId(block.getBlockId(), block.getBlockPoolId());
  }

  public ExtendedBlockId(long blockId, String bpId) {
    this.blockId = blockId;
    this.bpId = bpId;
  }

  public long getBlockId() {
    return this.blockId;
  }

  public String getBlockPoolId() {
    return this.bpId;
  }

  @Override
  public boolean equals(Object o) {
    if ((o == null) || (o.getClass() != this.getClass())) {
      return false;
    }
    ExtendedBlockId other = (ExtendedBlockId)o;
    return new EqualsBuilder().
        append(blockId, other.blockId).
        append(bpId, other.bpId).
        isEquals();
  }

  @Override
  public int hashCode() {
    return new HashCodeBuilder().
        append(this.blockId).
        append(this.bpId).
        toHashCode();
  }

  @Override
  public String toString() {
    return String.valueOf(blockId) + "_" + bpId;
  }
}
