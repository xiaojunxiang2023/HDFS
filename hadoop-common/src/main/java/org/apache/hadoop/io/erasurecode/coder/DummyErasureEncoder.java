package org.apache.hadoop.io.erasurecode.coder;

import org.apache.hadoop.io.erasurecode.ECBlock;
import org.apache.hadoop.io.erasurecode.ECBlockGroup;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;
import org.apache.hadoop.io.erasurecode.rawcoder.DummyRawEncoder;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureEncoder;

/**
 * Dummy erasure encoder does no real computation. Instead, it just returns
 * zero bytes. This decoder can be used to isolate the performance issue to
 * HDFS side logic instead of codec, and is intended for test only.
 */
public class DummyErasureEncoder extends ErasureEncoder {
  public DummyErasureEncoder(ErasureCoderOptions options) {
    super(options);
  }

  @Override
  protected ErasureCodingStep prepareEncodingStep(ECBlockGroup blockGroup) {
    RawErasureEncoder rawEncoder = new DummyRawEncoder(getOptions());

    ECBlock[] inputBlocks = getInputBlocks(blockGroup);

    return new ErasureEncodingStep(inputBlocks,
        getOutputBlocks(blockGroup), rawEncoder);
  }
}
