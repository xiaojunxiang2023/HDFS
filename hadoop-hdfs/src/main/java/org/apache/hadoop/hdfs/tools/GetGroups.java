package org.apache.hadoop.hdfs.tools;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeys;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.hdfs.*;
import org.apache.hadoop.tools.GetGroupsBase;
import org.apache.hadoop.tools.GetUserMappingsProtocol;
import org.apache.hadoop.util.ToolRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;

/**
 * HDFS implementation of a tool for getting the groups which a given user
 * belongs to.
 */
public class GetGroups extends GetGroupsBase {

  static final String USAGE = "Usage: hdfs groups [username ...]";
  private static final Logger LOG = LoggerFactory.getLogger(GetGroups.class);

  static {
    HdfsConfiguration.init();
  }


  public GetGroups(Configuration conf) {
    super(conf);
  }

  public GetGroups(Configuration conf, PrintStream out) {
    super(conf, out);
  }

  public static void main(String[] argv) throws Exception {
    if (DFSUtil.parseHelpArgument(argv, USAGE, System.out, true)) {
      System.exit(0);
    }

    int res = ToolRunner.run(new GetGroups(new HdfsConfiguration()), argv);
    System.exit(res);
  }

  @Override
  protected InetSocketAddress getProtocolAddress(Configuration conf)
      throws IOException {
    return DFSUtilClient.getNNAddress(conf);
  }

  @Override
  public void setConf(Configuration conf) {
    conf = new HdfsConfiguration(conf);
    String nameNodePrincipal = conf.get(
        DFSConfigKeys.DFS_NAMENODE_KERBEROS_PRINCIPAL_KEY, "");

    if (LOG.isDebugEnabled()) {
      LOG.debug("Using NN principal: " + nameNodePrincipal);
    }

    conf.set(CommonConfigurationKeys.HADOOP_SECURITY_SERVICE_USER_NAME_KEY,
        nameNodePrincipal);

    super.setConf(conf);
  }

  @Override
  protected GetUserMappingsProtocol getUgmProtocol() throws IOException {
    return NameNodeProxies.createProxy(getConf(), FileSystem.getDefaultUri(getConf()),
        GetUserMappingsProtocol.class).getProxy();
  }
}