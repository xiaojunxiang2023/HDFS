package org.apache.hadoop.crypto;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.crypto.random.OpensslSecureRandom;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.util.ReflectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Closeable;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.Random;

import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SECURITY_SECURE_RANDOM_IMPL_KEY;

/**
 * Implement the AES-CTR crypto codec using JNI into OpenSSL.
 */
public class OpensslAesCtrCryptoCodec extends AesCtrCryptoCodec {
  private static final Logger LOG =
      LoggerFactory.getLogger(OpensslAesCtrCryptoCodec.class.getName());

  private Configuration conf;
  private Random random;

  public OpensslAesCtrCryptoCodec() {
    String loadingFailureReason = OpensslCipher.getLoadingFailureReason();
    if (loadingFailureReason != null) {
      throw new RuntimeException(loadingFailureReason);
    }
  }

  @Override
  public void setConf(Configuration conf) {
    this.conf = conf;
    final Class<? extends Random> klass = conf.getClass(
        HADOOP_SECURITY_SECURE_RANDOM_IMPL_KEY, OpensslSecureRandom.class,
        Random.class);
    try {
      random = ReflectionUtils.newInstance(klass, conf);
      if (LOG.isDebugEnabled()) {
        LOG.debug("Using " + klass.getName() + " as random number generator.");
      }
    } catch (Exception e) {
      LOG.info("Unable to use " + klass.getName() + ".  Falling back to " +
          "Java SecureRandom.", e);
      this.random = new SecureRandom();
    }
  }

  @Override
  public Configuration getConf() {
    return conf;
  }

  @Override
  public Encryptor createEncryptor() throws GeneralSecurityException {
    return new OpensslAesCtrCipher(OpensslCipher.ENCRYPT_MODE);
  }

  @Override
  public Decryptor createDecryptor() throws GeneralSecurityException {
    return new OpensslAesCtrCipher(OpensslCipher.DECRYPT_MODE);
  }

  @Override
  public void generateSecureRandom(byte[] bytes) {
    random.nextBytes(bytes);
  }

  @Override
  public void close() throws IOException {
    try {
      Closeable r = (Closeable) this.random;
      r.close();
    } catch (ClassCastException e) {
    }
    super.close();
  }

  private static class OpensslAesCtrCipher implements Encryptor, Decryptor {
    private final OpensslCipher cipher;
    private final int mode;
    private boolean contextReset = false;

    public OpensslAesCtrCipher(int mode) throws GeneralSecurityException {
      this.mode = mode;
      cipher = OpensslCipher.getInstance(SUITE.getName());
    }

    @Override
    public void init(byte[] key, byte[] iv) throws IOException {
      Preconditions.checkNotNull(key);
      Preconditions.checkNotNull(iv);
      contextReset = false;
      cipher.init(mode, key, iv);
    }

    /**
     * AES-CTR will consume all of the input data. It requires enough space in 
     * the destination buffer to encrypt entire input buffer.
     */
    @Override
    public void encrypt(ByteBuffer inBuffer, ByteBuffer outBuffer)
        throws IOException {
      process(inBuffer, outBuffer);
    }

    /**
     * AES-CTR will consume all of the input data. It requires enough space in
     * the destination buffer to decrypt entire input buffer.
     */
    @Override
    public void decrypt(ByteBuffer inBuffer, ByteBuffer outBuffer)
        throws IOException {
      process(inBuffer, outBuffer);
    }

    private void process(ByteBuffer inBuffer, ByteBuffer outBuffer)
        throws IOException {
      try {
        int inputSize = inBuffer.remaining();
        // OpensslCipher#update will maintain crypto context.
        int n = cipher.update(inBuffer, outBuffer);
        if (n < inputSize) {
          /**
           * Typically code will not get here. OpensslCipher#update will 
           * consume all input data and put result in outBuffer. 
           * OpensslCipher#doFinal will reset the crypto context.
           */
          contextReset = true;
          cipher.doFinal(outBuffer);
        }
      } catch (Exception e) {
        throw new IOException(e);
      }
    }

    @Override
    public boolean isContextReset() {
      return contextReset;
    }
  }
}
