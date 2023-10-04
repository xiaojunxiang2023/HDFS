package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.thirdparty.com.google.common.collect.ComparisonChain;
import java.util.function.Function;
import org.apache.hadoop.hdfs.server.common.HdfsServerConstants;

public class RemoteEditLog implements Comparable<RemoteEditLog> {
  private long startTxId = HdfsServerConstants.INVALID_TXID;
  private long endTxId = HdfsServerConstants.INVALID_TXID;
  private boolean isInProgress = false;
  
  public RemoteEditLog() {
  }

  public RemoteEditLog(long startTxId, long endTxId) {
    this.startTxId = startTxId;
    this.endTxId = endTxId;
    this.isInProgress = (endTxId == HdfsServerConstants.INVALID_TXID);
  }
  
  public RemoteEditLog(long startTxId, long endTxId, boolean inProgress) {
    this.startTxId = startTxId;
    this.endTxId = endTxId;
    this.isInProgress = inProgress;
  }

  public long getStartTxId() {
    return startTxId;
  }

  public long getEndTxId() {
    return endTxId;
  }

  public boolean isInProgress() {
    return isInProgress;
  }

  @Override
  public String toString() {
    if (!isInProgress) {
      return "[" + startTxId + "," + endTxId + "]";
    } else {
      return "[" + startTxId + "-? (in-progress)]";
    }
  }
  
  @Override
  public int compareTo(RemoteEditLog log) {
    return ComparisonChain.start()
      .compare(startTxId, log.startTxId)
      .compare(endTxId, log.endTxId)
      .result();
  }

  @Override
  public boolean equals(Object o) {
    if (!(o instanceof RemoteEditLog)) return false;
    return this.compareTo((RemoteEditLog)o) == 0;
  }
  
  @Override
  public int hashCode() {
    return (int) (startTxId * endTxId);
  }
  
  /**
   * Java <code>Function</code> which applies {@link #getStartTxId()}
   */
  public static final Function<RemoteEditLog, Long> GET_START_TXID =
      log -> {
        if (null == log) {
          return HdfsServerConstants.INVALID_TXID;
        }
        return log.getStartTxId();
      };
}
