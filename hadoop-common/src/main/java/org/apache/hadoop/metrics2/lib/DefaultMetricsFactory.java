package org.apache.hadoop.metrics2.lib;

import org.apache.hadoop.metrics2.MetricsException;

/**
 * Experimental interface to extend metrics dynamically
 */
public enum DefaultMetricsFactory {
  INSTANCE; // the singleton

  private MutableMetricsFactory mmfImpl;

  public static MutableMetricsFactory getAnnotatedMetricsFactory() {
    return INSTANCE.getInstance(MutableMetricsFactory.class);
  }

  @SuppressWarnings("unchecked")
  public synchronized <T> T getInstance(Class<T> cls) {
    if (cls == MutableMetricsFactory.class) {
      if (mmfImpl == null) {
        mmfImpl = new MutableMetricsFactory();
      }
      return (T) mmfImpl;
    }
    throw new MetricsException("Unknown metrics factory type: " + cls.getName());
  }

  public synchronized void setInstance(MutableMetricsFactory factory) {
    mmfImpl = factory;
  }
}
