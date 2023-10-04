package org.apache.hadoop.hdfs.server.datanode;

import java.io.File;

import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants.ReplicaState;
import org.apache.hadoop.hdfs.server.datanode.fsdataset.FsVolumeSpi;

/** This class represents replicas being written. 
 * Those are the replicas that
 * are created in a pipeline initiated by a dfs client.
 */
public class ReplicaBeingWritten extends LocalReplicaInPipeline {
  /**
   * Constructor for a zero length replica.
   * @param blockId block id
   * @param genStamp replica generation stamp
   * @param vol volume where replica is located
   * @param dir directory path where block and meta files are located
   * @param bytesToReserve disk space to reserve for this replica, based on
   *                       the estimated maximum block length.
   */
  public ReplicaBeingWritten(long blockId, long genStamp,
        FsVolumeSpi vol, File dir, long bytesToReserve) {
    super(blockId, genStamp, vol, dir, bytesToReserve);
  }

  /**
   * Constructor.
   * @param block a block
   * @param vol volume where replica is located
   * @param dir directory path where block and meta files are located
   * @param writer a thread that is writing to this replica
   */
  public ReplicaBeingWritten(Block block,
      FsVolumeSpi vol, File dir, Thread writer) {
    super(block, vol, dir, writer);
  }

  /**
   * Constructor.
   * @param blockId block id
   * @param len replica length
   * @param genStamp replica generation stamp
   * @param vol volume where replica is located
   * @param dir directory path where block and meta files are located
   * @param writer a thread that is writing to this replica
   * @param bytesToReserve disk space to reserve for this replica, based on
   *                       the estimated maximum block length.
   */
  public ReplicaBeingWritten(long blockId, long len, long genStamp,
      FsVolumeSpi vol, File dir, Thread writer, long bytesToReserve) {
    super(blockId, len, genStamp, vol, dir, writer, bytesToReserve);
  }

  /**
   * Copy constructor.
   * @param from where to copy from
   */
  public ReplicaBeingWritten(ReplicaBeingWritten from) {
    super(from);
  }

  @Override
  public long getVisibleLength() {
    return getBytesAcked();       // all acked bytes are visible
  }

  @Override   //ReplicaInfo
  public ReplicaState getState() {
    return ReplicaState.RBW;
  }
  
  @Override  // Object
  public boolean equals(Object o) {
    return super.equals(o);
  }
  
  @Override  // Object
  public int hashCode() {
    return super.hashCode();
  }
}
