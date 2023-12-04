package org.apache.hadoop.hdfs.web;

import org.apache.hadoop.auth.client.ConnectionConfigurator;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.ssl.SSLFactory;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.security.GeneralSecurityException;

/**
 * Configure a connection to use SSL authentication.
 */

public class SSLConnectionConfigurator implements ConnectionConfigurator {
  private final SSLFactory factory;
  private final SSLSocketFactory sf;
  private final HostnameVerifier hv;
  private final int connectTimeout;
  private final int readTimeout;

  SSLConnectionConfigurator(int connectTimeout, int readTimeout,
                            Configuration conf) throws IOException, GeneralSecurityException {
    factory = new SSLFactory(SSLFactory.Mode.CLIENT, conf);
    factory.init();
    sf = factory.createSSLSocketFactory();
    hv = factory.getHostnameVerifier();
    this.connectTimeout = connectTimeout;
    this.readTimeout = readTimeout;
  }

  @Override
  public HttpURLConnection configure(HttpURLConnection conn) {
    if (conn instanceof HttpsURLConnection) {
      HttpsURLConnection c = (HttpsURLConnection) conn;
      c.setSSLSocketFactory(sf);
      c.setHostnameVerifier(hv);
    }
    conn.setConnectTimeout(connectTimeout);
    conn.setReadTimeout(readTimeout);
    return conn;
  }

  void destroy() {
    factory.destroy();
  }
}
