package org.apache.hadoop.io.compress;

/**
 * Codec related constants.
 */
public final class CodecConstants {

  private CodecConstants() {
  }
  /**
   * Default extension for {@link org.apache.hadoop.io.compress.DefaultCodec}.
   */
  public static final String DEFAULT_CODEC_EXTENSION = ".deflate";

  /**
   * Default extension for {@link org.apache.hadoop.io.compress.BZip2Codec}.
   */
  public static final String BZIP2_CODEC_EXTENSION = ".bz2";

  /**
   * Default extension for {@link org.apache.hadoop.io.compress.GzipCodec}.
   */
  public static final String GZIP_CODEC_EXTENSION = ".gz";

  /**
   * Default extension for {@link org.apache.hadoop.io.compress.Lz4Codec}.
   */
  public static final String LZ4_CODEC_EXTENSION = ".lz4";

  /**
   * Default extension for
   * {@link org.apache.hadoop.io.compress.PassthroughCodec}.
   */
  public static final String PASSTHROUGH_CODEC_EXTENSION = ".passthrough";

  /**
   * Default extension for {@link org.apache.hadoop.io.compress.SnappyCodec}.
   */
  public static final String SNAPPY_CODEC_EXTENSION = ".snappy";

  /**
   * Default extension for {@link org.apache.hadoop.io.compress.ZStandardCodec}.
   */
  public static final String ZSTANDARD_CODEC_EXTENSION = ".zst";
}
