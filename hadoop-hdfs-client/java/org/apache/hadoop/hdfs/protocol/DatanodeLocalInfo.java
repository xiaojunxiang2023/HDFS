package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;


/**
 * Locally available datanode information
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class DatanodeLocalInfo {
  private final String softwareVersion;
  private final String configVersion;
  private final long uptime; // datanode uptime in seconds.

  public DatanodeLocalInfo(String softwareVersion,
      String configVersion, long uptime) {
    this.softwareVersion = softwareVersion;
    this.configVersion = configVersion;
    this.uptime = uptime;
  }

  /** get software version */
  public String getSoftwareVersion() {
    return this.softwareVersion;
  }

  /** get config version */
  public String getConfigVersion() {
    return this.configVersion;
  }

  /** get uptime */
  public long getUptime() {
    return this.uptime;
  }

  /** A formatted string for printing the status of the DataNode. */
  public String getDatanodeLocalReport() {
    return ("Uptime: " + getUptime())
        + ", Software version: " + getSoftwareVersion()
        + ", Config version: " + getConfigVersion();
  }
}
