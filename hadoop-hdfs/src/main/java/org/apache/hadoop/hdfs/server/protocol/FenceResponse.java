package org.apache.hadoop.hdfs.server.protocol;

/**
 * Response to a journal fence request. See {@link JournalProtocol#fence}
 */
public class FenceResponse {
  private final long previousEpoch;
  private final long lastTransactionId;
  private final boolean isInSync;

  public FenceResponse(long previousEpoch, long lastTransId, boolean inSync) {
    this.previousEpoch = previousEpoch;
    this.lastTransactionId = lastTransId;
    this.isInSync = inSync;
  }

  public boolean isInSync() {
    return isInSync;
  }

  public long getLastTransactionId() {
    return lastTransactionId;
  }

  public long getPreviousEpoch() {
    return previousEpoch;
  }
}
