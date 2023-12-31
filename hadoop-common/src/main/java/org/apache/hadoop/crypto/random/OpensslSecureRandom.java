package org.apache.hadoop.crypto.random;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.util.NativeCodeLoader;
import org.apache.hadoop.util.PerformanceAdvisory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * OpenSSL secure random using JNI.
 * This implementation is thread-safe.
 * <p>
 *
 * If using an Intel chipset with RDRAND, the high-performance hardware 
 * random number generator will be used and it's much faster than
 * {@link java.security.SecureRandom}. If RDRAND is unavailable, default
 * OpenSSL secure random generator will be used. It's still faster
 * and can generate strong random bytes.
 * <p>
 * See https://wiki.openssl.org/index.php/Random_Numbers
 * See http://en.wikipedia.org/wiki/RdRand
 */
public class OpensslSecureRandom extends Random {
  private static final long serialVersionUID = -7828193502768789584L;
  private static final Logger LOG =
      LoggerFactory.getLogger(OpensslSecureRandom.class.getName());

  /** If native SecureRandom unavailable, use java SecureRandom */
  private java.security.SecureRandom fallback = null;
  private static boolean nativeEnabled = false;

  static {
    if (NativeCodeLoader.isNativeCodeLoaded() &&
        NativeCodeLoader.buildSupportsOpenssl()) {
      try {
        initSR();
        nativeEnabled = true;
      } catch (Throwable t) {
        LOG.error("Failed to load Openssl SecureRandom", t);
      }
    }
  }

  public static boolean isNativeCodeLoaded() {
    return nativeEnabled;
  }

  public OpensslSecureRandom() {
    if (!nativeEnabled) {
      PerformanceAdvisory.LOG.debug("Build does not support openssl, " +
          "falling back to Java SecureRandom.");
      fallback = new java.security.SecureRandom();
    }
  }

  /**
   * Generates a user-specified number of random bytes.
   * It's thread-safe.
   *
   * @param bytes the array to be filled in with random bytes.
   */
  @Override
  public void nextBytes(byte[] bytes) {
    if (!nativeEnabled || !nextRandBytes(bytes)) {
      fallback.nextBytes(bytes);
    }
  }

  @Override
  public void setSeed(long seed) {
    // Self-seeding.
  }

  /**
   * Generates an integer containing the user-specified number of
   * random bits (right justified, with leading zeros).
   *
   * @param numBits number of random bits to be generated, where
   * 0 {@literal <=} <code>numBits</code> {@literal <=} 32.
   *
   * @return int an <code>int</code> containing the user-specified number
   * of random bits (right justified, with leading zeros).
   */
  @Override
  final protected int next(int numBits) {
    Preconditions.checkArgument(numBits >= 0 && numBits <= 32);
    int numBytes = (numBits + 7) / 8;
    byte b[] = new byte[numBytes];
    int next = 0;

    nextBytes(b);
    for (int i = 0; i < numBytes; i++) {
      next = (next << 8) + (b[i] & 0xFF);
    }

    return next >>> (numBytes * 8 - numBits);
  }

  private native static void initSR();

  private native boolean nextRandBytes(byte[] bytes);
}
