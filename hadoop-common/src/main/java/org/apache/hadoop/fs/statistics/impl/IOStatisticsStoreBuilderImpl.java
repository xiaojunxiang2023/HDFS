package org.apache.hadoop.fs.statistics.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.apache.hadoop.fs.statistics.StoreStatisticNames.*;

/**
 * Builder for an IOStatistics store..
 */
final class IOStatisticsStoreBuilderImpl implements
    IOStatisticsStoreBuilder {

  private final List<String> counters = new ArrayList<>();

  private final List<String> gauges = new ArrayList<>();

  private final List<String> minimums = new ArrayList<>();

  private final List<String> maximums = new ArrayList<>();

  private final List<String> meanStatistics = new ArrayList<>();

  @Override
  public IOStatisticsStoreBuilderImpl withCounters(final String... keys) {
    counters.addAll(Arrays.asList(keys));
    return this;
  }

  @Override
  public IOStatisticsStoreBuilderImpl withGauges(final String... keys) {
    gauges.addAll(Arrays.asList(keys));
    return this;
  }

  @Override
  public IOStatisticsStoreBuilderImpl withMaximums(final String... keys) {
    maximums.addAll(Arrays.asList(keys));
    return this;
  }

  @Override
  public IOStatisticsStoreBuilderImpl withMinimums(final String... keys) {
    minimums.addAll(Arrays.asList(keys));
    return this;
  }

  @Override
  public IOStatisticsStoreBuilderImpl withMeanStatistics(
      final String... keys) {
    meanStatistics.addAll(Arrays.asList(keys));
    return this;
  }

  @Override
  public IOStatisticsStoreBuilderImpl withDurationTracking(
      final String... prefixes) {
    for (String p : prefixes) {
      withCounters(p, p + SUFFIX_FAILURES);
      withMinimums(
          p + SUFFIX_MIN,
          p + SUFFIX_FAILURES + SUFFIX_MIN);
      withMaximums(
          p + SUFFIX_MAX,
          p + SUFFIX_FAILURES + SUFFIX_MAX);
      withMeanStatistics(
          p + SUFFIX_MEAN,
          p + SUFFIX_FAILURES + SUFFIX_MEAN);
    }
    return this;
  }

  @Override
  public IOStatisticsStore build() {
    return new IOStatisticsStoreImpl(counters, gauges, minimums,
        maximums, meanStatistics);
  }
}
