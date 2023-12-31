package org.apache.hadoop.metrics2.lib;

import org.apache.hadoop.metrics2.MetricsInfo;

import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.checkNotNull;

/**
 * The mutable counter (monotonically increasing) metric interface
 */
public abstract class MutableCounter extends MutableMetric {
  private final MetricsInfo info;

  protected MutableCounter(MetricsInfo info) {
    this.info = checkNotNull(info, "counter info");
  }

  protected MetricsInfo info() {
    return info;
  }

  /**
   * Increment the metric value by 1.
   */
  public abstract void incr();
}
