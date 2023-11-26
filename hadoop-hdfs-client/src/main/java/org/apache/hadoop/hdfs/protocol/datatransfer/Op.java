package org.apache.hadoop.hdfs.protocol.datatransfer;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/** Operation */
public enum Op {
  WRITE_BLOCK((byte)80),
  READ_BLOCK((byte)81),
  READ_METADATA((byte)82),
  REPLACE_BLOCK((byte)83),
  COPY_BLOCK((byte)84),
  BLOCK_CHECKSUM((byte)85),
  TRANSFER_BLOCK((byte)86),
  REQUEST_SHORT_CIRCUIT_FDS((byte)87),
  RELEASE_SHORT_CIRCUIT_FDS((byte)88),
  REQUEST_SHORT_CIRCUIT_SHM((byte)89),
  BLOCK_GROUP_CHECKSUM((byte)90),
  CUSTOM((byte)127);

  /** The code for this operation. */
  public final byte code;

  Op(byte code) {
    this.code = code;
  }

  private static final int FIRST_CODE = values()[0].code;
  /** Return the object represented by the code. */
  private static Op valueOf(byte code) {
    final int i = (code & 0xff) - FIRST_CODE;
    return i < 0 || i >= values().length? null: values()[i];
  }

  /** Read from in */
  public static Op read(DataInput in) throws IOException {
    return valueOf(in.readByte());
  }

  /** Write to out */
  public void write(DataOutput out) throws IOException {
    out.write(code);
  }
}
