package org.apache.hadoop.metrics2;

/**
 * The metrics collector interface
 */
public interface MetricsCollector {
  /**
   * Add a metrics record
   * @param name  of the record
   * @return a {@link MetricsRecordBuilder} for the record {@code name}
   */
  public MetricsRecordBuilder addRecord(String name);

  /**
   * Add a metrics record
   * @param info  of the record
   * @return a {@link MetricsRecordBuilder} for metrics {@code info}
   */
  public MetricsRecordBuilder addRecord(MetricsInfo info);
}
