package org.apache.hadoop.util;
public interface IPList {

  /**
   * returns true if the ipAddress is in the IPList.
   * @param ipAddress
   * @return boolean value indicating whether the ipAddress is in the IPList
   */
  public abstract boolean isIn(String ipAddress);
}