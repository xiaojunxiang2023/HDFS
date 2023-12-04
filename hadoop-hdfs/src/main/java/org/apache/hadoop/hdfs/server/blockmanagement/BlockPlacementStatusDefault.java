package org.apache.hadoop.hdfs.server.blockmanagement;

public class BlockPlacementStatusDefault implements BlockPlacementStatus {

  private int requiredRacks = 0;
  private int currentRacks = 0;
  private final int totalRacks;

  public BlockPlacementStatusDefault(int currentRacks, int requiredRacks,
                                     int totalRacks) {
    this.requiredRacks = requiredRacks;
    this.currentRacks = currentRacks;
    this.totalRacks = totalRacks;
  }

  @Override
  public boolean isPlacementPolicySatisfied() {
    return requiredRacks <= currentRacks || currentRacks >= totalRacks;
  }

  @Override
  public String getErrorDescription() {
    if (isPlacementPolicySatisfied()) {
      return null;
    }
    return "Block should be additionally replicated on " +
        (requiredRacks - currentRacks) +
        " more rack(s). Total number of racks in the cluster: " + totalRacks;
  }

  @Override
  public int getAdditionalReplicasRequired() {
    if (isPlacementPolicySatisfied()) {
      return 0;
    } else {
      return requiredRacks - currentRacks;
    }
  }
}
