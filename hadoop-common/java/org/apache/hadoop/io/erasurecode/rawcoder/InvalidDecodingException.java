package org.apache.hadoop.io.erasurecode.rawcoder;

import org.apache.hadoop.classification.InterfaceAudience;

import java.io.IOException;

/**
 * Thrown for invalid decoding.
 */
@InterfaceAudience.Private
public class InvalidDecodingException
    extends IOException {
  private static final long serialVersionUID = 0L;

  public InvalidDecodingException(String description) {
    super(description);
  }
}