package org.apache.hadoop.metrics2.lib;

import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.*;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.metrics2.MetricsInfo;

/**
 * The mutable gauge metric interface
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
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
