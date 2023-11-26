package org.apache.hadoop.io.erasurecode;

/**
 * Erasure codec options.
 */
public class ErasureCodecOptions {
  private ECSchema schema;

  public ErasureCodecOptions(ECSchema schema) {
    this.schema = schema;
  }

  public ECSchema getSchema() {
    return schema;
  }
}
