package org.apache.hadoop.hdfs;

import org.apache.hadoop.fs.*;
import org.apache.hadoop.fs.Options.ChecksumCombineMode;
import org.apache.hadoop.hdfs.protocol.*;
import org.apache.hadoop.hdfs.protocol.datatransfer.*;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.BlockOpResponseProto;
import org.apache.hadoop.hdfs.protocol.proto.DataTransferProtos.OpBlockChecksumResponseProto;
import org.apache.hadoop.hdfs.protocolPB.PBHelperClient;
import org.apache.hadoop.hdfs.security.token.block.InvalidBlockTokenException;
import org.apache.hadoop.io.DataOutputBuffer;
import org.apache.hadoop.io.IOUtils;
import org.apache.hadoop.io.MD5Hash;
import org.apache.hadoop.util.CrcComposer;
import org.apache.hadoop.util.CrcUtil;
import org.apache.hadoop.util.DataChecksum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.DataOutputStream;
import java.io.IOException;
import java.util.List;

/**
 * Utility classes to compute file checksum for both replicated and striped
 * files.
 */
final class FileChecksumHelper {
  static final Logger LOG =
      LoggerFactory.getLogger(FileChecksumHelper.class);

  private FileChecksumHelper() {
  }

  /**
   * A common abstract class to compute file checksum.
   */
  static abstract class FileChecksumComputer {
    private final String src;
    private final long length;
    private final DFSClient client;
    private final ClientProtocol namenode;
    private final ChecksumCombineMode combineMode;
    private final BlockChecksumType blockChecksumType;
    private final DataOutputBuffer blockChecksumBuf = new DataOutputBuffer();

    private FileChecksum fileChecksum;
    private LocatedBlocks blockLocations;

    private int timeout;
    private List<LocatedBlock> locatedBlocks;
    private long remaining = 0L;

    private int bytesPerCRC = -1;
    private DataChecksum.Type crcType = DataChecksum.Type.DEFAULT;
    private long crcPerBlock = 0;
    private boolean isRefetchBlocks = false;
    private int lastRetriedIndex = -1;

    /**
     * Constructor that accepts all the input parameters for the computing.
     */
    FileChecksumComputer(String src, long length,
                         LocatedBlocks blockLocations,
                         ClientProtocol namenode,
                         DFSClient client,
                         ChecksumCombineMode combineMode) throws IOException {
      this.src = src;
      this.length = length;
      this.blockLocations = blockLocations;
      this.namenode = namenode;
      this.client = client;
      this.combineMode = combineMode;
      switch (combineMode) {
        case MD5MD5CRC:
          this.blockChecksumType = BlockChecksumType.MD5CRC;
          break;
        case COMPOSITE_CRC:
          this.blockChecksumType = BlockChecksumType.COMPOSITE_CRC;
          break;
        default:
          throw new IOException("Unknown ChecksumCombineMode: " + combineMode);
      }

      this.remaining = length;

      if (blockLocations != null) {
        if (src.contains(HdfsConstants.SEPARATOR_DOT_SNAPSHOT_DIR_SEPARATOR)) {
          this.remaining = Math.min(length, blockLocations.getFileLength());
        }
        this.locatedBlocks = blockLocations.getLocatedBlocks();
      }
    }

    String getSrc() {
      return src;
    }

    long getLength() {
      return length;
    }

    DFSClient getClient() {
      return client;
    }

    ClientProtocol getNamenode() {
      return namenode;
    }

    ChecksumCombineMode getCombineMode() {
      return combineMode;
    }

    BlockChecksumType getBlockChecksumType() {
      return blockChecksumType;
    }

    DataOutputBuffer getBlockChecksumBuf() {
      return blockChecksumBuf;
    }

    FileChecksum getFileChecksum() {
      return fileChecksum;
    }

    LocatedBlocks getBlockLocations() {
      return blockLocations;
    }

