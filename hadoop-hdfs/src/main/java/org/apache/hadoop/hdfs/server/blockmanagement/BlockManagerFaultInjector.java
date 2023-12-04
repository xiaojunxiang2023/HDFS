package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.hdfs.protocol.DatanodeID;
import org.apache.hadoop.hdfs.server.protocol.BlockReportContext;
import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;

import java.io.IOException;

/**
 * Used to inject certain faults for testing.
 */
public class BlockManagerFaultInjector {
  @VisibleForTesting
  public static BlockManagerFaultInjector instance =
      new BlockManagerFaultInjector();

  @VisibleForTesting
  public static BlockManagerFaultInjector getInstance() {
    return instance;
  }

  @VisibleForTesting
  public void incomingBlockReportRpc(DatanodeID nodeID,
                                     BlockReportContext context) throws IOException {

  }

  @VisibleForTesting
  public void requestBlockReportLease(DatanodeDescriptor node, long leaseId) {
  }

  @VisibleForTesting
  public void removeBlockReportLease(DatanodeDescriptor node, long leaseId) {
  }
}
