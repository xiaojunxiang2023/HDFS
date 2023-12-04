package org.apache.hadoop.hdfs.util;

import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.thirdparty.com.google.common.io.Files;
import org.apache.hadoop.thirdparty.com.google.common.primitives.Longs;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * Class that represents a file on disk which stores a single <code>long</code>
 * value, but does not make any effort to make it truly durable. This is in
 * contrast to {@link PersistentLongFile} which fsync()s the value on every
 * change.
 *
 * This should be used for values which are updated frequently (such that
 * performance is important) and not required to be up-to-date for correctness.
 *
 * This class also differs in that it stores the value as binary data instead
 * of a textual string.
 */
public class BestEffortLongFile implements Closeable {

  private final File file;
  private final long defaultVal;
  private final ByteBuffer buf = ByteBuffer.allocate(Long.SIZE / 8);
  private long value;
  private FileChannel ch = null;

  public BestEffortLongFile(File file, long defaultVal) {
    this.file = file;
    this.defaultVal = defaultVal;
  }

  public long get() throws IOException {
    lazyOpen();
    return value;
  }

  public void set(long newVal) throws IOException {
    lazyOpen();
    buf.clear();
    buf.putLong(newVal);
    buf.flip();
    IOUtils.writeFully(ch, buf, 0);
    value = newVal;
  }

  private void lazyOpen() throws IOException {
    if (ch != null) {
      return;
    }

    // Load current value.
    byte[] data = null;
    try {
      data = Files.toByteArray(file);
    } catch (FileNotFoundException fnfe) {
      // Expected - this will use default value.
    }

    if (data != null && data.length != 0) {
      if (data.length != Longs.BYTES) {
        throw new IOException("File " + file + " had invalid length: " +
            data.length);
      }
      value = Longs.fromByteArray(data);
    } else {
      value = defaultVal;
    }

    // Now open file for future writes.
    RandomAccessFile raf = new RandomAccessFile(file, "rw");
    try {
      ch = raf.getChannel();
    } finally {
      if (ch == null) {
        IOUtils.closeStream(raf);
      }
    }
  }

  @Override
  public void close() throws IOException {
    if (ch != null) {
      ch.close();
      ch = null;
    }
  }
}
