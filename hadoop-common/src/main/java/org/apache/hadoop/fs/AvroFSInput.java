package org.apache.hadoop.fs;

import org.apache.avro.file.SeekableInput;

import java.io.Closeable;
import java.io.IOException;

/** Adapts an {@link FSDataInputStream} to Avro's SeekableInput interface. */
public class AvroFSInput implements Closeable, SeekableInput {
  private final FSDataInputStream stream;
  private final long len;

  /** Construct given an {@link FSDataInputStream} and its length. */
  public AvroFSInput(final FSDataInputStream in, final long len) {
    this.stream = in;
    this.len = len;
  }

  /** Construct given a {@link FileContext} and a {@link Path}. */
  public AvroFSInput(final FileContext fc, final Path p) throws IOException {
    FileStatus status = fc.getFileStatus(p);
    this.len = status.getLen();
    this.stream = fc.open(p);
  }

  @Override
  public long length() {
    return len;
  }

  @Override
  public int read(byte[] b, int off, int len) throws IOException {
    return stream.read(b, off, len);
  }

  @Override
  public void seek(long p) throws IOException {
    stream.seek(p);
  }

  @Override
  public long tell() throws IOException {
    return stream.getPos();
  }

  @Override
  public void close() throws IOException {
    stream.close();
  }
}
