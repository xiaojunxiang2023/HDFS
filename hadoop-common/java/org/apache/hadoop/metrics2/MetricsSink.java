package org.apache.hadoop.metrics2;

import java.io.Closeable;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * The metrics sink interface. <p>
 * Implementations of this interface consume the {@link MetricsRecord} generated
 * from {@link MetricsSource}. It registers with {@link MetricsSystem} which
 * periodically pushes the {@link MetricsRecord} to the sink using
 * {@link #putMetrics(MetricsRecord)} method.  If the implementing class also
 * implements {@link Closeable}, then the MetricsSystem will close the sink when
 * it is stopped.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface MetricsSink extends MetricsPlugin {
  /**
   * Put a metrics record in the sink
   * @param record  the record to put
   */
  void putMetrics(MetricsRecord record);

  /**
   * Flush any buffered metrics
   */
  void flush();
}
