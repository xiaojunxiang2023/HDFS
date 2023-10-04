package org.apache.hadoop.hdfs;

import org.apache.hadoop.classification.InterfaceAudience;

import java.util.concurrent.atomic.LongAdder;

/**
 * The client-side metrics for hedged read feature.
 * This class has a number of metrics variables that are publicly accessible,
 * we can grab them from client side, like HBase.
 */
@InterfaceAudience.Private
public class DFSHedgedReadMetrics {
  public final LongAdder hedgedReadOps = new LongAdder();
  public final LongAdder hedgedReadOpsWin = new LongAdder();
  public final LongAdder hedgedReadOpsInCurThread = new LongAdder();

  public void incHedgedReadOps() {
    hedgedReadOps.increment();
  }

  public void incHedgedReadOpsInCurThread() {
    hedgedReadOpsInCurThread.increment();
  }

  public void incHedgedReadWins() {
    hedgedReadOpsWin.increment();
  }

  public long getHedgedReadOps() {
    return hedgedReadOps.longValue();
  }

  public long getHedgedReadOpsInCurThread() {
    return hedgedReadOpsInCurThread.longValue();
  }

  public long getHedgedReadWins() {
    return hedgedReadOpsWin.longValue();
  }
}
