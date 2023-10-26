package org.apache.hadoop.fs;

/**
 * FSDataInputStreams implement this interface to indicate that they can clear
 * their buffers on request.
 */
public interface CanUnbuffer {
  /**
   * Reduce the buffering.  This will also free sockets and file descriptors
   * held by the stream, if possible.
   */
  public void unbuffer();
}
