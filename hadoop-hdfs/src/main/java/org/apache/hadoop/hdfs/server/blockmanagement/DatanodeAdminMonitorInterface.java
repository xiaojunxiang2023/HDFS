package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.hdfs.server.namenode.Namesystem;

import java.util.Queue;

// 对于 下线节点 和 维护模式节点 的监视器
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