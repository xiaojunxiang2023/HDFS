package org.apache.hadoop.fs;

import java.util.Collections;
import java.util.Iterator;

/**
 * EmptyStorageStatistics is a StorageStatistics implementation which has no
 * data.
 */
class EmptyStorageStatistics extends StorageStatistics {
  EmptyStorageStatistics(String name) {
    super(name);
  }

  @Override
  public Iterator<LongStatistic> getLongStatistics() {
    return Collections.emptyIterator();
  }

  @Override
  public Long getLong(String key) {
    return null;
  }

  @Override
  public boolean isTracked(String key) {
    return false;
  }

  @Override
  public void reset() {
  }
}
