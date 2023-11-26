package org.apache.hadoop.auth.client;


import java.io.IOException;
import java.net.HttpURLConnection;

public interface ConnectionConfigurator {

  // 配置下 conn
  HttpURLConnection configure(HttpURLConnection conn) throws IOException;

}
