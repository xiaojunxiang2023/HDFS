package org.apache.hadoop.hdfs.server.namenode;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * The lease that was being used to create this file has expired.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class LeaseExpiredException extends IOException {
  private static final long serialVersionUID = 1L;

  public LeaseExpiredException(String msg) {
    super(msg);
  }
}
