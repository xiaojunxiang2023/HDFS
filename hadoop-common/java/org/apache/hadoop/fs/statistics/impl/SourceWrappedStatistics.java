package org.apache.hadoop.fs.statistics.impl;

import org.apache.hadoop.fs.statistics.IOStatistics;
import org.apache.hadoop.fs.statistics.IOStatisticsSource;

/**
 * Wrap a statistics instance with an {@link IOStatisticsSource}
 * instance which will then serve up the statistics when asked.
 */
public class SourceWrappedStatistics implements IOStatisticsSource {

  private final IOStatistics source;

  /**
   * Constructor.
   * @param source source of statistics.
   */
  public SourceWrappedStatistics(final IOStatistics source) {
    this.source = source;
  }

  @Override
  public IOStatistics getIOStatistics() {
    return source;
  }
}
