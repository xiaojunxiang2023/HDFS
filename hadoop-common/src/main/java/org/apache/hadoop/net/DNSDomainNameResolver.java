package org.apache.hadoop.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * DNSDomainNameResolver wraps up the default DNS service for forward/reverse
 * DNS lookup. It also provides a function to resolve a host name to all of
 * fully qualified domain names belonging to the IPs from this host name
 */
public class DNSDomainNameResolver implements DomainNameResolver {
  @Override
  public InetAddress[] getAllByDomainName(String domainName)
      throws UnknownHostException {
    return InetAddress.getAllByName(domainName);
  }

  @Override
  public String getHostnameByIP(InetAddress address) {
    String host = address.getCanonicalHostName();
    if (host != null && host.length() != 0
        && host.charAt(host.length()-1) == '.') {
      host = host.substring(0, host.length()-1);
    }
    return host;
  }

  @Override
  public String[] getAllResolvedHostnameByDomainName(
      String domainName, boolean useFQDN) throws UnknownHostException {
    InetAddress[] addresses = getAllByDomainName(domainName);
    String[] hosts = new String[addresses.length];
    if (useFQDN) {
      for (int i = 0; i < addresses.length; i++) {
        hosts[i] = getHostnameByIP(addresses[i]);
      }
    } else {
      for (int i = 0; i < addresses.length; i++) {
        hosts[i] = addresses[i].getHostAddress();
      }
    }

    return hosts;
  }
}
