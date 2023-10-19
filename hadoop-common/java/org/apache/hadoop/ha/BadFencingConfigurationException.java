package org.apache.hadoop.ha;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Indicates that the operator has specified an invalid configuration
 * for fencing methods.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class BadFencingConfigurationException extends IOException {
  private static final long serialVersionUID = 1L;

  public BadFencingConfigurationException(String msg) {
    super(msg);
  }

  public BadFencingConfigurationException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
