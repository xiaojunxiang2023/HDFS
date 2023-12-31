package org.apache.hadoop.io.compress;

import org.apache.hadoop.fs.PositionedReadable;
import org.apache.hadoop.fs.Seekable;
import org.apache.hadoop.fs.statistics.IOStatistics;
import org.apache.hadoop.fs.statistics.IOStatisticsSource;
import org.apache.hadoop.fs.statistics.IOStatisticsSupport;

import java.io.IOException;
import java.io.InputStream;

/**
 * A compression input stream.
 *
 * <p>Implementations are assumed to be buffered.  This permits clients to
 * reposition the underlying input stream then call {@link #resetState()},
 * without having to also synchronize client buffers.
 */
public abstract class CompressionInputStream extends InputStream
    implements Seekable, IOStatisticsSource {
  /**
   * The input stream to be compressed. 
   */
  protected final InputStream in;
  protected long maxAvailableData = 0L;

  private Decompressor trackedDecompressor;

  /**
   * Create a compression input stream that reads
   * the decompressed bytes from the given stream.
   *
   * @param in The input stream to be compressed.
   * @throws IOException
   */
  protected CompressionInputStream(InputStream in) throws IOException {
    if (!(in instanceof Seekable) || !(in instanceof PositionedReadable)) {
      this.maxAvailableData = in.available();
    }
    this.in = in;
  }

  @Override
  public void close() throws IOException {
    try {
      in.close();
    } finally {
      if (trackedDecompressor != null) {
        CodecPool.returnDecompressor(trackedDecompressor);
        trackedDecompressor = null;
      }
    }
  }

  /**
   * Return any IOStatistics provided by the underlying stream.
   * @return IO stats from the inner stream.
   */
  @Override
  public IOStatistics getIOStatistics() {
    return IOStatisticsSupport.retrieveIOStatistics(in);
  }

  /**
   * Read bytes from the stream.
   * Made abstract to prevent leakage to underlying stream.
   */
  @Override
  public abstract int read(byte[] b, int off, int len) throws IOException;

  /**
   * Reset the decompressor to its initial state and discard any buffered data,
   * as the underlying stream may have been repositioned.
   */
  public abstract void resetState() throws IOException;

  /**
   * This method returns the current position in the stream.
   *
   * @return Current position in stream as a long
   */
  @Override
  public long getPos() throws IOException {
    if (!(in instanceof Seekable) || !(in instanceof PositionedReadable)) {
      //This way of getting the current position will not work for file
      //size which can be fit in an int and hence can not be returned by
      //available method.
      return (this.maxAvailableData - this.in.available());
    } else {
      return ((Seekable) this.in).getPos();
    }

  }

  /**
   * This method is current not supported.
   *
   * @throws UnsupportedOperationException
   */

  @Override
  public void seek(long pos) throws UnsupportedOperationException {
    throw new UnsupportedOperationException();
  }

  /**
   * This method is current not supported.
   *
   * @throws UnsupportedOperationException
   */
  @Override
  public boolean seekToNewSource(long targetPos) throws UnsupportedOperationException {
    throw new UnsupportedOperationException();
  }

  void setTrackedDecompressor(Decompressor decompressor) {
    trackedDecompressor = decompressor;
  }
}
