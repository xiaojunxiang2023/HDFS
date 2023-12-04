package org.apache.hadoop.hdfs.server.namenode;

import java.io.IOException;

public class SaveNamespaceCancelledException extends IOException {
  private static final long serialVersionUID = 1L;

  SaveNamespaceCancelledException(String cancelReason) {
    super(cancelReason);
  }
}
