package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;

/**
 * Exception related to rolling upgrade.
 */
public class RollingUpgradeException extends IOException {
  private static final long serialVersionUID = 1L;

  public RollingUpgradeException(String msg) {
    super(msg);
  }
}