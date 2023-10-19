package org.apache.hadoop.fs.statistics.impl;

import org.apache.hadoop.fs.statistics.DurationTracker;
import org.apache.hadoop.fs.statistics.DurationTrackerFactory;

/**
 * This is a stub factory which always returns no-op duration
 * trackers. Allows for code to always be handed a factory.
 */
public final class StubDurationTrackerFactory
    implements DurationTrackerFactory {

  /**
   * Single instance.
   */
  public static final StubDurationTrackerFactory STUB_DURATION_TRACKER_FACTORY
      = new StubDurationTrackerFactory();

  private StubDurationTrackerFactory() {
  }

  @Override
  public DurationTracker trackDuration(final String key, final long count) {
    return StubDurationTracker.STUB_DURATION_TRACKER;
  }
}
