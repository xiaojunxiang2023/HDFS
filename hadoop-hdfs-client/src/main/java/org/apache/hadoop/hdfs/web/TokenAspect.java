package org.apache.hadoop.hdfs.web;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.DelegationTokenRenewer;
import org.apache.hadoop.fs.DelegationTokenRenewer.Renewable;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.hdfs.HAUtilClient;
import org.apache.hadoop.hdfs.security.token.delegation.DelegationTokenIdentifier;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.net.NetUtils;
import org.apache.hadoop.security.SecurityUtil;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.security.token.TokenRenewer;
import org.apache.hadoop.security.token.delegation.AbstractDelegationTokenSelector;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.URI;

/**
 * This class implements the aspects that relate to delegation tokens for all
 * HTTP-based file system.
 */
final class TokenAspect<T extends FileSystem & Renewable> {
  public static class TokenManager extends TokenRenewer {

    @Override
    public void cancel(Token<?> token, Configuration conf) throws IOException {
      getInstance(token, conf).cancelDelegationToken(token);
    }

    @Override
    public boolean handleKind(Text kind) {
      return kind.equals(WebHdfsConstants.WEBHDFS_TOKEN_KIND)
          || kind.equals(WebHdfsConstants.SWEBHDFS_TOKEN_KIND);
    }

    @Override
    public boolean isManaged(Token<?> token) throws IOException {
      return true;
    }

    @Override
    public long renew(Token<?> token, Configuration conf) throws IOException {
      return getInstance(token, conf).renewDelegationToken(token);
    }

    private TokenManagementDelegator getInstance(Token<?> token,
                                                 Configuration conf)
        throws IOException {
      final URI uri;
      final String scheme = getSchemeByKind(token.getKind());
      if (HAUtilClient.isTokenForLogicalUri(token)) {
        uri = HAUtilClient.getServiceUriFromToken(scheme, token);
      } else {
        final InetSocketAddress address = SecurityUtil.getTokenServiceAddr
            (token);
        uri = URI.create(scheme + "://" + NetUtils.getHostPortString(address));
      }
      return (TokenManagementDelegator) FileSystem.get(uri, conf);
    }

    private static String getSchemeByKind(Text kind) {
      if (kind.equals(WebHdfsConstants.WEBHDFS_TOKEN_KIND)) {
        return WebHdfsConstants.WEBHDFS_SCHEME;
      } else if (kind.equals(WebHdfsConstants.SWEBHDFS_TOKEN_KIND)) {
        return WebHdfsConstants.SWEBHDFS_SCHEME;
      } else {
        throw new IllegalArgumentException("Unsupported scheme");
      }
    }
  }

  private static class DTSelecorByKind extends
      AbstractDelegationTokenSelector<DelegationTokenIdentifier> {
    public DTSelecorByKind(final Text kind) {
      super(kind);
    }
  }

  /**
   * Callbacks for token management
   */
  interface TokenManagementDelegator {
    void cancelDelegationToken(final Token<?> token) throws IOException;

    long renewDelegationToken(final Token<?> token) throws IOException;
  }

  private DelegationTokenRenewer.RenewAction<?> action;
  private DelegationTokenRenewer dtRenewer = null;
  private final DTSelecorByKind dtSelector;
  private final T fs;
  private boolean hasInitedToken;
  private final Logger LOG;
  private final Text serviceName;

  TokenAspect(T fs, final Text serviceName, final Text kind) {
    this.LOG = LoggerFactory.getLogger(fs.getClass());
    this.fs = fs;
    this.dtSelector = new DTSelecorByKind(kind);
    this.serviceName = serviceName;
  }

  synchronized void ensureTokenInitialized() throws IOException {
    // we haven't inited yet, or we used to have a token but it expired
    if (!hasInitedToken || (action != null && !action.isValid())) {
      //since we don't already have a token, go get one
      Token<?> token = fs.getDelegationToken(null);
      // security might be disabled
      if (token != null) {
        fs.setDelegationToken(token);
        addRenewAction(fs);
        LOG.debug("Created new DT for {}", token.getService());
      }
      hasInitedToken = true;
    }
  }

  public synchronized void reset() {
    hasInitedToken = false;
  }

  synchronized void initDelegationToken(UserGroupInformation ugi) {
    Token<?> token = selectDelegationToken(ugi);
    if (token != null) {
      LOG.debug("Found existing DT for {}", token.getService());
      fs.setDelegationToken(token);
      hasInitedToken = true;
    }
  }

  synchronized void removeRenewAction() throws IOException {
    if (dtRenewer != null) {
      dtRenewer.removeRenewAction(fs);
    }
  }


  Token<DelegationTokenIdentifier> selectDelegationToken(
      UserGroupInformation ugi) {
    return dtSelector.selectToken(serviceName, ugi.getTokens());
  }

  private synchronized void addRenewAction(final T webhdfs) {
    if (dtRenewer == null) {
      dtRenewer = DelegationTokenRenewer.getInstance();
    }

    action = dtRenewer.addRenewAction(webhdfs);
  }
}
