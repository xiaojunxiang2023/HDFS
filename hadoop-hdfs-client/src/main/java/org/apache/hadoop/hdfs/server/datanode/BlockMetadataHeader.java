package org.apache.hadoop.hdfs.server.datanode;

import org.apache.hadoop.util.DataChecksum;
import org.apache.hadoop.util.InvalidChecksumSizeException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;


/**
 * BlockMetadataHeader manages metadata for data blocks on Datanodes.
 * This is not related to the Block related functionality in Namenode.
 * The biggest part of data block metadata is CRC for the block.
 */
public class BlockMetadataHeader {
  private static final Logger LOG = LoggerFactory.getLogger(
      BlockMetadataHeader.class);

  public static final short VERSION = 1;

  /**
   * Header includes everything except the checksum(s) themselves.
   * Version is two bytes. Following it is the DataChecksum
   * that occupies 5 bytes.
   */
  private final short version;
  private DataChecksum checksum = null;


  public BlockMetadataHeader(short version, DataChecksum checksum) {
    this.checksum = checksum;
    this.version = version;
  }

  /** Get the version */
  public short getVersion() {
    return version;
  }

  /** Get the checksum */
  public DataChecksum getChecksum() {
    return checksum;
  }

  /**
   * Read the checksum header from the meta file.
   * inputStream must be closed by the caller.
   * @return the data checksum obtained from the header.
   */
  public static DataChecksum readDataChecksum(
      FileInputStream inputStream, int bufSize, File metaFile)
      throws IOException {
    DataInputStream in = new DataInputStream(new BufferedInputStream(
        inputStream, bufSize));
    return readDataChecksum(in, metaFile);
  }

  /**
   * Read the checksum header from the meta input stream.
   * @return the data checksum obtained from the header.
   */
  public static DataChecksum readDataChecksum(final DataInputStream metaIn,
                                              final Object name) throws IOException {
    // read and handle the common header here. For now just a version
    final BlockMetadataHeader header = readHeader(metaIn);
    if (header.getVersion() != VERSION) {
      LOG.warn("Unexpected meta-file version for " + name
          + ": version in file is " + header.getVersion()
          + " but expected version is " + VERSION);
    }
    return header.getChecksum();
  }

  /**
   * Read the header without changing the position of the FileChannel.
   * This is used by the client for short-circuit reads.
   *
   * @param fc The FileChannel to read.
   * @return the Metadata Header.
   * @throws IOException on error.
   */
  public static BlockMetadataHeader preadHeader(FileChannel fc)
      throws IOException {
    final byte arr[] = new byte[getHeaderSize()];
    ByteBuffer buf = ByteBuffer.wrap(arr);

    while (buf.hasRemaining()) {
      if (fc.read(buf, buf.position()) <= 0) {
        throw new CorruptMetaHeaderException("EOF while reading header from " +
            "the metadata file. The meta file may be truncated or corrupt");
      }
    }
    short version = (short) ((arr[0] << 8) | (arr[1] & 0xff));
    DataChecksum dataChecksum;
    try {
      dataChecksum = DataChecksum.newDataChecksum(arr, 2);
    } catch (InvalidChecksumSizeException e) {
      throw new CorruptMetaHeaderException("The block meta file header is " +
          "corrupt", e);
    }
    return new BlockMetadataHeader(version, dataChecksum);
  }

  /**
   * This reads all the fields till the beginning of checksum.
   * @return Metadata Header
   * @throws IOException
   */
  public static BlockMetadataHeader readHeader(DataInputStream in)
      throws IOException {
    try {
      return readHeader(in.readShort(), in);
    } catch (EOFException eof) {
      // The attempt to read the header threw EOF, indicating there are not
      // enough bytes in the meta file for the header.
      throw new CorruptMetaHeaderException("EOF while reading header from meta" +
          ". The meta file may be truncated or corrupt", eof);
    }
  }

  /**
   * Reads header at the top of metadata file and returns the header.
   * Closes the input stream after reading the header.
   *
   * @return metadata header for the block
   * @throws IOException
   */
  public static BlockMetadataHeader readHeader(
      FileInputStream fis) throws IOException {
    try (DataInputStream in = new DataInputStream(
        new BufferedInputStream(fis))) {
      return readHeader(in);
    }
  }

  /**
   * Read the header at the beginning of the given block meta file.
   * The current file position will be altered by this method.
   * If an error occurs, the file is <em>not</em> closed.
   */
  public static BlockMetadataHeader readHeader(RandomAccessFile raf)
      throws IOException {
    byte[] buf = new byte[getHeaderSize()];
    raf.seek(0);
    raf.readFully(buf, 0, buf.length);
    return readHeader(new DataInputStream(new ByteArrayInputStream(buf)));
  }

  // Version is already read.
  private static BlockMetadataHeader readHeader(short version,
                                                DataInputStream in) throws IOException {
    DataChecksum checksum = null;
    try {
      checksum = DataChecksum.newDataChecksum(in);
    } catch (InvalidChecksumSizeException e) {
      throw new CorruptMetaHeaderException("The block meta file header is " +
          "corrupt", e);
    }
    return new BlockMetadataHeader(version, checksum);
  }

  /**
   * This writes all the fields till the beginning of checksum.
   * @param out DataOutputStream
   * @throws IOException
   */

  public static void writeHeader(DataOutputStream out,
                                 BlockMetadataHeader header)
      throws IOException {
    out.writeShort(header.getVersion());
    header.getChecksum().writeHeader(out);
  }

  /**
   * Writes all the fields till the beginning of checksum.
   * @throws IOException on error
   */
  public static void writeHeader(DataOutputStream out, DataChecksum checksum)
      throws IOException {
    writeHeader(out, new BlockMetadataHeader(VERSION, checksum));
  }

  /**
   * Returns the size of the header
   */
  public static int getHeaderSize() {
    return Short.SIZE / Byte.SIZE + DataChecksum.getChecksumHeaderSize();
  }
}

