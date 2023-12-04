package org.apache.hadoop.hdfs.tools.offlineEditsViewer;

import java.io.IOException;
import java.io.OutputStream;

/**
 * A TeeOutputStream writes its output to multiple output streams.
 */
public class TeeOutputStream extends OutputStream {
  private final OutputStream[] outs;

  public TeeOutputStream(OutputStream outs[]) {
    this.outs = outs;
  }

  @Override
  public void write(int c) throws IOException {
    for (OutputStream o : outs) {
      o.write(c);
    }
  }

  @Override
  public void write(byte[] b) throws IOException {
    for (OutputStream o : outs) {
      o.write(b);
    }
  }

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    for (OutputStream o : outs) {
      o.write(b, off, len);
    }
  }

  @Override
  public void close() throws IOException {
    for (OutputStream o : outs) {
      o.close();
    }
  }

  @Override
  public void flush() throws IOException {
    for (OutputStream o : outs) {
      o.flush();
    }
  }
}
