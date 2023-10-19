package org.apache.hadoop.metrics2;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * A general metrics exception wrapper
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class MetricsException extends RuntimeException {
  private static final long serialVersionUID = 1L;

  /**
   * Construct the exception with a message
   * @param message for the exception
   */
  public MetricsException(String message) {
    super(message);
  }

  /**
   * Construct the exception with a message and a cause
   * @param message for the exception
   * @param cause of the exception
   */
  public MetricsException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Construct the exception with a cause
   * @param cause of the exception
   */
  public MetricsException(Throwable cause) {
    super(cause);
  }
}
