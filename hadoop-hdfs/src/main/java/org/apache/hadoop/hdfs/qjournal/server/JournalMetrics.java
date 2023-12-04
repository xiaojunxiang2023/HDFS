package org.apache.hadoop.hdfs.qjournal.server;

import org.apache.hadoop.metrics2.annotation.Metric;
import org.apache.hadoop.metrics2.annotation.Metrics;
import org.apache.hadoop.metrics2.lib.*;

import java.io.IOException;


/**
 * The server-side metrics for a journal from the JournalNode's
 * perspective.
 */
@Metrics(about = "Journal metrics", context = "dfs")
class JournalMetrics {
  final MetricsRegistry registry = new MetricsRegistry("JournalNode");

  @Metric("Number of batches written since startup")
  MutableCounterLong batchesWritten;

  @Metric("Number of txns written since startup")
  MutableCounterLong txnsWritten;

  @Metric("Number of bytes written since startup")
  MutableCounterLong bytesWritten;

  @Metric("Number of txns served via RPC")
  MutableCounterLong txnsServedViaRpc;

  @Metric("Number of bytes served via RPC")
  MutableCounterLong bytesServedViaRpc;

  private MutableStat rpcRequestCacheMissAmount;

  @Metric("Number of RPC requests with zero edits returned")
  MutableCounterLong rpcEmptyResponses;

  @Metric("Number of batches written where this node was lagging")
  MutableCounterLong batchesWrittenWhileLagging;

  @Metric("Number of edit logs downloaded by JournalNodeSyncer")
  private MutableCounterLong numEditLogsSynced;

  private final int[] QUANTILE_INTERVALS = new int[]{
      1 * 60, // 1m
      5 * 60, // 5m
      60 * 60 // 1h
  };

  final MutableQuantiles[] syncsQuantiles;

  private final Journal journal;

  JournalMetrics(Journal journal) {
    this.journal = journal;

    syncsQuantiles = new MutableQuantiles[QUANTILE_INTERVALS.length];
    for (int i = 0; i < syncsQuantiles.length; i++) {
      int interval = QUANTILE_INTERVALS[i];
      syncsQuantiles[i] = registry.newQuantiles(
          "syncs" + interval + "s",
          "Journal sync time", "ops", "latencyMicros", interval);
    }
    rpcRequestCacheMissAmount = registry
        .newStat("RpcRequestCacheMissAmount", "Number of RPC requests unable to be " +
                "served due to lack of availability in cache, and how many " +
                "transactions away the request was from being in the cache.",
            "Misses", "Txns");
  }

  public static JournalMetrics create(Journal j) {
    JournalMetrics m = new JournalMetrics(j);
    return DefaultMetricsSystem.instance().register(
        m.getName(), null, m);
  }

  String getName() {
    return "Journal-" + journal.getJournalId();
  }

  @Metric("Current writer's epoch")
  public long getLastWriterEpoch() {
    try {
      return journal.getLastWriterEpoch();
    } catch (IOException e) {
      return -1L;
    }
  }

  @Metric("Last accepted epoch")
  public long getLastPromisedEpoch() {
    try {
      return journal.getLastPromisedEpoch();
    } catch (IOException e) {
      return -1L;
    }
  }

  @Metric("The highest txid stored on this JN")
  public long getLastWrittenTxId() {
    return journal.getHighestWrittenTxId();
  }

  @Metric("Number of transactions that this JN is lagging")
  public long getCurrentLagTxns() {
    try {
      return journal.getCurrentLagTxns();
    } catch (IOException e) {
      return -1L;
    }
  }

  @Metric("The timestamp of last successfully written transaction")
  public long getLastJournalTimestamp() {
    return journal.getLastJournalTimestamp();
  }

  void addSync(long us) {
    for (MutableQuantiles q : syncsQuantiles) {
      q.add(us);
    }
  }

  public MutableCounterLong getNumEditLogsSynced() {
    return numEditLogsSynced;
  }

  public void incrNumEditLogsSynced() {
    numEditLogsSynced.incr();
  }

  public void addRpcRequestCacheMissAmount(long cacheMissAmount) {
    rpcRequestCacheMissAmount.add(cacheMissAmount);
  }
}
