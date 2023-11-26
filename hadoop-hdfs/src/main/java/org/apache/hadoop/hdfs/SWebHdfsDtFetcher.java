package org.apache.hadoop.hdfs;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.hadoop.hdfs.web.WebHdfsConstants;
import org.apache.hadoop.io.Text;

/**
 *  DtFetcher for SWebHdfsFileSystem using the base class HdfsDtFetcher impl.
 */
public class SWebHdfsDtFetcher extends HdfsDtFetcher {
  private static final Logger LOG =
      LoggerFactory.getLogger(SWebHdfsDtFetcher.class);

  private static final String SERVICE_NAME = WebHdfsConstants.SWEBHDFS_SCHEME;

  @Override
  public Text getServiceName() {
    return new Text(SERVICE_NAME);
  }
}
