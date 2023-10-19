package org.apache.hadoop.ha;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Exception thrown to indicate service failover has failed.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class FailoverFailedException extends Exception {
  private static final long serialVersionUID = 1L;

  public FailoverFailedException(final String message) {
    super(message);
  }

  public FailoverFailedException(String message, Throwable cause) {
    super(message, cause);
  }
}
