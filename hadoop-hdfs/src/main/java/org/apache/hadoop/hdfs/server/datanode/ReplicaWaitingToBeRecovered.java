package org.apache.hadoop.hdfs.server.datanode;

import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants.ReplicaState;
import org.apache.hadoop.hdfs.server.datanode.fsdataset.FsVolumeSpi;
import org.apache.hadoop.hdfs.server.protocol.ReplicaRecoveryInfo;

import java.io.File;

/**
 * This class represents a replica that is waiting to be recovered.
 * After a datanode restart, any replica in "rbw" directory is loaded
 * as a replica waiting to be recovered.
 * A replica waiting to be recovered does not provision read nor
 * participates in any pipeline recovery. It will become outdated if its
 * client continues to write or be recovered as a result of
 * lease recovery.
 */
public class ReplicaWaitingToBeRecovered extends LocalReplica {

  /**
   * Constructor
   * @param blockId block id
   * @param len replica length
   * @param genStamp replica generation stamp
   * @param vol volume where replica is located
   * @param dir directory path where block and meta files are located
   */
  public ReplicaWaitingToBeRecovered(long blockId, long len, long genStamp,
                                     FsVolumeSpi vol, File dir) {
    super(blockId, len, genStamp, vol, dir);
  }

  /**
   * Constructor
   * @param block a block
   * @param vol volume where replica is located
   * @param dir directory path where block and meta files are located
   */
  public ReplicaWaitingToBeRecovered(Block block, FsVolumeSpi vol, File dir) {
    super(block, vol, dir);
  }

  /**
   * Copy constructor.
   * @param from where to copy from
   */
  public ReplicaWaitingToBeRecovered(ReplicaWaitingToBeRecovered from) {
    super(from);
  }

  @Override //ReplicaInfo
  public ReplicaState getState() {
    return ReplicaState.RWR;
  }

  @Override //ReplicaInfo
  public long getVisibleLength() {
    return -1;  //no bytes are visible
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
        " does not support getRecoveryID");
  }

  @Override
  public ReplicaRecoveryInfo createInfo() {
    throw new UnsupportedOperationException("Replica of type " + getState() +
        " does not support createInfo");
  }
}
