package org.apache.hadoop.hdfs.util;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * OutputStream that writes into a {@link ByteBuffer}.
 */
@InterfaceAudience.Private
@InterfaceStability.Stable
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
