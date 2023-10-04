package org.apache.hadoop.hdfs.qjournal.protocol;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;

@InterfaceAudience.Private
public class JournalOutOfSyncException extends IOException {
  private static final long serialVersionUID = 1L;
  
  public JournalOutOfSyncException(String msg) {
    super(msg);
  }

}
