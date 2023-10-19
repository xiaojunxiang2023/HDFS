package org.apache.hadoop.fs;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/** 
 * Thrown when the startAfter can't be found when listing a directory.
 */
@InterfaceAudience.LimitedPrivate({"HDFS"})
@InterfaceStability.Stable
public class DirectoryListingStartAfterNotFoundException extends IOException {
  private static final long serialVersionUID = 1L;

  public DirectoryListingStartAfterNotFoundException() {
    super();
  }

  public DirectoryListingStartAfterNotFoundException(String msg) {
    super(msg);
  }
}
