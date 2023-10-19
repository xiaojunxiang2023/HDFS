package org.apache.hadoop.fs;

import java.io.IOException;
import java.net.URL;
import java.net.URLStreamHandler;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.conf.Configuration;

/**
 * URLStream handler relying on FileSystem and on a given Configuration to
 * handle URL protocols.
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
class FsUrlStreamHandler extends URLStreamHandler {

  private Configuration conf;

  FsUrlStreamHandler(Configuration conf) {
    this.conf = conf;
  }

  FsUrlStreamHandler() {
    this.conf = new Configuration();
  }

  @Override
  protected FsUrlConnection openConnection(URL url) throws IOException {
    return new FsUrlConnection(conf, url);
  }

}
