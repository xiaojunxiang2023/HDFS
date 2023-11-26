package org.apache.hadoop.hdfs.server.datanode;

import java.io.IOException;

/**
 * When kernel report a "Input/output error", we use this exception to
 * represents some corruption(e.g. bad disk track) happened on some disk file.
 */
public class DiskFileCorruptException extends IOException {
  /**
   * Instantiate.
   * @param msg the exception message
   * @param cause the underlying cause
   */
  public DiskFileCorruptException(String msg, Throwable cause) {
    super(msg, cause);
  }

  public DiskFileCorruptException(String msg) {
    super(msg);
  }
}
