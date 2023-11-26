package org.apache.hadoop.hdfs.server.datanode;

import java.io.File;
import java.io.IOException;

import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants.ReplicaState;
import org.apache.hadoop.hdfs.server.datanode.fsdataset.FsVolumeSpi;
import org.apache.hadoop.hdfs.server.protocol.ReplicaRecoveryInfo;

/**
 * This class describes a replica that has been finalized.
 */
public class FinalizedReplica extends LocalReplica {
  private byte[] lastPartialChunkChecksum;
  private int metaLength = -1;
  /**
   * Constructor.
   * @param blockId block id
   * @param len replica length
   * @param genStamp replica generation stamp
   * @param vol volume where replica is located
   * @param dir directory path where block and meta files are located
   */
  public FinalizedReplica(long blockId, long len, long genStamp,
      FsVolumeSpi vol, File dir) {
    this(blockId, len, genStamp, vol, dir, null);
  }

  /**
   * Constructor.
   * @param blockId block id
   * @param len replica length
   * @param genStamp replica generation stamp
   * @param vol volume where replica is located
   * @param dir directory path where block and meta files are located
   * @param checksum the last partial chunk checksum
   */
  public FinalizedReplica(long blockId, long len, long genStamp,
      FsVolumeSpi vol, File dir, byte[] checksum) {
    super(blockId, len, genStamp, vol, dir);
    this.setLastPartialChunkChecksum(checksum);
  }

  /**
   * Constructor
   * @param block a block
   * @param vol volume where replica is located
   * @param dir directory path where block and meta files are located
   */
  public FinalizedReplica(Block block, FsVolumeSpi vol, File dir) {
    this(block, vol, dir, null);
  }

  /**
   * Constructor
   * @param block a block
   * @param vol volume where replica is located
   * @param dir directory path where block and meta files are located
   * @param checksum the last partial chunk checksum
   */
  public FinalizedReplica(Block block, FsVolumeSpi vol, File dir,
      byte[] checksum) {
    super(block, vol, dir);
    this.setLastPartialChunkChecksum(checksum);
  }

  /**
   * Copy constructor.
   * @param from where to copy construct from
   */
  public FinalizedReplica(FinalizedReplica from) {
    super(from);
    this.setLastPartialChunkChecksum(from.getLastPartialChunkChecksum());
  }

  @Override  // ReplicaInfo
  public ReplicaState getState() {
    return ReplicaState.FINALIZED;
  }
  
  @Override
  public long getVisibleLength() {
    return getNumBytes();       // all bytes are visible
  }

  @Override
  public long getBytesOnDisk() {
    return getNumBytes();
  }

  @Override  // Object
  public boolean equals(Object o) {
    return super.equals(o);
  }
  
  @Override  // Object
  public int hashCode() {
    return super.hashCode();
  }
  
  @Override
  public String toString() {
    return super.toString();
  }

  @Override
  public ReplicaInfo getOriginalReplica() {
    throw new UnsupportedOperationException("Replica of type " + getState() +
        " does not support getOriginalReplica");
  }

  @Override
  public long getRecoveryID() {
    throw new UnsupportedOperationException("Replica of type " + getState() +
        " does not support getRecoveryID");
  }

  @Override
  public void setRecoveryID(long recoveryId) {
    throw new UnsupportedOperationException("Replica of type " + getState() +
        " does not support setRecoveryID");
  }

  @Override
  public ReplicaRecoveryInfo createInfo() {
    throw new UnsupportedOperationException("Replica of type " + getState() +
        " does not support createInfo");
  }

  @Override
  public long getMetadataLength() {
    if (metaLength < 0) {
      metaLength = (int)super.getMetadataLength();
    }
    return metaLength;
  }

  public byte[] getLastPartialChunkChecksum() {
    return lastPartialChunkChecksum;
  }

  public void setLastPartialChunkChecksum(byte[] checksum) {
    lastPartialChunkChecksum = checksum;
  }

  public void loadLastPartialChunkChecksum()
      throws IOException {
    byte[] lastChecksum = getVolume().loadLastPartialChunkChecksum(
        getBlockFile(), getMetaFile());
    setLastPartialChunkChecksum(lastChecksum);
  }
}
