package org.apache.hadoop.hdfs.inotify;
public class MissingEventsException extends Exception {
  private static final long serialVersionUID = 1L;

  private long expectedTxid;
  private long actualTxid;

  public MissingEventsException() {}

  public MissingEventsException(long expectedTxid, long actualTxid) {
    this.expectedTxid = expectedTxid;
    this.actualTxid = actualTxid;
  }

  public long getExpectedTxid() {
    return expectedTxid;
  }

  public long getActualTxid() {
    return actualTxid;
  }

  @Override
  public String toString() {
    return "We expected the next batch of events to start with transaction ID "
        + expectedTxid + ", but it instead started with transaction ID " +
        actualTxid + ". Most likely the intervening transactions were cleaned "
        + "up as part of checkpointing.";
  }
}
