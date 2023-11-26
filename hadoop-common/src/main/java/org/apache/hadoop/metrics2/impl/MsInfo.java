package org.apache.hadoop.metrics2.impl;
import org.apache.hadoop.metrics2.MetricsInfo;

import java.util.StringJoiner;

/**
 * Metrics system related metrics info instances
 */
public enum MsInfo implements MetricsInfo {
  NumActiveSources("Number of active metrics sources"),
  NumAllSources("Number of all registered metrics sources"),
  NumActiveSinks("Number of active metrics sinks"),
  NumAllSinks("Number of all registered metrics sinks"),
  Context("Metrics context"),
  Hostname("Local hostname"),
  SessionId("Session ID"),
  ProcessName("Process name");

  private final String desc;

  MsInfo(String desc) {
    this.desc = desc;
  }

  @Override public String description() {
    return desc;
  }

  @Override public String toString() {
    return new StringJoiner(", ", this.getClass().getSimpleName() + "{", "}")
        .add("name=" + name())
        .add("description=" + desc)
        .toString();
  }
}
