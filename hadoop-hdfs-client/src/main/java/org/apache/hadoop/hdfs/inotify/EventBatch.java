package org.apache.hadoop.hdfs.inotify;

/**
 * A batch of events that all happened on the same transaction ID.
 */
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

  public Event[] getEvents() {
    return events;
  }
}
