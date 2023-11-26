package org.apache.hadoop.net;

import java.net.SocketTimeoutException;

/**
 * Thrown by {@link NetUtils#connect(java.net.Socket, java.net.SocketAddress, int)}
 * if it times out while connecting to the remote host.
 */
public class ConnectTimeoutException extends SocketTimeoutException {
  private static final long serialVersionUID = 1L;

  public ConnectTimeoutException(String msg) {
    super(msg);
  }
}
