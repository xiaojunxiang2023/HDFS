package org.apache.hadoop.security;

import org.apache.hadoop.classification.InterfaceAudience.LimitedPrivate;
import org.apache.hadoop.classification.InterfaceStability.Evolving;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.security.token.TokenInfo;

@Evolving
@LimitedPrivate({"MapReduce", "HDFS"})
/**
 * Interface used by RPC to get the Security information for a given 
 * protocol.
 */
public abstract class SecurityInfo {

  /**
   * Get the KerberosInfo for a given protocol.
   * @param protocol interface class
   * @param conf configuration
   * @return KerberosInfo
   */
  public abstract KerberosInfo getKerberosInfo(Class<?> protocol, Configuration conf);

  /**
   * Get the TokenInfo for a given protocol.
   * @param protocol interface class
   * @param conf configuration object.
   * @return TokenInfo instance
   */
  public abstract TokenInfo getTokenInfo(Class<?> protocol, Configuration conf);

}
