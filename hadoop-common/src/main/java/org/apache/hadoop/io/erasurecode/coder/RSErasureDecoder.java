package org.apache.hadoop.io.erasurecode.coder;
import org.apache.hadoop.io.erasurecode.CodecUtil;
import org.apache.hadoop.io.erasurecode.ECBlock;
import org.apache.hadoop.io.erasurecode.ECBlockGroup;
import org.apache.hadoop.io.erasurecode.ErasureCodeConstants;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureDecoder;

/**
 * Reed-Solomon erasure decoder that decodes a block group.
 *
 * It implements {@link ErasureCoder}.
 */
public class RSErasureDecoder extends ErasureDecoder {
  private RawErasureDecoder rsRawDecoder;

  public RSErasureDecoder(ErasureCoderOptions options) {
    super(options);
  }

  @Override
  protected ErasureCodingStep prepareDecodingStep(final ECBlockGroup blockGroup) {

    ECBlock[] inputBlocks = getInputBlocks(blockGroup);
    ECBlock[] outputBlocks = getOutputBlocks(blockGroup);

    RawErasureDecoder rawDecoder = checkCreateRSRawDecoder();
    return new ErasureDecodingStep(inputBlocks,
        getErasedIndexes(inputBlocks), outputBlocks, rawDecoder);
  }

  private RawErasureDecoder checkCreateRSRawDecoder() {
    if (rsRawDecoder == null) {
      rsRawDecoder = CodecUtil.createRawDecoder(getConf(),
          ErasureCodeConstants.RS_CODEC_NAME, getOptions());
    }
    return rsRawDecoder;
  }

  @Override
  public void release() {
    if (rsRawDecoder != null) {
      rsRawDecoder.release();
    }
  }
}
