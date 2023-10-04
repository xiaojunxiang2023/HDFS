package org.apache.hadoop.hdfs.server.federation.resolver;

import java.io.IOException;

/**
 * Thrown by FileSubclusterResolver when a path can't be resolved.
 */
public class RouterResolveException extends IOException {
  /** For java.io.Serializable. */
  private static final long serialVersionUID = 1L;

  public RouterResolveException(String msg) {
    super(msg);
  }
}
