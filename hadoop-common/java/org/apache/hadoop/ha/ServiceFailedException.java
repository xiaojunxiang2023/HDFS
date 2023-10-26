package org.apache.hadoop.ha;

import java.io.IOException;


/**
 * Exception thrown to indicate that an operation performed
 * to modify the state of a service or application failed.
 */
public class ServiceFailedException extends IOException {
  private static final long serialVersionUID = 1L;

  public ServiceFailedException(final String message) {
    super(message);
  }
  
  public ServiceFailedException(String message, Throwable cause) {
    super(message, cause);
  }
}
