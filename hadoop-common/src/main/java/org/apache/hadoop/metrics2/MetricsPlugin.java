package org.apache.hadoop.metrics2;

import org.apache.commons.configuration2.SubsetConfiguration;

/**
 * The plugin interface for the metrics framework
 */
public interface MetricsPlugin {
  /**
   * Initialize the plugin
   * @param conf  the configuration object for the plugin
   */
  void init(SubsetConfiguration conf);
}
