package org.apache.hadoop.net;

import java.net.SocketTimeoutException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Thrown by {@link NetUtils#connect(java.net.Socket, java.net.SocketAddress, int)}
 * if it times out while connecting to the remote host.
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public class ConnectTimeoutException extends SocketTimeoutException {
  private static final long serialVersionUID = 1L;

  public ConnectTimeoutException(String msg) {
    super(msg);
  }
}
