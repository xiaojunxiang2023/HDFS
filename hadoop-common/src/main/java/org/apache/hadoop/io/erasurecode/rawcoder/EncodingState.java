package org.apache.hadoop.io.erasurecode.rawcoder;

import org.apache.hadoop.util.micro.HadoopIllegalArgumentException;

/**
 * A utility class that maintains encoding state during an encode call.
 */
abstract class EncodingState {
  RawErasureEncoder encoder;
  int encodeLength;

  /**
   * Check and validate decoding parameters, throw exception accordingly.
   * @param inputs input buffers to check
   * @param outputs output buffers to check
   */
  <T> void checkParameters(T[] inputs, T[] outputs) {
    if (inputs.length != encoder.getNumDataUnits()) {
      throw new HadoopIllegalArgumentException("Invalid inputs length");
    }
    if (outputs.length != encoder.getNumParityUnits()) {
      throw new HadoopIllegalArgumentException("Invalid outputs length");
    }
  }
}
