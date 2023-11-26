package org.apache.hadoop.hdfs.server.namenode.ha;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.NameNodeProxiesClient;
import org.apache.hadoop.ipc.AlignmentContext;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicBoolean;

public class ClientHAProxyFactory<T> implements HAProxyFactory<T> {

  private AlignmentContext alignmentContext;

  public void setAlignmentContext(AlignmentContext alignmentContext) {
    this.alignmentContext = alignmentContext;
  }

  @Override
  @SuppressWarnings("unchecked")
  public T createProxy(Configuration conf, InetSocketAddress nnAddr,
      Class<T> xface, UserGroupInformation ugi, boolean withRetries,
      AtomicBoolean fallbackToSimpleAuth) throws IOException {
    if (alignmentContext != null) {
      return (T) NameNodeProxiesClient.createProxyWithAlignmentContext(
        nnAddr, conf, ugi, false, fallbackToSimpleAuth, alignmentContext);
    }
    return (T) NameNodeProxiesClient.createNonHAProxyWithClientProtocol(
      nnAddr, conf, ugi, false, fallbackToSimpleAuth);
  }

  @Override
  public T createProxy(Configuration conf, InetSocketAddress nnAddr,
      Class<T> xface, UserGroupInformation ugi, boolean withRetries)
      throws IOException {
    return createProxy(conf, nnAddr, xface, ugi, withRetries, null);
  }
}
