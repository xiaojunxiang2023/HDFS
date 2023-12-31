package org.apache.hadoop.hdfs;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

/**
 * A simple wrapper around {@link org.apache.hadoop.io.UTF8}.
 * This class should be used only when it is absolutely necessary
 * to use {@link org.apache.hadoop.io.UTF8}. The only difference is that 
 * using this class does not require "@SuppressWarning" annotation to avoid 
 * javac warning. Instead the deprecation is implied in the class name.
 *
 * This should be treated as package private class to HDFS.
 */
@SuppressWarnings("deprecation")
public class DeprecatedUTF8 extends org.apache.hadoop.io.UTF8 {

  public DeprecatedUTF8() {
    super();
  }

  /** Construct from a given string. */
  public DeprecatedUTF8(String string) {
    super(string);
  }

  /** Construct from a given string. */
  public DeprecatedUTF8(DeprecatedUTF8 utf8) {
    super(utf8);
  }

  /* The following two are the mostly commonly used methods.
   * wrapping them so that editors do not complain about the deprecation.
   */

  public static String readString(DataInput in) throws IOException {
    return org.apache.hadoop.io.UTF8.readString(in);
  }

  public static int writeString(DataOutput out, String s) throws IOException {
    return org.apache.hadoop.io.UTF8.writeString(out, s);
  }
}
