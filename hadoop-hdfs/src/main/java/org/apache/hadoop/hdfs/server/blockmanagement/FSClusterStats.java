package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.fs.StorageType;

import java.util.Map;

public interface FSClusterStats {

  // 此刻正在传输的 block + 写入的 block   总数
  int getTotalLoad();

  // 此刻正在传输的 block + 写入的 block   平均负载
  double getInServiceXceiverAverage();

  boolean isAvoidingStaleDataNodesForWrite();

  // alive && !decommissioned
  int getNumDatanodesInService();

  Map<StorageType, StorageTypeStats> getStorageTypeStats();
}
