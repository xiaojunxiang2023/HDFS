package org.apache.hadoop.hdfs.server.namenode;

import java.io.IOException;

/**
 * This exception is thrown when the name node is in safe mode.
 * Client cannot modified namespace until the safe mode is off.
 *
 */
public class SafeModeException extends IOException {
  private static final long serialVersionUID = 1L;

  public SafeModeException(String msg) {
    super(msg);
  }
}
