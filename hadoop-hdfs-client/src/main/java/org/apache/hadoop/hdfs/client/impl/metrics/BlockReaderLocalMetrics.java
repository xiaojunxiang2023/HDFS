package org.apache.hadoop.hdfs.client.impl.metrics;

import org.apache.hadoop.metrics2.MetricsSystem;
import org.apache.hadoop.metrics2.annotation.Metric;
import org.apache.hadoop.metrics2.annotation.Metrics;
import org.apache.hadoop.metrics2.lib.DefaultMetricsSystem;
import org.apache.hadoop.metrics2.lib.MutableRollingAverages;

/**
 * This class maintains a metric of rolling average latency for short circuit
 * reads.
 */
@Metrics(name = "HdfsShortCircuitReads",
    about = "Block Reader Local's Short Circuit Read latency",
    context = "dfs")
public class BlockReaderLocalMetrics {

  @Metric(value = "short circuit read operation rate", valueName = "LatencyMs")
  private MutableRollingAverages shortCircuitReadRollingAverages;

  private static final String SHORT_CIRCUIT_READ_METRIC_REGISTERED_NAME =
      "HdfsShortCircuitReads";
  private static final String SHORT_CIRCUIT_LOCAL_READS_METRIC_VALUE_NAME =
      "ShortCircuitLocalReads";

  public static BlockReaderLocalMetrics create() {
    MetricsSystem ms = DefaultMetricsSystem.instance();
    BlockReaderLocalMetrics metrics = new BlockReaderLocalMetrics();

    ms.register(
        SHORT_CIRCUIT_READ_METRIC_REGISTERED_NAME, null, metrics);
    return metrics;
  }

  /**
   * Adds short circuit read elapsed time.
   */
  public void addShortCircuitReadLatency(final long latency) {
    shortCircuitReadRollingAverages.add(
        SHORT_CIRCUIT_LOCAL_READS_METRIC_VALUE_NAME, latency);
  }

  /**
   * Collects states maintained in {@link ThreadLocal}, if any.
   */
  public void collectThreadLocalStates() {
    shortCircuitReadRollingAverages.collectThreadLocalStates();
  }

  /**
   * Get the MutableRollingAverage metric for testing only.
   * @return
   */

  public MutableRollingAverages getShortCircuitReadRollingAverages() {
    return shortCircuitReadRollingAverages;
  }
}
