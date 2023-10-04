package org.apache.hadoop.hdfs.inotify;

import org.apache.hadoop.classification.InterfaceAudience;

/**
 * A batch of events that all happened on the same transaction ID.
 */
@InterfaceAudience.Public
public class EventBatch {
  private final long txid;
  private final Event[] events;

  public EventBatch(long txid, Event[] events) {
    this.txid = txid;
    this.events = events;
  }

  public long getTxid() {
    return txid;
  }

  public Event[] getEvents() { return events; }
}
