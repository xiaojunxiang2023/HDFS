package org.apache.hadoop.util;

import java.io.IOException;

/**
 * Thrown when bytesPerChecksun field in the meta file is less than
 * or equal to 0 or type is invalid.
 **/
public class InvalidChecksumSizeException extends IOException {

  private static final long serialVersionUID = 1L;

  public InvalidChecksumSizeException(String s) {
    super(s);
  }
}
