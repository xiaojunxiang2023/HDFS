package org.apache.hadoop.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CombinedIPWhiteList implements IPList {

  public static final Logger LOG =
      LoggerFactory.getLogger(CombinedIPWhiteList.class);
  private static final String LOCALHOST_IP = "127.0.0.1";

  private final IPList[] networkLists;

  public CombinedIPWhiteList(String fixedWhiteListFile,
                             String variableWhiteListFile, long cacheExpiryInSeconds) {

    IPList fixedNetworkList = new FileBasedIPList(fixedWhiteListFile);
    if (variableWhiteListFile != null) {
      IPList variableNetworkList = new CacheableIPList(
          new FileBasedIPList(variableWhiteListFile), cacheExpiryInSeconds);
      networkLists = new IPList[]{fixedNetworkList, variableNetworkList};
    } else {
      networkLists = new IPList[]{fixedNetworkList};
    }
  }

  @Override
  public boolean isIn(String ipAddress) {
    if (ipAddress == null) {
      throw new IllegalArgumentException("ipAddress is null");
    }

    if (LOCALHOST_IP.equals(ipAddress)) {
      return true;
    }

    for (IPList networkList : networkLists) {
      if (networkList.isIn(ipAddress)) {
        return true;
      }
    }
    return false;
  }
}
