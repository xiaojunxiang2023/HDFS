package org.apache.hadoop.fs;


import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Used when target file already exists for any operation and 
 * is not configured to be overwritten.  
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public class FileAlreadyExistsException
    extends IOException {

  public FileAlreadyExistsException() {
    super();
  }

  public FileAlreadyExistsException(String msg) {
    super(msg);
  }
}
