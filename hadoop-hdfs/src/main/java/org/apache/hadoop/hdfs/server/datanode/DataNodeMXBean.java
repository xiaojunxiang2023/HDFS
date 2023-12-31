package org.apache.hadoop.hdfs.server.datanode;

import java.util.Map;

/**
 *
 * This is the JMX management interface for data node information.
 * End users shouldn't be implementing these interfaces, and instead
 * access this information through the JMX APIs.
 */
public interface DataNodeMXBean {

  /**
   * Gets the version of Hadoop.
   *
   * @return the version of Hadoop
   */
  public String getVersion();

  /**
   * Get the version of software running on the DataNode
   *
   * @return a string representing the version
   */
  public String getSoftwareVersion();

  /**
   * Gets the rpc port.
   *
   * @return the rpc port
   */
  public String getRpcPort();

  /**
   * Gets the http port.
   *
   * @return the http port
   */
  public String getHttpPort();

  /**
   * Gets the data port.
   *
   * @return the data port
   */
  String getDataPort();

  /**
   * Gets the namenode IP addresses.
   *
   * @return the namenode IP addresses that the datanode is talking to
   */
  public String getNamenodeAddresses();

  /**
   * Gets the datanode hostname.
   *
   * @return the datanode hostname for the datanode.
   */
  public String getDatanodeHostname();

  /**
   * Gets information of the block pool service actors.
   *
   * @return block pool service actors info
   */
  String getBPServiceActorInfo();

  /**
   * Gets the information of each volume on the Datanode. Please
   * see the implementation for the format of returned information.
   *
   * @return the volume info
   */
  public String getVolumeInfo();

  /**
   * Gets the cluster id.
   *
   * @return the cluster id
   */
  public String getClusterId();

  /**
   * Returns the number of active xceivers.
   */
  public int getXceiverCount();

  /**
   * Returns the number of Datanode threads actively transferring blocks.
   */
  int getActiveTransferThreadCount();

  /**
   * Returns an estimate of the number of data replication/reconstruction tasks
   * running currently.
   */
  public int getXmitsInProgress();

  /**
   * Gets the network error counts on a per-Datanode basis.
   */
  public Map<String, Map<String, Long>> getDatanodeNetworkCounts();

  /**
   * Gets the diskBalancer Status.
   * Please see implementation for the format of the returned information.
   *
   * @return DiskBalancer Status
   */
  String getDiskBalancerStatus();

  /**
   * Gets the average info (e.g. time) of SendPacketDownstream when the DataNode
   * acts as the penultimate (2nd to the last) node in pipeline.
   * <p>
   * Example Json:
   * {"[185.164.159.81:9801]RollingAvgTime":504.867,
   *  "[49.236.149.246:9801]RollingAvgTime":504.463,
   *  "[84.125.113.65:9801]RollingAvgTime":497.954}
   * </p>
   */
  String getSendPacketDownstreamAvgInfo();

  /**
   * Gets the slow disks in the Datanode.
   *
   * @return list of slow disks
   */
  String getSlowDisks();

  /**
   * Gets if security is enabled.
   *
   * @return true, if security is enabled.
   */
  boolean isSecurityEnabled();

  /**
   * Get the start time of the DataNode.
   *
   * @return Start time of the DataNode.
   */
  long getDNStartedTimeInMillis();
}
