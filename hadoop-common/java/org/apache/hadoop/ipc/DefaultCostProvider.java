package org.apache.hadoop.ipc;

import org.apache.hadoop.conf.Configuration;

/**
 * Ignores process details and returns a constant value for each call.
 */
public class DefaultCostProvider implements CostProvider {

  @Override
  public void init(String namespace, Configuration conf) {
    // No-op
  }

  /**
   * Returns 1, regardless of the processing details.
   *
   * @param details Process details (ignored)
   * @return 1
   */
  @Override
  public long getCost(ProcessingDetails details) {
    return 1;
  }
}
