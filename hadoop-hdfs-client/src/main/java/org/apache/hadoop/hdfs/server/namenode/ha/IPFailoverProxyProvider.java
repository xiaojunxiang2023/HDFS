package org.apache.hadoop.hdfs.server.namenode.ha;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.DFSUtilClient;
import org.apache.hadoop.ipc.RPC;

import java.io.Closeable;
import java.io.IOException;
import java.net.URI;

/**
 * A NNFailoverProxyProvider implementation which works on IP failover setup.
 * Only one proxy is used to connect to both servers and switching between
 * the servers is done by the environment/infrastructure, which guarantees
 * clients can consistently reach only one node at a time.
 *
 * Clients with a live connection will likely get connection reset after an
 * IP failover. This case will be handled by the
 * FailoverOnNetworkExceptionRetry retry policy. I.e. if the call is
 * not idempotent, it won't get retried.
 *
 * A connection reset while setting up a connection (i.e. before sending a
 * request) will be handled in ipc client.
 *
 * The namenode URI must contain a resolvable host name.
 */
public class IPFailoverProxyProvider<T> extends
    AbstractNNFailoverProxyProvider<T> {
  private final NNProxyInfo<T> nnProxyInfo;

  public IPFailoverProxyProvider(Configuration conf, URI uri,
                                 Class<T> xface, HAProxyFactory<T> factory) {
    super(conf, uri, xface, factory);
    this.nnProxyInfo = new NNProxyInfo<>(DFSUtilClient.getNNAddress(uri));
  }

  @Override
  public synchronized NNProxyInfo<T> getProxy() {
    // Create a non-ha proxy if not already created.
    return createProxyIfNeeded(nnProxyInfo);
  }

  /** Nothing to do for IP failover */
  @Override
  public void performFailover(T currentProxy) {
  }

  /**
   * Close the proxy,
   */
  @Override
  public synchronized void close() throws IOException {
    if (nnProxyInfo.proxy == null) {
      return;
    }
    if (nnProxyInfo.proxy instanceof Closeable) {
      ((Closeable) nnProxyInfo.proxy).close();
    } else {
      RPC.stopProxy(nnProxyInfo.proxy);
    }
  }

  /**
   * Logical URI is not used for IP failover.
   */
  @Override
  public boolean useLogicalURI() {
    return false;
  }
}
