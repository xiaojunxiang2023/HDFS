package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.server.namenode.INodeId;
import org.apache.hadoop.util.SequentialNumber;

/**
 * Generate the next valid block ID by incrementing the maximum block
 * ID allocated so far, starting at 2^30+1.
 *
 * Block IDs used to be allocated randomly in the past. Hence we may
 * find some conflicts while stepping through the ID space sequentially.
 * However given the sparsity of the ID space, conflicts should be rare
 * and can be skipped over when detected.
 */
@InterfaceAudience.Private
public class SequentialBlockIdGenerator extends SequentialNumber {
  /**
   * The last reserved block ID.
   */
  public static final long LAST_RESERVED_BLOCK_ID = 1024L * 1024 * 1024;

  private final BlockManager blockManager;

  SequentialBlockIdGenerator(BlockManager blockManagerRef) {
    super(LAST_RESERVED_BLOCK_ID);
    this.blockManager = blockManagerRef;
  }

  @Override // NumberGenerator
  public long nextValue() {
    Block b = new Block(super.nextValue());

    // There may be an occasional conflict with randomly generated
    // block IDs. Skip over the conflicts.
    while(isValidBlock(b)) {
      b.setBlockId(super.nextValue());
    }
    if (b.getBlockId() < 0) {
      throw new IllegalStateException("All positive block IDs are used, " +
          "wrapping to negative IDs, " +
          "which might conflict with erasure coded block groups.");
    }
    return b.getBlockId();
  }

  /**
   * Returns whether the given block is one pointed-to by a file.
   */
  private boolean isValidBlock(Block b) {
    BlockInfo bi = blockManager.getStoredBlock(b);
    return bi != null && bi.getBlockCollectionId() !=
        INodeId.INVALID_INODE_ID;
  }
}
