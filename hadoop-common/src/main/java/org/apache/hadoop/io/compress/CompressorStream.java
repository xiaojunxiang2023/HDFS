package org.apache.hadoop.io.compress;

import java.io.IOException;
import java.io.OutputStream;
import org.apache.hadoop.io.compress.CompressionOutputStream;
import org.apache.hadoop.io.compress.Compressor;
public class CompressorStream extends CompressionOutputStream {
  protected Compressor compressor;
  protected byte[] buffer;
  protected boolean closed = false;
  
  public CompressorStream(OutputStream out, Compressor compressor, int bufferSize) {
    super(out);

    if (out == null || compressor == null) {
      throw new NullPointerException();
    } else if (bufferSize <= 0) {
      throw new IllegalArgumentException("Illegal bufferSize");
    }

    this.compressor = compressor;
    buffer = new byte[bufferSize];
  }

  public CompressorStream(OutputStream out, Compressor compressor) {
    this(out, compressor, 512);
  }
  
  /**
   * Allow derived classes to directly set the underlying stream.
   * 
   * @param out Underlying output stream.
   */
  protected CompressorStream(OutputStream out) {
    super(out);
  }

  @Override
  public void write(byte[] b, int off, int len) throws IOException {
    // Sanity checks
    if (compressor.finished()) {
      throw new IOException("write beyond end of stream");
    }
    if ((off | len | (off + len) | (b.length - (off + len))) < 0) {
      throw new IndexOutOfBoundsException();
    } else if (len == 0) {
      return;
    }

    compressor.setInput(b, off, len);
    while (!compressor.needsInput()) {
      compress();
    }
  }

  protected void compress() throws IOException {
    int len = compressor.compress(buffer, 0, buffer.length);
    if (len > 0) {
      out.write(buffer, 0, len);
    }
  }

  @Override
  public void finish() throws IOException {
    if (!compressor.finished()) {
      compressor.finish();
      while (!compressor.finished()) {
        compress();
      }
    }
  }

  @Override
  public void resetState() throws IOException {
    compressor.reset();
  }
  
  @Override
  public void close() throws IOException {
    if (!closed) {
      try {
        super.close();
      }
      finally {
        closed = true;
      }
    }
  }

  private byte[] oneByte = new byte[1];
  @Override
  public void write(int b) throws IOException {
    oneByte[0] = (byte)(b & 0xff);
    write(oneByte, 0, oneByte.length);
  }

}