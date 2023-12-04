package org.apache.hadoop.hdfs.server.common;

import java.io.IOException;
import java.net.HttpURLConnection;

public class HttpGetFailedException extends IOException {
  private static final long serialVersionUID = 1L;
  private final int responseCode;

  public HttpGetFailedException(String msg, HttpURLConnection connection)
      throws IOException {
    super(msg);
    this.responseCode = connection.getResponseCode();
  }

  public int getResponseCode() {
    return responseCode;
  }
}
