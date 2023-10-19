package org.apache.hadoop.io.erasurecode.coder;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.io.erasurecode.ECBlock;
import org.apache.hadoop.io.erasurecode.ECChunk;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureDecoder;

import java.io.IOException;

/**
 * Erasure decoding step, a wrapper of all the necessary information to perform
 * a decoding step involved in the whole process of decoding a block group.
 */
@InterfaceAudience.Private
public class ErasureDecodingStep implements ErasureCodingStep {
  private ECBlock[] inputBlocks;
  private ECBlock[] outputBlocks;
  private int[] erasedIndexes;
  private RawErasureDecoder rawDecoder;

  /**
   * The constructor with all the necessary info.
   * @param inputBlocks
   * @param erasedIndexes the indexes of erased blocks in inputBlocks array
   * @param outputBlocks
   * @param rawDecoder
   */
  public ErasureDecodingStep(ECBlock[] inputBlocks, int[] erasedIndexes,
                             ECBlock[] outputBlocks,
                             RawErasureDecoder rawDecoder) {
    this.inputBlocks = inputBlocks;
    this.outputBlocks = outputBlocks;
    this.erasedIndexes = erasedIndexes;
    this.rawDecoder = rawDecoder;
  }

  @Override
  public void performCoding(ECChunk[] inputChunks, ECChunk[] outputChunks)
      throws IOException {
    rawDecoder.decode(inputChunks, erasedIndexes, outputChunks);
  }

  @Override
  public ECBlock[] getInputBlocks() {
    return inputBlocks;
  }

  @Override
  public ECBlock[] getOutputBlocks() {
    return outputBlocks;
  }

  @Override
  public void finish() {
    // TODO: Finalize decoder if necessary
  }
}
