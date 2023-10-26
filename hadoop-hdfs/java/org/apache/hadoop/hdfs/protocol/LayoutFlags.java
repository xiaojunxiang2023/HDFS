package org.apache.hadoop.hdfs.protocol;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

import org.apache.hadoop.thirdparty.com.google.common.base.Joiner;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.thirdparty.com.google.common.collect.ImmutableSet;
import org.apache.hadoop.thirdparty.com.google.common.collect.Sets;

/**
 * LayoutFlags represent features which the FSImage and edit logs can either
 * support or not, independently of layout version.
 * 
 * Note: all flags starting with 'test' are reserved for unit test purposes.
 */
public class LayoutFlags {

  /**
   * Read next int from given input stream. If the value is not 0 (unsupported
   * feature flags), throw appropriate IOException.
   *
   * @param in            The stream to read from.
   * @throws IOException  If next byte read from given stream is not 0.
   */
  public static void read(DataInputStream in) throws IOException {
    int length = in.readInt();
    if (length < 0) {
      throw new IOException("The length of the feature flag section " +
          "was negative at " + length + " bytes.");
    } else if (length > 0) {
      throw new IOException("Found feature flags which we can't handle. " +
          "Please upgrade your software.");
    }
  }

  private LayoutFlags() {
  }

  public static void write(DataOutputStream out) throws IOException {
    out.writeInt(0);
  }
}
