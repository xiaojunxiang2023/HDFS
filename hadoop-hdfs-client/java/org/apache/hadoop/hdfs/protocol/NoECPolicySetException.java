package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 *Thrown when no EC policy is set explicitly on the directory.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class NoECPolicySetException extends IOException {
  private static final long serialVersionUID = 1L;

  public NoECPolicySetException(String msg) {
    super(msg);
  }
}
