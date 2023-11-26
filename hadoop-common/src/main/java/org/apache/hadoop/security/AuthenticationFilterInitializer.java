package org.apache.hadoop.security;

import org.apache.hadoop.http.HttpServer2;
import org.apache.hadoop.filter.AuthenticationFilter;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.http.FilterContainer;
import org.apache.hadoop.http.FilterInitializer;
import org.apache.hadoop.filter.handler.KerberosAuthenticationHandler;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Initializes hadoop-auth AuthenticationFilter which provides support for
 * Kerberos HTTP SPNEGO authentication.
 * <p>
 * It enables anonymous access, simple/pseudo and Kerberos HTTP SPNEGO
 * authentication  for Hadoop JobTracker, NameNode, DataNodes and
 * TaskTrackers.
 * <p>
 * Refer to the <code>core-default.xml</code> file, after the comment
 * 'HTTP Authentication' for details on the configuration options.
 * All related configuration properties have 'hadoop.http.authentication.'
 * as prefix.
 */
public class AuthenticationFilterInitializer extends FilterInitializer {

  public static final String PREFIX = "hadoop.http.authentication.";

  /**
   * Initializes hadoop-auth AuthenticationFilter.
   * <p>
   * Propagates to hadoop-auth AuthenticationFilter configuration all Hadoop
   * configuration properties prefixed with "hadoop.http.authentication."
   *
   * @param container The filter container
   * @param conf Configuration for run-time parameters
   */
  @Override
  public void initFilter(FilterContainer container, Configuration conf) {
    Map<String, String> filterConfig = getFilterConfigMap(conf, PREFIX);

    container.addFilter("authentication",
                        AuthenticationFilter.class.getName(),
                        filterConfig);
  }

  public static Map<String, String> getFilterConfigMap(Configuration conf,
      String prefix) {
    Map<String, String> filterConfig = new HashMap<String, String>();

    //setting the cookie path to root '/' so it is used for all resources.
    filterConfig.put(AuthenticationFilter.COOKIE_PATH, "/");
    Map<String, String> propsWithPrefix = conf.getPropsWithPrefix(prefix);

    for (Map.Entry<String, String> entry : propsWithPrefix.entrySet()) {
      filterConfig.put(entry.getKey(), entry.getValue());
    }

    //Resolve _HOST into bind address
    String bindAddress = conf.get(HttpServer2.BIND_ADDRESS);
    String principal = filterConfig.get(KerberosAuthenticationHandler.PRINCIPAL);
    if (principal != null) {
      try {
        principal = SecurityUtil.getServerPrincipal(principal, bindAddress);
      }
      catch (IOException ex) {
        throw new RuntimeException("Could not resolve Kerberos principal name: " + ex.toString(), ex);
      }
      filterConfig.put(KerberosAuthenticationHandler.PRINCIPAL, principal);
    }
    return filterConfig;
  }

}
