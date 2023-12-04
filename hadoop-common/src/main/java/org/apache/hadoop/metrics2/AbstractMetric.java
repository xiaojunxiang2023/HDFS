package org.apache.hadoop.metrics2;

import org.apache.hadoop.thirdparty.com.google.common.base.Objects;

import java.util.StringJoiner;

import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.checkNotNull;

/**
 * The immutable metric
 */
public abstract class AbstractMetric implements MetricsInfo {
  private final MetricsInfo info;

  /**
   * Construct the metric
   * @param info  about the metric
   */
  protected AbstractMetric(MetricsInfo info) {
    this.info = checkNotNull(info, "metric info");
  }

  @Override
  public String name() {
    return info.name();
  }

  @Override
  public String description() {
    return info.description();
  }

  protected MetricsInfo info() {
    return info;
  }

  /**
   * Get the value of the metric
   * @return the value of the metric
   */
  public abstract Number value();

  /**
   * Get the type of the metric
   * @return the type of the metric
   */
  public abstract MetricType type();

  /**
   * Accept a visitor interface
   * @param visitor of the metric
   */
  public abstract void visit(MetricsVisitor visitor);

  @Override
  public boolean equals(Object obj) {
    if (obj instanceof AbstractMetric) {
      final AbstractMetric other = (AbstractMetric) obj;
      return Objects.equal(info, other.info()) &&
          Objects.equal(value(), other.value());
    }
    return false;
  }

  @Override
  public int hashCode() {
    return Objects.hashCode(info, value());
  }

  @Override
  public String toString() {
    return new StringJoiner(", ", this.getClass().getSimpleName() + "{", "}")
        .add("info=" + info)
        .add("value=" + value())
        .toString();
  }
}
