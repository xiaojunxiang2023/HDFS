package org.apache.hadoop.hdfs;

import java.io.IOException;
import java.net.URI;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.hdfs.protocol.HdfsConstants;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.security.Credentials;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.security.token.DtFetcher;
import org.apache.hadoop.security.token.Token;


/**
 *  DtFetcher is an interface which permits the abstraction and separation of
 *  delegation token fetch implementaions across different packages and
 *  compilation units.  Resolution of fetcher impl will be done at runtime.
 */
public class HdfsDtFetcher implements DtFetcher {
  private static final Logger LOG =
      LoggerFactory.getLogger(HdfsDtFetcher.class);

  private static final String SERVICE_NAME = HdfsConstants.HDFS_URI_SCHEME;

  private static final String FETCH_FAILED = "Fetch of delegation token failed";

  /**
   * Returns the service name for HDFS, which is also a valid URL prefix.
   */
  public Text getServiceName() {
    return new Text(SERVICE_NAME);
  }

  public boolean isTokenRequired() {
    return UserGroupInformation.isSecurityEnabled();
  }

  /**
   *  Returns Token object via FileSystem, null if bad argument.
   *  @param conf - a Configuration object used with FileSystem.get()
   *  @param creds - a Credentials object to which token(s) will be added
   *  @param renewer  - the renewer to send with the token request
   *  @param url  - the URL to which the request is sent
   *  @return a Token, or null if fetch fails.
   */
  public Token<?> addDelegationTokens(Configuration conf, Credentials creds,
                                  String renewer, String url) throws Exception {
    if (!url.startsWith(getServiceName().toString())) {
      url = getServiceName().toString() + "://" + url;
    }
    FileSystem fs = FileSystem.get(URI.create(url), conf);
    Token<?> token = fs.getDelegationToken(renewer);
    if (token == null) {
      LOG.error(FETCH_FAILED);
      throw new IOException(FETCH_FAILED);
    }
    creds.addToken(token.getService(), token);
    return token;
  }
}
