package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.hdfs.protocol.DatanodeInfo.AdminStates;

/**
 * The class describes the configured admin properties for a datanode.
 *
 * It is the static configuration specified by administrators via dfsadmin
 * command; different from the runtime state. CombinedHostFileManager uses
 * the class to deserialize the configurations from json-based file format.
 *
 * To decommission a node, use AdminStates.DECOMMISSIONED.
 */
public class DatanodeAdminProperties {
  private String hostName;
  private int port;
  private String upgradeDomain;
  private AdminStates adminState = AdminStates.NORMAL;
  private long maintenanceExpireTimeInMS = Long.MAX_VALUE;

  /**
   * Return the host name of the datanode.
   * @return the host name of the datanode.
   */
  public String getHostName() {
    return hostName;
  }

  /**
   * Set the host name of the datanode.
   * @param hostName the host name of the datanode.
   */
  public void setHostName(final String hostName) {
    this.hostName = hostName;
  }

  /**
   * Get the port number of the datanode.
   * @return the port number of the datanode.
   */
  public int getPort() {
    return port;
  }

  /**
   * Set the port number of the datanode.
   * @param port the port number of the datanode.
   */
  public void setPort(final int port) {
    this.port = port;
  }

  /**
   * Get the upgrade domain of the datanode.
   * @return the upgrade domain of the datanode.
   */
  public String getUpgradeDomain() {
    return upgradeDomain;
  }

  /**
   * Set the upgrade domain of the datanode.
   * @param upgradeDomain the upgrade domain of the datanode.
   */
  public void setUpgradeDomain(final String upgradeDomain) {
    this.upgradeDomain = upgradeDomain;
  }

  /**
   * Get the admin state of the datanode.
   * @return the admin state of the datanode.
   */
  public AdminStates getAdminState() {
    return adminState;
  }

  /**
   * Set the admin state of the datanode.
   * @param adminState the admin state of the datanode.
   */
  public void setAdminState(final AdminStates adminState) {
    this.adminState = adminState;
  }

  /**
   * Get the maintenance expiration time in milliseconds.
   * @return the maintenance expiration time in milliseconds.
   */
  public long getMaintenanceExpireTimeInMS() {
    return this.maintenanceExpireTimeInMS;
  }

  /**
   * Get the maintenance expiration time in milliseconds.
   * @param maintenanceExpireTimeInMS
   *        the maintenance expiration time in milliseconds.
   */
  public void setMaintenanceExpireTimeInMS(
      final long maintenanceExpireTimeInMS) {
    this.maintenanceExpireTimeInMS = maintenanceExpireTimeInMS;
  }
}
