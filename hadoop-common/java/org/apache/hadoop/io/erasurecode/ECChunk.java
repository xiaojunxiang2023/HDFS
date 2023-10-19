package org.apache.hadoop.io.erasurecode;

import java.nio.ByteBuffer;

import org.apache.hadoop.classification.InterfaceAudience;

/**
 * A wrapper for ByteBuffer or bytes array for an erasure code chunk.
 */
@InterfaceAudience.Private
public class ECChunk {

  private ByteBuffer chunkBuffer;

  // TODO: should be in a more general flags
  private boolean allZero = false;

  /**
   * Wrapping a ByteBuffer
   * @param buffer buffer to be wrapped by the chunk
   */
  public ECChunk(ByteBuffer buffer) {
    this.chunkBuffer = buffer;
  }

  public ECChunk(ByteBuffer buffer, int offset, int len) {
    ByteBuffer tmp = buffer.duplicate();
    tmp.position(offset);
    tmp.limit(offset + len);
    this.chunkBuffer = tmp.slice();
  }

  /**
   * Wrapping a bytes array
   * @param buffer buffer to be wrapped by the chunk
   */
  public ECChunk(byte[] buffer) {
    this.chunkBuffer = ByteBuffer.wrap(buffer);
  }

  public ECChunk(byte[] buffer, int offset, int len) {
    this.chunkBuffer = ByteBuffer.wrap(buffer, offset, len);
  }

  public boolean isAllZero() {
    return allZero;
  }

  public void setAllZero(boolean allZero) {
    this.allZero = allZero;
  }

  /**
   * Convert to ByteBuffer
   * @return ByteBuffer
   */
  public ByteBuffer getBuffer() {
    return chunkBuffer;
  }

  /**
   * Convert an array of this chunks to an array of ByteBuffers
   * @param chunks chunks to convert into buffers
   * @return an array of ByteBuffers
   */
  public static ByteBuffer[] toBuffers(ECChunk[] chunks) {
    ByteBuffer[] buffers = new ByteBuffer[chunks.length];

    ECChunk chunk;
    for (int i = 0; i < chunks.length; i++) {
      chunk = chunks[i];
      if (chunk == null) {
        buffers[i] = null;
      } else {
        buffers[i] = chunk.getBuffer();
      }
    }

    return buffers;
  }

  /**
   * Convert to a bytes array, just for test usage.
   * @return bytes array
   */
  public byte[] toBytesArray() {
    byte[] bytesArr = new byte[chunkBuffer.remaining()];
    // Avoid affecting the original one
    chunkBuffer.mark();
    chunkBuffer.get(bytesArr);
    chunkBuffer.reset();

    return bytesArr;
  }
}
