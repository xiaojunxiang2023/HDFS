package org.apache.hadoop.hdfs.protocol;

/**
 * Describes a path-based cache directive entry.
 */
public class CacheDirectiveEntry {
  private final CacheDirectiveInfo info;
  private final CacheDirectiveStats stats;

  public CacheDirectiveEntry(CacheDirectiveInfo info,
      CacheDirectiveStats stats) {
    this.info = info;
    this.stats = stats;
  }

  public CacheDirectiveInfo getInfo() {
    return info;
  }

  public CacheDirectiveStats getStats() {
    return stats;
  }
}
