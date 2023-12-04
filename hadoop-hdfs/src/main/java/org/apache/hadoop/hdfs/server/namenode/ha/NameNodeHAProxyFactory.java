package org.apache.hadoop.hdfs.server.namenode.ha;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.NameNodeProxies;
import org.apache.hadoop.ipc.AlignmentContext;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicBoolean;

public class NameNodeHAProxyFactory<T> implements HAProxyFactory<T> {

  private AlignmentContext alignmentContext;

  @Override
  public T createProxy(Configuration conf, InetSocketAddress nnAddr,
                       Class<T> xface, UserGroupInformation ugi, boolean withRetries,
                       AtomicBoolean fallbackToSimpleAuth) throws IOException {
    return NameNodeProxies.createNonHAProxy(conf, nnAddr, xface,
        ugi, withRetries, fallbackToSimpleAuth, alignmentContext).getProxy();
  }

  @Override
  public T createProxy(Configuration conf, InetSocketAddress nnAddr,
                       Class<T> xface, UserGroupInformation ugi, boolean withRetries)
      throws IOException {
    return NameNodeProxies.createNonHAProxy(conf, nnAddr, xface,
        ugi, withRetries).getProxy();
  }

  public void setAlignmentContext(AlignmentContext alignmentContext) {
    this.alignmentContext = alignmentContext;
  }
}
