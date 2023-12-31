package org.apache.hadoop.hdfs.security.token.delegation;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.client.HdfsClientConfigKeys;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.net.NetUtils;
import org.apache.hadoop.security.SecurityUtil;
import org.apache.hadoop.security.token.Token;
import org.apache.hadoop.security.token.delegation.AbstractDelegationTokenSelector;

import java.net.URI;
import java.util.Collection;

/**
 * A delegation token that is specialized for HDFS
 */
public class DelegationTokenSelector
    extends AbstractDelegationTokenSelector<DelegationTokenIdentifier> {
  public static final String SERVICE_NAME_KEY = "hdfs.service.host_";

  /**
   * Select the delegation token for hdfs.  The port will be rewritten to
   * the port of hdfs.service.host_$nnAddr, or the default rpc namenode port.
   * This method should only be called by non-hdfs filesystems that do not
   * use the rpc port to acquire tokens.  Ex. webhdfs
   * @param nnUri of the remote namenode
   * @param tokens as a collection
   * @param conf hadoop configuration
   * @return Token
   */
  public Token<DelegationTokenIdentifier> selectToken(
      final URI nnUri, Collection<Token<?>> tokens,
      final Configuration conf) {
    // this guesses the remote cluster's rpc service port.
    // the current token design assumes it's the same as the local cluster's
    // rpc port unless a config key is set.  there should be a way to automatic
    // and correctly determine the value
    Text serviceName = SecurityUtil.buildTokenService(nnUri);
    final String nnServiceName = conf.get(SERVICE_NAME_KEY + serviceName);

    int nnRpcPort = HdfsClientConfigKeys.DFS_NAMENODE_RPC_PORT_DEFAULT;
    if (nnServiceName != null) {
      nnRpcPort = NetUtils.createSocketAddr(nnServiceName, nnRpcPort).getPort();
    }
    // use original hostname from the uri to avoid unintentional host resolving
    serviceName = SecurityUtil.buildTokenService(
        NetUtils.createSocketAddrForHost(nnUri.getHost(), nnRpcPort));

    return selectToken(serviceName, tokens);
  }

  public DelegationTokenSelector() {
    super(DelegationTokenIdentifier.HDFS_DELEGATION_KIND);
  }
}
