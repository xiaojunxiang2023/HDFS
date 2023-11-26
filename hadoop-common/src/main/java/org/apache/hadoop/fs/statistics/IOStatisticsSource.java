package org.apache.hadoop.fs.statistics;

/**
 * A source of IO statistics.
 * <p>
 * These statistics MUST be instance specific, not thread local.
 * </p>
 */
public interface IOStatisticsSource {

  /**
   * Return a statistics instance.
   * <p>
   * It is not a requirement that the same instance is returned every time.
   * {@link IOStatisticsSource}.
   * <p>
   * If the object implementing this is Closeable, this method
   * may return null if invoked on a closed object, even if
   * it returns a valid instance when called earlier.
   * @return an IOStatistics instance or null
   */
  default IOStatistics getIOStatistics() {
    return null;
  }
}
