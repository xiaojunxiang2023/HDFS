package org.apache.hadoop.hdfs;

import org.apache.hadoop.hdfs.protocol.BlockType;

/**
 * A utility class that maintains statistics for reading.
 */
public class ReadStatistics {
  private long totalBytesRead;
  private long totalLocalBytesRead;
  private long totalShortCircuitBytesRead;
  private long totalZeroCopyBytesRead;

  private BlockType blockType = BlockType.CONTIGUOUS;
  private long totalEcDecodingTimeMillis;

  public ReadStatistics() {
    clear();
  }

  public ReadStatistics(ReadStatistics rhs) {
    this.totalBytesRead = rhs.getTotalBytesRead();
    this.totalLocalBytesRead = rhs.getTotalLocalBytesRead();
    this.totalShortCircuitBytesRead = rhs.getTotalShortCircuitBytesRead();
    this.totalZeroCopyBytesRead = rhs.getTotalZeroCopyBytesRead();
  }

  /**
   * @return The total bytes read.  This will always be at least as
   * high as the other numbers, since it includes all of them.
   */
  public synchronized long getTotalBytesRead() {
    return totalBytesRead;
  }

  /**
   * @return The total local bytes read.  This will always be at least
   * as high as totalShortCircuitBytesRead, since all short-circuit
   * reads are also local.
   */
  public synchronized long getTotalLocalBytesRead() {
    return totalLocalBytesRead;
  }

  /**
   * @return The total short-circuit local bytes read.
   */
  public synchronized long getTotalShortCircuitBytesRead() {
    return totalShortCircuitBytesRead;
  }

  /**
   * @return The total number of zero-copy bytes read.
   */
  public synchronized long getTotalZeroCopyBytesRead() {
    return totalZeroCopyBytesRead;
  }

  /**
   * @return The total number of bytes read which were not local.
   */
  public synchronized long getRemoteBytesRead() {
    return totalBytesRead - totalLocalBytesRead;
  }

  /**
   * @return block type of the input stream. If block type != CONTIGUOUS,
   * it is reading erasure coded data.
   */
  public synchronized BlockType getBlockType() {
    return blockType;
  }

  /**
   * Return the total time in milliseconds used for erasure coding decoding.
   */
  public synchronized long getTotalEcDecodingTimeMillis() {
    return totalEcDecodingTimeMillis;
  }

  public synchronized void addRemoteBytes(long amt) {
    this.totalBytesRead += amt;
  }

  public synchronized void addLocalBytes(long amt) {
    this.totalBytesRead += amt;
    this.totalLocalBytesRead += amt;
  }

  public synchronized void addShortCircuitBytes(long amt) {
    this.totalBytesRead += amt;
    this.totalLocalBytesRead += amt;
    this.totalShortCircuitBytesRead += amt;
  }

  public synchronized void addZeroCopyBytes(long amt) {
    this.totalBytesRead += amt;
    this.totalLocalBytesRead += amt;
    this.totalShortCircuitBytesRead += amt;
    this.totalZeroCopyBytesRead += amt;
  }

  public synchronized void addErasureCodingDecodingTime(long millis) {
    this.totalEcDecodingTimeMillis += millis;
  }

  synchronized void setBlockType(BlockType blockType) {
    this.blockType = blockType;
  }

  public synchronized void clear() {
    this.totalBytesRead = 0;
    this.totalLocalBytesRead = 0;
    this.totalShortCircuitBytesRead = 0;
    this.totalZeroCopyBytesRead = 0;
    this.totalEcDecodingTimeMillis = 0;
  }
}
