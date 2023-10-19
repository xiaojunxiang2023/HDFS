package org.apache.hadoop.io.erasurecode.rawcoder;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.io.erasurecode.ErasureCodeConstants;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;

/**
 * A raw coder factory for xor coder in native using Intel ISA-L library.
 */

@InterfaceAudience.Private
public class NativeXORRawErasureCoderFactory implements RawErasureCoderFactory {

  public static final String CODER_NAME = "xor_native";

  @Override
  public RawErasureEncoder createEncoder(ErasureCoderOptions coderOptions) {
    return new NativeXORRawEncoder(coderOptions);
  }

  @Override
  public RawErasureDecoder createDecoder(ErasureCoderOptions coderOptions) {
    return new NativeXORRawDecoder(coderOptions);
  }

  @Override
  public String getCoderName() {
    return CODER_NAME;
  }

  @Override
  public String getCodecName() {
    return ErasureCodeConstants.XOR_CODEC_NAME;
  }
}
