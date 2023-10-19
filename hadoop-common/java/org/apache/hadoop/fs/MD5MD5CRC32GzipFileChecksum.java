package org.apache.hadoop.fs;

import org.apache.hadoop.io.MD5Hash;
import org.apache.hadoop.util.DataChecksum;

/** For CRC32 with the Gzip polynomial */
public class MD5MD5CRC32GzipFileChecksum extends MD5MD5CRC32FileChecksum {
  /** Same as this(0, 0, null) */
  public MD5MD5CRC32GzipFileChecksum() {
    this(0, 0, null);
  }

  /** Create a MD5FileChecksum */
  public MD5MD5CRC32GzipFileChecksum(int bytesPerCRC, long crcPerBlock, MD5Hash md5) {
    super(bytesPerCRC, crcPerBlock, md5);
  }
  @Override
  public DataChecksum.Type getCrcType() {
    // default to the one that is understood by all releases.
    return DataChecksum.Type.CRC32;
  }
}
