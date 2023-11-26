package org.apache.hadoop.hdfs.server.namenode;

import java.io.IOException;

/**
 * This exception is thrown when an operation is not supported.
 */
public class UnsupportedActionException extends IOException {
  /** for java.io.Serializable */
  private static final long serialVersionUID = 1L;

  public UnsupportedActionException(String msg) {
    super(msg);
  }
}
