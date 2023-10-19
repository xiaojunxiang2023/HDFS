package org.apache.hadoop.fs;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface CanSetReadahead {
  /**
   * Set the readahead on this stream.
   *
   * @param readahead     The readahead to use.  null means to use the default.
   * @throws IOException  If there was an error changing the dropBehind
   *                      setting.
   *         UnsupportedOperationException  If this stream doesn't support
   *                                        setting readahead. 
   */
  public void setReadahead(Long readahead)
    throws IOException, UnsupportedOperationException;
}
