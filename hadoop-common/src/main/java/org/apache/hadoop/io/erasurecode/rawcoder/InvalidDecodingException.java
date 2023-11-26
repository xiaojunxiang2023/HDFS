package org.apache.hadoop.io.erasurecode.rawcoder;

import java.io.IOException;

/**
 * Thrown for invalid decoding.
 */
public class InvalidDecodingException
    extends IOException {
  private static final long serialVersionUID = 0L;

  public InvalidDecodingException(String description) {
    super(description);
  }
}