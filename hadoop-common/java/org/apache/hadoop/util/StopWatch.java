package org.apache.hadoop.util;

import java.io.Closeable;
import java.util.concurrent.TimeUnit;

/**
 * A simplified StopWatch implementation which can measure times in nanoseconds.
 */
public class StopWatch implements Closeable {
  private final Timer timer;
  private boolean isStarted;
  private long startNanos;
  private long currentElapsedNanos;

  public StopWatch() {
    this(new Timer());
  }

  /**
   * Used for tests to be able to create a StopWatch which does not follow real
   * time.
   * @param timer The timer to base this StopWatch's timekeeping off of.
   */
  public StopWatch(Timer timer) {
    this.timer = timer;
  }

  /**
   * The method is used to find out if the StopWatch is started.
   * @return boolean If the StopWatch is started.
   */
  public boolean isRunning() {
    return isStarted;
  }

  /**
   * Start to measure times and make the state of stopwatch running.
   * @return this instance of StopWatch.
   */
  public StopWatch start() {
    if (isStarted) {
      throw new IllegalStateException("StopWatch is already running");
    }
    isStarted = true;
    startNanos = timer.monotonicNowNanos();
    return this;
  }

  /**
   * Stop elapsed time and make the state of stopwatch stop.
   * @return this instance of StopWatch.
   */
  public StopWatch stop() {
    if (!isStarted) {
      throw new IllegalStateException("StopWatch is already stopped");
    }
    long now = timer.monotonicNowNanos();
    isStarted = false;
    currentElapsedNanos += now - startNanos;
    return this;
  }

  /**
   * Reset elapsed time to zero and make the state of stopwatch stop.
   * @return this instance of StopWatch.
   */
  public StopWatch reset() {
    currentElapsedNanos = 0;
    isStarted = false;
    return this;
  }

  /**
   * @return current elapsed time in specified timeunit.
   */
  public long now(TimeUnit timeUnit) {
    return timeUnit.convert(now(), TimeUnit.NANOSECONDS);

  }

  /**
   * @return current elapsed time in nanosecond.
   */
  public long now() {
    return isStarted ?
        timer.monotonicNowNanos() - startNanos + currentElapsedNanos :
        currentElapsedNanos;
  }

  @Override
  public String toString() {
    return String.valueOf(now());
  }

  @Override
  public void close() {
    if (isStarted) {
      stop();
    }
  }
}
