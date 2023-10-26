package org.apache.hadoop.metrics2.annotation;

import java.lang.annotation.*;

/**
 * Annotation interface for a group of metrics
 */
@Documented
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface Metrics {

  /**
   * @return the (record) name of the metrics
   */
  String name() default "";

  /**
   * @return the optional description of metrics
   */
  String about() default "";

  /**
   * @return the context name for a group of metrics
   */
  String context();
}
