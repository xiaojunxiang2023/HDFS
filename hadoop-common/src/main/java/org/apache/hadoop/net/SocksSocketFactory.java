package org.apache.hadoop.net;

import org.apache.hadoop.conf.Configurable;
import org.apache.hadoop.conf.Configuration;

import javax.net.SocketFactory;
import java.io.IOException;
import java.net.*;

import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.HADOOP_SOCKS_SERVER_KEY;

/**
 * Specialized SocketFactory to create sockets with a SOCKS proxy
 */
public class SocksSocketFactory extends SocketFactory implements
    Configurable {

  private Configuration conf;

  private Proxy proxy;

  /**
   * Default empty constructor (for use with the reflection API).
   */
  public SocksSocketFactory() {
    this.proxy = Proxy.NO_PROXY;
  }

  /**
   * Constructor with a supplied Proxy
   *
   * @param proxy the proxy to use to create sockets
   */
  public SocksSocketFactory(Proxy proxy) {
    this.proxy = proxy;
  }

  @Override
  public Socket createSocket() throws IOException {

    return new Socket(proxy);
  }

  @Override
  public Socket createSocket(InetAddress addr, int port) throws IOException {

    Socket socket = createSocket();
    socket.connect(new InetSocketAddress(addr, port));
    return socket;
  }

  @Override
  public Socket createSocket(InetAddress addr, int port,
                             InetAddress localHostAddr, int localPort) throws IOException {

    Socket socket = createSocket();
    socket.bind(new InetSocketAddress(localHostAddr, localPort));
    socket.connect(new InetSocketAddress(addr, port));
    return socket;
  }

  @Override
  public Socket createSocket(String host, int port) throws IOException,
      UnknownHostException {

    Socket socket = createSocket();
    socket.connect(new InetSocketAddress(host, port));
    return socket;
  }

  @Override
  public Socket createSocket(String host, int port,
                             InetAddress localHostAddr, int localPort) throws IOException,
      UnknownHostException {

    Socket socket = createSocket();
    socket.bind(new InetSocketAddress(localHostAddr, localPort));
    socket.connect(new InetSocketAddress(host, port));
    return socket;
  }

  @Override
  public int hashCode() {
    return proxy.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (!(obj instanceof SocksSocketFactory))
      return false;
    final SocksSocketFactory other = (SocksSocketFactory) obj;
    if (proxy == null) {
      if (other.proxy != null)
        return false;
    } else if (!proxy.equals(other.proxy))
      return false;
    return true;
  }

  @Override
  public Configuration getConf() {
    return this.conf;
  }

  @Override
  public void setConf(Configuration conf) {
    this.conf = conf;
    String proxyStr = conf.get(HADOOP_SOCKS_SERVER_KEY);
    if ((proxyStr != null) && (proxyStr.length() > 0)) {
      setProxy(proxyStr);
    }
  }

  /**
   * Set the proxy of this socket factory as described in the string
   * parameter
   *
   * @param proxyStr the proxy address using the format "host:port"
   */
  private void setProxy(String proxyStr) {
    String[] strs = proxyStr.split(":", 2);
    if (strs.length != 2)
      throw new RuntimeException("Bad SOCKS proxy parameter: " + proxyStr);
    String host = strs[0];
    int port = Integer.parseInt(strs[1]);
    this.proxy =
        new Proxy(Proxy.Type.SOCKS, InetSocketAddress.createUnresolved(host,
            port));
  }
}
