package org.apache.hadoop.metrics2.annotation;

import java.lang.annotation.*;

/**
 * Annotation interface for a single metric used to annotate a field or a method
 * in the class.
 */
@Documented
@Target({ElementType.FIELD, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Metric {

  public enum Type {
    DEFAULT, COUNTER, GAUGE, TAG
  }

  /**
   * Shorthand for optional name and description
   * @return {description} or {name, description}
   */
  String[] value() default {};

  /**
   * @return optional description of the metric
   */
  String about() default "";

  /**
   * @return optional sample name for MutableStat/Rate/Rates
   */
  String sampleName() default "Ops";

  /**
   * @return optional value name for MutableStat/Rate/Rates
   */
  String valueName() default "Time";

  /**
   * @return true to create a metric snapshot even if unchanged.
   */
  boolean always() default false;

  /**
   * @return optional type (counter|gauge) of the metric
   */
  Type type() default Type.DEFAULT;

  /**
   * @return optional roll over interval in secs for MutableQuantiles
   */
  int interval() default 10;
}
