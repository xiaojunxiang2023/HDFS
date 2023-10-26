package org.apache.hadoop.hdfs.protocol.datatransfer;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import org.apache.hadoop.io.IOUtils;

/**
 * A little struct class to wrap an InputStream and an OutputStream.
 */
public class IOStreamPair implements Closeable {
  public final InputStream in;
  public final OutputStream out;

  public IOStreamPair(InputStream in, OutputStream out) {
    this.in = in;
    this.out = out;
  }

  @Override
  public void close() throws IOException {
    IOUtils.closeStream(in);
    IOUtils.closeStream(out);
  }
}
