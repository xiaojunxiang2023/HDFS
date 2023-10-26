package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;

/**
 * Exception indicating that a replica is already being recovery.
 */
public class RecoveryInProgressException extends IOException {
  private static final long serialVersionUID = 1L;

  public RecoveryInProgressException(String msg) {
    super(msg);
  }
}