package org.apache.hadoop.io;

import java.io.*;

/** A WritableComparable for floats. */
public class FloatWritable implements WritableComparable<FloatWritable> {
  private float value;

  public FloatWritable() {}

  public FloatWritable(float value) { set(value); }

  /** Set the value of this FloatWritable. */
  public void set(float value) { this.value = value; }

  /** Return the value of this FloatWritable. */
  public float get() { return value; }

  @Override
  public void readFields(DataInput in) throws IOException {
    value = in.readFloat();
  }

  @Override
  public void write(DataOutput out) throws IOException {
    out.writeFloat(value);
  }

  /** Returns true iff <code>o</code> is a FloatWritable with the same value. */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof FloatWritable))
      return false;
    FloatWritable other = (FloatWritable)o;
    return this.value == other.value;
  }

  @Override
  public int hashCode() {
    return Float.floatToIntBits(value);
  }

  /** Compares two FloatWritables. */
  @Override
  public int compareTo(FloatWritable o) {
    return Float.compare(value, o.value);
  }

  @Override
  public String toString() {
    return Float.toString(value);
  }

  /** A Comparator optimized for FloatWritable. */ 
  public static class Comparator extends WritableComparator {
    public Comparator() {
      super(FloatWritable.class);
    }
    @Override
    public int compare(byte[] b1, int s1, int l1,
                       byte[] b2, int s2, int l2) {
      float thisValue = readFloat(b1, s1);
      float thatValue = readFloat(b2, s2);
      return Float.compare(thisValue, thatValue);
    }
  }

  static {                                        // register this comparator
    WritableComparator.define(FloatWritable.class, new Comparator());
  }

}

