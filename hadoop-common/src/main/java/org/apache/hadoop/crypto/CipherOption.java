package org.apache.hadoop.crypto;

/**
 * Used between client and server to negotiate the 
 * cipher suite, key and iv.
 */
public class CipherOption {
  private final CipherSuite suite;
  private final byte[] inKey;
  private final byte[] inIv;
  private final byte[] outKey;
  private final byte[] outIv;

  public CipherOption(CipherSuite suite) {
    this(suite, null, null, null, null);
  }

  public CipherOption(CipherSuite suite, byte[] inKey, byte[] inIv,
                      byte[] outKey, byte[] outIv) {
    this.suite = suite;
    this.inKey = inKey;
    this.inIv = inIv;
    this.outKey = outKey;
    this.outIv = outIv;
  }

  public CipherSuite getCipherSuite() {
    return suite;
  }

  public byte[] getInKey() {
    return inKey;
  }

  public byte[] getInIv() {
    return inIv;
  }

  public byte[] getOutKey() {
    return outKey;
  }

  public byte[] getOutIv() {
    return outIv;
  }
}
