package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.classification.InterfaceAudience;

/**
 * The context of the block report.
 *
 * This is a set of fields that the Datanode sends to provide context about a
 * block report RPC.  The context includes a unique 64-bit ID which
 * identifies the block report as a whole.  It also includes the total number
 * of RPCs which this block report is split into, and the index into that
 * total for the current RPC.
 */
@InterfaceAudience.Private
public class BlockReportContext {
  /**
   * The total number of RPCs contained in the block report.
   */
  private final int totalRpcs;

  /**
   * The index of this particular RPC.
   */
  private final int curRpc;

  /**
   * A 64-bit ID which identifies the block report as a whole.
   */
  private final long reportId;

  /**
   * The lease ID which this block report is using, or 0 if this block report is
   * bypassing rate-limiting.
   */
  private final long leaseId;

  public BlockReportContext(int totalRpcs, int curRpc,
                            long reportId, long leaseId) {
    this.totalRpcs = totalRpcs;
    this.curRpc = curRpc;
    this.reportId = reportId;
    this.leaseId = leaseId;
  }

  public int getTotalRpcs() {
    return totalRpcs;
  }

  public int getCurRpc() {
    return curRpc;
  }

  public long getReportId() {
    return reportId;
  }

  public long getLeaseId() {
    return leaseId;
  }
}
