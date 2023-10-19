package org.apache.hadoop.fs;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * File system for a given file system name/scheme is not supported
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public class UnsupportedFileSystemException extends IOException {
  private static final long serialVersionUID = 1L;

  /**
   * Constructs exception with the specified detail message. 
   * @param message exception message.
   */
  public UnsupportedFileSystemException(final String message) {
    super(message);
  }
}
