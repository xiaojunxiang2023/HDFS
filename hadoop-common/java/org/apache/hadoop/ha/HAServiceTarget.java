package org.apache.hadoop.ha;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Map;

import javax.net.SocketFactory;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeysPublic;
import org.apache.hadoop.ha.fence.NodeFencer;
import org.apache.hadoop.ha.micro.BadFencingConfigurationException;
import org.apache.hadoop.ha.protocolPB.HAServiceProtocolClientSideTranslatorPB;
import org.apache.hadoop.ha.protocolPB.ZKFCProtocolClientSideTranslatorPB;
import org.apache.hadoop.net.NetUtils;

import org.apache.hadoop.thirdparty.com.google.common.collect.Maps;

public abstract class HAServiceTarget {

  private static final String HOST_SUBST_KEY = "host";
  private static final String PORT_SUBST_KEY = "port";
  private static final String ADDRESS_SUBST_KEY = "address";

  private HAServiceProtocol.HAServiceState transitionTargetHAStatus;

  public abstract InetSocketAddress getAddress();

  public InetSocketAddress getHealthMonitorAddress() {
    return null;
  }

  public abstract InetSocketAddress getZKFCAddress();

  public abstract NodeFencer getFencer();
  
  public abstract void checkFencingConfigured() throws BadFencingConfigurationException;
  
  public HAServiceProtocol getProxy(Configuration conf, int timeoutMs)
      throws IOException {
    return getProxyForAddress(conf, timeoutMs, getAddress());
  }

  public void setTransitionTargetHAStatus(
      HAServiceProtocol.HAServiceState status) {
    this.transitionTargetHAStatus = status;
  }

  public HAServiceProtocol.HAServiceState getTransitionTargetHAStatus() {
    return this.transitionTargetHAStatus;
  }

  public HAServiceProtocol getHealthMonitorProxy(Configuration conf,
      int timeoutMs, int retries) throws IOException {
    InetSocketAddress addr = getHealthMonitorAddress();
    if (addr == null) {
      addr = getAddress();
    }
    return getProxyForAddress(conf, timeoutMs, retries, addr);
  }

  private HAServiceProtocol getProxyForAddress(Configuration conf,
      int timeoutMs, InetSocketAddress addr) throws IOException {
    // Lower the timeout by setting retries to 1, so we quickly fail to connect
    return getProxyForAddress(conf, timeoutMs, 1, addr);
  }

  private HAServiceProtocol getProxyForAddress(Configuration conf,
      int timeoutMs, int retries, InetSocketAddress addr) throws IOException {
    Configuration confCopy = new Configuration(conf);
    confCopy.setInt(
        CommonConfigurationKeysPublic.IPC_CLIENT_CONNECT_MAX_RETRIES_KEY,
        retries);
    SocketFactory factory = NetUtils.getDefaultSocketFactory(confCopy);
    return new HAServiceProtocolClientSideTranslatorPB(
        addr,
        confCopy, factory, timeoutMs);
  }

  /**
   * @return a proxy to the ZKFC which is associated with this HA service.
   */
  public ZKFCProtocol getZKFCProxy(Configuration conf, int timeoutMs)
      throws IOException {
    Configuration confCopy = new Configuration(conf);
    // Lower the timeout so we quickly fail to connect
    confCopy.setInt(CommonConfigurationKeysPublic.IPC_CLIENT_CONNECT_MAX_RETRIES_KEY, 1);
    SocketFactory factory = NetUtils.getDefaultSocketFactory(confCopy);
    return new ZKFCProtocolClientSideTranslatorPB(
        getZKFCAddress(),
        confCopy, factory, timeoutMs);
  }
  
  public final Map<String, String> getFencingParameters() {
    Map<String, String> ret = Maps.newHashMap();
    addFencingParameters(ret);
    return ret;
  }
  
  /**
   * Hook to allow subclasses to add any parameters they would like to
   * expose to fencing implementations/scripts. Fencing methods are free
   * to use this map as they see fit -- notably, the shell script
   * implementation takes each entry, prepends 'target_', substitutes
   * '_' for '.', and adds it to the environment of the script.
   *
   * Subclass implementations should be sure to delegate to the superclass
   * implementation as well as adding their own keys.
   *
   * @param ret map which can be mutated to pass parameters to the fencer
   */
  protected void addFencingParameters(Map<String, String> ret) {
    ret.put(ADDRESS_SUBST_KEY, String.valueOf(getAddress()));
    ret.put(HOST_SUBST_KEY, getAddress().getHostName());
    ret.put(PORT_SUBST_KEY, String.valueOf(getAddress().getPort()));
  }

  /**
   * @return true if auto failover should be considered enabled
   */
  public boolean isAutoFailoverEnabled() {
    return false;
  }

  /**
   * @return true if this target supports the Observer state, false otherwise.
   */
  public boolean supportObserver() {
    return false;
  }
}
