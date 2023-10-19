package org.apache.hadoop.metrics2.lib;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * A convenient mutable metric for throughput measurement
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class MutableRate extends MutableStat {

  MutableRate(String name, String description, boolean extended) {
    super(name, description, "Ops", "Time", extended);
  }
}
