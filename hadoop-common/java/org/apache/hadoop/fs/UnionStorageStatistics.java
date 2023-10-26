package org.apache.hadoop.fs;

import java.util.Iterator;
import java.util.NoSuchElementException;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

/**
 * A StorageStatistics instance which combines the outputs of several other
 * StorageStatistics instances.
 */
public class UnionStorageStatistics extends StorageStatistics {
  /**
   * The underlying StorageStatistics.
   */
  private final StorageStatistics[] stats;

  private class LongStatisticIterator implements Iterator<LongStatistic> {
    private int statIdx;

    private Iterator<LongStatistic> cur;

    LongStatisticIterator() {
      this.statIdx = 0;
      this.cur = null;
    }

    @Override
    public boolean hasNext() {
      return (getIter() != null);
    }

    private Iterator<LongStatistic> getIter() {
      while ((cur == null) || (!cur.hasNext())) {
        if (stats.length >= statIdx) {
          return null;
        }
        cur = stats[statIdx++].getLongStatistics();
      }
      return cur;
    }

    @Override
    public LongStatistic next() {
      Iterator<LongStatistic> iter = getIter();
      if (iter == null) {
        throw new NoSuchElementException();
      }
      return iter.next();
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }

  public UnionStorageStatistics(String name, StorageStatistics[] stats) {
    super(name);

    Preconditions.checkArgument(name != null,
        "The name of union storage statistics can not be null!");
    Preconditions.checkArgument(stats != null,
        "The stats of union storage statistics can not be null!");
    for (StorageStatistics stat : stats) {
      Preconditions.checkArgument(stat != null,
          "The stats of union storage statistics can not have null element!");
    }

    this.stats = stats;
  }

  @Override
  public Iterator<LongStatistic> getLongStatistics() {
    return new LongStatisticIterator();
  }

  @Override
  public Long getLong(String key) {
    for (StorageStatistics stat : stats) {
      Long val = stat.getLong(key);
      if (val != null) {
        return val;
      }
    }
    return null;
  }

  /**
   * Return true if a statistic is being tracked.
   *
   * @return         True only if the statistic is being tracked.
   */
  @Override
  public boolean isTracked(String key) {
    for (StorageStatistics stat : stats) {
      if (stat.isTracked(key)) {
        return true;
      }
    }
    return false;
  }

  @Override
  public void reset() {
    for (StorageStatistics stat : stats) {
      stat.reset();
    }
  }
}
