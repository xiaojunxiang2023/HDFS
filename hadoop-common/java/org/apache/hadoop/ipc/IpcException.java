package org.apache.hadoop.ipc;

import java.io.IOException;

/**
 * IPC exception is thrown by IPC layer when the IPC
 * connection cannot be established.
 */
public class IpcException extends IOException {
  private static final long serialVersionUID = 1L;

  public IpcException(final String err) {
    super(err);
  }
}
