package org.apache.hadoop.ipc;

import org.apache.hadoop.conf.Configuration;

/**
 * Used by {@link DecayRpcScheduler} to get the cost of users' operations. This
 * is configurable using
 * {@link org.apache.hadoop.fs.CommonConfigurationKeys#IPC_COST_PROVIDER_KEY}.
 */
public interface CostProvider {

  /**
   * Initialize this provider using the given configuration, examining only
   * ones which fall within the provided namespace.
   *
   * @param namespace The namespace to use when looking up configurations.
   * @param conf The configuration
   */
  void init(String namespace, Configuration conf);

  /**
   * Get cost from {@link ProcessingDetails} which will be used in scheduler.
   *
   * @param details Process details
   * @return The cost of the call
   */
  long getCost(ProcessingDetails details);
}
