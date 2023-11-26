package org.apache.hadoop.ha.micro;

import java.io.IOException;

public class HealthCheckFailedException extends IOException {
  private static final long serialVersionUID = 1L;

  public HealthCheckFailedException(final String message) {
    super(message);
  }
  
  public HealthCheckFailedException(String message, Throwable cause) {
    super(message, cause);
  }
}
