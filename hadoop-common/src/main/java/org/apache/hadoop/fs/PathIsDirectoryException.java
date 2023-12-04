package org.apache.hadoop.fs;

/** EISDIR */
public class PathIsDirectoryException extends PathExistsException {
  static final long serialVersionUID = 0L;

  /** @param path for the exception */
  public PathIsDirectoryException(String path) {
    super(path, "Is a directory");
  }
}