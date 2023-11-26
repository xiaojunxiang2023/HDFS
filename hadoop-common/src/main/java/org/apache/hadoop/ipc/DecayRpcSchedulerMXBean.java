package org.apache.hadoop.ipc;

/**
 * Provides metrics for Decay scheduler.
 */
public interface DecayRpcSchedulerMXBean {
  // Get an overview of the requests in history.
  String getSchedulingDecisionSummary();
  String getCallVolumeSummary();
  int getUniqueIdentityCount();
  long getTotalCallVolume();
  double[] getAverageResponseTime();
  long[] getResponseTimeCountInLastWindow();
}