package org.apache.hadoop.hdfs.server.blockmanagement.az;

import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.net.NetworkTopology;
import org.apache.hadoop.net.Node;

/**
 * @Author: hellosrc
 * @Date: 2023/12/01日  13:21分
 * @Description:
 */
public class AzNetworkTopology extends NetworkTopology {
  public static final String DEFAULT_MAIN_AZ = DFSConfigKeys.DEFAULT_MAIN_AZ_DEFAULT;

  // TODO
  public AzInfo getAzInfo(Node writer) {
    return null;
  }

}
