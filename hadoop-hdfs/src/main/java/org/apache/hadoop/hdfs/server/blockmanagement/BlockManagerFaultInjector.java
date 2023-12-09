package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.hdfs.protocol.DatanodeID;
import org.apache.hadoop.hdfs.server.protocol.BlockReportContext;

import java.io.IOException;

/**
 * Used to inject certain faults for testing.
 */
public class BlockManagerFaultInjector {

  public static BlockManagerFaultInjector instance =
      new BlockManagerFaultInjector();


  public static BlockManagerFaultInjector getInstance() {
    return instance;
  }


  public void incomingBlockReportRpc(DatanodeID nodeID,
                                     BlockReportContext context) throws IOException {

  }


  public void requestBlockReportLease(DatanodeDescriptor node, long leaseId) {
  }


  public void removeBlockReportLease(DatanodeDescriptor node, long leaseId) {
  }
}
