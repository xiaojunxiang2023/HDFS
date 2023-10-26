package org.apache.hadoop.ipc;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;
/** generates byte-length framed buffers. */
public class ResponseBuffer extends DataOutputStream {

  public ResponseBuffer() {
    this(1024);
  }

  public ResponseBuffer(int capacity) {
    super(new FramedBuffer(capacity));
  }

  // update framing bytes based on bytes written to stream.
  private FramedBuffer getFramedBuffer() {
    FramedBuffer buf = (FramedBuffer)out;
    buf.setSize(written);
    return buf;
  }

  public void writeTo(OutputStream out) throws IOException {
    getFramedBuffer().writeTo(out);
  }

  byte[] toByteArray() {
    return getFramedBuffer().toByteArray();
  }

  int capacity() {
    return ((FramedBuffer)out).capacity();
  }

  void setCapacity(int capacity) {
    ((FramedBuffer)out).setCapacity(capacity);
  }

  void ensureCapacity(int capacity) {
    if (((FramedBuffer)out).capacity() < capacity) {
      ((FramedBuffer)out).setCapacity(capacity);
    }
  }

  ResponseBuffer reset() {
    written = 0;
    ((FramedBuffer)out).reset();
    return this;
  }

  private static class FramedBuffer extends ByteArrayOutputStream {
    private static final int FRAMING_BYTES = 4;
    FramedBuffer(int capacity) {
      super(capacity + FRAMING_BYTES);
      reset();
    }
    @Override
    public int size() {
      return count - FRAMING_BYTES;
    }
    void setSize(int size) {
      buf[0] = (byte)((size >>> 24) & 0xFF);
      buf[1] = (byte)((size >>> 16) & 0xFF);
      buf[2] = (byte)((size >>>  8) & 0xFF);
      buf[3] = (byte)((size >>>  0) & 0xFF);
    }
    int capacity() {
      return buf.length - FRAMING_BYTES;
    }
    void setCapacity(int capacity) {
      buf = Arrays.copyOf(buf, capacity + FRAMING_BYTES);
    }
    @Override
    public void reset() {
      count = FRAMING_BYTES;
      setSize(0);
    }
  };
}