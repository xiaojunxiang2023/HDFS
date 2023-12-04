package org.apache.hadoop.io.erasurecode.rawcoder;

import org.apache.hadoop.util.micro.HadoopIllegalArgumentException;

import java.nio.ByteBuffer;

/**
 * A utility class that maintains decoding state during a decode call using
 * ByteBuffer inputs.
 */
class ByteBufferDecodingState extends DecodingState {
  ByteBuffer[] inputs;
  ByteBuffer[] outputs;
  int[] erasedIndexes;
  boolean usingDirectBuffer;

  ByteBufferDecodingState(RawErasureDecoder decoder, ByteBuffer[] inputs,
                          int[] erasedIndexes, ByteBuffer[] outputs) {
    this.decoder = decoder;
    this.inputs = inputs;
    this.outputs = outputs;
    this.erasedIndexes = erasedIndexes;
    ByteBuffer validInput = CoderUtil.findFirstValidInput(inputs);
    this.decodeLength = validInput.remaining();
    this.usingDirectBuffer = validInput.isDirect();

    checkParameters(inputs, erasedIndexes, outputs);
    checkInputBuffers(inputs);
    checkOutputBuffers(outputs);
  }

  ByteBufferDecodingState(RawErasureDecoder decoder,
                          int decodeLength,
                          int[] erasedIndexes,
                          ByteBuffer[] inputs,
                          ByteBuffer[] outputs) {
    this.decoder = decoder;
    this.decodeLength = decodeLength;
    this.erasedIndexes = erasedIndexes;
    this.inputs = inputs;
    this.outputs = outputs;
  }

  /**
   * Convert to a ByteArrayDecodingState when it's backed by on-heap arrays.
   */
  ByteArrayDecodingState convertToByteArrayState() {
    int[] inputOffsets = new int[inputs.length];
    int[] outputOffsets = new int[outputs.length];
    byte[][] newInputs = new byte[inputs.length][];
    byte[][] newOutputs = new byte[outputs.length][];

    ByteBuffer buffer;
    for (int i = 0; i < inputs.length; ++i) {
      buffer = inputs[i];
      if (buffer != null) {
        inputOffsets[i] = buffer.arrayOffset() + buffer.position();
        newInputs[i] = buffer.array();
      }
    }

    for (int i = 0; i < outputs.length; ++i) {
      buffer = outputs[i];
      outputOffsets[i] = buffer.arrayOffset() + buffer.position();
      newOutputs[i] = buffer.array();
    }

    ByteArrayDecodingState baeState = new ByteArrayDecodingState(decoder,
        decodeLength, erasedIndexes, newInputs,
        inputOffsets, newOutputs, outputOffsets);
    return baeState;
  }

  /**
   * Check and ensure the buffers are of the desired length and type, direct
   * buffers or not.
   * @param buffers the buffers to check
   */
  void checkInputBuffers(ByteBuffer[] buffers) {
    int validInputs = 0;

    for (ByteBuffer buffer : buffers) {
      if (buffer == null) {
        continue;
      }

      if (buffer.remaining() != decodeLength) {
        throw new HadoopIllegalArgumentException(
            "Invalid buffer, not of length " + decodeLength);
      }
      if (buffer.isDirect() != usingDirectBuffer) {
        throw new HadoopIllegalArgumentException(
            "Invalid buffer, isDirect should be " + usingDirectBuffer);
      }

      validInputs++;
    }

    if (validInputs < decoder.getNumDataUnits()) {
      throw new HadoopIllegalArgumentException(
          "No enough valid inputs are provided, not recoverable");
    }
  }

  /**
   * Check and ensure the buffers are of the desired length and type, direct
   * buffers or not.
   * @param buffers the buffers to check
   */
  void checkOutputBuffers(ByteBuffer[] buffers) {
    for (ByteBuffer buffer : buffers) {
      if (buffer == null) {
        throw new HadoopIllegalArgumentException(
            "Invalid buffer found, not allowing null");
      }

      if (buffer.remaining() != decodeLength) {
        throw new HadoopIllegalArgumentException(
            "Invalid buffer, not of length " + decodeLength);
      }
      if (buffer.isDirect() != usingDirectBuffer) {
        throw new HadoopIllegalArgumentException(
            "Invalid buffer, isDirect should be " + usingDirectBuffer);
      }
    }
  }
}
