package org.apache.hadoop.hdfs.server.datanode.erasurecode;

import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.protocol.ErasureCodingPolicy;
import org.apache.hadoop.hdfs.protocol.ExtendedBlock;

/**
 * Stores striped block info that can be used for block reconstruction.
 */
public class StripedReconstructionInfo {

  private final ExtendedBlock blockGroup;
  private final ErasureCodingPolicy ecPolicy;

  // source info
  private final byte[] liveIndices;
  private final DatanodeInfo[] sources;

  // target info
  private final byte[] targetIndices;
  private final DatanodeInfo[] targets;
  private final StorageType[] targetStorageTypes;
  private final String[] targetStorageIds;

  public StripedReconstructionInfo(ExtendedBlock blockGroup,
                                   ErasureCodingPolicy ecPolicy, byte[] liveIndices, DatanodeInfo[] sources,
                                   byte[] targetIndices) {
    this(blockGroup, ecPolicy, liveIndices, sources, targetIndices, null,
        null, null);
  }

  StripedReconstructionInfo(ExtendedBlock blockGroup,
                            ErasureCodingPolicy ecPolicy, byte[] liveIndices, DatanodeInfo[] sources,
                            DatanodeInfo[] targets, StorageType[] targetStorageTypes,
                            String[] targetStorageIds) {
    this(blockGroup, ecPolicy, liveIndices, sources, null, targets,
        targetStorageTypes, targetStorageIds);
  }

  private StripedReconstructionInfo(ExtendedBlock blockGroup,
                                    ErasureCodingPolicy ecPolicy, byte[] liveIndices, DatanodeInfo[] sources,
                                    byte[] targetIndices, DatanodeInfo[] targets,
                                    StorageType[] targetStorageTypes, String[] targetStorageIds) {

    this.blockGroup = blockGroup;
    this.ecPolicy = ecPolicy;
    this.liveIndices = liveIndices;
    this.sources = sources;
    this.targetIndices = targetIndices;
    this.targets = targets;
    this.targetStorageTypes = targetStorageTypes;
    this.targetStorageIds = targetStorageIds;
  }

  ExtendedBlock getBlockGroup() {
    return blockGroup;
  }

  ErasureCodingPolicy getEcPolicy() {
    return ecPolicy;
  }

  byte[] getLiveIndices() {
    return liveIndices;
  }

  DatanodeInfo[] getSources() {
    return sources;
  }

  byte[] getTargetIndices() {
    return targetIndices;
  }

  DatanodeInfo[] getTargets() {
    return targets;
  }

  StorageType[] getTargetStorageTypes() {
    return targetStorageTypes;
  }

  String[] getTargetStorageIds() {
    return targetStorageIds;
  }

  /**
   * Return the weight of this EC reconstruction task.
   *
   * DN uses it to coordinate with NN to adjust the speed of scheduling the
   * reconstructions tasks to this DN.
   *
   * @return the weight of this reconstruction task.
   * @see HDFS-12044
   */
  int getWeight() {
    // See HDFS-12044. The weight of a RS(n, k) is calculated by the network
    // connections it opens.
    return sources.length + targets.length;
  }
}

