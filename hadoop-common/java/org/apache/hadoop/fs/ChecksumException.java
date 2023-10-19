package org.apache.hadoop.fs;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/** Thrown for checksum errors. */
@InterfaceAudience.Public
@InterfaceStability.Stable
public class ChecksumException extends IOException {
  private static final long serialVersionUID = 1L;
  private long pos;
  public ChecksumException(String description, long pos) {
    super(description);
    this.pos = pos;
  }
  
  public long getPos() {
    return pos;
  }
}
