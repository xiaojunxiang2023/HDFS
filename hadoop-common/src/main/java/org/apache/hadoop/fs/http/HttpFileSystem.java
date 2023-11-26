package org.apache.hadoop.fs.http;

/**
 * A Filesystem that reads from HTTP endpoint.
 */
public class HttpFileSystem extends AbstractHttpFileSystem {
  @Override
  public String getScheme() {
    return "http";
  }
}
