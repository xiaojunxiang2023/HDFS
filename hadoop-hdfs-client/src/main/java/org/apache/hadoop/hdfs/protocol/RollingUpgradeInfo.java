package org.apache.hadoop.hdfs.protocol;

import java.util.Date;

/**
 * Rolling upgrade information
 */
public class RollingUpgradeInfo extends RollingUpgradeStatus {
  private final long startTime;
  private long finalizeTime;
  private boolean createdRollbackImages;

  public RollingUpgradeInfo(String blockPoolId, boolean createdRollbackImages,
                            long startTime, long finalizeTime) {
    super(blockPoolId, finalizeTime != 0);
    this.createdRollbackImages = createdRollbackImages;
    this.startTime = startTime;
    this.finalizeTime = finalizeTime;
  }

  public boolean createdRollbackImages() {
    return createdRollbackImages;
  }

  public void setCreatedRollbackImages(boolean created) {
    this.createdRollbackImages = created;
  }

  public boolean isStarted() {
    return startTime != 0;
  }

  /** @return The rolling upgrade starting time. */
  public long getStartTime() {
    return startTime;
  }

  @Override
  public boolean isFinalized() {
    return finalizeTime != 0;
  }

  /**
   * Finalize the upgrade if not already finalized
   */
  public void finalize(long finalizeTime) {
    if (finalizeTime != 0) {
      this.finalizeTime = finalizeTime;
      createdRollbackImages = false;
    }
  }

  public long getFinalizeTime() {
    return finalizeTime;
  }

  @Override
  public int hashCode() {
    //only use lower 32 bits
    return super.hashCode() ^ (int) startTime ^ (int) finalizeTime;
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    } else if (obj == null || !(obj instanceof RollingUpgradeInfo)) {
      return false;
    }
    final RollingUpgradeInfo that = (RollingUpgradeInfo) obj;
    return super.equals(that)
        && this.startTime == that.startTime
        && this.finalizeTime == that.finalizeTime;
  }

  @Override
  public String toString() {
    return super.toString()
        + "\n     Start Time: "
        + (startTime == 0 ? "<NOT STARTED>" : timestamp2String(startTime))
        + "\n  Finalize Time: "
        + (finalizeTime == 0 ? "<NOT FINALIZED>" :
        timestamp2String(finalizeTime));
  }

  private static String timestamp2String(long timestamp) {
    return new Date(timestamp) + " (=" + timestamp + ")";
  }

  public static class Bean {
    private final String blockPoolId;
    private final long startTime;
    private final long finalizeTime;
    private final boolean createdRollbackImages;

    public Bean(RollingUpgradeInfo f) {
      this.blockPoolId = f.getBlockPoolId();
      this.startTime = f.startTime;
      this.finalizeTime = f.finalizeTime;
      this.createdRollbackImages = f.createdRollbackImages();
    }

    public String getBlockPoolId() {
      return blockPoolId;
    }

    public long getStartTime() {
      return startTime;
    }

    public long getFinalizeTime() {
      return finalizeTime;
    }

    public boolean isCreatedRollbackImages() {
      return createdRollbackImages;
    }
  }
}
