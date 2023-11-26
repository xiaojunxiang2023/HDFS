package org.apache.hadoop.fs;

import java.io.IOException;

/**
 *  Abort data being written to  a stream, so that close() does
 *  not write the data. It is implemented by output streams in
 *  some object stores, and passed through {@link FSDataOutputStream}.
 */
public interface Abortable {

  /**
   * Abort the active operation without the output becoming visible.
   *
   * This is to provide ability to cancel the write on stream; once
   * a stream is aborted, the write MUST NOT become visible.
   *
   * @throws UnsupportedOperationException if the operation is not supported.
   * @return the result.
   */
  AbortableResult abort();

  /**
   * Interface for the result of aborts; allows subclasses to extend
   * (IOStatistics etc) or for future enhancements if ever needed.
   */
  interface AbortableResult {

    /**
     * Was the stream already closed/aborted?
     * @return true if a close/abort operation had already
     * taken place.
     */
    boolean alreadyClosed();

    /**
     * Any exception caught during cleanup operations,
     * exceptions whose raising/catching does not change
     * the semantics of the abort.
     * @return an exception or null.
     */
    IOException anyCleanupException();
  }
}
