package org.apache.hadoop.ipc;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.retry.RetryPolicy;
import org.apache.hadoop.ipc.Client.ConnectionId;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.security.token.SecretManager;
import org.apache.hadoop.security.token.TokenIdentifier;

import javax.net.SocketFactory;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.atomic.AtomicBoolean;

/** An RPC implementation. */
public interface RpcEngine {

  /** Construct a client-side proxy object. 
   * @param <T>*/
  <T> ProtocolProxy<T> getProxy(Class<T> protocol,
                                long clientVersion, InetSocketAddress addr,
                                UserGroupInformation ticket, Configuration conf,
                                SocketFactory factory, int rpcTimeout,
                                RetryPolicy connectionRetryPolicy) throws IOException;

  /** Construct a client-side proxy object. */
  <T> ProtocolProxy<T> getProxy(Class<T> protocol,
                                long clientVersion, InetSocketAddress addr,
                                UserGroupInformation ticket, Configuration conf,
                                SocketFactory factory, int rpcTimeout,
                                RetryPolicy connectionRetryPolicy,
                                AtomicBoolean fallbackToSimpleAuth,
                                AlignmentContext alignmentContext) throws IOException;

  /**
   * Construct a server for a protocol implementation instance.
   *
   * @param protocol the class of protocol to use
   * @param instance the instance of protocol whose methods will be called
   * @param conf the configuration to use
   * @param bindAddress the address to bind on to listen for connection
   * @param port the port to listen for connections on
   * @param numHandlers the number of method handler threads to run
   * @param numReaders the number of reader threads to run
   * @param queueSizePerHandler the size of the queue per hander thread
   * @param verbose whether each call should be logged
   * @param secretManager The secret manager to use to validate incoming requests.
   * @param portRangeConfig A config parameter that can be used to restrict
   *        the range of ports used when port is 0 (an ephemeral port)
   * @param alignmentContext provides server state info on client responses
   * @return The Server instance
   * @throws IOException on any error
   */
  RPC.Server getServer(Class<?> protocol, Object instance, String bindAddress,
                       int port, int numHandlers, int numReaders,
                       int queueSizePerHandler, boolean verbose,
                       Configuration conf,
                       SecretManager<? extends TokenIdentifier> secretManager,
                       String portRangeConfig,
                       AlignmentContext alignmentContext) throws IOException;

  /**
   * Returns a proxy for ProtocolMetaInfoPB, which uses the given connection
   * id.
   * @param connId, ConnectionId to be used for the proxy.
   * @param conf, Configuration.
   * @param factory, Socket factory.
   * @return Proxy object.
   * @throws IOException
   */
  ProtocolProxy<ProtocolMetaInfoPB> getProtocolMetaInfoProxy(
      ConnectionId connId, Configuration conf, SocketFactory factory)
      throws IOException;
}
