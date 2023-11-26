package org.apache.hadoop.hdfs.protocol.datatransfer;

import java.net.InetAddress;

import org.apache.hadoop.conf.Configurable;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.client.HdfsClientConfigKeys;
import org.apache.hadoop.util.ReflectionUtils;

/**
 * Class used to indicate whether a channel is trusted or not.
 * The default implementation is to return false indicating that
 * the channel is not trusted.
 * This class can be overridden to provide custom logic to determine
 * whether a channel is trusted or not.
 * The custom class can be specified via configuration.
 *
 */
public class TrustedChannelResolver implements Configurable {
  Configuration conf;

  /**
   * Returns an instance of TrustedChannelResolver.
   * Looks up the configuration to see if there is custom class specified.
   * @return TrustedChannelResolver
   */
  public static TrustedChannelResolver getInstance(Configuration conf) {
    Class<? extends TrustedChannelResolver> clazz =
        conf.getClass(
            HdfsClientConfigKeys.DFS_TRUSTEDCHANNEL_RESOLVER_CLASS,
            TrustedChannelResolver.class, TrustedChannelResolver.class);
    return ReflectionUtils.newInstance(clazz, conf);
  }

  @Override
  public void setConf(Configuration conf) {
    this.conf = conf;
  }

  @Override
  public Configuration getConf() {
    return conf;
  }

  /**
   * Return boolean value indicating whether a channel is trusted or not
   * from a client's perspective.
   * @return true if the channel is trusted and false otherwise.
   */
  public boolean isTrusted() {
    return false;
  }


  /**
   * Identify boolean value indicating whether a channel is trusted or not.
   * @param peerAddress address of the peer
   * @return true if the channel is trusted and false otherwise.
   */
  public boolean isTrusted(InetAddress peerAddress) {
    return false;
  }
}
