package org.apache.hadoop.hdfs.protocol.datatransfer;

import java.io.IOException;

/**
 * Indicates a failure due to block pinning.
 */
public class BlockPinningException extends IOException {

  // Required by {@link java.io.Serializable}.
  private static final long serialVersionUID = 1L;

  public BlockPinningException(String errMsg) {
    super(errMsg);
  }
}
