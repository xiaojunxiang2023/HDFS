package org.apache.hadoop.fs.statistics.impl;

import org.apache.hadoop.fs.statistics.IOStatistics;
import org.apache.hadoop.fs.statistics.MeanStatistic;

import java.util.Map;

import static java.util.Collections.emptyMap;

/**
 * An empty IO Statistics implementation for classes which always
 * want to return a non-null set of statistics.
 */
final class EmptyIOStatistics extends AbstractIOStatisticsImpl {

  /**
   * The sole instance of this class.
   */
  private static final EmptyIOStatistics INSTANCE = new EmptyIOStatistics();

  private EmptyIOStatistics() {
  }

  @Override
  public Map<String, Long> counters() {
    return emptyMap();
  }

  @Override
  public Map<String, Long> gauges() {
    return emptyMap();
  }

  @Override
  public Map<String, Long> minimums() {
    return emptyMap();
  }

  @Override
  public Map<String, Long> maximums() {
    return emptyMap();
  }

  @Override
  public Map<String, MeanStatistic> meanStatistics() {
    return emptyMap();
  }

  /**
   * Get the single instance of this class.
   * @return a shared, empty instance.
   */
  public static IOStatistics getInstance() {
    return INSTANCE;
  }
}
