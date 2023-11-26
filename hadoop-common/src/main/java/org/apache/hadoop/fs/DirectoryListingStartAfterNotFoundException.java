package org.apache.hadoop.fs;

import java.io.IOException;

/** 
 * Thrown when the startAfter can't be found when listing a directory.
 */
public class DirectoryListingStartAfterNotFoundException extends IOException {
  private static final long serialVersionUID = 1L;

  public DirectoryListingStartAfterNotFoundException() {
    super();
  }

  public DirectoryListingStartAfterNotFoundException(String msg) {
    super(msg);
  }
}
