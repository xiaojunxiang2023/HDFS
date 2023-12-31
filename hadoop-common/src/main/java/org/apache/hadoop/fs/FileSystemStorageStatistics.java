package org.apache.hadoop.fs;

import org.apache.hadoop.fs.FileSystem.Statistics.StatisticsData;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * A basic StorageStatistics instance which simply returns data from
 * FileSystem#Statistics.
 */
public class FileSystemStorageStatistics extends StorageStatistics {
  /**
   * The per-class FileSystem statistics.
   */
  private final FileSystem.Statistics stats;

  private static final String[] KEYS = {
      "bytesRead",
      "bytesWritten",
      "readOps",
      "largeReadOps",
      "writeOps",
      "bytesReadLocalHost",
      "bytesReadDistanceOfOneOrTwo",
      "bytesReadDistanceOfThreeOrFour",
      "bytesReadDistanceOfFiveOrLarger",
      "bytesReadErasureCoded"
  };

  private static class LongStatisticIterator
      implements Iterator<LongStatistic> {
    private final StatisticsData data;

    private int keyIdx;

    LongStatisticIterator(StatisticsData data) {
      this.data = data;
      this.keyIdx = 0;
    }

    @Override
    public boolean hasNext() {
      return (this.keyIdx < KEYS.length);
    }

    @Override
    public LongStatistic next() {
      if (this.keyIdx >= KEYS.length) {
        throw new NoSuchElementException();
      }
      String key = KEYS[this.keyIdx++];
      Long val = fetch(data, key);
      return new LongStatistic(key, val.longValue());
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

  private static Long fetch(StatisticsData data, String key) {
    Preconditions.checkArgument(key != null,
        "The stat key of FileSystemStorageStatistics should not be null!");

    switch (key) {
      case "bytesRead":
        return data.getBytesRead();
      case "bytesWritten":
        return data.getBytesWritten();
      case "readOps":
        return (long) (data.getReadOps() + data.getLargeReadOps());
      case "largeReadOps":
        return Long.valueOf(data.getLargeReadOps());
      case "writeOps":
        return Long.valueOf(data.getWriteOps());
      case "bytesReadLocalHost":
        return data.getBytesReadLocalHost();
      case "bytesReadDistanceOfOneOrTwo":
        return data.getBytesReadDistanceOfOneOrTwo();
      case "bytesReadDistanceOfThreeOrFour":
        return data.getBytesReadDistanceOfThreeOrFour();
      case "bytesReadDistanceOfFiveOrLarger":
        return data.getBytesReadDistanceOfFiveOrLarger();
      case "bytesReadErasureCoded":
        return data.getBytesReadErasureCoded();
      default:
        return null;
    }
  }

  FileSystemStorageStatistics(String name, FileSystem.Statistics stats) {
    super(name);
    Preconditions.checkArgument(stats != null,
        "FileSystem.Statistics can not be null");
    Preconditions.checkArgument(stats.getData() != null,
        "FileSystem.Statistics can not have null data");
    this.stats = stats;
  }

  @Override
  public String getScheme() {
    return stats.getScheme();
  }

  @Override
  public Iterator<LongStatistic> getLongStatistics() {
    return new LongStatisticIterator(stats.getData());
  }

  @Override
  public Long getLong(String key) {
    return fetch(stats.getData(), key);
  }

  /**
   * Return true if a statistic is being tracked.
   *
   * @return True only if the statistic is being tracked.
   */
  @Override
  public boolean isTracked(String key) {
    for (String k : KEYS) {
      if (k.equals(key)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void reset() {
    stats.reset();
  }
}
