package org.apache.hadoop.io.compress.zlib;

import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

import org.apache.hadoop.io.compress.Decompressor;

/**
 * A wrapper around java.util.zip.Inflater to make it conform 
 * to org.apache.hadoop.io.compress.Decompressor interface.
 * 
 */
public class BuiltInZlibInflater extends Inflater implements Decompressor {

  public BuiltInZlibInflater(boolean nowrap) {
    super(nowrap);
  }

  public BuiltInZlibInflater() {
    super();
  }

  @Override
  public synchronized int decompress(byte[] b, int off, int len) 
    throws IOException {
    try {
      return super.inflate(b, off, len);
    } catch (DataFormatException dfe) {
      throw new IOException(dfe.getMessage());
    }
  }
}
