package org.apache.hadoop.hdfs.qjournal.server;

import java.io.IOException;

/**
 * Used for injecting faults in QuorumJournalManager tests.
 * Calls into this are a no-op in production code. 
 */

public class JournalFaultInjector {
  public static JournalFaultInjector instance = new JournalFaultInjector();

  public static JournalFaultInjector get() {
    return instance;
  }

  public void beforePersistPaxosData() throws IOException {
  }

  public void afterPersistPaxosData() throws IOException {
  }
}
