package org.apache.hadoop.io.erasurecode;

import org.apache.hadoop.classification.InterfaceAudience;

/**
 * Erasure codec options.
 */
@InterfaceAudience.Private
public class ErasureCodecOptions {
  private ECSchema schema;

  public ErasureCodecOptions(ECSchema schema) {
    this.schema = schema;
  }

  public ECSchema getSchema() {
    return schema;
  }
}
