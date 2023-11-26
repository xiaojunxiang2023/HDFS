package org.apache.hadoop.fs;

import java.io.IOException;

public class ZeroCopyUnavailableException extends IOException {
  private static final long serialVersionUID = 0L;

  public ZeroCopyUnavailableException(String message) {
    super(message);
  }

  public ZeroCopyUnavailableException(String message, Exception e) {
    super(message, e);
  }

  public ZeroCopyUnavailableException(Exception e) {
    super(e);
  }
}
