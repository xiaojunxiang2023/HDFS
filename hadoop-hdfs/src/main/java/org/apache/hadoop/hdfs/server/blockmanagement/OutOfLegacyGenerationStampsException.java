package org.apache.hadoop.hdfs.server.blockmanagement;

import java.io.IOException;

/**
 * This exception is thrown when the name node runs out of V1 (legacy)
 * generation stamps.
 *
 */
public class OutOfLegacyGenerationStampsException extends IOException {
  private static final long serialVersionUID = 1L;

  public OutOfLegacyGenerationStampsException() {
    super("Out of V1 (legacy) generation stamps\n");
  }
}
