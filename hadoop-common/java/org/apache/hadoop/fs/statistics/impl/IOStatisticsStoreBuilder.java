package org.apache.hadoop.fs.statistics.impl;

/**
 * Builder of the {@link IOStatisticsStore} implementation.
 */
public interface IOStatisticsStoreBuilder {

  /**
   * Declare a varargs list of counters to add.
   * @param keys names of statistics.
   * @return this builder.
   */
  IOStatisticsStoreBuilder withCounters(String... keys);

  /**
   * Declare a varargs list of gauges to add.
   * @param keys names of statistics.
   * @return this builder.
   */
  IOStatisticsStoreBuilder withGauges(String... keys);

  /**
   * Declare a varargs list of maximums to add.
   * @param keys names of statistics.
   * @return this builder.
   */
  IOStatisticsStoreBuilder withMaximums(String... keys);

  /**
   * Declare a varargs list of minimums to add.
   * @param keys names of statistics.
   * @return this builder.
   */
  IOStatisticsStoreBuilder withMinimums(String... keys);

  /**
   * Declare a varargs list of means to add.
   * @param keys names of statistics.
   * @return this builder.
   */
  IOStatisticsStoreBuilder withMeanStatistics(String... keys);

  /**
   * Add a statistic in the counter, min, max and mean maps for each
   * declared statistic prefix.
   * @param prefixes prefixes for the stats.
   * @return this
   */
  IOStatisticsStoreBuilder withDurationTracking(
      String... prefixes);

  /**
   * Build the collector.
   * @return a new collector.
   */
  IOStatisticsStore build();
}
