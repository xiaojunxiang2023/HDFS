package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;

/**
 *Thrown when no EC policy is set explicitly on the directory.
 */
public class NoECPolicySetException extends IOException {
  private static final long serialVersionUID = 1L;

  public NoECPolicySetException(String msg) {
    super(msg);
  }
}
