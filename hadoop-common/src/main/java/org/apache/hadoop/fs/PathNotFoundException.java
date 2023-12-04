package org.apache.hadoop.fs;

/**
 * Exception corresponding to path not found: ENOENT/ENOFILE
 */
public class PathNotFoundException extends PathIOException {
  static final long serialVersionUID = 0L;

  /** @param path for the exception */
  public PathNotFoundException(String path) {
    super(path, "No such file or directory");
  }

  public PathNotFoundException(String path, Throwable cause) {
    super(path, cause);
  }

  public PathNotFoundException(String path, String error) {
    super(path, error);
  }

  public PathNotFoundException(String path,
                               String error,
                               Throwable cause) {
    super(path, error, cause);
  }
}
