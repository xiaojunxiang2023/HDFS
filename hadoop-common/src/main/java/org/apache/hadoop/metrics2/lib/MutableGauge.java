package org.apache.hadoop.metrics2.lib;

import org.apache.hadoop.metrics2.MetricsInfo;

import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.checkNotNull;

/**
 * The mutable gauge metric interface
 */
public abstract class MutableGauge extends MutableMetric {
  private final MetricsInfo info;

  protected MutableGauge(MetricsInfo info) {
    this.info = checkNotNull(info, "metric info");
  }

  protected MetricsInfo info() {
    return info;
  }

  /**
   * Increment the value of the metric by 1
   */
  public abstract void incr();

  /**
   * Decrement the value of the metric by 1
   */
  public abstract void decr();
}
