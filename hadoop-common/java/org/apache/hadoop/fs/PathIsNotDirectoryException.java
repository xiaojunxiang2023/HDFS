package org.apache.hadoop.fs;

/** ENOTDIR */
public class PathIsNotDirectoryException extends PathExistsException {
  static final long serialVersionUID = 0L;
  /** @param path for the exception */
  public PathIsNotDirectoryException(String path) {
    super(path, "Is not a directory");
  }
}