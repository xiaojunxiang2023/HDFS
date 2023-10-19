package org.apache.hadoop.io.erasurecode.coder;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.io.erasurecode.CodecUtil;
import org.apache.hadoop.io.erasurecode.ECBlock;
import org.apache.hadoop.io.erasurecode.ECBlockGroup;
import org.apache.hadoop.io.erasurecode.ErasureCodeConstants;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;
import org.apache.hadoop.io.erasurecode.rawcoder.RawErasureEncoder;

/**
 * Hitchhiker is a new erasure coding algorithm developed as a research project
 * at UC Berkeley by Rashmi Vinayak.
 * It has been shown to reduce network traffic and disk I/O by 25%-45% during
 * data reconstruction while retaining the same storage capacity and failure
 * tolerance capability of RS codes.
 * The Hitchhiker algorithm is described in K.V.Rashmi, et al.,
 * "A "Hitchhiker's" Guide to Fast and Efficient Data Reconstruction in
 * Erasure-coded Data Centers", in ACM SIGCOMM 2014.
 * This is Hitchhiker-XOR erasure encoder that encodes a block group.
 */
@InterfaceAudience.Private
public class HHXORErasureEncoder extends ErasureEncoder {
  private RawErasureEncoder rsRawEncoder;
  private RawErasureEncoder xorRawEncoder;

  public HHXORErasureEncoder(ErasureCoderOptions options) {
    super(options);
  }

  @Override
  protected ErasureCodingStep prepareEncodingStep(
          final ECBlockGroup blockGroup) {

    RawErasureEncoder rsRawEncoderTmp = checkCreateRSRawEncoder();
    RawErasureEncoder xorRawEncoderTmp = checkCreateXorRawEncoder();

    ECBlock[] inputBlocks = getInputBlocks(blockGroup);

    return new HHXORErasureEncodingStep(inputBlocks,
            getOutputBlocks(blockGroup), rsRawEncoderTmp, xorRawEncoderTmp);
  }

  private RawErasureEncoder checkCreateRSRawEncoder() {
    if (rsRawEncoder == null) {
      rsRawEncoder = CodecUtil.createRawEncoder(getConf(),
          ErasureCodeConstants.RS_CODEC_NAME, getOptions());
    }
    return rsRawEncoder;
  }

  private RawErasureEncoder checkCreateXorRawEncoder() {
    if (xorRawEncoder == null) {
      xorRawEncoder = CodecUtil.createRawEncoder(getConf(),
          ErasureCodeConstants.XOR_CODEC_NAME,
          getOptions());
    }
    return xorRawEncoder;
  }

  @Override
  public void release() {
    if (rsRawEncoder != null) {
      rsRawEncoder.release();
    }
    if (xorRawEncoder != null) {
      xorRawEncoder.release();
    }
  }

}
