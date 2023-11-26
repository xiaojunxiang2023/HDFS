package org.apache.hadoop.fs.store;

public interface BlockUploadStatistics {

  /**
   * A block has been allocated.
   */
  void blockAllocated();

  /**
   * A block has been released.
   */
  void blockReleased();

}
