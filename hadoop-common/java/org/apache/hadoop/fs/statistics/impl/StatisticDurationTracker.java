package org.apache.hadoop.fs.statistics.impl;

import org.apache.hadoop.fs.statistics.DurationTracker;
import org.apache.hadoop.fs.statistics.StoreStatisticNames;
import org.apache.hadoop.util.OperationDuration;

/**
 * Track the duration of an object.
 *
 * When closed the
 * min/max/mean statistics are updated.
 *
 * In the constructor, the counter with name of 'key' is
 * incremented -default is by 1, but can be set to other
 * values, including 0.
 */
public class StatisticDurationTracker extends OperationDuration
    implements DurationTracker {

  /**
   * Statistics to update.
   */
  private final IOStatisticsStore iostats;

  /**
   * Key to use as prefix of values.
   */
  private final String key;

  /**
   * Flag to indicate the operation failed.
   */
  private boolean failed;

  /**
   * Constructor -increments the counter by 1.
   * @param iostats statistics to update
   * @param key prefix of values.
   */
  public StatisticDurationTracker(
      final IOStatisticsStore iostats,
      final String key) {
    this(iostats, key, 1);
  }

  /**
   * Constructor.
   * If the supplied count is greater than zero, the counter
   * of the key name is updated.
   * @param iostats statistics to update
   * @param key Key to use as prefix of values.
   * @param count #of times to increment the matching counter.
   */
  public StatisticDurationTracker(
      final IOStatisticsStore iostats,
      final String key,
      final long count) {
    this.iostats = iostats;
    this.key = key;
    if (count > 0) {
      iostats.incrementCounter(key, count);
    }
  }

  @Override
  public void failed() {
    failed = true;
  }

  /**
   * Set the finished time and then update the statistics.
   * If the operation failed then the key + .failures counter will be
   * incremented by one.
   * The operation min/mean/max values will be updated with the duration;
   * on a failure these will all be the .failures metrics.
   */
  @Override
  public void close() {
    finished();
    String name = key;
    if (failed) {
      // failure:
      name = key + StoreStatisticNames.SUFFIX_FAILURES;
      iostats.incrementCounter(name);
    }
    iostats.addTimedOperation(name, asDuration());
  }
}
