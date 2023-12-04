package org.apache.hadoop.fs;

import org.apache.hadoop.fs.statistics.IOStatistics;
import org.apache.hadoop.fs.statistics.IOStatisticsSource;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.util.StringJoiner;

import static org.apache.hadoop.fs.statistics.IOStatisticsSupport.retrieveIOStatistics;


/**
 * A class that optimizes reading from FSInputStream by buffering.
 */
public class BufferedFSInputStream extends BufferedInputStream
    implements Seekable, PositionedReadable, HasFileDescriptor,
    IOStatisticsSource, StreamCapabilities {
  /**
   * Creates a <code>BufferedFSInputStream</code>
   * with the specified buffer size,
   * and saves its  argument, the input stream
   * <code>in</code>, for later use.  An internal
   * buffer array of length  <code>size</code>
   * is created and stored in <code>buf</code>.
   *
   * @param   in     the underlying input stream.
   * @param   size   the buffer size.
   * @exception IllegalArgumentException if size {@literal <=} 0.
   */
  public BufferedFSInputStream(FSInputStream in, int size) {
    super(in, size);
  }

  @Override
  public long getPos() throws IOException {
    if (in == null) {
      throw new IOException(FSExceptionMessages.STREAM_IS_CLOSED);
    }
    return ((FSInputStream) in).getPos() - (count - pos);
  }

  @Override
  public long skip(long n) throws IOException {
    if (n <= 0) {
      return 0;
    }

    seek(getPos() + n);
    return n;
  }

  @Override
  public void seek(long pos) throws IOException {
    if (in == null) {
      throw new IOException(FSExceptionMessages.STREAM_IS_CLOSED);
    }
    if (pos < 0) {
      throw new EOFException(FSExceptionMessages.NEGATIVE_SEEK);
    }
    if (this.pos != this.count) {
      // optimize: check if the pos is in the buffer
      // This optimization only works if pos != count -- if they are
      // equal, it's possible that the previous reads were just
      // longer than the total buffer size, and hence skipped the buffer.
      long end = ((FSInputStream) in).getPos();
      long start = end - count;
      if (pos >= start && pos < end) {
        this.pos = (int) (pos - start);
        return;
      }
    }

    // invalidate buffer
    this.pos = 0;
    this.count = 0;

    ((FSInputStream) in).seek(pos);
  }

  @Override
  public boolean seekToNewSource(long targetPos) throws IOException {
    pos = 0;
    count = 0;
    return ((FSInputStream) in).seekToNewSource(targetPos);
  }

  @Override
  public int read(long position, byte[] buffer, int offset, int length) throws IOException {
    return ((FSInputStream) in).read(position, buffer, offset, length);
  }

  @Override
  public void readFully(long position, byte[] buffer, int offset, int length) throws IOException {
    ((FSInputStream) in).readFully(position, buffer, offset, length);
  }

  @Override
  public void readFully(long position, byte[] buffer) throws IOException {
    ((FSInputStream) in).readFully(position, buffer);
  }

  @Override
  public FileDescriptor getFileDescriptor() throws IOException {
    if (in instanceof HasFileDescriptor) {
      return ((HasFileDescriptor) in).getFileDescriptor();
    } else {
      return null;
    }
  }

  /**
   * If the inner stream supports {@link StreamCapabilities},
   * forward the probe to it.
   * Otherwise: return false.
   *
   * @param capability string to query the stream support for.
   * @return true if a capability is known to be supported.
   */
  @Override
  public boolean hasCapability(final String capability) {
    if (in instanceof StreamCapabilities) {
      return ((StreamCapabilities) in).hasCapability(capability);
    } else {
      return false;
    }
  }

  @Override
  public IOStatistics getIOStatistics() {
    return retrieveIOStatistics(in);
  }

  @Override
  public String toString() {
    return new StringJoiner(", ",
        BufferedFSInputStream.class.getSimpleName() + "[", "]")
        .add("in=" + in)
        .toString();
  }
}
