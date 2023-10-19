package org.apache.hadoop.fs.http;

/**
 * A Filesystem that reads from HTTPS endpoint.
 */
public class HttpsFileSystem extends AbstractHttpFileSystem {
  @Override
  public String getScheme() {
    return "https";
  }
}
