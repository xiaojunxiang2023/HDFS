package org.apache.hadoop.io.erasurecode.codec;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.erasurecode.ErasureCodecOptions;
import org.apache.hadoop.io.erasurecode.coder.ErasureDecoder;
import org.apache.hadoop.io.erasurecode.coder.ErasureEncoder;
import org.apache.hadoop.io.erasurecode.coder.HHXORErasureDecoder;
import org.apache.hadoop.io.erasurecode.coder.HHXORErasureEncoder;

/**
 * A Hitchhiker-XOR erasure codec.
 */
public class HHXORErasureCodec extends ErasureCodec {

  public HHXORErasureCodec(Configuration conf, ErasureCodecOptions options) {
    super(conf, options);
  }

  @Override
  public ErasureEncoder createEncoder() {
    return new HHXORErasureEncoder(getCoderOptions());
  }

  @Override
  public ErasureDecoder createDecoder() {
    return new HHXORErasureDecoder(getCoderOptions());
  }
}
