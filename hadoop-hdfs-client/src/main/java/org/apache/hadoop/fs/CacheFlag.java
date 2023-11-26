package org.apache.hadoop.fs;

/**
 * Specifies semantics for CacheDirective operations. Multiple flags can
 * be combined in an EnumSet.
 */
public enum CacheFlag {

  /**
   * Ignore cache pool resource limits when performing this operation.
   */
  FORCE((short) 0x01);
  private final short mode;

  CacheFlag(short mode) {
    this.mode = mode;
  }

  short getMode() {
    return mode;
  }
}
