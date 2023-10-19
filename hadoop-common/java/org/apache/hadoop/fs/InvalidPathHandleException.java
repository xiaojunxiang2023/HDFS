package org.apache.hadoop.fs;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Thrown when the constraints enoded in a {@link PathHandle} do not hold.
 * For example, if a handle were created with the default
 * {@link Options.HandleOpt#path()} constraints, a call to
 * {@link FileSystem#open(PathHandle)} would succeed if the file were
 * modified, but if a different file was at that location then it would throw
 * this exception.
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public class InvalidPathHandleException extends IOException {
  private static final long serialVersionUID = 0xcd8ac329L;

  public InvalidPathHandleException(String str) {
    super(str);
  }

  public InvalidPathHandleException(String message, Throwable cause) {
    super(message, cause);
  }

}
