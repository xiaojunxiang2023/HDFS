package org.apache.hadoop.crypto;

/**
 * Thrown to indicate that the specific codec is not supported.
 */
public class UnsupportedCodecException extends RuntimeException {

  /** Default constructor */
  public UnsupportedCodecException() {
  }

  /**
   * Constructs an UnsupportedCodecException with the specified
   * detail message.
   *
   * @param message the detail message
   */
  public UnsupportedCodecException(String message) {
    super(message);
  }

  /**
   * Constructs a new exception with the specified detail message and
   * cause.
   *
   * @param message the detail message
   * @param cause the cause
   */
  public UnsupportedCodecException(String message, Throwable cause) {
    super(message, cause);
  }

  /**
   * Constructs a new exception with the specified cause.
   *
   * @param cause the cause
   */
  public UnsupportedCodecException(Throwable cause) {
    super(cause);
  }

  private static final long serialVersionUID = 6713920435487942224L;
}