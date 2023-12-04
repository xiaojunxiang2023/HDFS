package org.apache.hadoop.fs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.web.WebHdfsFileSystem;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * AbstractFileSystem implementation for HDFS over the web.
 */
public class WebHdfs extends DelegateToFileSystem {

  public static final String SCHEME = "webhdfs";

  /**
   * This constructor has the signature needed by
   * {@link AbstractFileSystem#createFileSystem(URI, Configuration)}
   *
   * @param theUri which must be that of webhdfs
   * @param conf   configuration
   * @throws IOException
   */
  WebHdfs(URI theUri, Configuration conf)
      throws IOException, URISyntaxException {
    super(theUri, createWebHdfsFileSystem(conf), conf, SCHEME, false);
  }

  /**
   * Returns a new {@link WebHdfsFileSystem}, with the given configuration.
   *
   * @param conf configuration
   * @return new WebHdfsFileSystem
   */
  private static WebHdfsFileSystem createWebHdfsFileSystem(Configuration conf) {
    WebHdfsFileSystem fs = new WebHdfsFileSystem();
    fs.setConf(conf);
    return fs;
  }
}
