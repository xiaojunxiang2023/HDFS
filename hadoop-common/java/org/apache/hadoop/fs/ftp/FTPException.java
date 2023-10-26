package org.apache.hadoop.fs.ftp;

/**
 * A class to wrap a {@link Throwable} into a Runtime Exception.
 */
public class FTPException extends RuntimeException {

  private static final long serialVersionUID = 1L;

  public FTPException(String message) {
    super(message);
  }

  public FTPException(Throwable t) {
    super(t);
  }

  public FTPException(String message, Throwable t) {
    super(message, t);
  }
}
