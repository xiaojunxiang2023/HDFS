package org.apache.hadoop.filter;

import java.util.Map;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.http.FilterContainer;
import org.apache.hadoop.http.FilterInitializer;
import org.apache.hadoop.security.AuthenticationFilterInitializer;
import org.apache.hadoop.security.authorize.ProxyUsers;

/**
 * Filter initializer to initialize
 * {@link ProxyUserAuthenticationFilter} which adds support
 * to perform operations using end user instead of proxy user.
 */
public class ProxyUserAuthenticationFilterInitializer
    extends FilterInitializer {

  private String configPrefix;

  public ProxyUserAuthenticationFilterInitializer() {
    this.configPrefix = "hadoop.http.authentication.";
  }

  protected Map<String, String> createFilterConfig(Configuration conf) {
    Map<String, String> filterConfig = AuthenticationFilterInitializer
        .getFilterConfigMap(conf, configPrefix);
    //Add proxy user configs
    for (Map.Entry<String, String> entry : conf.getPropsWithPrefix(
        ProxyUsers.CONF_HADOOP_PROXYUSER).entrySet()) {
      filterConfig.put("proxyuser" + entry.getKey(), entry.getValue());
    }
    return filterConfig;
  }

  @Override
  public void initFilter(FilterContainer container, Configuration conf) {
    Map<String, String> filterConfig = createFilterConfig(conf);
    container.addFilter("ProxyUserAuthenticationFilter",
        ProxyUserAuthenticationFilter.class.getName(), filterConfig);
  }

}