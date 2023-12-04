package org.apache.hadoop.fs.crypto;

import org.apache.hadoop.crypto.CryptoCodec;
import org.apache.hadoop.crypto.CryptoInputStream;
import org.apache.hadoop.fs.FSDataInputStream;

import java.io.IOException;

public class CryptoFSDataInputStream extends FSDataInputStream {

  public CryptoFSDataInputStream(FSDataInputStream in, CryptoCodec codec,
                                 int bufferSize, byte[] key, byte[] iv) throws IOException {
    super(new CryptoInputStream(in, codec, bufferSize, key, iv));
  }

  public CryptoFSDataInputStream(FSDataInputStream in, CryptoCodec codec,
                                 byte[] key, byte[] iv) throws IOException {
    super(new CryptoInputStream(in, codec, key, iv));
  }
}
