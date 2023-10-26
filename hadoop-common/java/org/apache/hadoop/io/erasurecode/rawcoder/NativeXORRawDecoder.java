package org.apache.hadoop.io.erasurecode.rawcoder;
import org.apache.hadoop.io.erasurecode.ErasureCodeNative;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * A XOR raw decoder using Intel ISA-L library.
 */
public class NativeXORRawDecoder extends AbstractNativeRawDecoder {

  static {
    ErasureCodeNative.checkNativeCodeLoaded();
  }

  public NativeXORRawDecoder(ErasureCoderOptions coderOptions) {
    super(coderOptions);
    decoderLock.writeLock().lock();
    try {
      initImpl(coderOptions.getNumDataUnits(),
          coderOptions.getNumParityUnits());
    } finally {
      decoderLock.writeLock().unlock();
    }
  }

  @Override
  protected void performDecodeImpl(
      ByteBuffer[] inputs, int[] inputOffsets, int dataLen, int[] erased,
      ByteBuffer[] outputs, int[] outputOffsets) throws IOException {
    decodeImpl(inputs, inputOffsets, dataLen, erased, outputs, outputOffsets);
  }

  @Override
  public void release() {
    decoderLock.writeLock().lock();
    try {
      destroyImpl();
    } finally {
      decoderLock.writeLock().unlock();
    }
  }

  private native void initImpl(int numDataUnits, int numParityUnits);

  /**
   * Native implementation of decoding.
   * @throws IOException if the decoder is closed.
   */
  private native void decodeImpl(
      ByteBuffer[] inputs, int[] inputOffsets, int dataLen, int[] erased,
      ByteBuffer[] outputs, int[] outputOffsets) throws IOException;

  private native void destroyImpl();
}
