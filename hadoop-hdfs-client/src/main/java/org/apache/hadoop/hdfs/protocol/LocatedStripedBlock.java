package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.security.token.block.BlockTokenIdentifier;
import org.apache.hadoop.security.token.Token;

import java.util.Arrays;

/**
 * {@link LocatedBlock} with striped block support. For a striped block, each
 * datanode storage is associated with a block in the block group. We need to
 * record the index (in the striped block group) for each of them.
 */
public class LocatedStripedBlock extends LocatedBlock {
  private static final byte[] EMPTY_INDICES = {};
  private static final Token<BlockTokenIdentifier> EMPTY_TOKEN = new Token<>();

  private final byte[] blockIndices;
  private Token<BlockTokenIdentifier>[] blockTokens;

  @SuppressWarnings({"unchecked"})
  public LocatedStripedBlock(ExtendedBlock b, DatanodeInfo[] locs,
                             String[] storageIDs, StorageType[] storageTypes, byte[] indices,
                             long startOffset, boolean corrupt, DatanodeInfo[] cachedLocs) {
    super(b, locs, storageIDs, storageTypes, startOffset, corrupt, cachedLocs);

    if (indices == null) {
      this.blockIndices = EMPTY_INDICES;
    } else {
      this.blockIndices = new byte[indices.length];
      System.arraycopy(indices, 0, blockIndices, 0, indices.length);
    }
    blockTokens = new Token[blockIndices.length];
    for (int i = 0; i < blockIndices.length; i++) {
      blockTokens[i] = EMPTY_TOKEN;
    }
  }

  @Override
  public String toString() {
    return getClass().getSimpleName() + "{" + getBlock()
        + "; getBlockSize()=" + getBlockSize()
        + "; corrupt=" + isCorrupt()
        + "; offset=" + getStartOffset()
        + "; locs=" + Arrays.asList(getLocations())
        + "; indices=" + Arrays.toString(blockIndices)
        + "}";
  }

  public byte[] getBlockIndices() {
    return this.blockIndices;
  }

  @Override
  public boolean isStriped() {
    return true;
  }

  @Override
  public BlockType getBlockType() {
    return BlockType.STRIPED;
  }

  public Token<BlockTokenIdentifier>[] getBlockTokens() {
    return blockTokens;
  }

  public void setBlockTokens(Token<BlockTokenIdentifier>[] tokens) {
    this.blockTokens = tokens;
  }
}
