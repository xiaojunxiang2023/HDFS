package org.apache.hadoop.fs;

import java.io.IOException;

/**
 * This is the interface for flush/sync operations.
 * Consult the Hadoop filesystem specification for the definition of the
 * semantics of these operations.
 */
public interface Syncable {

  /** Flush out the data in client's user buffer. After the return of
   * this call, new readers will see the data.
   * @throws IOException if any error occurs
   */
  void hflush() throws IOException;

  /** Similar to posix fsync, flush out the data in client's user buffer 
   * all the way to the disk device (but the disk may have it in its cache).
   * @throws IOException if error occurs
   */
  void hsync() throws IOException;
}
