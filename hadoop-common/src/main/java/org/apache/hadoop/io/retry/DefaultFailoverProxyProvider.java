package org.apache.hadoop.io.retry;

import org.apache.hadoop.ipc.RPC;

import java.io.IOException;

/**
 * An implementation of {@link FailoverProxyProvider} which does nothing in the
 * event of failover, and always returns the same proxy object. 
 */
public class DefaultFailoverProxyProvider<T> implements FailoverProxyProvider<T> {

  private T proxy;
  private Class<T> iface;

  public DefaultFailoverProxyProvider(Class<T> iface, T proxy) {
    this.proxy = proxy;
    this.iface = iface;
  }

  @Override
  public Class<T> getInterface() {
    return iface;
  }

  @Override
  public ProxyInfo<T> getProxy() {
    return new ProxyInfo<T>(proxy, null);
  }

  @Override
  public void performFailover(T currentProxy) {
    // Nothing to do.
  }

  @Override
  public void close() throws IOException {
    RPC.stopProxy(proxy);
  }

}
