package org.apache.hadoop.io.erasurecode.coder;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.io.erasurecode.ECBlock;
import org.apache.hadoop.io.erasurecode.ECChunk;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureEncoder;

import java.io.IOException;

/**
 * Erasure encoding step, a wrapper of all the necessary information to perform
 * an encoding step involved in the whole process of encoding a block group.
 */
@InterfaceAudience.Private
public class ErasureEncodingStep implements ErasureCodingStep {
  private ECBlock[] inputBlocks;
  private ECBlock[] outputBlocks;
  private RawErasureEncoder rawEncoder;

  /**
   * The constructor with all the necessary info.
   * @param inputBlocks
   * @param outputBlocks
   * @param rawEncoder
   */
  public ErasureEncodingStep(ECBlock[] inputBlocks, ECBlock[] outputBlocks,
                             RawErasureEncoder rawEncoder) {
    this.inputBlocks = inputBlocks;
    this.outputBlocks = outputBlocks;
    this.rawEncoder = rawEncoder;
  }

  @Override
  public void performCoding(ECChunk[] inputChunks, ECChunk[] outputChunks)
      throws IOException {
    rawEncoder.encode(inputChunks, outputChunks);
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
    // do nothing
  }
}
