package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Exception indicating that a replica is already being recovery.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class RecoveryInProgressException extends IOException {
  private static final long serialVersionUID = 1L;

  public RecoveryInProgressException(String msg) {
    super(msg);
  }
}