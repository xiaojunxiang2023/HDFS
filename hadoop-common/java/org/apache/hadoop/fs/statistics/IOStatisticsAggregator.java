package org.apache.hadoop.fs.statistics;

import javax.annotation.Nullable;

/**
 * Interface exported by classes which support
 * aggregation of {@link IOStatistics}.
 * Implementations MAY aggregate all statistics
 * exported by the IOStatistics reference passed in to
 * {@link #aggregate(IOStatistics)}, or they
 * may selectively aggregate specific values/classes
 * of statistics.
 */
public interface IOStatisticsAggregator {

  /**
   * Aggregate the supplied statistics into the current
   * set.
   *
   * @param statistics statistics; may be null
   * @return true if the statistics reference was not null and
   * so aggregated.
   */
  boolean aggregate(@Nullable IOStatistics statistics);
}
