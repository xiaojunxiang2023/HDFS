package org.apache.hadoop.security.authorize;

import org.apache.hadoop.conf.Configuration;

import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.HashSet;

public class ProxyServers {
  public static final String CONF_HADOOP_PROXYSERVERS = "hadoop.proxyservers";
  private static volatile Collection<String> proxyServers;

  public static void refresh() {
    refresh(new Configuration());
  }

  public static void refresh(Configuration conf) {
    Collection<String> tempServers = new HashSet<String>();
    // trusted proxy servers such as http proxies
    for (String host : conf.getTrimmedStrings(CONF_HADOOP_PROXYSERVERS)) {
      InetSocketAddress addr = new InetSocketAddress(host, 0);
      if (!addr.isUnresolved()) {
        tempServers.add(addr.getAddress().getHostAddress());
      }
    }
    proxyServers = tempServers;
  }

  public static boolean isProxyServer(String remoteAddr) {
    if (proxyServers == null) {
      refresh();
    }
    return proxyServers.contains(remoteAddr);
  }
}
