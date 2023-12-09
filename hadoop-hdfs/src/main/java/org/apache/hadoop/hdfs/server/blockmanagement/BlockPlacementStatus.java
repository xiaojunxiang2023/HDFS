package org.apache.hadoop.hdfs.server.blockmanagement;

public interface BlockPlacementStatus {

  // 是否副本满足放置策略
  boolean isPlacementPolicySatisfied();

  // 还需要的副本数
  int getAdditionalReplicasRequired();

  // 错误原因的描述
  String getErrorDescription();

}
