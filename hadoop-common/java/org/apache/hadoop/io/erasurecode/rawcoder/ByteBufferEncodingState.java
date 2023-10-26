package org.apache.hadoop.io.erasurecode.rawcoder;

import org.apache.hadoop.util.micro.HadoopIllegalArgumentException;

import java.nio.ByteBuffer;

/**
 * A utility class that maintains encoding state during an encode call using
 * ByteBuffer inputs.
 */
class ByteBufferEncodingState extends EncodingState {
  ByteBuffer[] inputs;
  ByteBuffer[] outputs;
  boolean usingDirectBuffer;

  ByteBufferEncodingState(RawErasureEncoder encoder,
                          ByteBuffer[] inputs, ByteBuffer[] outputs) {
    this.encoder = encoder;
    ByteBuffer validInput = CoderUtil.findFirstValidInput(inputs);
    this.encodeLength = validInput.remaining();
    this.usingDirectBuffer = validInput.isDirect();
    this.inputs = inputs;
    this.outputs = outputs;

    checkParameters(inputs, outputs);
    checkBuffers(inputs);
    checkBuffers(outputs);
  }

  ByteBufferEncodingState(RawErasureEncoder encoder,
                          int encodeLength,
                          ByteBuffer[] inputs,
                          ByteBuffer[] outputs) {
    this.encoder = encoder;
    this.encodeLength = encodeLength;
    this.inputs = inputs;
    this.outputs = outputs;
  }

  /**
   * Convert to a ByteArrayEncodingState when it's backed by on-heap arrays.
   */
  ByteArrayEncodingState convertToByteArrayState() {
    int[] inputOffsets = new int[inputs.length];
    int[] outputOffsets = new int[outputs.length];
    byte[][] newInputs = new byte[inputs.length][];
    byte[][] newOutputs = new byte[outputs.length][];

    ByteBuffer buffer;
    for (int i = 0; i < inputs.length; ++i) {
      buffer = inputs[i];
      inputOffsets[i] = buffer.arrayOffset() + buffer.position();
      newInputs[i] = buffer.array();
    }

    for (int i = 0; i < outputs.length; ++i) {
      buffer = outputs[i];
      outputOffsets[i] = buffer.arrayOffset() + buffer.position();
      newOutputs[i] = buffer.array();
    }

    ByteArrayEncodingState baeState = new ByteArrayEncodingState(encoder,
        encodeLength, newInputs, inputOffsets, newOutputs, outputOffsets);
    return baeState;
  }

  /**
   * Check and ensure the buffers are of the desired length and type, direct
   * buffers or not.
   * @param buffers the buffers to check
   */
  void checkBuffers(ByteBuffer[] buffers) {
    for (ByteBuffer buffer : buffers) {
      if (buffer == null) {
        throw new HadoopIllegalArgumentException(
            "Invalid buffer found, not allowing null");
      }

      if (buffer.remaining() != encodeLength) {
        throw new HadoopIllegalArgumentException(
            "Invalid buffer, not of length " + encodeLength);
      }
      if (buffer.isDirect() != usingDirectBuffer) {
        throw new HadoopIllegalArgumentException(
            "Invalid buffer, isDirect should be " + usingDirectBuffer);
      }
    }
  }
}
