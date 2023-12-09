package org.apache.hadoop.ipc.metrics;

import org.apache.hadoop.metrics2.annotation.Metric;
import org.apache.hadoop.metrics2.annotation.Metrics;
import org.apache.hadoop.metrics2.lib.DefaultMetricsSystem;
import org.apache.hadoop.metrics2.lib.MetricsRegistry;
import org.apache.hadoop.metrics2.lib.MutableRatesWithAggregation;
import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is for maintaining queue (priority) level related
 * statistics when FairCallQueue is used and publishing them
 * through the metrics interface.
 */
@Metrics(about = "Per queue(priority) metrics",
    context = "decayrpcschedulerdetailed")
public class DecayRpcSchedulerDetailedMetrics {

  @Metric
  private MutableRatesWithAggregation rpcQueueRates;
  @Metric
  private MutableRatesWithAggregation rpcProcessingRates;

  private static final Logger LOG =
      LoggerFactory.getLogger(DecayRpcSchedulerDetailedMetrics.class);
  private final MetricsRegistry registry;
  private final String name;
  private String[] queueNamesForLevels;
  private String[] processingNamesForLevels;

  DecayRpcSchedulerDetailedMetrics(String ns) {
    name = "DecayRpcSchedulerDetailedMetrics." + ns;
    registry = new MetricsRegistry("decayrpcschedulerdetailed")
        .tag("port", "RPC port", String.valueOf(ns));
    LOG.debug(registry.info().toString());
  }

  public static DecayRpcSchedulerDetailedMetrics create(String ns) {
    DecayRpcSchedulerDetailedMetrics m =
        new DecayRpcSchedulerDetailedMetrics(ns);
    return DefaultMetricsSystem.instance().register(m.name, null, m);
  }

  /**
   * Initialize the metrics for JMX with priority levels.
   */
  public void init(int numLevels) {
    LOG.info("Initializing RPC stats for {} priority levels", numLevels);
    queueNamesForLevels = new String[numLevels];
    processingNamesForLevels = new String[numLevels];
    for (int i = 0; i < numLevels; i++) {
      queueNamesForLevels[i] = getQueueName(i + 1);
      processingNamesForLevels[i] = getProcessingName(i + 1);
    }
    rpcQueueRates.init(queueNamesForLevels);
    rpcProcessingRates.init(processingNamesForLevels);
  }

  /**
   * Instrument a Call queue time based on its priority.
   *
   * @param priority of the RPC call
   * @param queueTime of the RPC call in the queue of the priority
   */
  public void addQueueTime(int priority, long queueTime) {
    rpcQueueRates.add(queueNamesForLevels[priority], queueTime);
  }

  /**
   * Instrument a Call processing time based on its priority.
   *
   * @param priority of the RPC call
   * @param processingTime of the RPC call in the queue of the priority
   */
  public void addProcessingTime(int priority, long processingTime) {
    rpcProcessingRates.add(processingNamesForLevels[priority], processingTime);
  }

  /**
   * Shutdown the instrumentation process.
   */
  public void shutdown() {
    DefaultMetricsSystem.instance().unregisterSource(name);
  }

  /**
   * Returns the rate name inside the metric.
   */
  public String getQueueName(int priority) {
    return "DecayRPCSchedulerPriority." + priority + ".RpcQueueTime";
  }

  /**
   * Returns the rate name inside the metric.
   */
  public String getProcessingName(int priority) {
    return "DecayRPCSchedulerPriority." + priority + ".RpcProcessingTime";
  }

  public String getName() {
    return name;
  }

  
  MutableRatesWithAggregation getRpcQueueRates() {
    return rpcQueueRates;
  }

  
  MutableRatesWithAggregation getRpcProcessingRates() {
    return rpcProcessingRates;
  }
}
