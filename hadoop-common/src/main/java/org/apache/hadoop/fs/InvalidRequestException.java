package org.apache.hadoop.fs;

import java.io.IOException;

/**
 * Thrown when the user makes a malformed request, for example missing required
 * parameters or parameters that are not valid.
 */
public class InvalidRequestException extends IOException {
  static final long serialVersionUID = 0L;

  public InvalidRequestException(String str) {
    super(str);
  }

  public InvalidRequestException(String message, Throwable cause) {
    super(message, cause);
  }
}
