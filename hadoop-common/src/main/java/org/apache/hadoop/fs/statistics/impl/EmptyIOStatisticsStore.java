package org.apache.hadoop.fs.statistics.impl;

import org.apache.hadoop.fs.statistics.IOStatistics;
import org.apache.hadoop.fs.statistics.MeanStatistic;

import javax.annotation.Nullable;
import java.time.Duration;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

import static java.util.Collections.emptyMap;

/**
 * An Empty IOStatisticsStore implementation.
 */
final class EmptyIOStatisticsStore implements IOStatisticsStore {

  /**
   * The sole instance of this class.
   */
  private static final EmptyIOStatisticsStore INSTANCE =
      new EmptyIOStatisticsStore();

  /**
   * Get the single instance of this class.
   * @return a shared, empty instance.
   */
  static IOStatisticsStore getInstance() {
    return INSTANCE;
  }

  private EmptyIOStatisticsStore() {
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

  @Override
  public boolean aggregate(@Nullable final IOStatistics statistics) {
    return false;
  }

  @Override
  public long incrementCounter(final String key, final long value) {
    return 0;
  }

  @Override
  public void setCounter(final String key, final long value) {

  }

  @Override
  public void setGauge(final String key, final long value) {

  }

  @Override
  public long incrementGauge(final String key, final long value) {
    return 0;
  }

  @Override
  public void setMaximum(final String key, final long value) {

  }

  @Override
  public long incrementMaximum(final String key, final long value) {
    return 0;
  }

  @Override
  public void setMinimum(final String key, final long value) {

  }

  @Override
  public long incrementMinimum(final String key, final long value) {
    return 0;
  }

  @Override
  public void addMinimumSample(final String key, final long value) {

  }

  @Override
  public void addMaximumSample(final String key, final long value) {

  }

  @Override
  public void setMeanStatistic(final String key, final MeanStatistic value) {

  }

  @Override
  public void addMeanStatisticSample(final String key, final long value) {

  }

  @Override
  public void reset() {

  }

  @Override
  public AtomicLong getCounterReference(final String key) {
    return null;
  }

  @Override
  public AtomicLong getMaximumReference(final String key) {
    return null;
  }

  @Override
  public AtomicLong getMinimumReference(final String key) {
    return null;
  }

  @Override
  public AtomicLong getGaugeReference(final String key) {
    return null;
  }

  @Override
  public MeanStatistic getMeanStatistic(final String key) {
    return null;
  }

  @Override
  public void addTimedOperation(final String prefix,
                                final long durationMillis) {

  }

  @Override
  public void addTimedOperation(final String prefix, final Duration duration) {

  }
}
