package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.fs.StorageType;

import java.util.Map;

public interface BlockStatsMXBean {
  Map<StorageType, StorageTypeStats> getStorageTypeStats();
}
