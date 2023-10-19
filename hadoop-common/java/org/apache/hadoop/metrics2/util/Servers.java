package org.apache.hadoop.metrics2.util;

import java.net.InetSocketAddress;
import java.util.List;

import org.apache.hadoop.thirdparty.com.google.common.collect.Lists;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.net.NetUtils;

/**
 * Helpers to handle server addresses
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class Servers {
  /**
   * This class is not intended to be instantiated
   */
  private Servers() {}

  /**
   * Parses a space and/or comma separated sequence of server specifications
   * of the form <i>hostname</i> or <i>hostname:port</i>.  If
   * the specs string is null, defaults to localhost:defaultPort.
   *
   * @param specs   server specs (see description)
   * @param defaultPort the default port if not specified
   * @return a list of InetSocketAddress objects.
   */
  public static List<InetSocketAddress> parse(String specs, int defaultPort) {
    List<InetSocketAddress> result = Lists.newArrayList();
    if (specs == null) {
      result.add(new InetSocketAddress("localhost", defaultPort));
    }
    else {
      String[] specStrings = specs.split("[ ,]+");
      for (String specString : specStrings) {
        result.add(NetUtils.createSocketAddr(specString, defaultPort));
      }
    }
    return result;
  }
}
