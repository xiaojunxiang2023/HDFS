package org.apache.hadoop.hdfs.server.datanode.erasurecode;

import org.apache.hadoop.io.DataOutputBuffer;
import org.apache.hadoop.util.CrcComposer;

import java.io.IOException;

/**
 * Computes striped composite CRCs over reconstructed chunk CRCs.
 */
public class StripedBlockChecksumCompositeCrcReconstructor
    extends StripedBlockChecksumReconstructor {
  private final int ecPolicyCellSize;

  private byte[] digestValue;
  private CrcComposer digester;

  public StripedBlockChecksumCompositeCrcReconstructor(
      ErasureCodingWorker worker,
      StripedReconstructionInfo stripedReconInfo,
      DataOutputBuffer checksumWriter,
      long requestedBlockLength) throws IOException {
    super(worker, stripedReconInfo, checksumWriter, requestedBlockLength);
    this.ecPolicyCellSize = stripedReconInfo.getEcPolicy().getCellSize();
  }

  @Override
  public Object getDigestObject() {
    return digestValue;
  }

  @Override
  void prepareDigester() throws IOException {
    digester = CrcComposer.newStripedCrcComposer(
        getChecksum().getChecksumType(),
        getChecksum().getBytesPerChecksum(),
        ecPolicyCellSize);
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
    digester.update(
        checksumBytes, 0, checksumBytes.length, dataBytesPerChecksum);
  }

  @Override
  void commitDigest() throws IOException {
    if (digester == null) {
      throw new IOException("Called commitDigest() but digester is null");
    }
    digestValue = digester.digest();
    getChecksumWriter().write(digestValue, 0, digestValue.length);
  }
}
