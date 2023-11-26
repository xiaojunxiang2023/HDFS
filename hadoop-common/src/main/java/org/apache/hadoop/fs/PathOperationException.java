package org.apache.hadoop.fs;

/** ENOTSUP */
public class PathOperationException extends PathExistsException {
  static final long serialVersionUID = 0L;
  /** @param path for the exception */
  public PathOperationException(String path) {
    super(path, "Operation not supported");
  }
}