package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.hdfs.server.namenode.Namesystem;

import java.util.Queue;

/**
 * Interface used to implement a decommission and maintenance monitor class,
 * which is instantiated by the DatanodeAdminManager class.
 */

public interface DatanodeAdminMonitorInterface extends Runnable {
  void stopTrackingNode(DatanodeDescriptor dn);

  void startTrackingNode(DatanodeDescriptor dn);

  int getPendingNodeCount();

  int getTrackedNodeCount();

  int getNumNodesChecked();

  Queue<DatanodeDescriptor> getPendingNodes();

  void setBlockManager(BlockManager bm);

  void setDatanodeAdminManager(DatanodeAdminManager dnm);

  void setNameSystem(Namesystem ns);
}