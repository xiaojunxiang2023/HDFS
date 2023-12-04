package org.apache.hadoop.io.erasurecode.coder;

import org.apache.hadoop.io.erasurecode.*;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureEncoder;

/**
 * Xor erasure encoder that encodes a block group.
 *
 * It implements {@link ErasureCoder}.
 */
public class XORErasureEncoder extends ErasureEncoder {

  public XORErasureEncoder(ErasureCoderOptions options) {
    super(options);
  }

  @Override
  protected ErasureCodingStep prepareEncodingStep(
      final ECBlockGroup blockGroup) {
    RawErasureEncoder rawEncoder = CodecUtil.createRawEncoder(getConf(),
        ErasureCodeConstants.XOR_CODEC_NAME, getOptions());

    ECBlock[] inputBlocks = getInputBlocks(blockGroup);

    return new ErasureEncodingStep(inputBlocks,
        getOutputBlocks(blockGroup), rawEncoder);
  }
}
