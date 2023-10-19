package org.apache.hadoop.io.erasurecode.coder;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.io.erasurecode.CodecUtil;
import org.apache.hadoop.io.erasurecode.ECBlock;
import org.apache.hadoop.io.erasurecode.ECBlockGroup;
import org.apache.hadoop.io.erasurecode.ErasureCodeConstants;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureEncoder;

/**
 * Reed-Solomon erasure encoder that encodes a block group.
 *
 * It implements {@link ErasureCoder}.
 */
@InterfaceAudience.Private
public class RSErasureEncoder extends ErasureEncoder {
  private RawErasureEncoder rawEncoder;

  public RSErasureEncoder(ErasureCoderOptions options) {
    super(options);
  }

  @Override
  protected ErasureCodingStep prepareEncodingStep(final ECBlockGroup blockGroup) {

    RawErasureEncoder rawEncoder = checkCreateRSRawEncoder();

    ECBlock[] inputBlocks = getInputBlocks(blockGroup);

    return new ErasureEncodingStep(inputBlocks,
        getOutputBlocks(blockGroup), rawEncoder);
  }

  private RawErasureEncoder checkCreateRSRawEncoder() {
    if (rawEncoder == null) {
      // TODO: we should create the raw coder according to codec.
      rawEncoder = CodecUtil.createRawEncoder(getConf(),
          ErasureCodeConstants.RS_CODEC_NAME, getOptions());
    }
    return rawEncoder;
  }

  @Override
  public void release() {
    if (rawEncoder != null) {
      rawEncoder.release();
    }
  }

  @Override
  public boolean preferDirectBuffer() {
    return false;
  }
}
