package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.fs.StorageType;

import java.util.Map;

public interface DatanodeStatistics {

  long getCapacityTotal();

  long getCapacityUsed();

  float getCapacityUsedPercent();

  long getCapacityRemaining();

  float getCapacityRemainingPercent();

  long getBlockPoolUsed();

  float getPercentBlockPoolUsed();

  long getCacheCapacity();

  long getCacheUsed();

  int getXceiverCount();

  int getInServiceXceiverCount();

  int getNumDatanodesInService();

  long getCapacityUsedNonDFS();

  long[] getStats();

  int getExpiredHeartbeats();

  Map<StorageType, StorageTypeStats> getStorageTypeStats();

  long getProvidedCapacity();

}