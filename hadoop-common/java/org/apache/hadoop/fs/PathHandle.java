package org.apache.hadoop.fs;

import java.io.Serializable;
import java.nio.ByteBuffer;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Opaque, serializable reference to an entity in the FileSystem. May contain
 * metadata sufficient to resolve or verify subsequent accesses independent of
 * other modifications to the FileSystem.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
@FunctionalInterface
public interface PathHandle extends Serializable {

  /**
   * @return Serialized form in bytes.
   */
  default byte[] toByteArray() {
    ByteBuffer bb = bytes();
    byte[] ret = new byte[bb.remaining()];
    bb.get(ret);
    return ret;
  }

  /**
   * Get the bytes of this path handle.
   * @return the bytes to get to the process completing the upload.
   */
  ByteBuffer bytes();

  @Override
  boolean equals(Object other);

}
