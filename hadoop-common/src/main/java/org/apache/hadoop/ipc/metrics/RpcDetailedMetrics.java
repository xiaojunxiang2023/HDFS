package org.apache.hadoop.ipc.metrics;

import org.apache.hadoop.metrics2.annotation.Metric;
import org.apache.hadoop.metrics2.annotation.Metrics;
import org.apache.hadoop.metrics2.lib.DefaultMetricsSystem;
import org.apache.hadoop.metrics2.lib.MetricsRegistry;
import org.apache.hadoop.metrics2.lib.MutableRatesWithAggregation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * This class is for maintaining RPC method related statistics
 * and publishing them through the metrics interfaces.
 */
@Metrics(about = "Per method RPC metrics", context = "rpcdetailed")
public class RpcDetailedMetrics {

  @Metric
  MutableRatesWithAggregation rates;
  @Metric
  MutableRatesWithAggregation deferredRpcRates;

  static final Logger LOG = LoggerFactory.getLogger(RpcDetailedMetrics.class);
  final MetricsRegistry registry;
  final String name;

  RpcDetailedMetrics(int port) {
    name = "RpcDetailedActivityForPort" + port;
    registry = new MetricsRegistry("rpcdetailed")
        .tag("port", "RPC port", String.valueOf(port));
    LOG.debug(registry.info().toString());
  }

  public String name() {
    return name;
  }

  public static RpcDetailedMetrics create(int port) {
    RpcDetailedMetrics m = new RpcDetailedMetrics(port);
    return DefaultMetricsSystem.instance().register(m.name, null, m);
  }

  /**
   * Initialize the metrics for JMX with protocol methods
   * @param protocol the protocol class
   */
  public void init(Class<?> protocol) {
    rates.init(protocol);
    deferredRpcRates.init(protocol, "Deferred");
  }

  /**
   * Add an RPC processing time sample
   * @param rpcCallName of the RPC call
   * @param processingTime  the processing time
   */
  //@Override // some instrumentation interface
  public void addProcessingTime(String rpcCallName, long processingTime) {
    rates.add(rpcCallName, processingTime);
  }

  public void addDeferredProcessingTime(String name, long processingTime) {
    deferredRpcRates.add(name, processingTime);
  }

  /**
   * Shutdown the instrumentation for the process
   */
  //@Override // some instrumentation interface
  public void shutdown() {
    DefaultMetricsSystem.instance().unregisterSource(name);
  }
}
