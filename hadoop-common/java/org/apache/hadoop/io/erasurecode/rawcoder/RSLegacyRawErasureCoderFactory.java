package org.apache.hadoop.io.erasurecode.rawcoder;
import org.apache.hadoop.io.erasurecode.ErasureCodeConstants;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;

/**
 * A raw coder factory for the legacy raw Reed-Solomon coder in Java.
 */
public class RSLegacyRawErasureCoderFactory implements RawErasureCoderFactory {

  public static final String CODER_NAME = "rs-legacy_java";

  @Override
  public RawErasureEncoder createEncoder(ErasureCoderOptions coderOptions) {
    return new RSLegacyRawEncoder(coderOptions);
  }

  @Override
  public RawErasureDecoder createDecoder(ErasureCoderOptions coderOptions) {
    return new RSLegacyRawDecoder(coderOptions);
  }

  @Override
  public String getCoderName() {
    return CODER_NAME;
  }

  @Override
  public String getCodecName() {
    return ErasureCodeConstants.RS_LEGACY_CODEC_NAME;
  }
}
