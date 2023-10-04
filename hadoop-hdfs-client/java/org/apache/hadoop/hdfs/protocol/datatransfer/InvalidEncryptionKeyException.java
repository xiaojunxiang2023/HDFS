package org.apache.hadoop.hdfs.protocol.datatransfer;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Encryption key verification failed.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class InvalidEncryptionKeyException extends IOException {
  private static final long serialVersionUID = 0l;

  public InvalidEncryptionKeyException() {
    super();
  }

  public InvalidEncryptionKeyException(String msg) {
    super(msg);
  }
}
