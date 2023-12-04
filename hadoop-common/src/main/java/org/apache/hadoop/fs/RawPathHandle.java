package org.apache.hadoop.fs;

import java.io.*;
import java.nio.ByteBuffer;

/**
 * Generic format of FileStatus objects. When the origin is unknown, the
 * attributes of the handle are undefined.
 */
public final class RawPathHandle implements PathHandle {

  private static final long serialVersionUID = 0x12ba4689510L;

  public static final int MAX_SIZE = 1 << 20;

  private transient ByteBuffer fd;

  /**
   * Store a reference to the given bytes as the serialized form.
   * @param fd serialized bytes
   */
  public RawPathHandle(ByteBuffer fd) {
    this.fd = null == fd
        ? ByteBuffer.allocate(0)
        : fd.asReadOnlyBuffer();
  }

  /**
   * Initialize using a copy of bytes from the serialized handle.
   * @param handle PathHandle to preserve in serialized form.
   */
  public RawPathHandle(PathHandle handle) {
    ByteBuffer hb = null == handle
        ? ByteBuffer.allocate(0)
        : handle.bytes();
    fd = ByteBuffer.allocate(hb.remaining());
    fd.put(hb);
    fd.flip();
  }

  @Override
  public ByteBuffer bytes() {
    return fd.asReadOnlyBuffer();
  }

  @Override
  public boolean equals(Object other) {
    if (!(other instanceof PathHandle)) {
      return false;
    }
    PathHandle o = (PathHandle) other;
    return bytes().equals(o.bytes());
  }

  @Override
  public int hashCode() {
    return bytes().hashCode();
  }

  @Override
  public String toString() {
    return bytes().toString();
  }

  private void writeObject(ObjectOutputStream out) throws IOException {
    out.defaultWriteObject();
    out.writeInt(fd.remaining());
    if (fd.hasArray()) {
      out.write(fd.array(), fd.position(), fd.remaining());
    } else {
      byte[] x = new byte[fd.remaining()];
      fd.slice().get(x);
      out.write(x);
    }
  }

  private void readObject(ObjectInputStream in)
      throws IOException, ClassNotFoundException {
    in.defaultReadObject();
    int len = in.readInt();
    if (len < 0 || len > MAX_SIZE) {
      throw new IOException("Illegal buffer length " + len);
    }
    byte[] x = new byte[len];
    in.readFully(x);
    fd = ByteBuffer.wrap(x);
  }

  private void readObjectNoData() throws ObjectStreamException {
    throw new InvalidObjectException("Stream data required");
  }

}
