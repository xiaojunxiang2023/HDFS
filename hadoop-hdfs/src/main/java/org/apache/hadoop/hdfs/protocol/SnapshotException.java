package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;

/** Snapshot related exception. */
public class SnapshotException extends IOException {
  private static final long serialVersionUID = 1L;

  public SnapshotException(final String message) {
    super(message);
  }

  public SnapshotException(final Throwable cause) {
    super(cause);
  }

  public SnapshotException(final String message, final Throwable cause) {
    super(message, cause);
  }
}
