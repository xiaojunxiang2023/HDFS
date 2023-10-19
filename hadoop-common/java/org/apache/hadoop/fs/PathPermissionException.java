package org.apache.hadoop.fs;

/**
 * Exception corresponding to Operation Not Permitted - EPERM
 */
public class PathPermissionException extends PathIOException {
  static final long serialVersionUID = 0L;
  /** @param path for the exception */
  public PathPermissionException(String path) {
    super(path, "Operation not permitted");
  }

  public PathPermissionException(String path, Throwable cause) {
    super(path, cause);
  }

  public PathPermissionException(String path, String error) {
    super(path, error);
  }

  public PathPermissionException(String path,
      String error,
      Throwable cause) {
    super(path, error, cause);
  }
}
