package org.apache.hadoop.fs;


import java.io.IOException;

/**
 * Used when target file already exists for any operation and 
 * is not configured to be overwritten.  
 */
public class FileAlreadyExistsException
    extends IOException {

  public FileAlreadyExistsException() {
    super();
  }

  public FileAlreadyExistsException(String msg) {
    super(msg);
  }
}
