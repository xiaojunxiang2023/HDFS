package org.apache.hadoop.util;

import org.apache.hadoop.metrics2.MetricsInfo;
import org.apache.hadoop.metrics2.MetricsSystem;
import org.apache.hadoop.metrics2.annotation.Metric;
import org.apache.hadoop.metrics2.lib.*;
import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;

import java.util.HashMap;
import java.util.Map;

import static org.apache.hadoop.metrics2.lib.Interns.info;

/**
 * The metrics for a directory generated by {@link ReadWriteDiskValidator}.
 */
public class ReadWriteDiskValidatorMetrics {
  @Metric("# of disk failure")
  MutableCounterInt failureCount;
  @Metric("Time of last failure")
  MutableGaugeLong lastFailureTime;

  private final MetricsRegistry registry;
  private static final MetricsInfo RECORD_INFO =
      info("ReadWriteDiskValidatorMetrics", "Metrics for the DiskValidator");

  private final int[] quantileIntervals = new int[]{
      60 * 60, // 1h
      24 * 60 * 60, //1 day
      10 * 24 * 60 * 60 //10 day
  };
  private final MutableQuantiles[] fileReadQuantiles;
  private final MutableQuantiles[] fileWriteQuantiles;

  public ReadWriteDiskValidatorMetrics() {
    registry = new MetricsRegistry(RECORD_INFO);

    fileReadQuantiles = new MutableQuantiles[quantileIntervals.length];
    for (int i = 0; i < fileReadQuantiles.length; i++) {
      int interval = quantileIntervals[i];
      fileReadQuantiles[i] = registry.newQuantiles(
          "readLatency" + interval + "s",
          "File read latency", "Ops", "latencyMicros", interval);
    }

    fileWriteQuantiles = new MutableQuantiles[quantileIntervals.length];
    for (int i = 0; i < fileWriteQuantiles.length; i++) {
      int interval = quantileIntervals[i];
      fileWriteQuantiles[i] = registry.newQuantiles(
          "writeLatency" + interval + "s",
          "File write latency", "Ops", "latencyMicros", interval);
    }
  }

  /**
   * Simple metrics cache to help prevent re-registrations and help to access
   * metrics.
   */
  protected final static Map<String, ReadWriteDiskValidatorMetrics> DIR_METRICS
      = new HashMap<>();

  /**
   * Get a metric by given directory name.
   *
   * @param dirName directory name
   * @return the metric
   */
  public synchronized static ReadWriteDiskValidatorMetrics getMetric(
      String dirName) {
    MetricsSystem ms = DefaultMetricsSystem.instance();

    ReadWriteDiskValidatorMetrics metrics = DIR_METRICS.get(dirName);
    if (metrics == null) {
      metrics = new ReadWriteDiskValidatorMetrics();

      // Register with the MetricsSystems
      if (ms != null) {
        metrics = ms.register(sourceName(dirName),
            "Metrics for directory: " + dirName, metrics);
      }
      DIR_METRICS.put(dirName, metrics);
    }

    return metrics;
  }

  /**
   * Add the file write latency to {@link MutableQuantiles} metrics.
   *
   * @param writeLatency file write latency in microseconds
   */
  public void addWriteFileLatency(long writeLatency) {
    if (fileWriteQuantiles != null) {
      for (MutableQuantiles q : fileWriteQuantiles) {
        q.add(writeLatency);
      }
    }
  }

  /**
   * Add the file read latency to {@link MutableQuantiles} metrics.
   *
   * @param readLatency file read latency in microseconds
   */
  public void addReadFileLatency(long readLatency) {
    if (fileReadQuantiles != null) {
      for (MutableQuantiles q : fileReadQuantiles) {
        q.add(readLatency);
      }
    }
  }

  /**
   * Get a source name by given directory name.
   *
   * @param dirName directory name
   * @return the source name
   */
  protected static String sourceName(String dirName) {
    StringBuilder sb = new StringBuilder(RECORD_INFO.name());
    sb.append(",dir=").append(dirName);
    return sb.toString();
  }

  /**
   * Increase the failure count and update the last failure timestamp.
   */
  public void diskCheckFailed() {
    failureCount.incr();
    lastFailureTime.set(System.nanoTime());
  }

  /**
   * Get {@link MutableQuantiles} metrics for the file read time.
   *
   * @return {@link MutableQuantiles} metrics for the file read time
   */
  
  protected MutableQuantiles[] getFileReadQuantiles() {
    return fileReadQuantiles;
  }

  /**
   * Get {@link MutableQuantiles} metrics for the file write time.
   *
   * @return {@link MutableQuantiles} metrics for the file write time
   */
  
  protected MutableQuantiles[] getFileWriteQuantiles() {
    return fileWriteQuantiles;
  }
}
