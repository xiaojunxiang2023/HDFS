package org.apache.hadoop.io;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * Writable for Double values.
 */
public class DoubleWritable implements WritableComparable<DoubleWritable> {

  private double value = 0.0;
  
  public DoubleWritable() {
    
  }
  
  public DoubleWritable(double value) {
    set(value);
  }
  
  @Override
  public void readFields(DataInput in) throws IOException {
    value = in.readDouble();
  }

  @Override
  public void write(DataOutput out) throws IOException {
    out.writeDouble(value);
  }
  
  public void set(double value) { this.value = value; }
  
  public double get() { return value; }

  /**
   * Returns true iff <code>o</code> is a DoubleWritable with the same value.
   */
  @Override
  public boolean equals(Object o) {
    if (!(o instanceof DoubleWritable)) {
      return false;
    }
    DoubleWritable other = (DoubleWritable)o;
    return this.value == other.value;
  }
  
  @Override
  public int hashCode() {
    return (int)Double.doubleToLongBits(value);
  }
  
  @Override
  public int compareTo(DoubleWritable o) {
    return Double.compare(value, o.value);
  }
  
  @Override
  public String toString() {
    return Double.toString(value);
  }

  /** A Comparator optimized for DoubleWritable. */ 
  public static class Comparator extends WritableComparator {
    public Comparator() {
      super(DoubleWritable.class);
    }

    @Override
    public int compare(byte[] b1, int s1, int l1,
                       byte[] b2, int s2, int l2) {
      double thisValue = readDouble(b1, s1);
      double thatValue = readDouble(b2, s2);
      return Double.compare(thisValue, thatValue);
    }
  }

  static {                                        // register this comparator
    WritableComparator.define(DoubleWritable.class, new Comparator());
  }

}

