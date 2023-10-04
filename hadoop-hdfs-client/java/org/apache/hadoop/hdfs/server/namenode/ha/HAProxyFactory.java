package org.apache.hadoop.hdfs.server.namenode.ha;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.ipc.AlignmentContext;
import org.apache.hadoop.security.UserGroupInformation;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * This interface aims to decouple the proxy creation implementation that used
 * in {@link AbstractNNFailoverProxyProvider}. Client side can use
 * {@link org.apache.hadoop.hdfs.protocol.ClientProtocol} to initialize the
 * proxy while the server side can use NamenodeProtocols
 */
@InterfaceAudience.Private
public interface HAProxyFactory<T> {

  T createProxy(Configuration conf, InetSocketAddress nnAddr, Class<T> xface,
      UserGroupInformation ugi, boolean withRetries,
      AtomicBoolean fallbackToSimpleAuth) throws IOException;

  T createProxy(Configuration conf, InetSocketAddress nnAddr, Class<T> xface,
      UserGroupInformation ugi, boolean withRetries) throws IOException;

  /**
   * Set the alignment context to be used when creating new proxies using
   * this factory. Not all implementations will use this alignment context.
   */
  default void setAlignmentContext(AlignmentContext alignmentContext) {
    // noop
  }

}
