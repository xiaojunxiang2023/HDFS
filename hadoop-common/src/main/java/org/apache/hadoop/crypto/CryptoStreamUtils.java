package org.apache.hadoop.crypto;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Seekable;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.util.CleanerUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CRYPTO_BUFFER_SIZE_DEFAULT;
import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_CRYPTO_BUFFER_SIZE_KEY;

public class CryptoStreamUtils {
  private static final int MIN_BUFFER_SIZE = 512;
  private static final Logger LOG =
      LoggerFactory.getLogger(CryptoStreamUtils.class);

  /** Forcibly free the direct buffer. */
  public static void freeDB(ByteBuffer buffer) {
    if (CleanerUtil.UNMAP_SUPPORTED) {
      try {
        CleanerUtil.getCleaner().freeBuffer(buffer);
      } catch (IOException e) {
        LOG.info("Failed to free the buffer", e);
      }
    } else {
      LOG.trace(CleanerUtil.UNMAP_NOT_SUPPORTED_REASON);
    }
  }

  /** Read crypto buffer size */
  public static int getBufferSize(Configuration conf) {
    return conf.getInt(HADOOP_SECURITY_CRYPTO_BUFFER_SIZE_KEY,
        HADOOP_SECURITY_CRYPTO_BUFFER_SIZE_DEFAULT);
  }

  /** AES/CTR/NoPadding is required */
  public static void checkCodec(CryptoCodec codec) {
    if (codec.getCipherSuite() != CipherSuite.AES_CTR_NOPADDING) {
      throw new UnsupportedCodecException("AES/CTR/NoPadding is required");
    }
  }

  /** Check and floor buffer size */
  public static int checkBufferSize(CryptoCodec codec, int bufferSize) {
    Preconditions.checkArgument(bufferSize >= MIN_BUFFER_SIZE,
        "Minimum value of buffer size is " + MIN_BUFFER_SIZE + ".");
    return bufferSize - bufferSize % codec.getCipherSuite()
        .getAlgorithmBlockSize();
  }

  /**
   * If input stream is {@link org.apache.hadoop.fs.Seekable}, return it's
   * current position, otherwise return 0;
   */
  public static long getInputStreamOffset(InputStream in) throws IOException {
    if (in instanceof Seekable) {
      return ((Seekable) in).getPos();
    }
    return 0;
  }
}
