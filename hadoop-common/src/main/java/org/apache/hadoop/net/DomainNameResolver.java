package org.apache.hadoop.net;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * This interface provides methods for the failover proxy to get IP addresses
 * of the associated servers (NameNodes, RBF routers etc). Implementations will
 * use their own service discovery mechanism, DNS, Zookeeper etc
 */
public interface DomainNameResolver {
  /**
   * Takes one domain name and returns its IP addresses based on the actual
   * service discovery methods.
   *
   * @param domainName
   * @return all IP addresses
   * @throws UnknownHostException
   */
  InetAddress[] getAllByDomainName(String domainName)
      throws UnknownHostException;

  /**
   * Reverse lookup an IP address and get the fully qualified domain name(fqdn).
   *
   * @param address
   * @return fully qualified domain name
   */
  String getHostnameByIP(InetAddress address);

  /**
   * This function combines getAllByDomainName and getHostnameByIP, for a single
   * domain name, it will first do a forward lookup to get all of IP addresses,
   * then for each IP address, it will do a reverse lookup to get the fqdn.
   * This function is necessary in secure environment since Kerberos uses fqdn
   * in the service principal instead of IP.
   *
   * @param domainName
   * @return all fully qualified domain names belonging to the IPs resolved from
   * the input domainName
   * @throws UnknownHostException
   */
  String[] getAllResolvedHostnameByDomainName(
      String domainName, boolean useFQDN) throws UnknownHostException;
}
