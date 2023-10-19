package org.apache.hadoop.ha;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;


/**
 * Exception thrown to indicate that an operation performed
 * to modify the state of a service or application failed.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class ServiceFailedException extends IOException {
  private static final long serialVersionUID = 1L;

  public ServiceFailedException(final String message) {
    super(message);
  }
  
  public ServiceFailedException(String message, Throwable cause) {
    super(message, cause);
  }
}
