package org.apache.hadoop.metrics2;

import org.apache.hadoop.metrics2.annotation.Metric;

/**
 * Interface to provide immutable metainfo for metrics.
 */
public interface MetricsInfo {
  /**
   * Typically name corresponds to annotation {@link Metric#value()} or
   * the name of the class.
   * @return the name of the metric/tag
   */
  String name();

  /**
   * Typically the description corresponds to annotation {@link Metric#about()}
   * or the name of the class.
   * @return the description of the metric/tag
   */
  String description();
}
