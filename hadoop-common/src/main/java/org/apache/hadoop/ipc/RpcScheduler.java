package org.apache.hadoop.ipc;

import org.apache.hadoop.ipc.metrics.RpcMetrics;

/**
 * Implement this interface to be used for RPC scheduling and backoff.
 *
 */
public interface RpcScheduler {
  /**
   * Returns priority level greater than zero as a hint for scheduling.
   */
  int getPriorityLevel(Schedulable obj);

  boolean shouldBackOff(Schedulable obj);

  /**
   * This method only exists to maintain backwards compatibility with old
   * implementations. It will not be called by any Hadoop code, and should not
   * be implemented by new implementations.
   *
   * @deprecated Use
   * {@link #addResponseTime(String, Schedulable, ProcessingDetails)} instead.
   */
  @Deprecated
  @SuppressWarnings("unused")
  default void addResponseTime(String name, int priorityLevel, int queueTime,
                               int processingTime) {
    throw new UnsupportedOperationException(
        "This method is deprecated: use the other addResponseTime");
  }

  /**
   * Store a processing time value for an RPC call into this scheduler.
   *
   * @param callName The name of the call.
   * @param schedulable The schedulable representing the incoming call.
   * @param details The details of processing time.
   */
  @SuppressWarnings("deprecation")
  default void addResponseTime(String callName, Schedulable schedulable,
                               ProcessingDetails details) {
    // For the sake of backwards compatibility with old implementations of
    // this interface, a default implementation is supplied which uses the old
    // method. All new implementations MUST override this interface and should
    // NOT use the other addResponseTime method.
    int queueTime = (int) details.get(ProcessingDetails.Timing.QUEUE,
        RpcMetrics.DEFAULT_METRIC_TIME_UNIT);
    int processingTime = (int) details.get(ProcessingDetails.Timing.PROCESSING,
        RpcMetrics.DEFAULT_METRIC_TIME_UNIT);
    addResponseTime(callName, schedulable.getPriorityLevel(),
        queueTime, processingTime);
  }

  void stop();
}
