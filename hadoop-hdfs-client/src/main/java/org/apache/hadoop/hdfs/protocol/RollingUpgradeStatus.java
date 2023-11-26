package org.apache.hadoop.hdfs.protocol;

/**
 * Rolling upgrade status
 */
public class RollingUpgradeStatus {
  private final String blockPoolId;
  private final boolean finalized;

  public RollingUpgradeStatus(String blockPoolId, boolean finalized) {
    this.blockPoolId = blockPoolId;
    this.finalized = finalized;
  }

  public String getBlockPoolId() {
    return blockPoolId;
  }

  public boolean isFinalized() {
    return finalized;
  }

  @Override
  public int hashCode() {
    return blockPoolId.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    } else if (obj == null || !(obj instanceof RollingUpgradeStatus)) {
      return false;
    }
    final RollingUpgradeStatus that = (RollingUpgradeStatus) obj;
    return this.blockPoolId.equals(that.blockPoolId)
        && this.isFinalized() == that.isFinalized();
  }

  @Override
  public String toString() {
    return "  Block Pool ID: " + blockPoolId;
  }
}
