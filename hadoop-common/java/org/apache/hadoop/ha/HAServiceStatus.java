package org.apache.hadoop.ha;

import org.apache.hadoop.ha.HAServiceProtocol.HAServiceState;

public class HAServiceStatus {
  private final HAServiceState state;
  private boolean readyToBecomeActive;
  private String notReadyReason;
  
  public HAServiceStatus(HAServiceState state) {
    this.state = state;
  }

  public HAServiceState getState() {
    return state;
  }

  public void setReadyToBecomeActive() {
    this.readyToBecomeActive = true;
    this.notReadyReason = null;
  }
  
  public void setNotReadyToBecomeActive(String reason) {
    this.readyToBecomeActive = false;
    this.notReadyReason = reason;
  }

  public boolean isReadyToBecomeActive() {
    return readyToBecomeActive;
  }

  public String getNotReadyReason() {
    return notReadyReason;
  }
}
