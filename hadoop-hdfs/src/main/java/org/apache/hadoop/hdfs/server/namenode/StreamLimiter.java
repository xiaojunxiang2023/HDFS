package org.apache.hadoop.hdfs.server.namenode;

/**
 * An object that allows you to set a limit on a stream.  This limit
 * represents the number of bytes that can be read without getting an
 * exception.
 */
interface StreamLimiter {
  /**
   * Set a limit.  Calling this function clears any existing limit.
   */
  public void setLimit(long limit);
  
  /**
   * Disable limit.
   */
  public void clearLimit();
}