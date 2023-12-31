package org.apache.hadoop.io;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import java.lang.reflect.Array;

/** A Writable for 2D arrays containing a matrix of instances of a class. */
public class TwoDArrayWritable implements Writable {
  private Class valueClass;
  private Writable[][] values;

  public TwoDArrayWritable(Class valueClass) {
    this.valueClass = valueClass;
  }

  public TwoDArrayWritable(Class valueClass, Writable[][] values) {
    this(valueClass);
    this.values = values;
  }

  public Object toArray() {
    int dimensions[] = {values.length, 0};
    Object result = Array.newInstance(valueClass, dimensions);
    for (int i = 0; i < values.length; i++) {
      Object resultRow = Array.newInstance(valueClass, values[i].length);
      Array.set(result, i, resultRow);
      for (int j = 0; j < values[i].length; j++) {
        Array.set(resultRow, j, values[i][j]);
      }
    }
    return result;
  }

  public void set(Writable[][] values) {
    this.values = values;
  }

  public Writable[][] get() {
    return values;
  }

  @Override
  public void readFields(DataInput in) throws IOException {
    // construct matrix
    values = new Writable[in.readInt()][];
    for (int i = 0; i < values.length; i++) {
      values[i] = new Writable[in.readInt()];
    }

    // construct values
    for (int i = 0; i < values.length; i++) {
      for (int j = 0; j < values[i].length; j++) {
        Writable value;                             // construct value
        try {
          value = (Writable) valueClass.newInstance();
        } catch (InstantiationException e) {
          throw new RuntimeException(e.toString());
        } catch (IllegalAccessException e) {
          throw new RuntimeException(e.toString());
        }
        value.readFields(in);                       // read a value
        values[i][j] = value;                       // store it in values
      }
    }
  }

  @Override
  public void write(DataOutput out) throws IOException {
    out.writeInt(values.length);                 // write values
    for (int i = 0; i < values.length; i++) {
      out.writeInt(values[i].length);
    }
    for (int i = 0; i < values.length; i++) {
      for (int j = 0; j < values[i].length; j++) {
        values[i][j].write(out);
      }
    }
  }
}