    void refetchBlocks() throws IOException {
      this.blockLocations = getClient().getBlockLocations(getSrc(),
          getLength());
      this.locatedBlocks = getBlockLocations().getLocatedBlocks();
      this.isRefetchBlocks = false;
    }

    int getTimeout() {
      return timeout;
    }

    void setTimeout(int timeout) {
      this.timeout = timeout;
    }

    List<LocatedBlock> getLocatedBlocks() {
      return locatedBlocks;
    }

    long getRemaining() {
      return remaining;
    }

    void setRemaining(long remaining) {
      this.remaining = remaining;
    }

    int getBytesPerCRC() {
      return bytesPerCRC;
    }

    void setBytesPerCRC(int bytesPerCRC) {
      this.bytesPerCRC = bytesPerCRC;
    }

    DataChecksum.Type getCrcType() {
      return crcType;
    }

    void setCrcType(DataChecksum.Type crcType) {
      this.crcType = crcType;
    }

    long getCrcPerBlock() {
      return crcPerBlock;
    }

    void setCrcPerBlock(long crcPerBlock) {
      this.crcPerBlock = crcPerBlock;
    }

    boolean isRefetchBlocks() {
      return isRefetchBlocks;
    }

    void setRefetchBlocks(boolean refetchBlocks) {
      this.isRefetchBlocks = refetchBlocks;
    }

    int getLastRetriedIndex() {
      return lastRetriedIndex;
    }

    void setLastRetriedIndex(int lastRetriedIndex) {
      this.lastRetriedIndex = lastRetriedIndex;
    }

    /**
     * Perform the file checksum computing. The intermediate results are stored
     * in the object and will be used later.
     * @throws IOException
     */
    void compute() throws IOException {
      /**
       * request length is 0 or the file is empty, return one with the
       * magic entry that matches what previous hdfs versions return.
       */
      if (locatedBlocks == null || locatedBlocks.isEmpty()) {
        // Explicitly specified here in case the default DataOutputBuffer
        // buffer length value is changed in future. This matters because the
        // fixed value 32 has to be used to repeat the magic value for previous
        // HDFS version.
        final int lenOfZeroBytes = 32;
        byte[] emptyBlockMd5 = new byte[lenOfZeroBytes];
        MD5Hash fileMD5 = MD5Hash.digest(emptyBlockMd5);
        fileChecksum = new MD5MD5CRC32GzipFileChecksum(0, 0, fileMD5);
      } else {
        checksumBlocks();
        fileChecksum = makeFinalResult();
      }
    }

    /**
     * Compute block checksums block by block and append the raw bytes of the
     * block checksums into getBlockChecksumBuf().
     *
     * @throws IOException
     */
    abstract void checksumBlocks() throws IOException;

    /**
     * Make final file checksum result given the per-block or per-block-group
     * checksums collected into getBlockChecksumBuf().
     */
    FileChecksum makeFinalResult() throws IOException {
      switch (combineMode) {
        case MD5MD5CRC:
          return makeMd5CrcResult();
        case COMPOSITE_CRC:
          return makeCompositeCrcResult();
        default:
          throw new IOException("Unknown ChecksumCombineMode: " + combineMode);
      }
    }

    FileChecksum makeMd5CrcResult() {
      //compute file MD5
      final MD5Hash fileMD5 = MD5Hash.digest(blockChecksumBuf.getData());
      switch (crcType) {
        case CRC32:
          return new MD5MD5CRC32GzipFileChecksum(bytesPerCRC,
              crcPerBlock, fileMD5);
        case CRC32C:
          return new MD5MD5CRC32CastagnoliFileChecksum(bytesPerCRC,
              crcPerBlock, fileMD5);
        default:
          // we will get here when crcType is "NULL".
          return null;
      }
    }

