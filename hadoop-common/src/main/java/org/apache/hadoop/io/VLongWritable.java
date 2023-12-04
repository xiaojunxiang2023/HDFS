package org.apache.hadoop.io;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/** A WritableComparable for longs in a variable-length format. Such values take
 *  between one and five bytes.  Smaller values take fewer bytes.
 *
 *  @see org.apache.hadoop.io.WritableUtils#readVLong(DataInput)
 */
public class VLongWritable implements WritableComparable<VLongWritable> {
  private long value;

  public VLongWritable() {
  }

  public VLongWritable(long value) {
    set(value);
  }

  /** Set the value of this LongWritable. */
  public void set(long value) {
    this.value = value;
  }

  /** Return the value of this LongWritable. */
  public long get() {
    return value;
  }

  @Override
  public void readFields(DataInput in) throws IOException {
    value = WritableUtils.readVLong(in);
  }

  @Override
  public void write(DataOutput out) throws IOException {
    WritableUtils.writeVLong(out, value);
  }

  /** Returns true iff <code>o</code> is a VLongWritable with the same value. */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof VLongWritable))
      return false;
    VLongWritable other = (VLongWritable) o;
    return this.value == other.value;
  }

  @Override
  public int hashCode() {
    return (int) value;
  }

  /** Compares two VLongWritables. */
  @Override
  public int compareTo(VLongWritable o) {
    long thisValue = this.value;
    long thatValue = o.value;
    return (thisValue < thatValue ? -1 : (thisValue == thatValue ? 0 : 1));
  }

  @Override
  public String toString() {
    return Long.toString(value);
  }

}

