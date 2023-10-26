package org.apache.hadoop.io.erasurecode.coder;
import org.apache.hadoop.io.erasurecode.CodecUtil;
import org.apache.hadoop.io.erasurecode.ECBlock;
import org.apache.hadoop.io.erasurecode.ECBlockGroup;
import org.apache.hadoop.io.erasurecode.ErasureCodeConstants;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureDecoder;

/**
 * Xor erasure decoder that decodes a block group.
 *
 * It implements {@link ErasureCoder}.
 */
public class XORErasureDecoder extends ErasureDecoder {

  public XORErasureDecoder(ErasureCoderOptions options) {
    super(options);
  }

  @Override
  protected ErasureCodingStep prepareDecodingStep(
      final ECBlockGroup blockGroup) {
    RawErasureDecoder rawDecoder = CodecUtil.createRawDecoder(getConf(),
        ErasureCodeConstants.XOR_CODEC_NAME, getOptions());

    ECBlock[] inputBlocks = getInputBlocks(blockGroup);

    return new ErasureDecodingStep(inputBlocks,
        getErasedIndexes(inputBlocks),
        getOutputBlocks(blockGroup), rawDecoder);
  }

  /**
   * Which blocks were erased ? For XOR it's simple we only allow and return one
   * erased block, either data or parity.
   * @param blockGroup
   * @return output blocks to recover
   */
  @Override
  protected ECBlock[] getOutputBlocks(ECBlockGroup blockGroup) {
    /**
     * If more than one blocks (either data or parity) erased, then it's not
     * edible to recover. We don't have the check here since it will be done
     * by upper level: ErasreCoder call can be avoid if not possible to recover
     * at all.
     */
    int erasedNum = getNumErasedBlocks(blockGroup);
    ECBlock[] outputBlocks = new ECBlock[erasedNum];

    int idx = 0;
    for (int i = 0; i < getNumParityUnits(); i++) {
      if (blockGroup.getParityBlocks()[i].isErased()) {
        outputBlocks[idx++] = blockGroup.getParityBlocks()[i];
      }
    }

    for (int i = 0; i < getNumDataUnits(); i++) {
      if (blockGroup.getDataBlocks()[i].isErased()) {
        outputBlocks[idx++] = blockGroup.getDataBlocks()[i];
      }
    }

    return outputBlocks;
  }
}
