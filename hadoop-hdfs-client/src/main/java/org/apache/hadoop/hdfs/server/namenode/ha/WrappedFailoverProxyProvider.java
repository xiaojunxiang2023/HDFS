package org.apache.hadoop.hdfs.server.namenode.ha;

import org.apache.hadoop.io.retry.FailoverProxyProvider;

import java.io.IOException;

/**
 * A NNFailoverProxyProvider implementation which wrapps old implementations
 * directly implementing the {@link FailoverProxyProvider} interface.
 *
 * It is assumed that the old impelmentation is using logical URI.
 */
public class WrappedFailoverProxyProvider<T> extends
    AbstractNNFailoverProxyProvider<T> {
  private final FailoverProxyProvider<T> proxyProvider;

  /**
   * Wrap the given instance of an old FailoverProxyProvider.
   */
  public WrappedFailoverProxyProvider(FailoverProxyProvider<T> provider) {
    proxyProvider = provider;
  }

  @Override
  public Class<T> getInterface() {
    return proxyProvider.getInterface();
  }

  @Override
  public synchronized ProxyInfo<T> getProxy() {
    return proxyProvider.getProxy();
  }

  @Override
  public void performFailover(T currentProxy) {
    proxyProvider.performFailover(currentProxy);
  }

  /**
   * Close the proxy,
   */
  @Override
  public synchronized void close() throws IOException {
    proxyProvider.close();
  }

  /**
   * Assume logical URI is used for old proxy provider implementations.
   */
  @Override
  public boolean useLogicalURI() {
    return true;
  }
}
