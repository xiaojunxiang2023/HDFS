package org.apache.hadoop.metrics2.lib;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.metrics2.MetricsSource;

/**
 * Metrics annotation helpers.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class MetricsAnnotations {
  /**
   * Make an metrics source from an annotated object.
   * @param source  the annotated object.
   * @return a metrics source
   */
  public static MetricsSource makeSource(Object source) {
    return new MetricsSourceBuilder(source,
        DefaultMetricsFactory.getAnnotatedMetricsFactory()).build();
  }

  public static MetricsSourceBuilder newSourceBuilder(Object source) {
    return new MetricsSourceBuilder(source,
        DefaultMetricsFactory.getAnnotatedMetricsFactory());
  }
}
