package org.apache.hadoop.net;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.ReflectionUtils;

import java.io.IOException;
import java.net.URI;

/**
 * This class creates the DomainNameResolver instance based on the config.
 * It can either create the default resolver for the whole resolving for
 * hadoop or create individual resolver per nameservice or yarn.
 */
public final class DomainNameResolverFactory {

  private DomainNameResolverFactory() {
    // Utility classes should not have a public or default constructor
  }

  /**
   * Create a domain name resolver to convert the domain name in the config to
   * the actual IP addresses of the Namenode/Router/RM.
   *
   * @param conf Configuration to get the resolver from.
   * @param uri the url that the resolver will be used against
   * @param configKey The config key name suffixed with
   *                  the nameservice/yarnservice.
   * @return Domain name resolver.
   */
  public static DomainNameResolver newInstance(
      Configuration conf, URI uri, String configKey) throws IOException {
    String host = uri.getHost();
    String confKeyWithHost = configKey + "." + host;
    return newInstance(conf, confKeyWithHost);
  }

  /**
   * This function gets the instance based on the config.
   *
   * @param conf Configuration
   * @param configKey config key name.
   * @return Domain name resolver.
   * @throws IOException when the class cannot be found or initiated.
   */
  public static DomainNameResolver newInstance(
      Configuration conf, String configKey) {
    Class<? extends DomainNameResolver> resolverClass = conf.getClass(
        configKey,
        DNSDomainNameResolver.class,
        DomainNameResolver.class);
    return ReflectionUtils.newInstance(resolverClass, conf);
  }
}
