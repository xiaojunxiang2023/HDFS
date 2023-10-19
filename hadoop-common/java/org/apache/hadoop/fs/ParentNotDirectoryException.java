package org.apache.hadoop.fs;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Indicates that the parent of specified Path is not a directory
 * as expected.
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public class ParentNotDirectoryException extends IOException {
  private static final long serialVersionUID = 1L;

  public ParentNotDirectoryException() {
    super();
  }

  public ParentNotDirectoryException(String msg) {
    super(msg);
  }
}
