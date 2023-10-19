package org.apache.hadoop.io.erasurecode.rawcoder;

import org.apache.hadoop.util.micro.HadoopIllegalArgumentException;
import org.apache.hadoop.classification.InterfaceAudience;

/**
 * A utility class that maintains decoding state during a decode call.
 */
@InterfaceAudience.Private
class DecodingState {
  RawErasureDecoder decoder;
  int decodeLength;

  /**
   * Check and validate decoding parameters, throw exception accordingly. The
   * checking assumes it's a MDS code. Other code  can override this.
   * @param inputs input buffers to check
   * @param erasedIndexes indexes of erased units in the inputs array
   * @param outputs output buffers to check
   */
  <T> void checkParameters(T[] inputs, int[] erasedIndexes,
                           T[] outputs) {
    if (inputs.length != decoder.getNumParityUnits() +
        decoder.getNumDataUnits()) {
      throw new IllegalArgumentException("Invalid inputs length");
    }

    if (erasedIndexes.length != outputs.length) {
      throw new HadoopIllegalArgumentException(
          "erasedIndexes and outputs mismatch in length");
    }

    if (erasedIndexes.length > decoder.getNumParityUnits()) {
      throw new HadoopIllegalArgumentException(
          "Too many erased, not recoverable");
    }
  }
}
