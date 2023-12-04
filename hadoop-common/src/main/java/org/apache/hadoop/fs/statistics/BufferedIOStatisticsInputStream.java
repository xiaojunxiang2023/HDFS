package org.apache.hadoop.fs.statistics;

import org.apache.hadoop.fs.StreamCapabilities;

import java.io.BufferedInputStream;
import java.io.InputStream;

import static org.apache.hadoop.fs.statistics.IOStatisticsSupport.retrieveIOStatistics;

/**
 * An extension of {@code BufferedInputStream} which implements
 * {@link IOStatisticsSource} and forwards requests for the
 * {@link IOStatistics} to the wrapped stream.
 *
 * This should be used when any input stream needs buffering while
 * allowing the inner stream to be a source of statistics.
 *
 * It also implements {@link StreamCapabilities} and forwards the probe
 * to the inner stream, if possible.
 */
public class BufferedIOStatisticsInputStream
    extends BufferedInputStream
    implements IOStatisticsSource, StreamCapabilities {

  /**
   * Buffer an input stream with the default buffer size of 8k.
   * @param in input stream
   */
  public BufferedIOStatisticsInputStream(final InputStream in) {
    super(in);
  }

  /**
   * Buffer an input stream with the chosen buffer size.
   * @param in input stream
   * @param size buffer size
   */
  public BufferedIOStatisticsInputStream(final InputStream in, final int size) {
    super(in, size);
  }

  /**
   * Return any IOStatistics offered by the inner stream.
   * @return inner IOStatistics or null
   */
  @Override
  public IOStatistics getIOStatistics() {
    return retrieveIOStatistics(in);
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
}
