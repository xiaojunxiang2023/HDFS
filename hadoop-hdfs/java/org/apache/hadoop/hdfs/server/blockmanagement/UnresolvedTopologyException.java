package org.apache.hadoop.hdfs.server.blockmanagement;

import java.io.IOException;

/**
 * This exception is thrown if resolving topology path 
 * for a node fails. 
 */
public class UnresolvedTopologyException extends IOException {
  /** for java.io.Serializable */
  private static final long serialVersionUID = 1L;
  
  public UnresolvedTopologyException(String text) {
    super(text);
  }
}
