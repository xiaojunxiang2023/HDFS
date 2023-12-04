package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.fs.StorageType;

import java.util.Map;

/**
 * This is an interface used to retrieve statistic information related to
 * block management.
 */
public interface BlockStatsMXBean {

  /**
   * The statistics of storage types.
   *
   * @return get storage statistics per storage type
   */
  Map<StorageType, StorageTypeStats> getStorageTypeStats();
}
