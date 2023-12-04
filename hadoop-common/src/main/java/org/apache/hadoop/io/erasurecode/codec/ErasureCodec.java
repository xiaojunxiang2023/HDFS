package org.apache.hadoop.io.erasurecode.codec;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.erasurecode.ECSchema;
import org.apache.hadoop.io.erasurecode.ErasureCodecOptions;
import org.apache.hadoop.io.erasurecode.ErasureCoderOptions;
import org.apache.hadoop.io.erasurecode.coder.ErasureDecoder;
import org.apache.hadoop.io.erasurecode.coder.ErasureEncoder;
import org.apache.hadoop.io.erasurecode.grouper.BlockGrouper;

/**
 * Abstract Erasure Codec is defines the interface of each actual erasure
 * codec classes.
 */
public abstract class ErasureCodec {

  private ECSchema schema;
  private ErasureCodecOptions codecOptions;
  private ErasureCoderOptions coderOptions;

  public ErasureCodec(Configuration conf,
                      ErasureCodecOptions options) {
    this.schema = options.getSchema();
    this.codecOptions = options;
    boolean allowChangeInputs = false;
    this.coderOptions = new ErasureCoderOptions(schema.getNumDataUnits(),
        schema.getNumParityUnits(), allowChangeInputs, false);
  }

  public String getName() {
    return schema.getCodecName();
  }

  public ECSchema getSchema() {
    return schema;
  }

  /**
   * Get a {@link ErasureCodecOptions}.
   * @return erasure codec options
   */
  public ErasureCodecOptions getCodecOptions() {
    return codecOptions;
  }

  protected void setCodecOptions(ErasureCodecOptions options) {
    this.codecOptions = options;
    this.schema = options.getSchema();
  }

  /**
   * Get a {@link ErasureCoderOptions}.
   * @return erasure coder options
   */
  public ErasureCoderOptions getCoderOptions() {
    return coderOptions;
  }

  protected void setCoderOptions(ErasureCoderOptions options) {
    this.coderOptions = options;
  }

  public abstract ErasureEncoder createEncoder();

  public abstract ErasureDecoder createDecoder();

  public BlockGrouper createBlockGrouper() {
    BlockGrouper blockGrouper = new BlockGrouper();
    blockGrouper.setSchema(getSchema());

    return blockGrouper;
  }
}
