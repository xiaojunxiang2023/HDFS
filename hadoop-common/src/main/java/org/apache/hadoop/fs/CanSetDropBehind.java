package org.apache.hadoop.fs;

import java.io.IOException;

public interface CanSetDropBehind {
  /**
   * Configure whether the stream should drop the cache.
   *
   * @param dropCache     Whether to drop the cache.  null means to use the
   *                      default value.
   * @throws IOException  If there was an error changing the dropBehind
   *                      setting.
   *         UnsupportedOperationException  If this stream doesn't support
   *                                        setting the drop-behind.
   */
  void setDropBehind(Boolean dropCache)
      throws IOException, UnsupportedOperationException;
}
