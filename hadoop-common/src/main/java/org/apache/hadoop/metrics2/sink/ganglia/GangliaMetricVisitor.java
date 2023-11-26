package org.apache.hadoop.metrics2.sink.ganglia;

import org.apache.hadoop.metrics2.MetricsInfo;
import org.apache.hadoop.metrics2.MetricsVisitor;
import org.apache.hadoop.metrics2.sink.ganglia.AbstractGangliaSink.GangliaSlope;

/**
 * Since implementations of Metric are not public, hence use a visitor to figure
 * out the type and slope of the metric. Counters have "positive" slope.
 */
class GangliaMetricVisitor implements MetricsVisitor {
  private static final String INT32 = "int32";
  private static final String FLOAT = "float";
  private static final String DOUBLE = "double";

  private String type;
  private GangliaSlope slope;

  /**
   * @return the type of a visited metric
   */
  String getType() {
    return type;
  }

  /**
   * @return the slope of a visited metric. Slope is positive for counters and
   *         null for others
   */
  GangliaSlope getSlope() {
    return slope;
  }

  @Override
  public void gauge(MetricsInfo info, int value) {
    // MetricGaugeInt.class ==> "int32"
    type = INT32;
    slope = null; // set to null as cannot figure out from Metric
  }

  @Override
  public void gauge(MetricsInfo info, long value) {
    // MetricGaugeLong.class ==> "float"
    type = FLOAT;
    slope = null; // set to null as cannot figure out from Metric
  }

  @Override
  public void gauge(MetricsInfo info, float value) {
    // MetricGaugeFloat.class ==> "float"
    type = FLOAT;
    slope = null; // set to null as cannot figure out from Metric
  }

  @Override
  public void gauge(MetricsInfo info, double value) {
    // MetricGaugeDouble.class ==> "double"
    type = DOUBLE;
    slope = null; // set to null as cannot figure out from Metric
  }

  @Override
  public void counter(MetricsInfo info, int value) {
    // MetricCounterInt.class ==> "int32"
    type = INT32;
    // counters have positive slope
    slope = GangliaSlope.positive;
  }

  @Override
  public void counter(MetricsInfo info, long value) {
    // MetricCounterLong.class ==> "float"
    type = FLOAT;
    // counters have positive slope
    slope = GangliaSlope.positive;
  }
}
