package org.apache.hadoop.fs.crypto;

import java.io.IOException;

import org.apache.hadoop.crypto.CryptoCodec;
import org.apache.hadoop.crypto.CryptoOutputStream;
import org.apache.hadoop.fs.FSDataOutputStream;

public class CryptoFSDataOutputStream extends FSDataOutputStream {
  private final FSDataOutputStream fsOut;
  
  public CryptoFSDataOutputStream(FSDataOutputStream out, CryptoCodec codec,
      int bufferSize, byte[] key, byte[] iv) throws IOException {
    this(out, codec, bufferSize, key, iv, true);
  }

  public CryptoFSDataOutputStream(FSDataOutputStream out, CryptoCodec codec,
      int bufferSize, byte[] key, byte[] iv, boolean closeOutputStream)
      throws IOException {
    super(new CryptoOutputStream(out, codec, bufferSize, key, iv, 
        out.getPos(), closeOutputStream), null, out.getPos());
    this.fsOut = out;
  }
  
  public CryptoFSDataOutputStream(FSDataOutputStream out, CryptoCodec codec,
      byte[] key, byte[] iv) throws IOException {
    super(new CryptoOutputStream(out, codec, key, iv, out.getPos()), 
        null, out.getPos()); 
    this.fsOut = out;
  }
  
  @Override
  public long getPos() {
    return fsOut.getPos();
  }
}
