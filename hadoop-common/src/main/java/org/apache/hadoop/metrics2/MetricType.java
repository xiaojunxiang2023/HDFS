package org.apache.hadoop.metrics2;

public enum MetricType {
  /**
   * A monotonically increasing metric that can be used
   * to calculate throughput
   */
  COUNTER,

  /**
   * An arbitrary varying metric
   */
  GAUGE
}
