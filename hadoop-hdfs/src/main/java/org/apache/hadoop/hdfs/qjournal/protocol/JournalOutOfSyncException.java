package org.apache.hadoop.hdfs.qjournal.protocol;

import java.io.IOException;

public class JournalOutOfSyncException extends IOException {
  private static final long serialVersionUID = 1L;

  public JournalOutOfSyncException(String msg) {
    super(msg);
  }

}
