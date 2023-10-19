package org.apache.hadoop.io.erasurecode.rawcoder;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.io.erasurecode.ErasureCodeNative;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * A Reed-Solomon raw encoder using Intel ISA-L library.
 */
@InterfaceAudience.Private
public class NativeRSRawEncoder extends AbstractNativeRawEncoder {

  static {
    ErasureCodeNative.checkNativeCodeLoaded();
  }

  public NativeRSRawEncoder(ErasureCoderOptions coderOptions) {
    super(coderOptions);
    encoderLock.writeLock().lock();
    try {
      initImpl(coderOptions.getNumDataUnits(),
          coderOptions.getNumParityUnits());
    } finally {
      encoderLock.writeLock().unlock();
    }
  }

  @Override
  protected void performEncodeImpl(
          ByteBuffer[] inputs, int[] inputOffsets, int dataLen,
          ByteBuffer[] outputs, int[] outputOffsets) throws IOException {
    encodeImpl(inputs, inputOffsets, dataLen, outputs, outputOffsets);
  }

  @Override
  public void release() {
    encoderLock.writeLock().lock();
    try {
      destroyImpl();
    } finally {
      encoderLock.writeLock().unlock();
    }
  }

  @Override
  public boolean preferDirectBuffer() {
    return true;
  }

  private native void initImpl(int numDataUnits, int numParityUnits);

  private native void encodeImpl(ByteBuffer[] inputs, int[] inputOffsets,
                                 int dataLen, ByteBuffer[] outputs,
                                 int[] outputOffsets) throws IOException;

  private native void destroyImpl();
}
