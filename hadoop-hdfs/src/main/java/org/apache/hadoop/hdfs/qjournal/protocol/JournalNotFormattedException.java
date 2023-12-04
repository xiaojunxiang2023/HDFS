package org.apache.hadoop.hdfs.qjournal.protocol;

import java.io.IOException;

/**
 * Exception indicating that a call has been made to a JournalNode
 * which is not yet formatted.
 */
public class JournalNotFormattedException extends IOException {
  private static final long serialVersionUID = 1L;

  public JournalNotFormattedException(String msg) {
    super(msg);
  }

}
