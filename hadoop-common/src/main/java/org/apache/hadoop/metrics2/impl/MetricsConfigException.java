package org.apache.hadoop.metrics2.impl;

import org.apache.hadoop.metrics2.MetricsException;

/**
 *  The metrics configuration runtime exception
 */
class MetricsConfigException extends MetricsException {
  private static final long serialVersionUID = 1L;

  MetricsConfigException(String message) {
    super(message);
  }

  MetricsConfigException(String message, Throwable cause) {
    super(message, cause);
  }

  MetricsConfigException(Throwable cause) {
    super(cause);
  }
}
