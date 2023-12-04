package org.apache.hadoop.io.compress;

import org.apache.hadoop.fs.statistics.IOStatistics;
import org.apache.hadoop.fs.statistics.IOStatisticsSource;
import org.apache.hadoop.fs.statistics.IOStatisticsSupport;

import java.io.IOException;
import java.io.OutputStream;

/**
 * A compression output stream.
 */
public abstract class CompressionOutputStream extends OutputStream
    implements IOStatisticsSource {
  /**
   * The output stream to be compressed. 
   */
  protected final OutputStream out;

  /**
   * If non-null, this is the Compressor object that we should call
   * CodecPool#returnCompressor on when this stream is closed.
   */
  private Compressor trackedCompressor;

  /**
   * Create a compression output stream that writes
   * the compressed bytes to the given stream.
   * @param out
   */
  protected CompressionOutputStream(OutputStream out) {
    this.out = out;
  }

  void setTrackedCompressor(Compressor compressor) {
    trackedCompressor = compressor;
  }

  @Override
  public void close() throws IOException {
    try {
      finish();
    } finally {
      try {
        out.close();
      } finally {
        if (trackedCompressor != null) {
          CodecPool.returnCompressor(trackedCompressor);
          trackedCompressor = null;
        }
      }
    }
  }

  @Override
  public void flush() throws IOException {
    out.flush();
  }

  /**
   * Write compressed bytes to the stream.
   * Made abstract to prevent leakage to underlying stream.
   */
  @Override
  public abstract void write(byte[] b, int off, int len) throws IOException;

  /**
   * Finishes writing compressed data to the output stream 
   * without closing the underlying stream.
   */
  public abstract void finish() throws IOException;

  /**
   * Reset the compression to the initial state. 
   * Does not reset the underlying stream.
   */
  public abstract void resetState() throws IOException;

  /**
   * Return any IOStatistics provided by the underlying stream.
   * @return IO stats from the inner stream.
   */
  @Override
  public IOStatistics getIOStatistics() {
    return IOStatisticsSupport.retrieveIOStatistics(out);
  }
}
