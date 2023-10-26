package org.apache.hadoop.hdfs;

import java.io.IOException;

/**
 * Thrown when an unknown cipher suite is encountered.
 */
public class UnknownCipherSuiteException extends IOException {
  public UnknownCipherSuiteException(String msg) {
    super(msg);
  }
}
