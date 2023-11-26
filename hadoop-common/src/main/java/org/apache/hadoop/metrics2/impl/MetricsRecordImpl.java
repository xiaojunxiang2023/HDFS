package org.apache.hadoop.metrics2.impl;

import java.util.List;

import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.*;

import org.apache.hadoop.metrics2.MetricsInfo;
import org.apache.hadoop.metrics2.AbstractMetric;
import org.apache.hadoop.metrics2.MetricsTag;
import static org.apache.hadoop.metrics2.util.Contracts.*;

class MetricsRecordImpl extends AbstractMetricsRecord {
  protected static final String DEFAULT_CONTEXT = "default";

  private final long timestamp;
  private final MetricsInfo info;
  private final List<MetricsTag> tags;
  private final Iterable<AbstractMetric> metrics;

  /**
   * Construct a metrics record
   * @param info  {@link MetricsInfo} of the record
   * @param timestamp of the record
   * @param tags  of the record
   * @param metrics of the record
   */
  public MetricsRecordImpl(MetricsInfo info, long timestamp,
                           List<MetricsTag> tags,
                           Iterable<AbstractMetric> metrics) {
    this.timestamp = checkArg(timestamp, timestamp > 0, "timestamp");
    this.info = checkNotNull(info, "info");
    this.tags = checkNotNull(tags, "tags");
    this.metrics = checkNotNull(metrics, "metrics");
  }

  @Override public long timestamp() {
    return timestamp;
  }

  @Override public String name() {
    return info.name();
  }

  MetricsInfo info() {
    return info;
  }

  @Override public String description() {
    return info.description();
  }

  @Override public String context() {
    // usually the first tag
    for (MetricsTag t : tags) {
      if (t.info() == MsInfo.Context) {
        return t.value();
      }
    }
    return DEFAULT_CONTEXT;
  }

  @Override
  public List<MetricsTag> tags() {
    return tags; // already unmodifiable from MetricsRecordBuilderImpl#tags
  }

  @Override public Iterable<AbstractMetric> metrics() {
    return metrics;
  }
}