    FileChecksum makeCompositeCrcResult() throws IOException {
      long blockSizeHint = 0;
      if (locatedBlocks.size() > 0) {
        blockSizeHint = locatedBlocks.get(0).getBlockSize();
      }
      CrcComposer crcComposer =
          CrcComposer.newCrcComposer(getCrcType(), blockSizeHint);
      byte[] blockChecksumBytes = blockChecksumBuf.getData();

      long sumBlockLengths = 0;
      for (int i = 0; i < locatedBlocks.size() - 1; ++i) {
        LocatedBlock block = locatedBlocks.get(i);
        // For everything except the last LocatedBlock, we expect getBlockSize()
        // to accurately reflect the number of file bytes digested in the block
        // checksum.
        sumBlockLengths += block.getBlockSize();
        int blockCrc = CrcUtil.readInt(blockChecksumBytes, i * 4);

        crcComposer.update(blockCrc, block.getBlockSize());
        LOG.debug(
            "Added blockCrc 0x{} for block index {} of size {}",
            Integer.toString(blockCrc, 16), i, block.getBlockSize());
      }

      // NB: In some cases the located blocks have their block size adjusted
      // explicitly based on the requested length, but not all cases;
      // these numbers may or may not reflect actual sizes on disk.
      long reportedLastBlockSize =
          blockLocations.getLastLocatedBlock().getBlockSize();
      long consumedLastBlockLength = reportedLastBlockSize;
      if (length - sumBlockLengths < reportedLastBlockSize) {
        LOG.warn(
            "Last block length {} is less than reportedLastBlockSize {}",
            length - sumBlockLengths, reportedLastBlockSize);
        consumedLastBlockLength = length - sumBlockLengths;
      }
      // NB: blockChecksumBytes.length may be much longer than actual bytes
      // written into the DataOutput.
      int lastBlockCrc = CrcUtil.readInt(
          blockChecksumBytes, 4 * (locatedBlocks.size() - 1));
      crcComposer.update(lastBlockCrc, consumedLastBlockLength);
      LOG.debug(
          "Added lastBlockCrc 0x{} for block index {} of size {}",
          Integer.toString(lastBlockCrc, 16),
          locatedBlocks.size() - 1,
          consumedLastBlockLength);

      int compositeCrc = CrcUtil.readInt(crcComposer.digest(), 0);
      return new CompositeCrcFileChecksum(
          compositeCrc, getCrcType(), bytesPerCRC);
    }

    /**
     * Create and return a sender given an IO stream pair.
     */
    Sender createSender(IOStreamPair pair) {
      DataOutputStream out = (DataOutputStream) pair.out;
      return new Sender(out);
    }

    /**
     * Close an IO stream pair.
     */
    void close(IOStreamPair pair) {
      if (pair != null) {
        IOUtils.closeStream(pair.in);
        IOUtils.closeStream(pair.out);
      }
    }

