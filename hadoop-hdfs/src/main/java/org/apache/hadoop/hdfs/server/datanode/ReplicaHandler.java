package org.apache.hadoop.hdfs.server.datanode;

import org.apache.hadoop.hdfs.server.datanode.fsdataset.FsVolumeReference;

import java.io.Closeable;
import java.io.IOException;

/**
 * This class includes a replica being actively written and the reference to
 * the fs volume where this replica is located.
 */
public class ReplicaHandler implements Closeable {
  private final ReplicaInPipeline replica;
  private final FsVolumeReference volumeReference;

  public ReplicaHandler(
      ReplicaInPipeline replica, FsVolumeReference reference) {
    this.replica = replica;
    this.volumeReference = reference;
  }

  @Override
  public void close() throws IOException {
    if (this.volumeReference != null) {
      volumeReference.close();
    }
  }

  public ReplicaInPipeline getReplica() {
    return replica;
  }
}
