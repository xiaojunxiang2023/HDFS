package org.apache.hadoop.io.erasurecode.codec;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.erasurecode.ErasureCodecOptions;
import org.apache.hadoop.io.erasurecode.coder.ErasureDecoder;
import org.apache.hadoop.io.erasurecode.coder.ErasureEncoder;
import org.apache.hadoop.io.erasurecode.coder.RSErasureDecoder;
import org.apache.hadoop.io.erasurecode.coder.RSErasureEncoder;

/**
 * A Reed-Solomon erasure codec.
 */
@InterfaceAudience.Private
public class RSErasureCodec extends ErasureCodec {

  public RSErasureCodec(Configuration conf, ErasureCodecOptions options) {
    super(conf, options);
  }

  @Override
  public ErasureEncoder createEncoder() {
    return new RSErasureEncoder(getCoderOptions());
  }

  @Override
  public ErasureDecoder createDecoder() {
    return new RSErasureDecoder(getCoderOptions());
  }
}
