package org.apache.hadoop.tools;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.conf.Configured;
import org.apache.hadoop.ipc.RPC;
import org.apache.hadoop.net.NetUtils;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.util.Tool;

import java.io.IOException;
import java.io.PrintStream;
import java.net.InetSocketAddress;

/**
 * Base class for the HDFS and MR implementations of tools which fetch and
 * display the groups that users belong to.
 */
public abstract class GetGroupsBase extends Configured implements Tool {

  private PrintStream out;

  /**
   * Create an instance of this tool using the given configuration.
   * @param conf
   */
  protected GetGroupsBase(Configuration conf) {
    this(conf, System.out);
  }

  /**
   * Used exclusively for testing.
   *
   * @param conf The configuration to use.
   * @param out The PrintStream to write to, instead of System.out
   */
  protected GetGroupsBase(Configuration conf, PrintStream out) {
    super(conf);
    this.out = out;
  }

  /**
   * Get the groups for the users given and print formatted output to the
   * {@link PrintStream} configured earlier.
   */
  @Override
  public int run(String[] args) throws Exception {
    if (args.length == 0) {
      args = new String[]{UserGroupInformation.getCurrentUser().getUserName()};
    }

    for (String username : args) {
      StringBuilder sb = new StringBuilder();
      sb.append(username + " :");
      for (String group : getUgmProtocol().getGroupsForUser(username)) {
        sb.append(" ")
            .append(group);
      }
      out.println(sb);
    }

    return 0;
  }

  /**
   * Must be overridden by subclasses to get the address where the
   * {@link GetUserMappingsProtocol} implementation is running.
   *
   * @param conf The configuration to use.
   * @return The address where the service is listening.
   * @throws IOException
   */
  protected abstract InetSocketAddress getProtocolAddress(Configuration conf)
      throws IOException;

  /**
   * Get a client of the {@link GetUserMappingsProtocol}.
   * @return A {@link GetUserMappingsProtocol} client proxy.
   * @throws IOException
   */
  protected GetUserMappingsProtocol getUgmProtocol() throws IOException {
    GetUserMappingsProtocol userGroupMappingProtocol =
        RPC.getProxy(GetUserMappingsProtocol.class,
            GetUserMappingsProtocol.versionID,
            getProtocolAddress(getConf()), UserGroupInformation.getCurrentUser(),
            getConf(), NetUtils.getSocketFactory(getConf(),
                GetUserMappingsProtocol.class));
    return userGroupMappingProtocol;
  }

}
