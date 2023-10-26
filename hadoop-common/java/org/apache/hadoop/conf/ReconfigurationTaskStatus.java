package org.apache.hadoop.conf;
import org.apache.hadoop.conf.ReconfigurationUtil.PropertyChange;

import java.util.Map;
import java.util.Optional;

public class ReconfigurationTaskStatus {
  long startTime;
  long endTime;
  final Map<ReconfigurationUtil.PropertyChange, Optional<String>> status;

  public ReconfigurationTaskStatus(long startTime, long endTime,
      Map<ReconfigurationUtil.PropertyChange, Optional<String>> status) {
    this.startTime = startTime;
    this.endTime = endTime;
    this.status = status;
  }

  /**
   * Return true if
   *   - A reconfiguration task has finished or
   *   - an active reconfiguration task is running
   */
  public boolean hasTask() {
    return startTime > 0;
  }

  /**
   * Return true if the latest reconfiguration task has finished and there is
   * no another active task running.
   */
  public boolean stopped() {
    return endTime > 0;
  }

  public long getStartTime() {
    return startTime;
  }

  public long getEndTime() {
    return endTime;
  }

  public final Map<PropertyChange, Optional<String>> getStatus() {
    return status;
  }
}
