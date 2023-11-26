package org.apache.hadoop.auth.util.micro;

/**
 * Exception thrown when an authentication error occurs.
 */
public class AuthenticationException extends Exception {
  
  static final long serialVersionUID = 0;

  public AuthenticationException(Throwable cause) {
    super(cause);
  }

  /**
   * Creates an {@link AuthenticationException}.
   *
   * @param msg exception message.
   */
  public AuthenticationException(String msg) {
    super(msg);
  }

  /**
   * Creates an {@link AuthenticationException}.
   *
   * @param msg exception message.
   * @param cause original exception.
   */
  public AuthenticationException(String msg, Throwable cause) {
    super(msg, cause);
  }
}
