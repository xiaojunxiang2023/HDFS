package org.apache.hadoop.util;

/**
 * CacheableIPList loads a list of subnets from a file.
 * The list is cached and the cache can be refreshed by specifying cache timeout.
 * A negative value of cache timeout disables any caching.
 *
 * Thread safe.
 */

public class CacheableIPList implements IPList {
  private final long cacheTimeout;
  private volatile long cacheExpiryTimeStamp;
  private volatile FileBasedIPList ipList;

  public CacheableIPList(FileBasedIPList ipList, long cacheTimeout) {
    this.cacheTimeout =  cacheTimeout;
    this.ipList = ipList;
    updateCacheExpiryTime();
  }

  /**
   * Reloads the ip list
   */
  private  void  reset() {
    ipList = ipList.reload();
    updateCacheExpiryTime();
  }

  private void updateCacheExpiryTime() {
    if (cacheTimeout < 0) {
      cacheExpiryTimeStamp = -1; // no automatic cache expiry.
    }else {
      cacheExpiryTimeStamp = System.currentTimeMillis() + cacheTimeout;
    }
  }

  /**
   * Refreshes the ip list
   */
  public  void refresh () {
    cacheExpiryTimeStamp = 0;
  }

  @Override
  public boolean isIn(String ipAddress) {
    //is cache expired
    //Uses Double Checked Locking using volatile
    if (cacheExpiryTimeStamp >= 0 && cacheExpiryTimeStamp < System.currentTimeMillis()) {
      synchronized(this) {
        //check if cache expired again
        if (cacheExpiryTimeStamp < System.currentTimeMillis()) {
          reset();
        }
      }
    }
    return ipList.isIn(ipAddress);
  }
}