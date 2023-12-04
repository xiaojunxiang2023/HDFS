package org.apache.hadoop.metrics2;

/**
 * The metrics filter interface. The MetricsFilter objects can be used either to
 * filter the metrics from {@link MetricsSource}s or to filter metrics per
 * {@link MetricsSink}.
 */
public abstract class MetricsFilter implements MetricsPlugin {

  /**
   * Whether to accept the name
   * @param name  to filter on
   * @return true to accept; false otherwise.
   */
  public abstract boolean accepts(String name);

  /**
   * Whether to accept the tag
   * @param tag to filter on
   * @return true to accept; false otherwise
   */
  public abstract boolean accepts(MetricsTag tag);

  /**
   * Whether to accept the tags
   * @param tags to filter on
   * @return true to accept; false otherwise
   */
  public abstract boolean accepts(Iterable<MetricsTag> tags);

  /**
   * Whether to accept the record
   * @param record  to filter on
   * @return true to accept; false otherwise.
   */
  public boolean accepts(MetricsRecord record) {
    return accepts(record.name()) && accepts(record.tags());
  }

}
