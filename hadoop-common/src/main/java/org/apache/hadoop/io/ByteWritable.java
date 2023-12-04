package org.apache.hadoop.io;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/** A WritableComparable for a single byte. */
public class ByteWritable implements WritableComparable<ByteWritable> {
  private byte value;

  public ByteWritable() {
  }

  public ByteWritable(byte value) {
    set(value);
  }

  /** Set the value of this ByteWritable. */
  public void set(byte value) {
    this.value = value;
  }

  /** Return the value of this ByteWritable. */
  public byte get() {
    return value;
  }

  @Override
  public void readFields(DataInput in) throws IOException {
    value = in.readByte();
  }

  @Override
  public void write(DataOutput out) throws IOException {
    out.writeByte(value);
  }

  /** Returns true iff <code>o</code> is a ByteWritable with the same value. */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof ByteWritable)) {
      return false;
    }
    ByteWritable other = (ByteWritable) o;
    return this.value == other.value;
  }

  @Override
  public int hashCode() {
    return (int) value;
  }

  /** Compares two ByteWritables. */
  @Override
  public int compareTo(ByteWritable o) {
    int thisValue = this.value;
    int thatValue = o.value;
    return (thisValue < thatValue ? -1 : (thisValue == thatValue ? 0 : 1));
  }

  @Override
  public String toString() {
    return Byte.toString(value);
  }

  /** A Comparator optimized for ByteWritable. */
  public static class Comparator extends WritableComparator {
    public Comparator() {
      super(ByteWritable.class);
    }

    @Override
    public int compare(byte[] b1, int s1, int l1,
                       byte[] b2, int s2, int l2) {
      byte thisValue = b1[s1];
      byte thatValue = b2[s2];
      return (thisValue < thatValue ? -1 : (thisValue == thatValue ? 0 : 1));
    }
  }

  static {                                        // register this comparator
    WritableComparator.define(ByteWritable.class, new Comparator());
  }
}

