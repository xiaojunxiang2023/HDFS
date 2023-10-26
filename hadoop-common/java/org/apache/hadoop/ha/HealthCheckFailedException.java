package org.apache.hadoop.ha;

import java.io.IOException;

/**
 * Exception thrown to indicate that health check of a service failed.
 */
public class HealthCheckFailedException extends IOException {
  private static final long serialVersionUID = 1L;

  public HealthCheckFailedException(final String message) {
    super(message);
  }
  
  public HealthCheckFailedException(String message, Throwable cause) {
    super(message, cause);
  }
}
