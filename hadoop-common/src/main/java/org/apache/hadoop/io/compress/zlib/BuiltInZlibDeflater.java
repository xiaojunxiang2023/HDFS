package org.apache.hadoop.io.compress.zlib;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.compress.Compressor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.util.zip.Deflater;

/**
 * A wrapper around java.util.zip.Deflater to make it conform 
 * to org.apache.hadoop.io.compress.Compressor interface.
 *
 */
public class BuiltInZlibDeflater extends Deflater implements Compressor {

  private static final Logger LOG =
      LoggerFactory.getLogger(BuiltInZlibDeflater.class);

  public BuiltInZlibDeflater(int level, boolean nowrap) {
    super(level, nowrap);
  }

  public BuiltInZlibDeflater(int level) {
    super(level);
  }

  public BuiltInZlibDeflater() {
    super();
  }

  @Override
  public synchronized int compress(byte[] b, int off, int len)
      throws IOException {
    return super.deflate(b, off, len);
  }

  /**
   * reinit the compressor with the given configuration. It will reset the
   * compressor's compression level and compression strategy. Different from
   * <tt>ZlibCompressor</tt>, <tt>BuiltInZlibDeflater</tt> only support three
   * kind of compression strategy: FILTERED, HUFFMAN_ONLY and DEFAULT_STRATEGY.
   * It will use DEFAULT_STRATEGY as default if the configured compression
   * strategy is not supported.
   */
  @Override
  public void reinit(Configuration conf) {
    reset();
    if (conf == null) {
      return;
    }
    setLevel(ZlibFactory.getCompressionLevel(conf).compressionLevel());
    final ZlibCompressor.CompressionStrategy strategy =
        ZlibFactory.getCompressionStrategy(conf);
    try {
      setStrategy(strategy.compressionStrategy());
    } catch (IllegalArgumentException ill) {
      LOG.warn(strategy + " not supported by BuiltInZlibDeflater.");
      setStrategy(DEFAULT_STRATEGY);
    }
    if (LOG.isDebugEnabled()) {
      LOG.debug("Reinit compressor with new compression configuration");
    }
  }
}
