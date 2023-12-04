package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.hdfs.protocol.*;
import org.apache.hadoop.thirdparty.com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.Collection;

/**
 * BlockRecoveryCommand is an instruction to a data-node to recover
 * the specified blocks.
 *
 * The data-node that receives this command treats itself as a primary
 * data-node in the recover process.
 *
 * Block recovery is identified by a recoveryId, which is also the new
 * generation stamp, which the block will have after the recovery succeeds.
 */
public class BlockRecoveryCommand extends DatanodeCommand {
  final Collection<RecoveringBlock> recoveringBlocks;

  /**
   * This is a block with locations from which it should be recovered
   * and the new generation stamp, which the block will have after 
   * successful recovery.
   *
   * The new generation stamp of the block, also plays role of the recovery id.
   */
  public static class RecoveringBlock extends LocatedBlock {
    private final long newGenerationStamp;
    private final Block recoveryBlock;

    /**
     * Create RecoveringBlock.
     */
    public RecoveringBlock(ExtendedBlock b, DatanodeInfo[] locs, long newGS) {
      super(b, locs); // startOffset is unknown
      this.newGenerationStamp = newGS;
      this.recoveryBlock = null;
    }

    /**
     * Create RecoveringBlock with copy-on-truncate option.
     */
    public RecoveringBlock(ExtendedBlock b, DatanodeInfo[] locs,
                           Block recoveryBlock) {
      super(b, locs); // startOffset is unknown
      this.newGenerationStamp = recoveryBlock.getGenerationStamp();
      this.recoveryBlock = recoveryBlock;
    }

    public RecoveringBlock(RecoveringBlock rBlock) {
      super(rBlock.getBlock(), rBlock.getLocations(), rBlock.getStorageIDs(),
          rBlock.getStorageTypes());
      this.newGenerationStamp = rBlock.newGenerationStamp;
      this.recoveryBlock = rBlock.recoveryBlock;
    }

    /**
     * Return the new generation stamp of the block,
     * which also plays role of the recovery id.
     */
    public long getNewGenerationStamp() {
      return newGenerationStamp;
    }

    /**
     * Return the new block.
     */
    public Block getNewBlock() {
      return recoveryBlock;
    }
  }

  public static class RecoveringStripedBlock extends RecoveringBlock {
    private final byte[] blockIndices;
    private final ErasureCodingPolicy ecPolicy;

    public RecoveringStripedBlock(RecoveringBlock rBlock, byte[] blockIndices,
                                  ErasureCodingPolicy ecPolicy) {
      super(rBlock);
      this.blockIndices = blockIndices == null ? new byte[]{} : blockIndices;
      this.ecPolicy = ecPolicy;
    }

    public byte[] getBlockIndices() {
      return blockIndices;
    }

    public ErasureCodingPolicy getErasureCodingPolicy() {
      return ecPolicy;
    }

    @Override
    public boolean isStriped() {
      return true;
    }
  }

  /**
   * Create empty BlockRecoveryCommand.
   */
  public BlockRecoveryCommand() {
    this(0);
  }

  /**
   * Create BlockRecoveryCommand with
   * the specified capacity for recovering blocks.
   */
  public BlockRecoveryCommand(int capacity) {
    this(new ArrayList<RecoveringBlock>(capacity));
  }

  public BlockRecoveryCommand(Collection<RecoveringBlock> blocks) {
    super(DatanodeProtocol.DNA_RECOVERBLOCK);
    recoveringBlocks = blocks;
  }

  /**
   * Return the list of recovering blocks.
   */
  public Collection<RecoveringBlock> getRecoveringBlocks() {
    return recoveringBlocks;
  }

  /**
   * Add recovering block to the command.
   */
  public void add(RecoveringBlock block) {
    recoveringBlocks.add(block);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("BlockRecoveryCommand(\n  ");
    Joiner.on("\n  ").appendTo(sb, recoveringBlocks);
    sb.append("\n)");
    return sb.toString();
  }
}
