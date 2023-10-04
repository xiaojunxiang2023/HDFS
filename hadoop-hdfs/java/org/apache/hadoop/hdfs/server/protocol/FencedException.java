package org.apache.hadoop.hdfs.server.protocol;

import java.io.IOException;

/**
 * If a previous user of a resource tries to use a shared resource, after
 * fenced by another user, this exception is thrown.
 */
public class FencedException extends IOException {
  private static final long serialVersionUID = 1L;
  
  public FencedException(String errorMsg) {
    super(errorMsg);
  }
}
