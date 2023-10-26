package org.apache.hadoop.ha;
import org.apache.hadoop.ha.HAServiceProtocol.HAServiceState;
public class HAServiceStatus {
  private HAServiceState state;
  private boolean readyToBecomeActive;
  private String notReadyReason;
  
  public HAServiceStatus(HAServiceState state) {
    this.state = state;
  }

  public HAServiceState getState() {
    return state;
  }

  public HAServiceStatus setReadyToBecomeActive() {
    this.readyToBecomeActive = true;
    this.notReadyReason = null;
    return this;
  }
  
  public HAServiceStatus setNotReadyToBecomeActive(String reason) {
    this.readyToBecomeActive = false;
    this.notReadyReason = reason;
    return this;
  }

  public boolean isReadyToBecomeActive() {
    return readyToBecomeActive;
  }

  public String getNotReadyReason() {
    return notReadyReason;
  }
}
