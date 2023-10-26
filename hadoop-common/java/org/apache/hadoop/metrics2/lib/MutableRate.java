package org.apache.hadoop.metrics2.lib;

/**
 * A convenient mutable metric for throughput measurement
 */
public class MutableRate extends MutableStat {

  MutableRate(String name, String description, boolean extended) {
    super(name, description, "Ops", "Time", extended);
  }
}
