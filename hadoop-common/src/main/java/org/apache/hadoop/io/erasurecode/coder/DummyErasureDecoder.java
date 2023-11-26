package org.apache.hadoop.io.erasurecode.coder;

import org.apache.hadoop.io.erasurecode.ECBlock;
import org.apache.hadoop.io.erasurecode.ECBlockGroup;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;
import org.apache.hadoop.io.erasurecode.rawcoder.DummyRawDecoder;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureDecoder;

/**
 * Dummy erasure decoder does no real computation. Instead, it just returns
 * zero bytes. This decoder can be used to isolate the performance issue to
 * HDFS side logic instead of codec, and is intended for test only.
 */
public class DummyErasureDecoder extends ErasureDecoder {
  public DummyErasureDecoder(ErasureCoderOptions options) {
    super(options);
  }

  @Override
  protected ErasureCodingStep prepareDecodingStep(ECBlockGroup blockGroup) {
    RawErasureDecoder rawDecoder = new DummyRawDecoder(getOptions());

    ECBlock[] inputBlocks = getInputBlocks(blockGroup);

    return new ErasureDecodingStep(inputBlocks,
        getErasedIndexes(inputBlocks),
        getOutputBlocks(blockGroup), rawDecoder);
  }
}
