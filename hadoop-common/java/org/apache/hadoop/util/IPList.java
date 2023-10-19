package org.apache.hadoop.util;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

@InterfaceStability.Unstable
@InterfaceAudience.Public
public interface IPList {

  /**
   * returns true if the ipAddress is in the IPList.
   * @param ipAddress
   * @return boolean value indicating whether the ipAddress is in the IPList
   */
  public abstract boolean isIn(String ipAddress);
}