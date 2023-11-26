package org.apache.hadoop.hdfs.server.blockmanagement;
public interface BlockPlacementStatus {

  /**
   * Boolean value to identify if replicas of this block satisfy requirement of 
   * placement policy
   * @return if replicas satisfy placement policy's requirement 
   */
  public boolean isPlacementPolicySatisfied();
  
  /**
   * Get description info for log or printed in case replicas are failed to meet
   * requirement of placement policy
   * @return description in case replicas are failed to meet requirement of
   * placement policy
   */
  public String getErrorDescription();

  /**
   * Return the number of additional replicas needed to ensure the block
   * placement policy is satisfied.
   * @return The number of new replicas needed to satisify the placement policy
   * or zero if no extra are needed
   */
  int getAdditionalReplicasRequired();

}
