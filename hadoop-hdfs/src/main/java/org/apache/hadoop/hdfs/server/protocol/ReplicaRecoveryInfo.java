package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.hdfs.protocol.Block;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants.ReplicaState;

/**
 * Replica recovery information.
 */
public class ReplicaRecoveryInfo extends Block {
  private final ReplicaState originalState;

  public ReplicaRecoveryInfo(long blockId, long diskLen, long gs, ReplicaState rState) {
    set(blockId, diskLen, gs);
    originalState = rState;
  }

  public ReplicaState getOriginalReplicaState() {
    return originalState;
  }

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public String toString() {
    return super.toString() + "[numBytes=" + this.getNumBytes() +
        ",originalReplicaState=" + this.originalState.name() + "]";
  }
}
