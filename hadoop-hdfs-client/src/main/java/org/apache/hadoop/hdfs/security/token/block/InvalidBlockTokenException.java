package org.apache.hadoop.hdfs.security.token.block;

import java.io.IOException;

/**
 * Access token verification failed.
 */
public class InvalidBlockTokenException extends IOException {
  private static final long serialVersionUID = 168L;

  public InvalidBlockTokenException() {
    super();
  }

  public InvalidBlockTokenException(String msg) {
    super(msg);
  }
}
