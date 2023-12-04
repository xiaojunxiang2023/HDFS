package org.apache.hadoop.ha.micro;

import java.io.IOException;

public class ServiceFailedException extends IOException {
  private static final long serialVersionUID = 1L;

  public ServiceFailedException(final String message) {
    super(message);
  }

  public ServiceFailedException(String message, Throwable cause) {
    super(message, cause);
  }
}
