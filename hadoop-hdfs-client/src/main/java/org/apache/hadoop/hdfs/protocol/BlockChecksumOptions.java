package org.apache.hadoop.hdfs.protocol;

/**
 * Encapsulates various options related to how fine-grained data checksums are
 * combined into block-level checksums.
 */
public class BlockChecksumOptions {
  private final BlockChecksumType blockChecksumType;
  private final long stripeLength;

  public BlockChecksumOptions(
      BlockChecksumType blockChecksumType, long stripeLength) {
    this.blockChecksumType = blockChecksumType;
    this.stripeLength = stripeLength;
  }

  public BlockChecksumOptions(BlockChecksumType blockChecksumType) {
    this(blockChecksumType, 0);
  }

  public BlockChecksumType getBlockChecksumType() {
    return blockChecksumType;
  }

  public long getStripeLength() {
    return stripeLength;
  }

  @Override
  public String toString() {
    return String.format("blockChecksumType=%s, stripedLength=%d",
        blockChecksumType, stripeLength);
  }
}
