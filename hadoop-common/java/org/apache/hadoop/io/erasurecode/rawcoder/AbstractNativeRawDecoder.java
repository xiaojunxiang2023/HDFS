package org.apache.hadoop.io.erasurecode.rawcoder;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;
import org.apache.hadoop.util.PerformanceAdvisory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/**
 * Abstract native raw decoder for all native coders to extend with.
 */
abstract class AbstractNativeRawDecoder extends RawErasureDecoder {
  public static Logger LOG =
      LoggerFactory.getLogger(AbstractNativeRawDecoder.class);

  // Protect ISA-L coder data structure in native layer from being accessed and
  // updated concurrently by the init, release and decode functions.
  protected final ReentrantReadWriteLock decoderLock =
      new ReentrantReadWriteLock();

  public AbstractNativeRawDecoder(ErasureCoderOptions coderOptions) {
    super(coderOptions);
  }

  @Override
  protected void doDecode(ByteBufferDecodingState decodingState)
      throws IOException {
    decoderLock.readLock().lock();
    try {
      if (nativeCoder == 0) {
        throw new IOException(String.format("%s closed",
            getClass().getSimpleName()));
      }
      int[] inputOffsets = new int[decodingState.inputs.length];
      int[] outputOffsets = new int[decodingState.outputs.length];

      ByteBuffer buffer;
      for (int i = 0; i < decodingState.inputs.length; ++i) {
        buffer = decodingState.inputs[i];
        if (buffer != null) {
          inputOffsets[i] = buffer.position();
        }
      }

      for (int i = 0; i < decodingState.outputs.length; ++i) {
        buffer = decodingState.outputs[i];
        outputOffsets[i] = buffer.position();
      }

      performDecodeImpl(decodingState.inputs, inputOffsets,
          decodingState.decodeLength, decodingState.erasedIndexes,
          decodingState.outputs, outputOffsets);
    } finally {
      decoderLock.readLock().unlock();
    }
  }

  protected abstract void performDecodeImpl(ByteBuffer[] inputs,
                                            int[] inputOffsets, int dataLen,
                                            int[] erased, ByteBuffer[] outputs,
                                            int[] outputOffsets)
      throws IOException;

  @Override
  protected void doDecode(ByteArrayDecodingState decodingState)
      throws IOException {
    PerformanceAdvisory.LOG.debug("convertToByteBufferState is invoked, " +
        "not efficiently. Please use direct ByteBuffer inputs/outputs");

    ByteBufferDecodingState bbdState = decodingState.convertToByteBufferState();
    doDecode(bbdState);

    for (int i = 0; i < decodingState.outputs.length; i++) {
      bbdState.outputs[i].get(decodingState.outputs[i],
          decodingState.outputOffsets[i], decodingState.decodeLength);
    }
  }

  @Override
  public boolean preferDirectBuffer() {
    return true;
  }

  // To link with the underlying data structure in the native layer.
  // No get/set as only used by native codes.
  private long nativeCoder;
}
