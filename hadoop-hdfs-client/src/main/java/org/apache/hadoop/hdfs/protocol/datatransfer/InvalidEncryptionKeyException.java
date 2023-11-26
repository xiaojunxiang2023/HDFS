package org.apache.hadoop.hdfs.protocol.datatransfer;

import java.io.IOException;

/**
 * Encryption key verification failed.
 */
public class InvalidEncryptionKeyException extends IOException {
  private static final long serialVersionUID = 0l;

  public InvalidEncryptionKeyException() {
    super();
  }

  public InvalidEncryptionKeyException(String msg) {
    super(msg);
  }
}
