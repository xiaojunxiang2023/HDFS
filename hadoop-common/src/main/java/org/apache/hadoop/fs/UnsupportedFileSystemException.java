package org.apache.hadoop.fs;

import java.io.IOException;

/**
 * File system for a given file system name/scheme is not supported
 */
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
