package org.apache.hadoop.ipc;

public interface FairCallQueueMXBean {
  // Get the size of each subqueue, the index corresponding to the priority
  // level.
  int[] getQueueSizes();
  long[] getOverflowedCalls();
  int getRevision();
}