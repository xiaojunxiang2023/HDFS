package org.apache.hadoop.fs.statistics;

import javax.annotation.Nullable;
import java.io.Serializable;

import static org.apache.hadoop.fs.statistics.StoreStatisticNames.*;

/**
 * Summary of duration tracking statistics
 * as extracted from an IOStatistics instance.
 * <p>
 * This is for reporting and testing.
 */
public final class DurationStatisticSummary implements Serializable {

  private static final long serialVersionUID = 6776381340896518486L;

  /** Statistic key. */
  private final String key;

  /** Are these success or failure statistics. */
  private final boolean success;

  /** Count of operation invocations. */
  private final long count;

  /** Max duration; -1 if unknown. */
  private final long max;

  /** Min duration; -1 if unknown. */
  private final long min;

  /** Mean duration -may be null. */
  private final MeanStatistic mean;

  /**
   * Constructor.
   * @param key Statistic key.
   * @param success Are these success or failure statistics.
   * @param count Count of operation invocations.
   * @param max Max duration; -1 if unknown.
   * @param min Min duration; -1 if unknown.
   * @param mean Mean duration -may be null. (will be cloned)
   */
  public DurationStatisticSummary(final String key,
                                  final boolean success,
                                  final long count,
                                  final long max,
                                  final long min,
                                  @Nullable final MeanStatistic mean) {
    this.key = key;
    this.success = success;
    this.count = count;
    this.max = max;
    this.min = min;
    this.mean = mean == null ? null : mean.clone();
  }

  public String getKey() {
    return key;
  }

  public boolean isSuccess() {
    return success;
  }

  public long getCount() {
    return count;
  }

  public long getMax() {
    return max;
  }

  public long getMin() {
    return min;
  }

  public MeanStatistic getMean() {
    return mean;
  }

  @Override
  public String toString() {
    return "DurationStatisticSummary{" +
        "key='" + key + '\'' +
        ", success=" + success +
        ", counter=" + count +
        ", max=" + max +
        ", mean=" + mean +
        '}';
  }

  /**
   * Fetch the duration timing summary of success or failure operations
   * from an IO Statistics source.
   * If the duration key is unknown, the summary will be incomplete.
   * @param source source of data
   * @param key duration statistic key
   * @param success fetch success statistics, or if false, failure stats.
   * @return a summary of the statistics.
   */
  public static DurationStatisticSummary fetchDurationSummary(
      IOStatistics source,
      String key,
      boolean success) {
    String fullkey = success ? key : key + SUFFIX_FAILURES;
    return new DurationStatisticSummary(key, success,
        source.counters().getOrDefault(fullkey, 0L),
        source.maximums().getOrDefault(fullkey + SUFFIX_MAX, -1L),
        source.minimums().getOrDefault(fullkey + SUFFIX_MIN, -1L),
        source.meanStatistics()
            .get(fullkey + SUFFIX_MEAN));
  }

  /**
   * Fetch the duration timing summary from an IOStatistics source.
   * If the duration key is unknown, the summary will be incomplete.
   * @param source source of data
   * @param key duration statistic key
   * @return a summary of the statistics.
   */
  public static DurationStatisticSummary fetchSuccessSummary(
      IOStatistics source,
      String key) {
    return fetchDurationSummary(source, key, true);
  }
}
