package org.apache.hadoop.io.erasurecode;

/**
 * A wrapper of block level data source/output that {@link ECChunk}s can be
 * extracted from. For HDFS, it can be an HDFS block (250MB). Note it only cares
 * about erasure coding specific logic thus avoids coupling with any HDFS block
 * details. We can have something like HdfsBlock extend it.
 */
public class ECBlock {

  private boolean isParity;
  private boolean isErased;

  /**
   * A default constructor. isParity and isErased are false by default.
   */
  public ECBlock() {
    this(false, false);
  }

  /**
   * A constructor specifying isParity and isErased.
   * @param isParity is a parity block
   * @param isErased is erased or not
   */
  public ECBlock(boolean isParity, boolean isErased) {
    this.isParity = isParity;
    this.isErased = isErased;
  }

  /**
   * Set true if it's for a parity block.
   * @param isParity is parity or not
   */
  public void setParity(boolean isParity) {
    this.isParity = isParity;
  }

  /**
   * Set true if the block is missing.
   * @param isErased is erased or not
   */
  public void setErased(boolean isErased) {
    this.isErased = isErased;
  }

  /**
   *
   * @return true if it's parity block, otherwise false
   */
  public boolean isParity() {
    return isParity;
  }

  /**
   *
   * @return true if it's erased due to erasure, otherwise false
   */
  public boolean isErased() {
    return isErased;
  }

}
