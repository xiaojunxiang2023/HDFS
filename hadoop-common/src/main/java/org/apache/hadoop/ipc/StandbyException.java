package org.apache.hadoop.ipc;

import java.io.IOException;

/**
 * Thrown by a remote server when it is up, but is not the active server in a
 * set of servers in which only a subset may be active.
 */
public class StandbyException extends IOException {
  static final long serialVersionUID = 0x12308AD010L;

  public StandbyException(String msg) {
    super(msg);
  }
}
