package org.apache.hadoop.fs.statistics;

import static org.apache.hadoop.fs.statistics.IOStatisticsSupport.stubDurationTracker;

/**
 * Interface for a source of duration tracking.
 *
 * This is intended for uses where it can be passed into classes
 * which update operation durations, without tying those
 * classes to internal implementation details.
 */
public interface DurationTrackerFactory {

  /**
   * Initiate a duration tracking operation by creating/returning
   * an object whose {@code close()} call will
   * update the statistics.
   *
   * The statistics counter with the key name will be incremented
   * by the given count.
   *
   * The expected use is within a try-with-resources clause.
   *
   * The default implementation returns a stub duration tracker.
   * @param key statistic key prefix
   * @param count  #of times to increment the matching counter in this
   * operation.
   * @return an object to close after an operation completes.
   */
  default DurationTracker trackDuration(String key, long count) {
    return stubDurationTracker();
  }

  /**
   * Initiate a duration tracking operation by creating/returning
   * an object whose {@code close()} call will
   * update the statistics.
   * The expected use is within a try-with-resources clause.
   * @param key statistic key
   * @return an object to close after an operation completes.
   */
  default DurationTracker trackDuration(String key) {
    return trackDuration(key, 1);
  }
}
