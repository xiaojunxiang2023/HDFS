package org.apache.hadoop.fs;

import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.TreeMap;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

/**
 * Stores global storage statistics objects.
 */
public enum GlobalStorageStatistics {
  /**
   * The GlobalStorageStatistics singleton.
   */
  INSTANCE;

  /**
   * A map of all global StorageStatistics objects, indexed by name.
   */
  private final NavigableMap<String, StorageStatistics> map = new TreeMap<>();

  /**
   * A callback API for creating new StorageStatistics instances.
   */
  public interface StorageStatisticsProvider {
    StorageStatistics provide();
  }

  /**
   * Get the StorageStatistics object with the given name.
   *
   * @param name        The storage statistics object name.
   * @return            The StorageStatistics object with the given name, or
   *                      null if there is none.
   */
  public synchronized StorageStatistics get(String name) {
    return name == null ? null : map.get(name);
  }

  /**
   * Create or return the StorageStatistics object with the given name.
   *
   * @param name        The storage statistics object name.
   * @param provider    An object which can create a new StorageStatistics
   *                      object if needed.
   * @return            The StorageStatistics object with the given name.
   * @throws RuntimeException  If the StorageStatisticsProvider provides a null
   *                           object or a new StorageStatistics object with the
   *                           wrong name.
   */
  public synchronized StorageStatistics put(String name,
      StorageStatisticsProvider provider) {
    Preconditions.checkNotNull(name,
        "Storage statistics can not have a null name!");
    StorageStatistics stats = map.get(name);
    if (stats != null) {
      return stats;
    }
    stats = provider.provide();
    if (stats == null) {
      throw new RuntimeException("StorageStatisticsProvider for " + name +
          " should not provide a null StorageStatistics object.");
    }
    if (!stats.getName().equals(name)) {
      throw new RuntimeException("StorageStatisticsProvider for " + name +
          " provided a StorageStatistics object for " + stats.getName() +
          " instead.");
    }
    map.put(name, stats);
    return stats;
  }

  /**
   * Reset all global storage statistics.
   */
  public synchronized void reset() {
    for (StorageStatistics statistics : map.values()) {
      statistics.reset();
    }
  }

  /**
   * Get an iterator that we can use to iterate throw all the global storage
   * statistics objects.
   */
  synchronized public Iterator<StorageStatistics> iterator() {
    Entry<String, StorageStatistics> first = map.firstEntry();
    return new StorageIterator((first == null) ? null : first.getValue());
  }

  private class StorageIterator implements Iterator<StorageStatistics> {
    private StorageStatistics next = null;

    StorageIterator(StorageStatistics first) {
      this.next = first;
    }

    @Override
    public boolean hasNext() {
      return (next != null);
    }

    @Override
    public StorageStatistics next() {
      if (next == null) {
        throw new NoSuchElementException();
      }
      synchronized (GlobalStorageStatistics.this) {
        StorageStatistics cur = next;
        Entry<String, StorageStatistics> nextEntry =
            map.higherEntry(cur.getName());
        next = (nextEntry == null) ? null : nextEntry.getValue();
        return cur;
      }
    }

    @Override
    public void remove() {
      throw new UnsupportedOperationException();
    }
  }
}
