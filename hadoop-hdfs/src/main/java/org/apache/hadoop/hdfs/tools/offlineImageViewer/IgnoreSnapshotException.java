package org.apache.hadoop.hdfs.tools.offlineImageViewer;

import java.io.IOException;

/**
 * Signals that a snapshot is ignored.
 */
public class IgnoreSnapshotException extends IOException {
  public IgnoreSnapshotException() {
  }
}
