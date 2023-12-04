package org.apache.hadoop.hdfs;

import java.io.IOException;

public class UnknownCryptoProtocolVersionException extends IOException {
  private static final long serialVersionUID = 8957192l;

  public UnknownCryptoProtocolVersionException() {
    super();
  }

  public UnknownCryptoProtocolVersionException(String msg) {
    super(msg);
  }
}
