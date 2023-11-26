package org.apache.hadoop.ipc;

import java.io.Closeable;
import java.lang.reflect.InvocationHandler;

import org.apache.hadoop.ipc.Client.ConnectionId;

/**
 * This interface must be implemented by all InvocationHandler
 * implementations.
 */
public interface RpcInvocationHandler extends InvocationHandler, Closeable {
  
  /**
   * Returns the connection id associated with the InvocationHandler instance.
   * @return ConnectionId
   */
  ConnectionId getConnectionId();
}
