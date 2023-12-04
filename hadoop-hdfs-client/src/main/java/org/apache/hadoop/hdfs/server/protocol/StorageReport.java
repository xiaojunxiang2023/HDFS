package org.apache.hadoop.hdfs.server.protocol;

/**
 * Utilization report for a Datanode storage
 */
public class StorageReport {
  private final DatanodeStorage storage;
  private final boolean failed;
  private final long capacity;
  private final long dfsUsed;
  private final long nonDfsUsed;
  private final long remaining;
  private final long blockPoolUsed;

  public static final StorageReport[] EMPTY_ARRAY = {};

  public StorageReport(DatanodeStorage storage, boolean failed, long capacity,
                       long dfsUsed, long remaining, long bpUsed, long nonDfsUsed) {
    this.storage = storage;
    this.failed = failed;
    this.capacity = capacity;
    this.dfsUsed = dfsUsed;
    this.nonDfsUsed = nonDfsUsed;
    this.remaining = remaining;
    this.blockPoolUsed = bpUsed;
  }

  public DatanodeStorage getStorage() {
    return storage;
  }

  public boolean isFailed() {
    return failed;
  }

  public long getCapacity() {
    return capacity;
  }

  public long getDfsUsed() {
    return dfsUsed;
  }

  public long getNonDfsUsed() {
    return nonDfsUsed;
  }

  public long getRemaining() {
    return remaining;
  }

  public long getBlockPoolUsed() {
    return blockPoolUsed;
  }
}
