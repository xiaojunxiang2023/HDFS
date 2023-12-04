package org.apache.hadoop.hdfs.server.datanode;

import java.io.IOException;

public class BPServiceActorActionException extends IOException {

  /**
   * An exception for BPSerivceActor call related issues
   */
  private static final long serialVersionUID = 1L;

  public BPServiceActorActionException(String message) {
    super(message);
  }

  public BPServiceActorActionException(String message, Throwable cause) {
    super(message, cause);
  }

}
