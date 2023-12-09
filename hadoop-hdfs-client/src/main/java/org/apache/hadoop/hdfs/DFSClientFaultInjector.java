package org.apache.hadoop.hdfs;

import java.util.concurrent.atomic.AtomicLong;

/**
 * Used for injecting faults in DFSClient and DFSOutputStream tests.
 * Calls into this are a no-op in production code.
 */

public class DFSClientFaultInjector {
  private static DFSClientFaultInjector instance = new DFSClientFaultInjector();
  public static AtomicLong exceptionNum = new AtomicLong(0);

  public static DFSClientFaultInjector get() {
    return instance;
  }

  public static void set(DFSClientFaultInjector instance) {
    DFSClientFaultInjector.instance = instance;
  }

  public boolean corruptPacket() {
    return false;
  }

  public boolean uncorruptPacket() {
    return false;
  }

  public boolean failPacket() {
    return false;
  }

  public void startFetchFromDatanode() {
  }

  public void fetchFromDatanodeException() {
  }

  public void readFromDatanodeDelay() {
  }

  public boolean skipRollingRestartWait() {
    return false;
  }

  public void sleepBeforeHedgedGet() {
  }

  public void delayWhenRenewLeaseTimeout() {
  }
}
