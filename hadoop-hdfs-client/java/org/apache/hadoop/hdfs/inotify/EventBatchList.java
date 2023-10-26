package org.apache.hadoop.hdfs.inotify;

import java.util.List;

/**
 * Contains a list of event batches, the transaction ID in the edit log up to
 * which we read to produce these events, and the first txid we observed when
 * producing these events (the last of which is for the purpose of determining
 * whether we have missed events due to edit deletion). Also contains the most
 * recent txid that the NameNode has sync'ed, so the client can determine how
 * far behind in the edit log it is.
 */
public class EventBatchList {
  private List<EventBatch> batches;
  private long firstTxid;
  private long lastTxid;
  private long syncTxid;

  public EventBatchList(List<EventBatch> batches, long firstTxid,
                         long lastTxid, long syncTxid) {
    this.batches = batches;
    this.firstTxid = firstTxid;
    this.lastTxid = lastTxid;
    this.syncTxid = syncTxid;
  }

  public List<EventBatch> getBatches() {
    return batches;
  }

  public long getFirstTxid() {
    return firstTxid;
  }

  public long getLastTxid() {
    return lastTxid;
  }

  public long getSyncTxid() {
    return syncTxid;
  }
}
