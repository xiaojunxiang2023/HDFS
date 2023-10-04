package org.apache.hadoop.hdfs.web;

import org.apache.hadoop.hdfs.client.HdfsClientConfigKeys;
import org.apache.hadoop.io.Text;

public class SWebHdfsFileSystem extends WebHdfsFileSystem {

  @Override
  public String getScheme() {
    return WebHdfsConstants.SWEBHDFS_SCHEME;
  }

  @Override
  protected String getTransportScheme() {
    return "https";
  }

  @Override
  protected Text getTokenKind() {
    return WebHdfsConstants.SWEBHDFS_TOKEN_KIND;
  }

  @Override
  protected int getDefaultPort() {
    return HdfsClientConfigKeys.DFS_NAMENODE_HTTPS_PORT_DEFAULT;
  }
}
