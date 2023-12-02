package org.apache.hadoop.hdfs.server.blockmanagement.az;

import java.util.Objects;

/**
 * @Author: hellosrc
 * @Date: 2023/12/01日  14:23分
 * @Description:
 */
public class AzInfo {
  
  public String az;
  public String rack;

  public AzInfo() {
    this(AzNetworkTopology.DEFAULT_MAIN_AZ, AzNetworkTopology.DEFAULT_RACK);
  }

  public AzInfo(String az, String rack) {
    this.az = az;
    this.rack = rack;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    AzInfo azInfo = (AzInfo) o;
    return Objects.equals(az, azInfo.az) &&
      Objects.equals(rack, azInfo.rack);
  }

  @Override
  public int hashCode() {
    return Objects.hash(az, rack);
  }
}
