package org.apache.hadoop.fs;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.fs.Options.ChecksumOpt;
import org.apache.hadoop.io.MD5Hash;
import org.apache.hadoop.io.WritableUtils;
import org.apache.hadoop.util.DataChecksum;

/** MD5 of MD5 of CRC32. */
@InterfaceAudience.LimitedPrivate({"HDFS"})
@InterfaceStability.Unstable
public class MD5MD5CRC32FileChecksum extends FileChecksum {
  public static final int LENGTH = MD5Hash.MD5_LEN
      + (Integer.SIZE + Long.SIZE)/Byte.SIZE;

  private int bytesPerCRC;
  private long crcPerBlock;
  private MD5Hash md5;

  /** Same as this(0, 0, null) */
  public MD5MD5CRC32FileChecksum() {
    this(0, 0, null);
  }

  /** Create a MD5FileChecksum */
  public MD5MD5CRC32FileChecksum(int bytesPerCRC, long crcPerBlock, MD5Hash md5) {
    this.bytesPerCRC = bytesPerCRC;
    this.crcPerBlock = crcPerBlock;
    this.md5 = md5;
  }

  @Override
  public String getAlgorithmName() {
    return "MD5-of-" + crcPerBlock + "MD5-of-" + bytesPerCRC +
        getCrcType().name();
  }

  public static DataChecksum.Type getCrcTypeFromAlgorithmName(String algorithm)
      throws IOException {
    if (algorithm.endsWith(DataChecksum.Type.CRC32.name())) {
      return DataChecksum.Type.CRC32;
    } else if (algorithm.endsWith(DataChecksum.Type.CRC32C.name())) {
      return DataChecksum.Type.CRC32C;
    }

    throw new IOException("Unknown checksum type in " + algorithm);
  }

  @Override
  public int getLength() {return LENGTH;}

  @Override
  public byte[] getBytes() {
    return WritableUtils.toByteArray(this);
  }

  /** returns the CRC type */
  public DataChecksum.Type getCrcType() {
    // default to the one that is understood by all releases.
    return DataChecksum.Type.CRC32;
  }

  @Override
  public ChecksumOpt getChecksumOpt() {
    return new ChecksumOpt(getCrcType(), bytesPerCRC);
  }

  @Override
  public void readFields(DataInput in) throws IOException {
    bytesPerCRC = in.readInt();
    crcPerBlock = in.readLong();
    md5 = MD5Hash.read(in);
  }

  @Override
  public void write(DataOutput out) throws IOException {
    out.writeInt(bytesPerCRC);
    out.writeLong(crcPerBlock);
    md5.write(out);
  }

  @Override
  public String toString() {
    return getAlgorithmName() + ":" + md5;
  }
}
