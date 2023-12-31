package org.apache.hadoop.crypto;

import java.io.IOException;
import java.nio.ByteBuffer;

public interface Encryptor {

  /**
   * Initialize the encryptor and the internal encryption context.
   * @param key encryption key.
   * @param iv encryption initialization vector
   * @throws IOException if initialization fails
   */
  public void init(byte[] key, byte[] iv) throws IOException;

  /**
   * Indicate whether the encryption context is reset.
   * <p>
   * Certain modes, like CTR, require a different IV depending on the
   * position in the stream. Generally, the encryptor maintains any necessary
   * context for calculating the IV and counter so that no reinit is necessary
   * during the encryption. Reinit before each operation is inefficient. 
   * @return boolean whether context is reset.
   */
  public boolean isContextReset();

  /**
   * This presents a direct interface encrypting with direct ByteBuffers.
   * <p>
   * This function does not always encrypt the entire buffer and may potentially
   * need to be called multiple times to process an entire buffer. The object 
   * may hold the encryption context internally.
   * <p>
   * Some implementations may require sufficient space in the destination 
   * buffer to encrypt the entire input buffer.
   * <p>
   * Upon return, inBuffer.position() will be advanced by the number of bytes
   * read and outBuffer.position() by bytes written. Implementations should
   * not modify inBuffer.limit() and outBuffer.limit().
   * <p>
   * @param inBuffer a direct {@link ByteBuffer} to read from. inBuffer may 
   * not be null and inBuffer.remaining() must be &gt; 0
   * @param outBuffer a direct {@link ByteBuffer} to write to. outBuffer may 
   * not be null and outBuffer.remaining() must be &gt; 0
   * @throws IOException if encryption fails
   */
  public void encrypt(ByteBuffer inBuffer, ByteBuffer outBuffer)
      throws IOException;
}
