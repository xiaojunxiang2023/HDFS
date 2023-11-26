package org.apache.hadoop.io.compress;

/**
 * This class encapsulates a codec which can decompress direct bytebuffers.
 */
public interface DirectDecompressionCodec extends CompressionCodec {
  /**
   * Create a new {@link DirectDecompressor} for use by this {@link DirectDecompressionCodec}.
   * 
   * @return a new direct decompressor for use by this codec
   */
  DirectDecompressor createDirectDecompressor();
}
