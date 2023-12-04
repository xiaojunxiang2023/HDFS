package org.apache.hadoop.io;


import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/** A WritableComparable for longs. */
public class LongWritable implements WritableComparable<LongWritable> {
  private long value;

  public LongWritable() {
  }

  public LongWritable(long value) {
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
    value = in.readLong();
  }

  @Override
  public void write(DataOutput out) throws IOException {
    out.writeLong(value);
  }

  /** Returns true iff <code>o</code> is a LongWritable with the same value. */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof LongWritable))
      return false;
    LongWritable other = (LongWritable) o;
    return this.value == other.value;
  }

  @Override
  public int hashCode() {
    return (int) value;
  }

  /** Compares two LongWritables. */
  @Override
  public int compareTo(LongWritable o) {
    long thisValue = this.value;
    long thatValue = o.value;
    return (thisValue < thatValue ? -1 : (thisValue == thatValue ? 0 : 1));
  }

  @Override
  public String toString() {
    return Long.toString(value);
  }

  /** A Comparator optimized for LongWritable. */
  public static class Comparator extends WritableComparator {
    public Comparator() {
      super(LongWritable.class);
    }

    @Override
    public int compare(byte[] b1, int s1, int l1,
                       byte[] b2, int s2, int l2) {
      long thisValue = readLong(b1, s1);
      long thatValue = readLong(b2, s2);
      return (thisValue < thatValue ? -1 : (thisValue == thatValue ? 0 : 1));
    }
  }

  /** A decreasing Comparator optimized for LongWritable. */
  public static class DecreasingComparator extends Comparator {

    @Override
    public int compare(WritableComparable a, WritableComparable b) {
      return super.compare(b, a);
    }

    @Override
    public int compare(byte[] b1, int s1, int l1, byte[] b2, int s2, int l2) {
      return super.compare(b2, s2, l2, b1, s1, l1);
    }
  }

  static {                                       // register default comparator
    WritableComparator.define(LongWritable.class, new Comparator());
  }

}

