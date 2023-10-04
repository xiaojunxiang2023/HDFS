package org.apache.hadoop.fs;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.web.SWebHdfsFileSystem;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

/**
 * AbstractFileSystem implementation for HDFS over the web (secure).
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class SWebHdfs extends DelegateToFileSystem {

  public static final String SCHEME = "swebhdfs";

  /**
   * This constructor has the signature needed by
   * {@link AbstractFileSystem#createFileSystem(URI, Configuration)}
   *
   * @param theUri which must be that of swebhdfs
   * @param conf   configuration
   * @throws IOException
   */
  SWebHdfs(URI theUri, Configuration conf)
      throws IOException, URISyntaxException {
    super(theUri, createSWebHdfsFileSystem(conf), conf, SCHEME, false);
  }

  /**
   * Returns a new {@link SWebHdfsFileSystem}, with the given configuration.
   *
   * @param conf configuration
   * @return new SWebHdfsFileSystem
   */
  private static SWebHdfsFileSystem createSWebHdfsFileSystem(
      Configuration conf) {
    SWebHdfsFileSystem fs = new SWebHdfsFileSystem();
    fs.setConf(conf);
    return fs;
  }
}
