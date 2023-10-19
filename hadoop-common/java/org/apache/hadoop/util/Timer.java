package org.apache.hadoop.util;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Utility methods for getting the time and computing intervals.
 *
 * It has the same behavior as {{@link Time}}, with the exception that its
 * functions can be overridden for dependency injection purposes.
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
public class Timer {
  /**
   * Current system time.  Do not use this to calculate a duration or interval
   * to sleep, because it will be broken by settimeofday.  Instead, use
   * monotonicNow.
   * @return current time in msec.
   */
  public long now() {
    return Time.now();
  }

  /**
   * Current time from some arbitrary time base in the past, counting in
   * milliseconds, and not affected by settimeofday or similar system clock
   * changes.  This is appropriate to use when computing how much longer to
   * wait for an interval to expire.
   * @return a monotonic clock that counts in milliseconds.
   */
  public long monotonicNow() { return Time.monotonicNow(); }

  /**
   * Same as {@link #monotonicNow()} but returns its result in nanoseconds.
   * Note that this is subject to the same resolution constraints as
   * {@link System#nanoTime()}.
   * @return a monotonic clock that counts in nanoseconds.
   */
  public long monotonicNowNanos() {
    return Time.monotonicNowNanos();
  }
}
