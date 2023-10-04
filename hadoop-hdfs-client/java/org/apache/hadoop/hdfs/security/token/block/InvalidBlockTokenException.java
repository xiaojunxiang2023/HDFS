package org.apache.hadoop.hdfs.security.token.block;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Access token verification failed.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class InvalidBlockTokenException extends IOException {
  private static final long serialVersionUID = 168L;

  public InvalidBlockTokenException() {
    super();
  }

  public InvalidBlockTokenException(String msg) {
    super(msg);
  }
}
