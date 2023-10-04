package org.apache.hadoop.hdfs.server.datanode;

import java.io.IOException;

/**
 * Exception indicating that the target block already exists 
 * and is not set to be recovered/overwritten.  
 */
public class ReplicaAlreadyExistsException extends IOException {
  private static final long serialVersionUID = 1L;

  public ReplicaAlreadyExistsException() {
    super();
  }

  public ReplicaAlreadyExistsException(String msg) {
    super(msg);
  }
}
