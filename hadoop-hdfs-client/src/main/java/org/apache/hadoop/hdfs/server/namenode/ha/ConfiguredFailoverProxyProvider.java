package org.apache.hadoop.hdfs.server.namenode.ha;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;
import java.util.List;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.RPC;

import static org.apache.hadoop.hdfs.client.HdfsClientConfigKeys.DFS_NAMENODE_RPC_ADDRESS_KEY;

/**
 * A FailoverProxyProvider implementation which allows one to configure
 * multiple URIs to connect to during fail-over. A random configured address is
 * tried first, and on a fail-over event the other addresses are tried
 * sequentially in a random order.
 */
public class ConfiguredFailoverProxyProvider<T> extends
    AbstractNNFailoverProxyProvider<T> {

  protected final List<NNProxyInfo<T>> proxies;

  private int currentProxyIndex = 0;

  public ConfiguredFailoverProxyProvider(Configuration conf, URI uri,
      Class<T> xface, HAProxyFactory<T> factory) {
    this(conf, uri, xface, factory, DFS_NAMENODE_RPC_ADDRESS_KEY);
  }

  public ConfiguredFailoverProxyProvider(Configuration conf, URI uri,
      Class<T> xface, HAProxyFactory<T> factory, String addressKey) {
    super(conf, uri, xface, factory);
    this.proxies = getProxyAddresses(uri, addressKey);
  }

  /**
   * Lazily initialize the RPC proxy object.
   */
  @Override
  public synchronized ProxyInfo<T> getProxy() {
    NNProxyInfo<T> current = proxies.get(currentProxyIndex);
    return createProxyIfNeeded(current);
  }

  @Override
  public  void performFailover(T currentProxy) {
    incrementProxyIndex();
  }

  synchronized void incrementProxyIndex() {
    currentProxyIndex = (currentProxyIndex + 1) % proxies.size();
  }

  /**
   * Close all the proxy objects which have been opened over the lifetime of
   * this proxy provider.
   */
  @Override
  public synchronized void close() throws IOException {
    for (ProxyInfo<T> proxy : proxies) {
      if (proxy.proxy != null) {
        if (proxy.proxy instanceof Closeable) {
          ((Closeable)proxy.proxy).close();
        } else {
          RPC.stopProxy(proxy.proxy);
        }
      }
    }
  }

  /**
   * Logical URI is required for this failover proxy provider.
   */
  @Override
  public boolean useLogicalURI() {
    return true;
  }
}
