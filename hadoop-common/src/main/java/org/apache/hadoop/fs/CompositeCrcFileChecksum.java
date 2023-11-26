package org.apache.hadoop.fs;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.apache.hadoop.fs.Options.ChecksumOpt;
import org.apache.hadoop.util.CrcUtil;
import org.apache.hadoop.util.DataChecksum;

/** Composite CRC. */
public class CompositeCrcFileChecksum extends FileChecksum {
  public static final int LENGTH = Integer.SIZE / Byte.SIZE;

  private int crc;
  private DataChecksum.Type crcType;
  private int bytesPerCrc;

  /** Create a CompositeCrcFileChecksum. */
  public CompositeCrcFileChecksum(
      int crc, DataChecksum.Type crcType, int bytesPerCrc) {
    this.crc = crc;
    this.crcType = crcType;
    this.bytesPerCrc = bytesPerCrc;
  }

  @Override
  public String getAlgorithmName() {
    return "COMPOSITE-" + crcType.name();
  }

  @Override
  public int getLength() {
    return LENGTH;
  }

  @Override
  public byte[] getBytes() {
    return CrcUtil.intToBytes(crc);
  }

  @Override
  public ChecksumOpt getChecksumOpt() {
    return new ChecksumOpt(crcType, bytesPerCrc);
  }

  @Override
  public void readFields(DataInput in) throws IOException {
    crc = in.readInt();
  }

  @Override
  public void write(DataOutput out) throws IOException {
    out.writeInt(crc);
  }

  @Override
  public String toString() {
    return getAlgorithmName() + ":" + String.format("0x%08x", crc);
  }
}
