package org.apache.hadoop.hdfs.server.blockmanagement;

import java.io.IOException;
import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * This exception is thrown when the name node runs out of V1 (legacy)
 * generation stamps.
 *
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class OutOfLegacyGenerationStampsException extends IOException {
  private static final long serialVersionUID = 1L;

  public OutOfLegacyGenerationStampsException() {
    super("Out of V1 (legacy) generation stamps\n");
  }
}
