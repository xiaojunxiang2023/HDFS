package org.apache.hadoop.hdfs.server.namenode;

import java.io.IOException;

/**
 * Thrown when upgrading from software release that doesn't support reserved
 * path to software release that supports reserved path, and when there is 
 * reserved path name in the Fsimage.
 */
public class IllegalReservedPathException extends IOException {
  private static final long serialVersionUID = 1L;
  
  public IllegalReservedPathException(String message, Throwable cause) {
    super(message, cause);
  }
  public IllegalReservedPathException(String message) {
    super(message);
  }
}
