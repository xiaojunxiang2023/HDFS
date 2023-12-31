package org.apache.hadoop.ha.micro;

public class FailoverFailedException extends Exception {
  private static final long serialVersionUID = 1L;

  public FailoverFailedException(final String message) {
    super(message);
  }

  public FailoverFailedException(String message, Throwable cause) {
    super(message, cause);
  }
}
