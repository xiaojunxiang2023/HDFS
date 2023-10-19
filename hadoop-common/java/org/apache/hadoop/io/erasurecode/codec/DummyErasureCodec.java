package org.apache.hadoop.io.erasurecode.codec;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.erasurecode.ErasureCodecOptions;
import org.apache.hadoop.io.erasurecode.coder.DummyErasureDecoder;
import org.apache.hadoop.io.erasurecode.coder.DummyErasureEncoder;
import org.apache.hadoop.io.erasurecode.coder.ErasureDecoder;
import org.apache.hadoop.io.erasurecode.coder.ErasureEncoder;

/**
 * Dummy erasure coder does not real coding computing. This is used for only
 * test or performance comparison with other erasure coders.
 */
public class DummyErasureCodec extends ErasureCodec {
  public DummyErasureCodec(Configuration conf, ErasureCodecOptions options) {
    super(conf, options);
  }

  @Override
  public ErasureEncoder createEncoder() {
    return new DummyErasureEncoder(getCoderOptions());
  }

  @Override
  public ErasureDecoder createDecoder() {
    return new DummyErasureDecoder(getCoderOptions());
  }
}
