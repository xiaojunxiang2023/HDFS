package org.apache.hadoop.hdfs.server.namenode;

import java.io.IOException;

/**
 * The lease that was being used to create this file has expired.
 */
public class LeaseExpiredException extends IOException {
  private static final long serialVersionUID = 1L;

  public LeaseExpiredException(String msg) {
    super(msg);
  }
}
