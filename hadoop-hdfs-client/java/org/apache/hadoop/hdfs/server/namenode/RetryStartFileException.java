package org.apache.hadoop.hdfs.server.namenode;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;

@InterfaceAudience.Private
public class RetryStartFileException extends IOException {
  private static final long serialVersionUID = 1L;

  public RetryStartFileException() {
    super("Preconditions for creating a file failed because of a " +
        "transient error, retry create later.");
  }

  public RetryStartFileException(String s) {
    super(s);
  }
}
