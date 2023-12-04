package org.apache.hadoop.hdfs.server.datanode;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.PathHandle;
import org.apache.hadoop.fs.RawPathHandle;
import org.apache.hadoop.hdfs.server.common.FileRegion;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants.ReplicaState;
import org.apache.hadoop.hdfs.server.datanode.fsdataset.FsVolumeSpi;
import org.apache.hadoop.hdfs.server.protocol.ReplicaRecoveryInfo;

import java.net.URI;
import java.nio.ByteBuffer;

/**
 * This class is used for provided replicas that are finalized.
 */
public class FinalizedProvidedReplica extends ProvidedReplica {

  public FinalizedProvidedReplica(long blockId, URI fileURI, long fileOffset,
                                  long blockLen, long genStamp, PathHandle pathHandle, FsVolumeSpi volume,
                                  Configuration conf, FileSystem remoteFS) {
    super(blockId, fileURI, fileOffset, blockLen, genStamp, pathHandle, volume,
        conf, remoteFS);
  }

  public FinalizedProvidedReplica(FileRegion fileRegion, FsVolumeSpi volume,
                                  Configuration conf, FileSystem remoteFS) {
    super(fileRegion.getBlock().getBlockId(),
        fileRegion.getProvidedStorageLocation().getPath().toUri(),
        fileRegion.getProvidedStorageLocation().getOffset(),
        fileRegion.getBlock().getNumBytes(),
        fileRegion.getBlock().getGenerationStamp(),
        new RawPathHandle(ByteBuffer
            .wrap(fileRegion.getProvidedStorageLocation().getNonce())),
        volume, conf, remoteFS);
  }

  public FinalizedProvidedReplica(long blockId, Path pathPrefix,
                                  String pathSuffix, long fileOffset, long blockLen, long genStamp,
                                  PathHandle pathHandle, FsVolumeSpi volume, Configuration conf,
                                  FileSystem remoteFS) {
    super(blockId, pathPrefix, pathSuffix, fileOffset, blockLen,
        genStamp, pathHandle, volume, conf, remoteFS);
  }

  @Override
  public ReplicaState getState() {
    return ReplicaState.FINALIZED;
  }

  @Override
  public long getBytesOnDisk() {
    return getNumBytes();
  }

  @Override
  public long getVisibleLength() {
    return getNumBytes(); //all bytes are visible
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
}
