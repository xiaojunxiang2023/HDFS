package org.apache.hadoop.hdfs.web;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.http.FilterContainer;
import org.apache.hadoop.http.FilterInitializer;
import org.apache.hadoop.security.AuthenticationFilterInitializer;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.security.authentication.server.KerberosAuthenticationHandler;
import org.apache.hadoop.security.authentication.server.PseudoAuthenticationHandler;
import org.apache.hadoop.security.authorize.ProxyUsers;

import java.util.Map;

/**
 * Filter initializer to initialize {@link AuthFilter}.
 */
public class AuthFilterInitializer extends FilterInitializer {

    private String configPrefix;

    public AuthFilterInitializer() {
        this.configPrefix = "hadoop.http.authentication.";
    }

    protected Map<String, String> createFilterConfig(Configuration conf) {
        Map<String, String> filterConfig = AuthenticationFilterInitializer
                .getFilterConfigMap(conf, configPrefix);

        for (Map.Entry<String, String> entry : conf.getPropsWithPrefix(
                ProxyUsers.CONF_HADOOP_PROXYUSER).entrySet()) {
            filterConfig.put("proxyuser" + entry.getKey(), entry.getValue());
        }

        if (filterConfig.get("type") == null) {
            filterConfig.put("type", UserGroupInformation.isSecurityEnabled() ?
                    KerberosAuthenticationHandler.TYPE :
                    PseudoAuthenticationHandler.TYPE);
        }

        //set cookie path
        filterConfig.put("cookie.path", "/");
        return filterConfig;
    }

    @Override
    public void initFilter(FilterContainer container, Configuration conf) {
        Map<String, String> filterConfig = createFilterConfig(conf);
        container.addFilter("AuthFilter", AuthFilter.class.getName(),
                filterConfig);
    }

}