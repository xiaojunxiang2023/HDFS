package org.apache.hadoop.metrics2;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * The source of metrics information. It generates and updates metrics. It
 * registers with {@link MetricsSystem}, which periodically polls it to collect
 * {@link MetricsRecord} and passes it to {@link MetricsSink}.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface MetricsSource {
  /**
   * Get metrics from the metrics source
   * @param collector to contain the resulting metrics snapshot
   * @param all if true, return all metrics even if unchanged.
   */
  void getMetrics(MetricsCollector collector, boolean all);
}
