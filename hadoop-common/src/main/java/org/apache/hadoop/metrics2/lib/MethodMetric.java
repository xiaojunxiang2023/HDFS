package org.apache.hadoop.metrics2.lib;

import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.metrics2.MetricsException;
import org.apache.hadoop.metrics2.MetricsInfo;
import org.apache.hadoop.metrics2.MetricsRecordBuilder;
import org.apache.hadoop.metrics2.annotation.Metric;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Method;

import static org.apache.hadoop.metrics2.util.Contracts.checkArg;
import static org.apache.hadoop.thirdparty.com.google.common.base.Preconditions.checkNotNull;

/**
 * Metric generated from a method, mostly used by annotation
 */
class MethodMetric extends MutableMetric {
  private static final Logger LOG = LoggerFactory.getLogger(MethodMetric.class);

  private final Object obj;
  private final Method method;
  private final MetricsInfo info;
  private final MutableMetric impl;

  MethodMetric(Object obj, Method method, MetricsInfo info, Metric.Type type) {
    this.obj = checkNotNull(obj, "object");
    this.method = checkArg(method, method.getParameterTypes().length == 0,
        "Metric method should have no arguments");
    this.method.setAccessible(true);
    this.info = checkNotNull(info, "info");
    impl = newImpl(checkNotNull(type, "metric type"));
  }

  private MutableMetric newImpl(Metric.Type metricType) {
    Class<?> resType = method.getReturnType();
    switch (metricType) {
      case COUNTER:
        return newCounter(resType);
      case GAUGE:
        return newGauge(resType);
      case DEFAULT:
        return resType == String.class ? newTag(resType) : newGauge(resType);
      case TAG:
        return newTag(resType);
      default:
        checkArg(metricType, false, "unsupported metric type");
        return null;
    }
  }

  MutableMetric newCounter(final Class<?> type) {
    if (isInt(type) || isLong(type)) {
      return new MutableMetric() {
        @Override
        public void snapshot(MetricsRecordBuilder rb, boolean all) {
          try {
            Object ret = method.invoke(obj, (Object[]) null);
            if (isInt(type)) rb.addCounter(info, ((Integer) ret).intValue());
            else rb.addCounter(info, ((Long) ret).longValue());
          } catch (Exception ex) {
            LOG.error("Error invoking method " + method.getName(), ex);
          }
        }
      };
    }
    throw new MetricsException("Unsupported counter type: " + type.getName());
  }

  static boolean isInt(Class<?> type) {
    boolean ret = type == Integer.TYPE || type == Integer.class;
    return ret;
  }

  static boolean isLong(Class<?> type) {
    return type == Long.TYPE || type == Long.class;
  }

  static boolean isFloat(Class<?> type) {
    return type == Float.TYPE || type == Float.class;
  }

  static boolean isDouble(Class<?> type) {
    return type == Double.TYPE || type == Double.class;
  }

  MutableMetric newGauge(final Class<?> t) {
    if (isInt(t) || isLong(t) || isFloat(t) || isDouble(t)) {
      return new MutableMetric() {
        @Override
        public void snapshot(MetricsRecordBuilder rb, boolean all) {
          try {
            Object ret = method.invoke(obj, (Object[]) null);
            if (isInt(t)) rb.addGauge(info, ((Integer) ret).intValue());
            else if (isLong(t)) rb.addGauge(info, ((Long) ret).longValue());
            else if (isFloat(t)) rb.addGauge(info, ((Float) ret).floatValue());
            else rb.addGauge(info, ((Double) ret).doubleValue());
          } catch (Exception ex) {
            LOG.error("Error invoking method " + method.getName(), ex);
          }
        }
      };
    }
    throw new MetricsException("Unsupported gauge type: " + t.getName());
  }

  MutableMetric newTag(Class<?> resType) {
    if (resType == String.class) {
      return new MutableMetric() {
        @Override
        public void snapshot(MetricsRecordBuilder rb, boolean all) {
          try {
            Object ret = method.invoke(obj, (Object[]) null);
            rb.tag(info, (String) ret);
          } catch (Exception ex) {
            LOG.error("Error invoking method " + method.getName(), ex);
          }
        }
      };
    }
    throw new MetricsException("Unsupported tag type: " + resType.getName());
  }

  @Override
  public void snapshot(MetricsRecordBuilder builder, boolean all) {
    impl.snapshot(builder, all);
  }

  static MetricsInfo metricInfo(Method method) {
    return Interns.info(nameFrom(method), "Metric for " + method.getName());
  }

  static String nameFrom(Method method) {
    String methodName = method.getName();
    if (methodName.startsWith("get")) {
      return StringUtils.capitalize(methodName.substring(3));
    }
    return StringUtils.capitalize(methodName);
  }
}
