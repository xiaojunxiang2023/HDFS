package org.apache.hadoop.hdfs.util;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/**
 * OutputStream that writes into a {@link ByteBuffer}.
 */
public class ByteBufferOutputStream extends OutputStream {

  private final ByteBuffer buf;

  public ByteBufferOutputStream(ByteBuffer buf) {
    this.buf = buf;
  }

  @Override
  public void write(int b) throws IOException {
    buf.put((byte)b);
  }

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    buf.put(b, off, len);
  }
}
