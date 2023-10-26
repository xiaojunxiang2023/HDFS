package org.apache.hadoop.io.erasurecode;

/**
 * A group of blocks or {@link ECBlock} incurred in an erasure coding task.
 */
public class ECBlockGroup {

  private ECBlock[] dataBlocks;
  private ECBlock[] parityBlocks;

  /**
   * A constructor specifying data blocks and parity blocks.
   * @param dataBlocks data blocks in the group
   * @param parityBlocks parity blocks in the group
   */
  public ECBlockGroup(ECBlock[] dataBlocks, ECBlock[] parityBlocks) {
    this.dataBlocks = dataBlocks;
    this.parityBlocks = parityBlocks;
  }

  /**
   * Get data blocks
   * @return data blocks
   */
  public ECBlock[] getDataBlocks() {
    return dataBlocks;
  }

  /**
   * Get parity blocks
   * @return parity blocks
   */
  public ECBlock[] getParityBlocks() {
    return parityBlocks;
  }

  /**
   * Any erased data block?
   * @return true if any erased data block, false otherwise
   */
  public boolean anyErasedDataBlock() {
    for (int i = 0; i < dataBlocks.length; ++i) {
      if (dataBlocks[i].isErased()) {
        return true;
      }
    }

    return false;
  }

  /**
   * Any erased parity block?
   * @return true if any erased parity block, false otherwise
   */
  public boolean anyErasedParityBlock() {
    for (int i = 0; i < parityBlocks.length; ++i) {
      if (parityBlocks[i].isErased()) {
        return true;
      }
    }

    return false;
  }

  /**
   * Get erased blocks count
   * @return erased count of blocks
   */
  public int getErasedCount() {
    int erasedCount = 0;

    for (ECBlock dataBlock : dataBlocks) {
      if (dataBlock.isErased()) erasedCount++;
    }

    for (ECBlock parityBlock : parityBlocks) {
      if (parityBlock.isErased()) erasedCount++;
    }

    return erasedCount;
  }

}
