package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.fs.StorageType;

import java.util.Map;

/**
 * This interface is used for retrieving the load related statistics of
 * the cluster.
 */
@InterfaceAudience.Private
public interface FSClusterStats {

  /**
   * an indication of the total load of the cluster.
   *
   * @return a count of the total number of block transfers and block
   *         writes that are currently occuring on the cluster.
   */
  public int getTotalLoad();

  /**
   * Indicate whether or not the cluster is now avoiding
   * to use stale DataNodes for writing.
   *
   * @return True if the cluster is currently avoiding using stale DataNodes
   *         for writing targets, and false otherwise.
   */
  public boolean isAvoidingStaleDataNodesForWrite();

  /**
   * Indicates number of datanodes that are in service.
   * @return Number of datanodes that are both alive and not decommissioned.
   */
  public int getNumDatanodesInService();

  /**
   * an indication of the average load of non-decommission(ing|ed) nodes
   * eligible for block placement
   *
   * @return average of the in service number of block transfers and block
   *         writes that are currently occurring on the cluster.
   */
  public double getInServiceXceiverAverage();

  /**
   * Indicates the storage statistics per storage type.
   * @return storage statistics per storage type.
   */
  Map<StorageType, StorageTypeStats> getStorageTypeStats();
}
