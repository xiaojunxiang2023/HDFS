package org.apache.hadoop.metrics2;

import org.apache.commons.configuration2.SubsetConfiguration;
import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * The plugin interface for the metrics framework
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface MetricsPlugin {
  /**
   * Initialize the plugin
   * @param conf  the configuration object for the plugin
   */
  void init(SubsetConfiguration conf);
}
