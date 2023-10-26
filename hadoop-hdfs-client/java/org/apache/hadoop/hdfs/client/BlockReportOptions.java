package org.apache.hadoop.hdfs.client;

import java.net.InetSocketAddress;

/**
 * Options that can be specified when manually triggering a block report.
 */
public final class BlockReportOptions {
  private final boolean incremental;
  private final InetSocketAddress namenodeAddr;

  private BlockReportOptions(boolean incremental, InetSocketAddress namenodeAddr) {
    this.incremental = incremental;
    this.namenodeAddr = namenodeAddr;
  }

  public boolean isIncremental() {
    return incremental;
  }

  public InetSocketAddress getNamenodeAddr() {
    return namenodeAddr;
  }

  public static class Factory {
    private boolean incremental = false;
    private InetSocketAddress namenodeAddr;

    public Factory() {
    }

    public Factory setIncremental(boolean incremental) {
      this.incremental = incremental;
      return this;
    }

    public Factory setNamenodeAddr(InetSocketAddress namenodeAddr) {
      this.namenodeAddr = namenodeAddr;
      return this;
    }

    public BlockReportOptions build() {
      return new BlockReportOptions(incremental, namenodeAddr);
    }
  }

  @Override
  public String toString() {
    return "BlockReportOptions{incremental=" + incremental + ", namenodeAddr=" + namenodeAddr + "}";
  }
}
