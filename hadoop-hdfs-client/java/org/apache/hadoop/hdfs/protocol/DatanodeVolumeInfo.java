package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.util.StringUtils;

/**
 * Locally available datanode volume information.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class DatanodeVolumeInfo {
  private long usedSpace;
  private long freeSpace;
  private long reservedSpace;
  private long reservedSpaceForReplicas;
  private long numBlocks;
  private StorageType storageType;
  private String path;

  public DatanodeVolumeInfo(String path, long usedSpace, long freeSpace,
      long reservedSpace, long reservedSpaceForReplicas, long numBlocks,
      StorageType type) {
    this.usedSpace = usedSpace;
    this.freeSpace = freeSpace;
    this.reservedSpace = reservedSpace;
    this.reservedSpaceForReplicas = reservedSpaceForReplicas;
    this.numBlocks = numBlocks;
    this.storageType = type;
    this.path = path;
  }

  /** get used space. */
  public long getUsedSpace() {
    return usedSpace;
  }

  /**
   * get free space.
   */
  public long getFreeSpace() {
    return freeSpace;
  }

  /**
   * get reserved space.
   */
  public long getReservedSpace() {
    return reservedSpace;
  }

  /**
   * get reserved space for replicas.
   */
  public long getReservedSpaceForReplicas() {
    return reservedSpaceForReplicas;
  }

  /**
   * get number of blocks.
   */
  public long getNumBlocks() {
    return numBlocks;
  }

  /**
   * get storage type.
   */
  public StorageType getStorageType() {
    return storageType;
  }

  /**
   * get volume path.
   */
  public String getPath() {
    return path;
  }

  /**
   * get volume report.
   */
  public String getDatanodeVolumeReport() {
    StringBuilder report = new StringBuilder();
    report
        .append("Directory: " + path)
        .append("\nStorageType: " + storageType)
        .append(
            "\nCapacity Used: " + usedSpace + "("
                + StringUtils.byteDesc(usedSpace) + ")")
        .append(
            "\nCapacity Left: " + freeSpace + "("
                + StringUtils.byteDesc(freeSpace) + ")")
        .append(
            "\nCapacity Reserved: " + reservedSpace + "("
                + StringUtils.byteDesc(reservedSpace) + ")")
        .append(
            "\nReserved Space for Replicas: " + reservedSpaceForReplicas + "("
                + StringUtils.byteDesc(reservedSpaceForReplicas) + ")")
        .append("\nBlocks: " + numBlocks);
    return report.toString();
  }
}