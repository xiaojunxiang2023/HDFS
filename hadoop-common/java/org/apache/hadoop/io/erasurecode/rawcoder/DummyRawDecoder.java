package org.apache.hadoop.io.erasurecode.rawcoder;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;

/**
 * A dummy raw decoder that does no real computation.
 * Instead, it just returns zero bytes.
 * This decoder can be used to isolate the performance issue to HDFS side logic
 * instead of codec, and is intended for test only.
 */
@InterfaceAudience.Private
public class DummyRawDecoder extends RawErasureDecoder {

  public DummyRawDecoder(ErasureCoderOptions coderOptions) {
    super(coderOptions);
  }

  @Override
  protected void doDecode(ByteBufferDecodingState decodingState) {
    // Nothing to do. Output buffers have already been reset
  }

  @Override
  protected void doDecode(ByteArrayDecodingState decodingState) {
    // Nothing to do. Output buffers have already been reset
  }
}
