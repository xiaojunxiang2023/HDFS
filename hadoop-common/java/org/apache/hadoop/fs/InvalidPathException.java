package org.apache.hadoop.fs;

import org.apache.hadoop.util.micro.HadoopIllegalArgumentException;

/**
 * Path string is invalid either because it has invalid characters or due to
 * other file system specific reasons.
 */
public class InvalidPathException extends HadoopIllegalArgumentException {
  private static final long serialVersionUID = 1L;

  /**
   * Constructs exception with the specified detail message.
   * 
   * @param path invalid path.
   */
  public InvalidPathException(final String path) {
    super("Invalid path name " + path);
  }

  /**
   * Constructs exception with the specified detail message.
   * 
   * @param path invalid path.
   * @param reason Reason <code>path</code> is invalid
   */
  public InvalidPathException(final String path, final String reason) {
    super("Invalid path " + path
        + (reason == null ? "" : ". (" + reason + ")"));
  }
}
