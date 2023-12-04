package org.apache.hadoop.fs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;

/**
 * Representation of a URL connection to open InputStreams.
 */
class FsUrlConnection extends URLConnection {
  private static final Logger LOG =
      LoggerFactory.getLogger(FsUrlConnection.class);

  private Configuration conf;

  private InputStream is;

  FsUrlConnection(Configuration conf, URL url) {
    super(url);
    Preconditions.checkArgument(conf != null, "null conf argument");
    Preconditions.checkArgument(url != null, "null url argument");
    this.conf = conf;
  }

  @Override
  public void connect() throws IOException {
    Preconditions.checkState(is == null, "Already connected");
    try {
      LOG.debug("Connecting to {}", url);
      URI uri = url.toURI();
      FileSystem fs = FileSystem.get(uri, conf);
      // URI#getPath returns null value if path contains relative path
      // i.e file:root/dir1/file1
      // So path can not be constructed from URI.
      // We can only use schema specific part in URI.
      // Uri#isOpaque return true if path is relative.
      if (uri.isOpaque() && uri.getScheme().equals("file")) {
        is = fs.open(new Path(uri.getSchemeSpecificPart()));
      } else {
        is = fs.open(new Path(uri));
      }
    } catch (URISyntaxException e) {
      throw new IOException(e.toString());
    }
  }

  @Override
  public InputStream getInputStream() throws IOException {
    if (is == null) {
      connect();
    }
    return is;
  }

}
