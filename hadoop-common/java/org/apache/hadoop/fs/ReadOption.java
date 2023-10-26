package org.apache.hadoop.fs;

/**
 * Options that can be used when reading from a FileSystem.
 */
public enum ReadOption {
  /**
   * Skip checksums when reading.  This option may be useful when reading a file
   * format that has built-in checksums, or for testing purposes.
   */
  SKIP_CHECKSUMS,
}
