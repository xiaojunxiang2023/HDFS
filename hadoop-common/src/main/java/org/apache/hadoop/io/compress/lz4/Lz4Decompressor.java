package org.apache.hadoop.io.compress.lz4;

import net.jpountz.lz4.LZ4Factory;
import net.jpountz.lz4.LZ4SafeDecompressor;
import org.apache.hadoop.io.compress.Decompressor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * A {@link Decompressor} based on the lz4 compression algorithm.
 * http://code.google.com/p/lz4/
 */
public class Lz4Decompressor implements Decompressor {
  private static final Logger LOG =
      LoggerFactory.getLogger(Lz4Compressor.class.getName());
  private static final int DEFAULT_DIRECT_BUFFER_SIZE = 64 * 1024;

  private int directBufferSize;
  private Buffer compressedDirectBuf = null;
  private int compressedDirectBufLen;
  private Buffer uncompressedDirectBuf = null;
  private byte[] userBuf = null;
  private int userBufOff = 0, userBufLen = 0;
  private boolean finished;

  private LZ4SafeDecompressor lz4Decompressor;

  /**
   * Creates a new compressor.
   *
   * @param directBufferSize size of the direct buffer to be used.
   */
  public Lz4Decompressor(int directBufferSize) {
    this.directBufferSize = directBufferSize;

    try {
      LZ4Factory lz4Factory = LZ4Factory.fastestInstance();
      lz4Decompressor = lz4Factory.safeDecompressor();
    } catch (AssertionError t) {
      throw new RuntimeException("lz4-java library is not available: " +
          "Lz4Decompressor has not been loaded. You need to add " +
          "lz4-java.jar to your CLASSPATH. " + t, t);
    }

    compressedDirectBuf = ByteBuffer.allocateDirect(directBufferSize);
    uncompressedDirectBuf = ByteBuffer.allocateDirect(directBufferSize);
    uncompressedDirectBuf.position(directBufferSize);

  }

  /**
   * Creates a new decompressor with the default buffer size.
   */
  public Lz4Decompressor() {
    this(DEFAULT_DIRECT_BUFFER_SIZE);
  }

  /**
   * Sets input data for decompression.
   * This should be called if and only if {@link #needsInput()} returns
   * <code>true</code> indicating that more input data is required.
   * (Both native and non-native versions of various Decompressors require
   * that the data passed in via <code>b[]</code> remain unmodified until
   * the caller is explicitly notified--via {@link #needsInput()}--that the
   * buffer may be safely modified.  With this requirement, an extra
   * buffer-copy can be avoided.)
   *
   * @param b   Input data
   * @param off Start offset
   * @param len Length
   */
  @Override
  public synchronized void setInput(byte[] b, int off, int len) {
    if (b == null) {
      throw new NullPointerException();
    }
    if (off < 0 || len < 0 || off > b.length - len) {
      throw new ArrayIndexOutOfBoundsException();
    }

    this.userBuf = b;
    this.userBufOff = off;
    this.userBufLen = len;

    setInputFromSavedData();

    // Reinitialize lz4's output direct-buffer
    uncompressedDirectBuf.limit(directBufferSize);
    uncompressedDirectBuf.position(directBufferSize);
  }

  /**
   * If a write would exceed the capacity of the direct buffers, it is set
   * aside to be loaded by this function while the compressed data are
   * consumed.
   */
  synchronized void setInputFromSavedData() {
    compressedDirectBufLen = Math.min(userBufLen, directBufferSize);

    // Reinitialize lz4's input direct buffer
    compressedDirectBuf.rewind();
    ((ByteBuffer) compressedDirectBuf).put(userBuf, userBufOff,
        compressedDirectBufLen);

    // Note how much data is being fed to lz4
    userBufOff += compressedDirectBufLen;
    userBufLen -= compressedDirectBufLen;
  }

  /**
   * Does nothing.
   */
  @Override
  public synchronized void setDictionary(byte[] b, int off, int len) {
    // do nothing
  }

