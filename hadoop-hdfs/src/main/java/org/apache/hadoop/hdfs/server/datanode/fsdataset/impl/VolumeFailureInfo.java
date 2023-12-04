package org.apache.hadoop.hdfs.server.datanode.fsdataset.impl;

import org.apache.hadoop.hdfs.server.datanode.StorageLocation;

/**
 * Tracks information about failure of a data volume.
 */
final class VolumeFailureInfo {
  private final StorageLocation failedStorageLocation;
  private final long failureDate;
  private final long estimatedCapacityLost;

  /**
   * Creates a new VolumeFailureInfo, when the capacity lost from this volume
   * failure is unknown.  Typically, this means the volume failed immediately at
   * startup, so there was never a chance to query its capacity.
   *
   * @param failedStorageLocation storage location that has failed
   * @param failureDate date/time of failure in milliseconds since epoch
   */
  public VolumeFailureInfo(StorageLocation failedStorageLocation,
                           long failureDate) {
    this(failedStorageLocation, failureDate, 0);
  }

  /**
   * Creates a new VolumeFailureInfo.
   *
   * @param failedStorageLocation storage location that has failed
   * @param failureDate date/time of failure in milliseconds since epoch
   * @param estimatedCapacityLost estimate of capacity lost in bytes
   */
  public VolumeFailureInfo(StorageLocation failedStorageLocation,
                           long failureDate, long estimatedCapacityLost) {
    this.failedStorageLocation = failedStorageLocation;
    this.failureDate = failureDate;
    this.estimatedCapacityLost = estimatedCapacityLost;
  }

  /**
   * Returns the storage location that has failed.
   *
   * @return storage location that has failed
   */
  public StorageLocation getFailedStorageLocation() {
    return this.failedStorageLocation;
  }

  /**
   * Returns date/time of failure
   *
   * @return date/time of failure in milliseconds since epoch
   */
  public long getFailureDate() {
    return this.failureDate;
  }

  /**
   * Returns estimate of capacity lost.  This is said to be an estimate, because
   * in some cases it's impossible to know the capacity of the volume, such as if
   * we never had a chance to query its capacity before the failure occurred.
   *
   * @return estimate of capacity lost in bytes
   */
  public long getEstimatedCapacityLost() {
    return this.estimatedCapacityLost;
  }
}
