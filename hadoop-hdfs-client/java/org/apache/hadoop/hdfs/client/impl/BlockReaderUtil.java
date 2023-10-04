package org.apache.hadoop.hdfs.client.impl;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.hdfs.BlockReader;

import java.io.IOException;

/**
 * For sharing between the local and remote block reader implementations.
 */
@InterfaceAudience.Private
class BlockReaderUtil {

  /* See {@link BlockReader#readAll(byte[], int, int)} */
  public static int readAll(BlockReader reader,
      byte[] buf, int offset, int len) throws IOException {
    int n = 0;
    for (;;) {
      int nread = reader.read(buf, offset + n, len - n);
      if (nread <= 0)
        return (n == 0) ? nread : n;
      n += nread;
      if (n >= len)
        return n;
    }
  }

  /* See {@link BlockReader#readFully(byte[], int, int)} */
  public static void readFully(BlockReader reader,
      byte[] buf, int off, int len) throws IOException {
    int toRead = len;
    while (toRead > 0) {
      int ret = reader.read(buf, off, toRead);
      if (ret < 0) {
        throw new IOException("Premature EOF from inputStream");
      }
      toRead -= ret;
      off += ret;
    }
  }
}
