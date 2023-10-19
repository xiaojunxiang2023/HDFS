package org.apache.hadoop.io.erasurecode.rawcoder;

import org.apache.hadoop.util.micro.HadoopIllegalArgumentException;
import org.apache.hadoop.classification.InterfaceAudience;

import java.nio.ByteBuffer;

/**
 * A utility class that maintains encoding state during an encode call using
 * byte array inputs.
 */
@InterfaceAudience.Private
class ByteArrayEncodingState extends EncodingState {
  byte[][] inputs;
  byte[][] outputs;
  int[] inputOffsets;
  int[] outputOffsets;

  ByteArrayEncodingState(RawErasureEncoder encoder,
                         byte[][] inputs, byte[][] outputs) {
    this.encoder = encoder;
    byte[] validInput = CoderUtil.findFirstValidInput(inputs);
    this.encodeLength = validInput.length;
    this.inputs = inputs;
    this.outputs = outputs;

    checkParameters(inputs, outputs);
    checkBuffers(inputs);
    checkBuffers(outputs);

    this.inputOffsets = new int[inputs.length]; // ALL ZERO
    this.outputOffsets = new int[outputs.length]; // ALL ZERO
  }

  ByteArrayEncodingState(RawErasureEncoder encoder,
                         int encodeLength,
                         byte[][] inputs,
                         int[] inputOffsets,
                         byte[][] outputs,
                         int[] outputOffsets) {
    this.encoder = encoder;
    this.encodeLength = encodeLength;
    this.inputs = inputs;
    this.outputs = outputs;
    this.inputOffsets = inputOffsets;
    this.outputOffsets = outputOffsets;
  }

  /**
   * Convert to a ByteBufferEncodingState when it's backed by on-heap arrays.
   */
  ByteBufferEncodingState convertToByteBufferState() {
    ByteBuffer[] newInputs = new ByteBuffer[inputs.length];
    ByteBuffer[] newOutputs = new ByteBuffer[outputs.length];

    for (int i = 0; i < inputs.length; i++) {
      newInputs[i] = CoderUtil.cloneAsDirectByteBuffer(inputs[i],
          inputOffsets[i], encodeLength);
    }

    for (int i = 0; i < outputs.length; i++) {
      newOutputs[i] = ByteBuffer.allocateDirect(encodeLength);
    }

    ByteBufferEncodingState bbeState = new ByteBufferEncodingState(encoder,
        encodeLength, newInputs, newOutputs);
    return bbeState;
  }

  /**
   * Check and ensure the buffers are of the desired length.
   * @param buffers the buffers to check
   */
  void checkBuffers(byte[][] buffers) {
    for (byte[] buffer : buffers) {
      if (buffer == null) {
        throw new HadoopIllegalArgumentException(
            "Invalid buffer found, not allowing null");
      }

      if (buffer.length != encodeLength) {
        throw new HadoopIllegalArgumentException(
            "Invalid buffer not of length " + encodeLength);
      }
    }
  }
}
