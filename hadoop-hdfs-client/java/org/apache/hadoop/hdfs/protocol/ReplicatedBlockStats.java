package org.apache.hadoop.hdfs.protocol;

import java.util.Collection;

/**
 * Get statistics pertaining to blocks of type {@link BlockType#CONTIGUOUS}
 * in the filesystem.
 * <p>
 * @see ClientProtocol#getReplicatedBlockStats()
 */
public final class ReplicatedBlockStats {
  private final long lowRedundancyBlocks;
  private final long corruptBlocks;
  private final long missingBlocks;
  private final long missingReplicationOneBlocks;
  private final long bytesInFutureBlocks;
  private final long pendingDeletionBlocks;
  private final Long highestPriorityLowRedundancyBlocks;

  public ReplicatedBlockStats(long lowRedundancyBlocks,
      long corruptBlocks, long missingBlocks,
      long missingReplicationOneBlocks, long bytesInFutureBlocks,
      long pendingDeletionBlocks) {
    this(lowRedundancyBlocks, corruptBlocks, missingBlocks,
        missingReplicationOneBlocks, bytesInFutureBlocks, pendingDeletionBlocks,
        null);
  }

  public ReplicatedBlockStats(long lowRedundancyBlocks,
      long corruptBlocks, long missingBlocks,
      long missingReplicationOneBlocks, long bytesInFutureBlocks,
      long pendingDeletionBlocks, Long highestPriorityLowRedundancyBlocks) {
    this.lowRedundancyBlocks = lowRedundancyBlocks;
    this.corruptBlocks = corruptBlocks;
    this.missingBlocks = missingBlocks;
    this.missingReplicationOneBlocks = missingReplicationOneBlocks;
    this.bytesInFutureBlocks = bytesInFutureBlocks;
    this.pendingDeletionBlocks = pendingDeletionBlocks;
    this.highestPriorityLowRedundancyBlocks
        = highestPriorityLowRedundancyBlocks;
  }

  public long getLowRedundancyBlocks() {
    return lowRedundancyBlocks;
  }

  public long getCorruptBlocks() {
    return corruptBlocks;
  }

  public long getMissingReplicaBlocks() {
    return missingBlocks;
  }

  public long getMissingReplicationOneBlocks() {
    return missingReplicationOneBlocks;
  }

  public long getBytesInFutureBlocks() {
    return bytesInFutureBlocks;
  }

  public long getPendingDeletionBlocks() {
    return pendingDeletionBlocks;
  }

  public boolean hasHighestPriorityLowRedundancyBlocks() {
    return getHighestPriorityLowRedundancyBlocks() != null;
  }

  public Long getHighestPriorityLowRedundancyBlocks(){
    return highestPriorityLowRedundancyBlocks;
  }

  @Override
  public String toString() {
    StringBuilder statsBuilder = new StringBuilder();
    statsBuilder.append("ReplicatedBlockStats=[")
        .append("LowRedundancyBlocks=").append(getLowRedundancyBlocks())
        .append(", CorruptBlocks=").append(getCorruptBlocks())
        .append(", MissingReplicaBlocks=").append(getMissingReplicaBlocks())
        .append(", MissingReplicationOneBlocks=").append(
            getMissingReplicationOneBlocks())
        .append(", BytesInFutureBlocks=").append(getBytesInFutureBlocks())
        .append(", PendingDeletionBlocks=").append(
            getPendingDeletionBlocks());
    if (hasHighestPriorityLowRedundancyBlocks()) {
        statsBuilder.append(", HighestPriorityLowRedundancyBlocks=").append(
            getHighestPriorityLowRedundancyBlocks());
    }
    statsBuilder.append("]");
    return statsBuilder.toString();
  }

  /**
   * Merge the multiple ReplicatedBlockStats.
   * @param stats Collection of stats to merge.
   * @return A new ReplicatedBlockStats merging all the input ones
   */
  public static ReplicatedBlockStats merge(
      Collection<ReplicatedBlockStats> stats) {
    long lowRedundancyBlocks = 0;
    long corruptBlocks = 0;
    long missingBlocks = 0;
    long missingReplicationOneBlocks = 0;
    long bytesInFutureBlocks = 0;
    long pendingDeletionBlocks = 0;
    long highestPriorityLowRedundancyBlocks = 0;
    boolean hasHighestPriorityLowRedundancyBlocks = false;

    // long's range is large enough that we don't need to consider overflow
    for (ReplicatedBlockStats stat : stats) {
      lowRedundancyBlocks += stat.getLowRedundancyBlocks();
      corruptBlocks += stat.getCorruptBlocks();
      missingBlocks += stat.getMissingReplicaBlocks();
      missingReplicationOneBlocks += stat.getMissingReplicationOneBlocks();
      bytesInFutureBlocks += stat.getBytesInFutureBlocks();
      pendingDeletionBlocks += stat.getPendingDeletionBlocks();
      if (stat.hasHighestPriorityLowRedundancyBlocks()) {
        hasHighestPriorityLowRedundancyBlocks = true;
        highestPriorityLowRedundancyBlocks +=
            stat.getHighestPriorityLowRedundancyBlocks();
      }
    }
    if (hasHighestPriorityLowRedundancyBlocks) {
      return new ReplicatedBlockStats(lowRedundancyBlocks, corruptBlocks,
          missingBlocks, missingReplicationOneBlocks, bytesInFutureBlocks,
          pendingDeletionBlocks, highestPriorityLowRedundancyBlocks);
    }
    return new ReplicatedBlockStats(lowRedundancyBlocks, corruptBlocks,
        missingBlocks, missingReplicationOneBlocks, bytesInFutureBlocks,
        pendingDeletionBlocks);
  }
}
