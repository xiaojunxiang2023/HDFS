package org.apache.hadoop.hdfs.qjournal.server;

import java.io.IOException;

import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;

import org.apache.hadoop.classification.InterfaceAudience;

/**
 * Used for injecting faults in QuorumJournalManager tests.
 * Calls into this are a no-op in production code. 
 */
@VisibleForTesting
@InterfaceAudience.Private
public class JournalFaultInjector {
  public static JournalFaultInjector instance = new JournalFaultInjector();

  public static JournalFaultInjector get() {
    return instance;
  }

  public void beforePersistPaxosData() throws IOException {}
  public void afterPersistPaxosData() throws IOException {}
}
