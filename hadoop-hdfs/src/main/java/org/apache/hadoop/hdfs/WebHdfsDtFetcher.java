package org.apache.hadoop.hdfs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.hadoop.hdfs.web.WebHdfsConstants;
import org.apache.hadoop.io.Text;

/**
 *  DtFetcher for WebHdfsFileSystem using the base class HdfsDtFetcher impl.
 */
public class WebHdfsDtFetcher extends HdfsDtFetcher {
  private static final Logger LOG =
      LoggerFactory.getLogger(WebHdfsDtFetcher.class);

  private static final String SERVICE_NAME = WebHdfsConstants.WEBHDFS_SCHEME;

  @Override
  public Text getServiceName() {
    return new Text(SERVICE_NAME);
  }
}
