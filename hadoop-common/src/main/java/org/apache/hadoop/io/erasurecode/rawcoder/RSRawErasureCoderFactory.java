package org.apache.hadoop.io.erasurecode.rawcoder;
import org.apache.hadoop.io.erasurecode.ErasureCodeConstants;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;

/**
 * A raw coder factory for the new raw Reed-Solomon coder in Java.
 */
public class RSRawErasureCoderFactory implements RawErasureCoderFactory {

  public static final String CODER_NAME = "rs_java";

  @Override
  public RawErasureEncoder createEncoder(ErasureCoderOptions coderOptions) {
    return new RSRawEncoder(coderOptions);
  }

  @Override
  public RawErasureDecoder createDecoder(ErasureCoderOptions coderOptions) {
    return new RSRawDecoder(coderOptions);
  }

  @Override
  public String getCoderName() {
    return CODER_NAME;
  }

  @Override
  public String getCodecName() {
    return ErasureCodeConstants.RS_CODEC_NAME;
  }
}
