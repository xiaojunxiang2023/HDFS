package org.apache.hadoop.hdfs;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Thrown when an unknown cipher suite is encountered.
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public class UnknownCipherSuiteException extends IOException {
  public UnknownCipherSuiteException(String msg) {
    super(msg);
  }
}
