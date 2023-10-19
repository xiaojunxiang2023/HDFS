package org.apache.hadoop.util;

import java.time.Duration;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Little duration counter.
 */
@InterfaceAudience.Public
@InterfaceStability.Unstable
public class OperationDuration {

  /**
   * Time in millis when the operation started.
   */
  private final long started;

  /**
   * Time when the operation finished.
   */
  private long finished;

  /**
   * Instantiate.
   * The start time and finished time are both set
   * to the current clock time.
   */
  public OperationDuration() {
    started = time();
    finished = started;
  }

  /**
   * Evaluate the system time.
   * @return the current clock time.
   */
  protected long time() {
    return System.currentTimeMillis();
  }

  /**
   * Update the finished time with the current system time.
   */
  public void finished() {
    finished = time();
  }

  /**
   * Return the duration as {@link #humanTime(long)}.
   * @return a printable duration.
   */
  public String getDurationString() {
    return humanTime(value());
  }

  /**
   * Convert to a human time of minutes:seconds.millis.
   * @param time time to humanize.
   * @return a printable value.
   */
  public static String humanTime(long time) {
    long seconds = (time / 1000);
    long minutes = (seconds / 60);
    return String.format("%d:%02d.%03ds", minutes, seconds % 60, time % 1000);
  }

  /**
   * Return the duration as {@link #humanTime(long)}.
   * @return a printable duration.
   */
  @Override
  public String toString() {
    return getDurationString();
  }

  /**
   * Get the duration in milliseconds.
   * <p></p>
   * This will be 0 until a call
   * to {@link #finished()} has been made.
   * @return the currently recorded duration.
   */
  public long value() {
    return finished -started;
  }

  /**
   * Get the duration of an operation as a java Duration
   * instance.
   * @return a duration.
   */
  public Duration asDuration() {
    return Duration.ofMillis(value());
  }
}
