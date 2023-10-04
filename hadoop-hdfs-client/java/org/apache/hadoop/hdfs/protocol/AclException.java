package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;

/**
 * Indicates a failure manipulating an ACL.
 */
@InterfaceAudience.Private
public class AclException extends IOException {
  private static final long serialVersionUID = 1L;

  /**
   * Creates a new AclException.
   *
   * @param message String message
   */
  public AclException(String message) {
    super(message);
  }

  /**
   * Creates a new AclException.
   *
   * @param message String message
   * @param cause The cause of the exception
   */
  public AclException(String message, Throwable cause) {
    super(message, cause);
  }
}
