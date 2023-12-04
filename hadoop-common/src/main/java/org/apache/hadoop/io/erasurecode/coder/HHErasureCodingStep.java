package org.apache.hadoop.io.erasurecode.coder;

import org.apache.hadoop.io.erasurecode.ECBlock;

/**
 * Abstract class for Hitchhiker common facilities shared by
 * {@link HHXORErasureEncodingStep}and {@link HHXORErasureDecodingStep}.
 *
 * It implements {@link ErasureCodingStep}.
 */
public abstract class HHErasureCodingStep
    implements ErasureCodingStep {

  private ECBlock[] inputBlocks;
  private ECBlock[] outputBlocks;

  private static final int SUB_PACKET_SIZE = 2;

  /**
   * Constructor given input blocks and output blocks.
   *
   * @param inputBlocks
   * @param outputBlocks
   */
  public HHErasureCodingStep(ECBlock[] inputBlocks,
                             ECBlock[] outputBlocks) {
    this.inputBlocks = inputBlocks;
    this.outputBlocks = outputBlocks;
  }

  protected int getSubPacketSize() {
    return SUB_PACKET_SIZE;
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
    // TODO: Finalize encoder/decoder if necessary
  }
}
