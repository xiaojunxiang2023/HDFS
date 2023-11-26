package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.protocol.BlockType;

/**
 * Subclass of {@link BlockInfo}, used for a block with replication scheme.
 */
public class BlockInfoContiguous extends BlockInfo {

  public BlockInfoContiguous(short size) {
    super(size);
  }

  public BlockInfoContiguous(Block blk, short size) {
    super(blk, size);
  }

  /**
   * Ensure that there is enough  space to include num more triplets.
   * @return first free triplet index.
   */
  private int ensureCapacity(int num) {
    assert this.triplets != null : "BlockInfo is not initialized";
    int last = numNodes();
    if (triplets.length >= (last+num)*3) {
      return last;
    }
    /* Not enough space left. Create a new array. Should normally
     * happen only when replication is manually increased by the user. */
    Object[] old = triplets;
    triplets = new Object[(last+num)*3];
    System.arraycopy(old, 0, triplets, 0, last * 3);
    return last;
  }

  @Override
  boolean addStorage(DatanodeStorageInfo storage, Block reportedBlock) {
    Preconditions.checkArgument(this.getBlockId() == reportedBlock.getBlockId(),
        "reported blk_%s is different from stored blk_%s",
        reportedBlock.getBlockId(), this.getBlockId());
    // find the last null node
    int lastNode = ensureCapacity(1);
    setStorageInfo(lastNode, storage);
    setNext(lastNode, null);
    setPrevious(lastNode, null);
    return true;
  }

  @Override
  boolean removeStorage(DatanodeStorageInfo storage) {
    int dnIndex = findStorageInfo(storage);
    if (dnIndex < 0) { // the node is not found
      return false;
    }
    assert getPrevious(dnIndex) == null && getNext(dnIndex) == null :
        "Block is still in the list and must be removed first.";
    // find the last not null node
    int lastNode = numNodes()-1;
    // replace current node triplet by the lastNode one
    setStorageInfo(dnIndex, getStorageInfo(lastNode));
    setNext(dnIndex, getNext(lastNode));
    setPrevious(dnIndex, getPrevious(lastNode));
    // set the last triplet to null
    setStorageInfo(lastNode, null);
    setNext(lastNode, null);
    setPrevious(lastNode, null);
    return true;
  }

  @Override
  boolean isProvided() {
    int len = getCapacity();
    for (int idx = 0; idx < len; idx++) {
      DatanodeStorageInfo storage = getStorageInfo(idx);
      if (storage != null
          && storage.getStorageType().equals(StorageType.PROVIDED)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public int numNodes() {
    assert this.triplets != null : "BlockInfo is not initialized";
    assert triplets.length % 3 == 0 : "Malformed BlockInfo";

    for (int idx = getCapacity()-1; idx >= 0; idx--) {
      if (getDatanode(idx) != null) {
        return idx + 1;
      }
    }
    return 0;
  }

  @Override
  public final boolean isStriped() {
    return false;
  }

  @Override
  public BlockType getBlockType() {
    return BlockType.CONTIGUOUS;
  }

  @Override
  final boolean hasNoStorage() {
    return getStorageInfo(0) == null;
  }
}
