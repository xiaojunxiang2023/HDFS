package org.apache.hadoop.ipc;

/**
 * Implement this interface to make a pluggable multiplexer in the
 * FairCallQueue.
 */
public interface RpcMultiplexer {
  /**
   * Should get current index and optionally perform whatever is needed
   * to prepare the next index.
   * @return current index
   */
  int getAndAdvanceCurrentIndex();
}
