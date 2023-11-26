package org.apache.hadoop.io.erasurecode.grouper;
import org.apache.hadoop.io.erasurecode.ECBlock;
import org.apache.hadoop.io.erasurecode.ECBlockGroup;
import org.apache.hadoop.io.erasurecode.ECSchema;

/**
 * As part of a codec, to handle how to form a block group for encoding
 * and provide instructions on how to recover erased blocks from a block group
 */
public class BlockGrouper {

  private ECSchema schema;

  /**
   * Set EC schema.
   * @param schema
   */
  public void setSchema(ECSchema schema) {
    this.schema = schema;
  }

  /**
   * Get EC schema.
   * @return
   */
  protected ECSchema getSchema() {
    return schema;
  }

  /**
   * Get required data blocks count in a BlockGroup.
   * @return count of required data blocks
   */
  public int getRequiredNumDataBlocks() {
    return schema.getNumDataUnits();
  }

  /**
   * Get required parity blocks count in a BlockGroup.
   * @return count of required parity blocks
   */
  public int getRequiredNumParityBlocks() {
    return schema.getNumParityUnits();
  }

  /**
   * Calculating and organizing BlockGroup, to be called by ECManager
   * @param dataBlocks Data blocks to compute parity blocks against
   * @param parityBlocks To be computed parity blocks
   * @return
   */
  public ECBlockGroup makeBlockGroup(ECBlock[] dataBlocks,
                                     ECBlock[] parityBlocks) {

    ECBlockGroup blockGroup = new ECBlockGroup(dataBlocks, parityBlocks);
    return blockGroup;
  }

  /**
   * Given a BlockGroup, tell if any of the missing blocks can be recovered,
   * to be called by ECManager
   * @param blockGroup a blockGroup that may contain erased blocks but not sure
   *                   recoverable or not
   * @return true if any erased block recoverable, false otherwise
   */
  public boolean anyRecoverable(ECBlockGroup blockGroup) {
    int erasedCount = blockGroup.getErasedCount();

    return erasedCount > 0 && erasedCount <= getRequiredNumParityBlocks();
  }

}