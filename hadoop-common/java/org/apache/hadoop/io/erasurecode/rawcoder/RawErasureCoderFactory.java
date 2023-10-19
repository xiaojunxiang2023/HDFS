package org.apache.hadoop.io.erasurecode.rawcoder;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;

/**
 * Raw erasure coder factory that can be used to create raw encoder and decoder.
 * It helps in configuration since only one factory class is needed to be
 * configured.
 */
@InterfaceAudience.Private
public interface RawErasureCoderFactory {

  /**
   * Create raw erasure encoder.
   * @param coderOptions the options used to create the encoder
   * @return raw erasure encoder
   */
  RawErasureEncoder createEncoder(ErasureCoderOptions coderOptions);

  /**
   * Create raw erasure decoder.
   * @param coderOptions the options used to create the encoder
   * @return raw erasure decoder
   */
  RawErasureDecoder createDecoder(ErasureCoderOptions coderOptions);

  /**
   * Get the name of the coder.
   * @return coder name
   */
  String getCoderName();

  /**
   * Get the name of its codec.
   * @return codec name
   */
  String getCodecName();
}
