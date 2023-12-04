package org.apache.hadoop.fs.statistics.impl;

import org.apache.hadoop.fs.statistics.IOStatistics;
import org.apache.hadoop.fs.statistics.MeanStatistic;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

import java.util.Map;

import static org.apache.hadoop.fs.statistics.IOStatisticsLogging.ioStatisticsToString;

/**
 * Wrap IOStatistics source with another (dynamic) wrapper.
 */
public class WrappedIOStatistics extends AbstractIOStatisticsImpl {

  /**
   * The wrapped statistics.
   */
  private IOStatistics wrapped;

  /**
   * Instantiate.
   * @param wrapped nullable wrapped statistics.
   */
  public WrappedIOStatistics(final IOStatistics wrapped) {
    this.wrapped = wrapped;
  }

  /**
   * Instantiate without setting the statistics.
   * This is for subclasses which build up the map during their own
   * construction.
   */
  protected WrappedIOStatistics() {
  }

  @Override
  public Map<String, Long> counters() {
    return getWrapped().counters();
  }

  /**
   * Get at the wrapped inner statistics.
   * @return the wrapped value
   */
  protected IOStatistics getWrapped() {
    return wrapped;
  }

  /**
   * Set the wrapped statistics.
   * Will fail if the field is already set.
   * @param wrapped new value
   */
  protected void setWrapped(final IOStatistics wrapped) {
    Preconditions.checkState(this.wrapped == null,
        "Attempted to overwrite existing wrapped statistics");
    this.wrapped = wrapped;
  }

  @Override
  public Map<String, Long> gauges() {
    return getWrapped().gauges();
  }

  @Override
  public Map<String, Long> minimums() {
    return getWrapped().minimums();
  }

  @Override
  public Map<String, Long> maximums() {
    return getWrapped().maximums();
  }

  @Override
  public Map<String, MeanStatistic> meanStatistics() {
    return getWrapped().meanStatistics();
  }

  /**
   * Return the statistics dump of the wrapped statistics.
   * @return the statistics for logging.
   */
  @Override
  public String toString() {
    return ioStatisticsToString(wrapped);
  }
}
