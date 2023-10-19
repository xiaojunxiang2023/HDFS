package org.apache.hadoop.fs;

/** EACCES */
public class PathAccessDeniedException extends PathIOException {
  static final long serialVersionUID = 0L;
  /** @param path for the exception */
  public PathAccessDeniedException(String path) {
    super(path, "Permission denied");
  }

  public PathAccessDeniedException(String path, Throwable cause) {
    super(path, cause);
  }

  public PathAccessDeniedException(String path,
      String error,
      Throwable cause) {
    super(path, error, cause);
  }
}