    /**
     * Parses out various checksum properties like bytesPerCrc, crcPerBlock,
     * and crcType from {@code checksumData} and either stores them as the
     * authoritative value or compares them to a previously extracted value
     * to check comppatibility.
     *
     * @param checksumData response from the datanode
     * @param locatedBlock the block corresponding to the response
     * @param datanode the datanode which produced the response
     * @param blockIdx the block or block-group index of the response
     */
    void extractChecksumProperties(
        OpBlockChecksumResponseProto checksumData,
        LocatedBlock locatedBlock,
        DatanodeInfo datanode,
        int blockIdx)
        throws IOException {
      //read byte-per-checksum
      final int bpc = checksumData.getBytesPerCrc();
      if (blockIdx == 0) { //first block
        setBytesPerCRC(bpc);
      } else if (bpc != getBytesPerCRC()) {
        if (getBlockChecksumType() == BlockChecksumType.COMPOSITE_CRC) {
          LOG.warn(
              "Current bytesPerCRC={} doesn't match next bpc={}, but "
                  + "continuing anyway because we're using COMPOSITE_CRC. "
                  + "If trying to preserve CHECKSUMTYPE, only the current "
                  + "bytesPerCRC will be preserved.", getBytesPerCRC(), bpc);
        } else {
          throw new IOException("Byte-per-checksum not matched: bpc=" + bpc
              + " but bytesPerCRC=" + getBytesPerCRC());
        }
      }

      //read crc-per-block
      final long cpb = checksumData.getCrcPerBlock();
      if (getLocatedBlocks().size() > 1 && blockIdx == 0) {
        setCrcPerBlock(cpb);
      }

      // read crc-type
      final DataChecksum.Type ct;
      if (checksumData.hasCrcType()) {
        ct = PBHelperClient.convert(checksumData.getCrcType());
      } else {
        LOG.debug("Retrieving checksum from an earlier-version DataNode: " +
            "inferring checksum by reading first byte");
        ct = getClient().inferChecksumTypeByReading(locatedBlock, datanode);
      }

      if (blockIdx == 0) {
        setCrcType(ct);
      } else if (getCrcType() != DataChecksum.Type.MIXED &&
          getCrcType() != ct) {
        if (getBlockChecksumType() == BlockChecksumType.COMPOSITE_CRC) {
          throw new IOException(
              "DataChecksum.Type.MIXED is not supported for COMPOSITE_CRC");
        } else {
          // if crc types are mixed in a file
          setCrcType(DataChecksum.Type.MIXED);
        }
      }

      if (blockIdx == 0) {
        LOG.debug("set bytesPerCRC={}, crcPerBlock={}",
            getBytesPerCRC(), getCrcPerBlock());
      }
    }

    /**
     * Parses out the raw blockChecksum bytes from {@code checksumData}
     * according to the blockChecksumType and populates the cumulative
     * blockChecksumBuf with it.
     *
     * @return a debug-string representation of the parsed checksum if
     *     debug is enabled, otherwise null.
     */
    String populateBlockChecksumBuf(OpBlockChecksumResponseProto checksumData)
        throws IOException {
      String blockChecksumForDebug = null;
      switch (getBlockChecksumType()) {
        case MD5CRC:
          //read md5
          final MD5Hash md5 = new MD5Hash(
              checksumData.getBlockChecksum().toByteArray());
          md5.write(getBlockChecksumBuf());
          if (LOG.isDebugEnabled()) {
            blockChecksumForDebug = md5.toString();
          }
          break;
        case COMPOSITE_CRC:
          BlockChecksumType returnedType = PBHelperClient.convert(
              checksumData.getBlockChecksumOptions().getBlockChecksumType());
          if (returnedType != BlockChecksumType.COMPOSITE_CRC) {
            throw new IOException(String.format(
                "Unexpected blockChecksumType '%s', expecting COMPOSITE_CRC",
                returnedType));
          }
          byte[] crcBytes = checksumData.getBlockChecksum().toByteArray();
          if (LOG.isDebugEnabled()) {
            blockChecksumForDebug = CrcUtil.toSingleCrcString(crcBytes);
          }
          getBlockChecksumBuf().write(crcBytes);
          break;
        default:
          throw new IOException(
              "Unknown BlockChecksumType: " + getBlockChecksumType());
      }
      return blockChecksumForDebug;
    }
  }

  /**
   * Replicated file checksum computer.
   */
  static class ReplicatedFileChecksumComputer extends FileChecksumComputer {
    private int blockIdx;

    ReplicatedFileChecksumComputer(String src, long length,
                                   LocatedBlocks blockLocations,
                                   ClientProtocol namenode,
                                   DFSClient client,
                                   ChecksumCombineMode combineMode)
        throws IOException {
      super(src, length, blockLocations, namenode, client, combineMode);
    }

