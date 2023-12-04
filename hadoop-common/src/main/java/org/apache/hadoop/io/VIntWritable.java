package org.apache.hadoop.io;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/** A WritableComparable for integer values stored in variable-length format.
 * Such values take between one and five bytes.  Smaller values take fewer bytes.
 *
 * @see org.apache.hadoop.io.WritableUtils#readVInt(DataInput)
 */
public class VIntWritable implements WritableComparable<VIntWritable> {
  private int value;

  public VIntWritable() {
  }

  public VIntWritable(int value) {
    set(value);
  }

  /** Set the value of this VIntWritable. */
  public void set(int value) {
    this.value = value;
  }

  /** Return the value of this VIntWritable. */
  public int get() {
    return value;
  }

  @Override
  public void readFields(DataInput in) throws IOException {
    value = WritableUtils.readVInt(in);
  }

  @Override
  public void write(DataOutput out) throws IOException {
    WritableUtils.writeVInt(out, value);
  }

  /** Returns true iff <code>o</code> is a VIntWritable with the same value. */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof VIntWritable))
      return false;
    VIntWritable other = (VIntWritable) o;
    return this.value == other.value;
  }

  @Override
  public int hashCode() {
    return value;
  }

  /** Compares two VIntWritables. */
  @Override
  public int compareTo(VIntWritable o) {
    int thisValue = this.value;
    int thatValue = o.value;
    return (thisValue < thatValue ? -1 : (thisValue == thatValue ? 0 : 1));
  }

  @Override
  public String toString() {
    return Integer.toString(value);
  }

}

