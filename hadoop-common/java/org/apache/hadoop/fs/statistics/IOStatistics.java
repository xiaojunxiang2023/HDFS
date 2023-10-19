package org.apache.hadoop.fs.statistics;

import java.util.Map;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * IO Statistics.
 * <p>
 * These are low-cost per-instance statistics provided by any Hadoop
 * I/O class instance.
 * <p>
 * Consult the filesystem specification document for the requirements
 * of an implementation of this interface.
 */
@InterfaceAudience.Public
@InterfaceStability.Unstable
public interface IOStatistics {

  /**
   * Map of counters.
   * @return the current map of counters.
   */
  Map<String, Long> counters();

  /**
   * Map of gauges.
   * @return the current map of gauges.
   */
  Map<String, Long> gauges();

  /**
   * Map of minimums.
   * @return the current map of minimums.
   */
  Map<String, Long> minimums();

  /**
   * Map of maximums.
   * @return the current map of maximums.
   */
  Map<String, Long> maximums();

  /**
   * Map of meanStatistics.
   * @return the current map of MeanStatistic statistics.
   */
  Map<String, MeanStatistic> meanStatistics();

  /**
   * Value when a minimum value has never been set.
   */
  long MIN_UNSET_VALUE = -1;

  /**
   * Value when a max value has never been set.
   */
  long MAX_UNSET_VALUE = -1;
}
