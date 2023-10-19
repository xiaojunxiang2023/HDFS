package org.apache.hadoop.fs;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Options that can be used when reading from a FileSystem.
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public enum ReadOption {
  /**
   * Skip checksums when reading.  This option may be useful when reading a file
   * format that has built-in checksums, or for testing purposes.
   */
  SKIP_CHECKSUMS,
}
