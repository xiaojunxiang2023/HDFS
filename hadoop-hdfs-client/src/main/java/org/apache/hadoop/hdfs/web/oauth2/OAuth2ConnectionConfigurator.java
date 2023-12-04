package org.apache.hadoop.hdfs.web.oauth2;

import org.apache.hadoop.auth.client.ConnectionConfigurator;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.util.ReflectionUtils;

import java.io.IOException;
import java.net.HttpURLConnection;

import static org.apache.hadoop.hdfs.client.HdfsClientConfigKeys.ACCESS_TOKEN_PROVIDER_KEY;
import static org.apache.hadoop.hdfs.web.oauth2.Utils.notNull;

/**
 * Configure a connection to use OAuth2 authentication.
 */
public class OAuth2ConnectionConfigurator implements ConnectionConfigurator {

  public static final String HEADER = "Bearer ";

  private final AccessTokenProvider accessTokenProvider;

  private ConnectionConfigurator sslConfigurator = null;

  public OAuth2ConnectionConfigurator(Configuration conf) {
    this(conf, null);
  }

  @SuppressWarnings("unchecked")
  public OAuth2ConnectionConfigurator(Configuration conf,
                                      ConnectionConfigurator sslConfigurator) {
    this.sslConfigurator = sslConfigurator;

    notNull(conf, ACCESS_TOKEN_PROVIDER_KEY);

    Class accessTokenProviderClass = conf.getClass(ACCESS_TOKEN_PROVIDER_KEY,
        ConfCredentialBasedAccessTokenProvider.class,
        AccessTokenProvider.class);

    accessTokenProvider = (AccessTokenProvider) ReflectionUtils
        .newInstance(accessTokenProviderClass, conf);
    accessTokenProvider.setConf(conf);
  }

  @Override
  public HttpURLConnection configure(HttpURLConnection conn)
      throws IOException {
    if (sslConfigurator != null) {
      sslConfigurator.configure(conn);
    }

    String accessToken = accessTokenProvider.getAccessToken();

    conn.setRequestProperty("AUTHORIZATION", HEADER + accessToken);

    return conn;
  }
}
