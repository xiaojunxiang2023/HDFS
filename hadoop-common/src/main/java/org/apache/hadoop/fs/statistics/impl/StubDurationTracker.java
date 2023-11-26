package org.apache.hadoop.fs.statistics.impl;

import java.time.Duration;

import org.apache.hadoop.fs.statistics.DurationTracker;

/**
 * A simple stub duration tracker which can be issued in interfaces
 * and other places where full duration tracking is not implemented.
 */
public final class StubDurationTracker implements DurationTracker {

  public static final DurationTracker STUB_DURATION_TRACKER =
      new StubDurationTracker();

  private StubDurationTracker() {
  }

  @Override
  public void failed() {

  }

  @Override
  public void close() {

  }

  @Override
  public Duration asDuration() {
    return Duration.ZERO;
  }
}
