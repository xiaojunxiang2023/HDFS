package org.apache.hadoop.io.erasurecode.coder;

import org.apache.hadoop.io.erasurecode.ECBlock;
import org.apache.hadoop.io.erasurecode.ECChunk;
import org.apache.hadoop.io.erasurecode.coder.util.HHUtil;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureEncoder;

import java.io.IOException;
import java.nio.ByteBuffer;

/**
 * Hitchhiker-XOR Erasure encoding step, a wrapper of all the necessary
 * information to perform an encoding step involved in the whole process of
 * encoding a block group.
 */
public class HHXORErasureEncodingStep extends HHErasureCodingStep {
  private int[] piggyBackIndex;
  private RawErasureEncoder rsRawEncoder;
  private RawErasureEncoder xorRawEncoder;

  /**
   * The constructor with all the necessary info.
   *
   * @param inputBlocks
   * @param outputBlocks
   * @param rsRawEncoder  underlying RS encoder for hitchhiker encoding
   * @param xorRawEncoder underlying XOR encoder for hitchhiker encoding
   */
  public HHXORErasureEncodingStep(ECBlock[] inputBlocks, ECBlock[] outputBlocks,
                                  RawErasureEncoder rsRawEncoder,
                                  RawErasureEncoder xorRawEncoder) {
    super(inputBlocks, outputBlocks);

    this.rsRawEncoder = rsRawEncoder;
    this.xorRawEncoder = xorRawEncoder;
    piggyBackIndex = HHUtil.initPiggyBackIndexWithoutPBVec(
        rsRawEncoder.getNumDataUnits(), rsRawEncoder.getNumParityUnits());
  }

  @Override
  public void performCoding(ECChunk[] inputChunks, ECChunk[] outputChunks)
      throws IOException {
    ByteBuffer[] inputBuffers = ECChunk.toBuffers(inputChunks);
    ByteBuffer[] outputBuffers = ECChunk.toBuffers(outputChunks);
    performCoding(inputBuffers, outputBuffers);
  }

  private void performCoding(ByteBuffer[] inputs, ByteBuffer[] outputs)
      throws IOException {
    final int numDataUnits = this.rsRawEncoder.getNumDataUnits();
    final int numParityUnits = this.rsRawEncoder.getNumParityUnits();
    final int subSPacketSize = getSubPacketSize();

    // inputs length = numDataUnits * subPacketSize
    if (inputs.length != numDataUnits * subSPacketSize) {
      throw new IllegalArgumentException("Invalid inputs length");
    }

    if (outputs.length != numParityUnits * subSPacketSize) {
      throw new IllegalArgumentException("Invalid outputs length");
    }

    // first numDataUnits length is first sub-stripe,
    // second numDataUnits length is second sub-stripe
    ByteBuffer[][] hhInputs = new ByteBuffer[subSPacketSize][numDataUnits];
    for (int i = 0; i < subSPacketSize; ++i) {
      for (int j = 0; j < numDataUnits; ++j) {
        hhInputs[i][j] = inputs[i * numDataUnits + j];
      }
    }

    ByteBuffer[][] hhOutputs = new ByteBuffer[subSPacketSize][numParityUnits];
    for (int i = 0; i < subSPacketSize; ++i) {
      for (int j = 0; j < numParityUnits; ++j) {
        hhOutputs[i][j] = outputs[i * numParityUnits + j];
      }
    }

    doEncode(hhInputs, hhOutputs);
  }

  private void doEncode(ByteBuffer[][] inputs, ByteBuffer[][] outputs)
      throws IOException {
    final int numParityUnits = this.rsRawEncoder.getNumParityUnits();

    // calc piggyBacks using first sub-packet
    ByteBuffer[] piggyBacks = HHUtil.getPiggyBacksFromInput(inputs[0],
        piggyBackIndex, numParityUnits, 0, xorRawEncoder);

    // Step1: RS encode each byte-stripe of sub-packets
    for (int i = 0; i < getSubPacketSize(); ++i) {
      rsRawEncoder.encode(inputs[i], outputs[i]);
    }

    // Step2: Adding piggybacks to the parities
    // Only second sub-packet is added with a piggyback.
    encodeWithPiggyBacks(piggyBacks, outputs, numParityUnits,
        inputs[0][0].isDirect());
  }

  private void encodeWithPiggyBacks(ByteBuffer[] piggyBacks,
                                    ByteBuffer[][] outputs,
                                    int numParityUnits,
                                    boolean bIsDirect) {
    if (!bIsDirect) {
      for (int i = 0; i < numParityUnits - 1; i++) {
        int parityIndex = i + 1;
        int bufSize = piggyBacks[i].remaining();
        byte[] newOut = outputs[1][parityIndex].array();
        int offset = outputs[1][parityIndex].arrayOffset()
            + outputs[1][parityIndex].position();

        for (int k = offset, j = 0; j < bufSize; k++, j++) {
          newOut[k] = (byte) (newOut[k] ^ piggyBacks[i].get(j));
        }
      }
      return;
    }

    for (int i = 0; i < numParityUnits - 1; i++) {
      int parityIndex = i + 1;
      for (int k = piggyBacks[i].position(),
           m = outputs[1][parityIndex].position();
           k < piggyBacks[i].limit(); k++, m++) {
        outputs[1][parityIndex].put(m,
            (byte) (outputs[1][parityIndex].get(m) ^ piggyBacks[i].get(k)));
      }
    }
  }

}
