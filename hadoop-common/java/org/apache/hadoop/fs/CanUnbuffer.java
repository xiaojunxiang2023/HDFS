package org.apache.hadoop.fs;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * FSDataInputStreams implement this interface to indicate that they can clear
 * their buffers on request.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface CanUnbuffer {
  /**
   * Reduce the buffering.  This will also free sockets and file descriptors
   * held by the stream, if possible.
   */
  public void unbuffer();
}