  /**
   * Returns true if the input data buffer is empty and
   * {@link #setInput(byte[], int, int)} should be called to
   * provide more input.
   *
   * @return <code>true</code> if the input data buffer is empty and
   *         {@link #setInput(byte[], int, int)} should be called in
   *         order to provide more input.
   */
  @Override
  public synchronized boolean needsInput() {
    // Consume remaining compressed data?
    if (uncompressedDirectBuf.remaining() > 0) {
      return false;
    }

    // Check if lz4 has consumed all input
    if (compressedDirectBufLen <= 0) {
      // Check if we have consumed all user-input
      if (userBufLen <= 0) {
        return true;
      } else {
        setInputFromSavedData();
      }
    }

    return false;
  }

  /**
   * Returns <code>false</code>.
   *
   * @return <code>false</code>.
   */
  @Override
  public synchronized boolean needsDictionary() {
    return false;
  }

  /**
   * Returns true if the end of the decompressed
   * data output stream has been reached.
   *
   * @return <code>true</code> if the end of the decompressed
   *         data output stream has been reached.
   */
  @Override
  public synchronized boolean finished() {
    return (finished && uncompressedDirectBuf.remaining() == 0);
  }

  /**
   * Fills specified buffer with uncompressed data. Returns actual number
   * of bytes of uncompressed data. A return value of 0 indicates that
   * {@link #needsInput()} should be called in order to determine if more
   * input data is required.
   *
   * @param b   Buffer for the compressed data
   * @param off Start offset of the data
   * @param len Size of the buffer
   * @return The actual number of bytes of uncompressed data.
   * @throws IOException
   */
  @Override
  public synchronized int decompress(byte[] b, int off, int len)
      throws IOException {
    if (b == null) {
      throw new NullPointerException();
    }
    if (off < 0 || len < 0 || off > b.length - len) {
      throw new ArrayIndexOutOfBoundsException();
    }

    int n = 0;

    // Check if there is uncompressed data
    n = uncompressedDirectBuf.remaining();
    if (n > 0) {
      n = Math.min(n, len);
      ((ByteBuffer) uncompressedDirectBuf).get(b, off, n);
      return n;
    }
    if (compressedDirectBufLen > 0) {
      // Re-initialize the lz4's output direct buffer
      uncompressedDirectBuf.rewind();
      uncompressedDirectBuf.limit(directBufferSize);

      // Decompress data
      n = decompressDirectBuf();
      uncompressedDirectBuf.limit(n);

      if (userBufLen <= 0) {
        finished = true;
      }

      // Get atmost 'len' bytes
      n = Math.min(n, len);
      ((ByteBuffer) uncompressedDirectBuf).get(b, off, n);
    }

    return n;
  }

  /**
   * Returns <code>0</code>.
   *
   * @return <code>0</code>.
   */
  @Override
  public synchronized int getRemaining() {
    // Never use this function in BlockDecompressorStream.
    return 0;
  }

  @Override
  public synchronized void reset() {
    finished = false;
    compressedDirectBufLen = 0;
    uncompressedDirectBuf.limit(directBufferSize);
    uncompressedDirectBuf.position(directBufferSize);
    userBufOff = userBufLen = 0;
  }

  /**
   * Resets decompressor and input and output buffers so that a new set of
   * input data can be processed.
   */
  @Override
  public synchronized void end() {
    // do nothing
  }

  private int decompressDirectBuf() {
    if (compressedDirectBufLen == 0) {
      return 0;
    } else {
      compressedDirectBuf.limit(compressedDirectBufLen).position(0);
      lz4Decompressor.decompress((ByteBuffer) compressedDirectBuf,
          (ByteBuffer) uncompressedDirectBuf);
      compressedDirectBufLen = 0;
      compressedDirectBuf.clear();
      int size = uncompressedDirectBuf.position();
      uncompressedDirectBuf.position(0);
      return size;
    }
  }
}
