package org.apache.hadoop.hdfs.server.datanode.erasurecode;

import org.apache.hadoop.io.DataOutputBuffer;
import org.apache.hadoop.io.MD5Hash;

import java.io.IOException;
import java.security.MessageDigest;

/**
 * Computes running MD5-of-CRC over reconstructed chunk CRCs.
 */
public class StripedBlockChecksumMd5CrcReconstructor
    extends StripedBlockChecksumReconstructor {
  private MD5Hash md5;
  private MessageDigest digester;

  public StripedBlockChecksumMd5CrcReconstructor(ErasureCodingWorker worker,
                                                 StripedReconstructionInfo stripedReconInfo,
                                                 DataOutputBuffer checksumWriter,
                                                 long requestedBlockLength) throws IOException {
    super(worker, stripedReconInfo, checksumWriter, requestedBlockLength);
  }

  @Override
  public Object getDigestObject() {
    return md5;
  }

  @Override
  void prepareDigester() throws IOException {
    digester = MD5Hash.getDigester();
  }

  @Override
  void updateDigester(byte[] checksumBytes, int dataBytesPerChecksum)
      throws IOException {
    if (digester == null) {
      throw new IOException(String.format(
          "Called updatedDigester with checksumBytes.length=%d, "
              + "dataBytesPerChecksum=%d but digester is null",
          checksumBytes.length, dataBytesPerChecksum));
    }
    digester.update(checksumBytes, 0, checksumBytes.length);
  }

  @Override
  void commitDigest() throws IOException {
    if (digester == null) {
      throw new IOException("Called commitDigest() but digester is null");
    }
    byte[] digest = digester.digest();
    md5 = new MD5Hash(digest);
    md5.write(getChecksumWriter());
  }
}
