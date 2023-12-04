package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.hdfs.server.common.HdfsServerConstants;
import org.apache.hadoop.thirdparty.com.google.common.base.Joiner;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

import java.util.Collections;
import java.util.List;

/**
 * An enumeration of logs available on a remote NameNode.
 */
public class RemoteEditLogManifest {

  private List<RemoteEditLog> logs;

  private long committedTxnId = HdfsServerConstants.INVALID_TXID;

  public RemoteEditLogManifest() {
  }

  public RemoteEditLogManifest(List<RemoteEditLog> logs) {
    this(logs, HdfsServerConstants.INVALID_TXID);
  }

  public RemoteEditLogManifest(List<RemoteEditLog> logs, long committedTxnId) {
    this.logs = logs;
    this.committedTxnId = committedTxnId;
    checkState();
  }


  /**
   * Check that the logs are non-overlapping sequences of transactions,
   * in sorted order. They do not need to be contiguous.
   * @throws IllegalStateException if incorrect
   */
  private void checkState() {
    Preconditions.checkNotNull(logs);

    RemoteEditLog prev = null;
    for (RemoteEditLog log : logs) {
      if (prev != null) {
        if (log.getStartTxId() <= prev.getEndTxId()) {
          throw new IllegalStateException(
              "Invalid log manifest (log " + log + " overlaps " + prev + ")\n"
                  + this);
        }
      }
      prev = log;
    }
  }

  public List<RemoteEditLog> getLogs() {
    return Collections.unmodifiableList(logs);
  }

  public long getCommittedTxnId() {
    return committedTxnId;
  }

  @Override
  public String toString() {
    return "[" + Joiner.on(", ").join(logs) + "]" + " CommittedTxId: "
        + committedTxnId;
  }
}
