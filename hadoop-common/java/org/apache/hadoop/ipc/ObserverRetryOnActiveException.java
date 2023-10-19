package org.apache.hadoop.ipc;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Thrown by a remote ObserverNode indicating the operation has failed and the
 * client should retry active namenode directly (instead of retry other
 * ObserverNodes).
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class ObserverRetryOnActiveException extends StandbyException {
  static final long serialVersionUID = 1L;
  public ObserverRetryOnActiveException(String msg) {
    super(msg);
  }
}
