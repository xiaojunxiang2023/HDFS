package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.security.AccessControlException;

/** Snapshot access related exception. */
public class SnapshotAccessControlException extends AccessControlException {
  private static final long serialVersionUID = 1L;

  public SnapshotAccessControlException(final String message) {
    super(message);
  }

  public SnapshotAccessControlException(final Throwable cause) {
    super(cause);
  }
}
