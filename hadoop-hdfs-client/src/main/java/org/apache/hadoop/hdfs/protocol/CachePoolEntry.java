package org.apache.hadoop.hdfs.protocol;

/**
 * Describes a Cache Pool entry.
 */
public class CachePoolEntry {
  private final CachePoolInfo info;
  private final CachePoolStats stats;

  public CachePoolEntry(CachePoolInfo info, CachePoolStats stats) {
    this.info = info;
    this.stats = stats;
  }

  public CachePoolInfo getInfo() {
    return info;
  }

  public CachePoolStats getStats() {
    return stats;
  }
}