    @Override
    void checksumBlocks() throws IOException {
      // get block checksum for each block
      for (blockIdx = 0;
           blockIdx < getLocatedBlocks().size() && getRemaining() >= 0;
           blockIdx++) {
        if (isRefetchBlocks()) {  // refetch to get fresh tokens
          refetchBlocks();
        }

        LocatedBlock locatedBlock = getLocatedBlocks().get(blockIdx);

        if (!checksumBlock(locatedBlock)) {
          throw new PathIOException(
              getSrc(), "Fail to get block MD5 for " + locatedBlock);
        }
      }
    }

    /**
     * Return true when sounds good to continue or retry, false when severe
     * condition or totally failed.
     */
    private boolean checksumBlock(LocatedBlock locatedBlock) {
      ExtendedBlock block = locatedBlock.getBlock();
      if (getRemaining() < block.getNumBytes()) {
        block.setNumBytes(getRemaining());
      }
      setRemaining(getRemaining() - block.getNumBytes());

      DatanodeInfo[] datanodes = locatedBlock.getLocations();

      int tmpTimeout = 3000 * datanodes.length +
          getClient().getConf().getSocketTimeout();
      setTimeout(tmpTimeout);

      //try each datanode location of the block
      boolean done = false;
      for (int j = 0; !done && j < datanodes.length; j++) {
        try {
          tryDatanode(locatedBlock, datanodes[j]);
          done = true;
        } catch (InvalidBlockTokenException ibte) {
          if (blockIdx > getLastRetriedIndex()) {
            LOG.debug("Got access token error in response to OP_BLOCK_CHECKSUM "
                    + "for file {} for block {} from datanode {}. Will retry "
                    + "the block once.",
                getSrc(), block, datanodes[j]);
            setLastRetriedIndex(blockIdx);
            done = true; // actually it's not done; but we'll retry
            blockIdx--; // repeat at blockIdx-th block
            setRefetchBlocks(true);
          }
        } catch (InvalidEncryptionKeyException iee) {
          if (blockIdx > getLastRetriedIndex()) {
            LOG.debug("Got invalid encryption key error in response to "
                    + "OP_BLOCK_CHECKSUM for file {} for block {} from "
                    + "datanode {}. Will retry " + "the block once.",
                getSrc(), block, datanodes[j]);
            setLastRetriedIndex(blockIdx);
            done = true; // actually it's not done; but we'll retry
            blockIdx--; // repeat at i-th block
            getClient().clearDataEncryptionKey();
          }
        } catch (IOException ie) {
          LOG.warn("src={}" + ", datanodes[{}]={}",
              getSrc(), j, datanodes[j], ie);
        }
      }

      return done;
    }

    /**
     * Try one replica or datanode to compute the block checksum given a block.
     */
    private void tryDatanode(LocatedBlock locatedBlock,
                             DatanodeInfo datanode) throws IOException {

      ExtendedBlock block = locatedBlock.getBlock();

      try (IOStreamPair pair = getClient().connectToDN(datanode, getTimeout(),
          locatedBlock.getBlockToken())) {

        LOG.debug("write to {}: {}, block={}", datanode,
            Op.BLOCK_CHECKSUM, block);

        // get block checksum
        createSender(pair).blockChecksum(
            block,
            locatedBlock.getBlockToken(),
            new BlockChecksumOptions(getBlockChecksumType()));

        final BlockOpResponseProto reply = BlockOpResponseProto.parseFrom(
            PBHelperClient.vintPrefixed(pair.in));

        String logInfo = "for block " + block + " from datanode " +
            datanode;
        DataTransferProtoUtil.checkBlockOpStatus(reply, logInfo);

        OpBlockChecksumResponseProto checksumData =
            reply.getChecksumResponse();
        extractChecksumProperties(
            checksumData, locatedBlock, datanode, blockIdx);
        String blockChecksumForDebug = populateBlockChecksumBuf(checksumData);
        LOG.debug("got reply from {}: blockChecksum={}, blockChecksumType={}",
            datanode, blockChecksumForDebug, getBlockChecksumType());
      }
    }
  }

}
