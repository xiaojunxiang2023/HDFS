package org.apache.hadoop.fs.statistics;

import java.time.Duration;

/**
 * Interface to be implemented by objects which can track duration.
 * It extends AutoCloseable to fit into a try-with-resources statement,
 * but then strips out the {@code throws Exception} aspect of the signature
 * so it doesn't force code to add extra handling for any failures.
 *
 * If a duration is declared as "failed()" then the failure counters
 * will be updated.
 */
public interface DurationTracker extends AutoCloseable {

  /**
   * The operation failed. Failure statistics will be updated.
   */
  void failed();

  /**
   * Finish tracking: update the statistics with the timings.
   */
  void close();

  /**
   * Get the duration of an operation as a java Duration
   * instance. If the duration tracker hasn't completed,
   * or its duration tracking doesn't actually measure duration,
   * returns Duration.ZERO.
   * @return a duration, value of ZERO until close().
   */
  default Duration asDuration() {
    return Duration.ZERO;
  }
}
