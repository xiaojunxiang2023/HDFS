package org.apache.hadoop.hdfs;

import org.apache.hadoop.classification.InterfaceAudience;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;

/**
 * The exception last seen by the {@link DataStreamer} or
 * {@link DFSOutputStream}.
 */
@InterfaceAudience.Private
class ExceptionLastSeen {
  private IOException thrown;

  /** Get the last seen exception. */
  synchronized protected IOException get() {
    return thrown;
  }

  /**
   * Set the last seen exception.
   * @param t the exception.
   */
  synchronized void set(Throwable t) {
    assert t != null;
    this.thrown = t instanceof IOException ?
        (IOException) t : new IOException(t);
  }

  /** Clear the last seen exception. */
  synchronized void clear() {
    thrown = null;
  }

  /**
   * Check if there already is an exception. Throw the exception if exist.
   *
   * @param resetToNull set to true to reset exception to null after calling
   *                    this function.
   * @throws IOException on existing IOException.
   */
  synchronized void check(boolean resetToNull) throws IOException {
    if (thrown != null) {
      final IOException e = thrown;
      if (resetToNull) {
        thrown = null;
      }
      throw e;
    }
  }

  synchronized void throwException4Close() throws IOException {
    check(false);
    throw new ClosedChannelException();
  }
}
