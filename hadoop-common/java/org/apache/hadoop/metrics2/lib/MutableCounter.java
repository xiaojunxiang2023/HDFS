package org.apache.hadoop.metrics2.lib;

import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.*;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.metrics2.MetricsInfo;

/**
 * The mutable counter (monotonically increasing) metric interface
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public abstract class MutableCounter extends MutableMetric {
  private final MetricsInfo info;

  protected MutableCounter(MetricsInfo info) {
    this.info =  checkNotNull(info, "counter info");
  }

  protected MetricsInfo info() {
    return info;
  }

  /**
   * Increment the metric value by 1.
   */
  public abstract void incr();
}
