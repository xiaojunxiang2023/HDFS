package org.apache.hadoop.io.erasurecode.rawcoder;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;

/**
 * A dummy raw encoder that does no real computation.
 * Instead, it just returns zero bytes.
 * This encoder can be used to isolate the performance issue to HDFS side logic
 * instead of codec, and is intended for test only.
 */
public class DummyRawEncoder extends RawErasureEncoder {

  public DummyRawEncoder(ErasureCoderOptions coderOptions) {
    super(coderOptions);
  }

  @Override
  protected void doEncode(ByteArrayEncodingState encodingState) {
    // Nothing to do. Output buffers have already been reset
  }

  @Override
  protected void doEncode(ByteBufferEncodingState encodingState) {
    // Nothing to do. Output buffers have already been reset
  }
}
