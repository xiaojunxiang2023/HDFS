package org.apache.hadoop.hdfs.server.datanode;

/**
 * holder class that holds checksum bytes and the length in a block at which
 * the checksum bytes end
 * 
 * ex: length = 1023 and checksum is 4 bytes which is for 512 bytes, then
 *     the checksum applies for the last chunk, or bytes 512 - 1023
 */

public class ChunkChecksum {
  private final long dataLength;
  // can be null if not available
  private final byte[] checksum;

  public ChunkChecksum(long dataLength, byte[] checksum) {
    this.dataLength = dataLength;
    this.checksum = checksum;
  }

  public long getDataLength() {
    return dataLength;
  }

  public byte[] getChecksum() {
    return checksum;
  }
}