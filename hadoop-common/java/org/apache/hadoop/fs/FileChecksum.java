package org.apache.hadoop.fs;

import java.util.Arrays;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.fs.Options.ChecksumOpt;
import org.apache.hadoop.io.Writable;

/** An abstract class representing file checksums for files. */
@InterfaceAudience.Public
@InterfaceStability.Stable
public abstract class FileChecksum implements Writable {
  /** The checksum algorithm name */
  public abstract String getAlgorithmName();

  /** The length of the checksum in bytes */
  public abstract int getLength();

  /** The value of the checksum in bytes */
  public abstract byte[] getBytes();

  public ChecksumOpt getChecksumOpt() {
    return null;
  }

  /** Return true if both the algorithms and the values are the same. */
  @Override
  public boolean equals(Object other) {
    if (other == this) {
      return true;
    }
    if (other == null || !(other instanceof FileChecksum)) {
      return false;
    }

    final FileChecksum that = (FileChecksum)other;
    return this.getAlgorithmName().equals(that.getAlgorithmName())
      && Arrays.equals(this.getBytes(), that.getBytes());
  }

  @Override
  public int hashCode() {
    return getAlgorithmName().hashCode() ^ Arrays.hashCode(getBytes());
  }
}