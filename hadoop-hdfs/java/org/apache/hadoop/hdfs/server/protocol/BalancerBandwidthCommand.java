package org.apache.hadoop.hdfs.server.protocol;

/*
 * A system administrator can tune the balancer bandwidth parameter
 * (dfs.datanode.balance.bandwidthPerSec) dynamically by calling
 * "dfsadmin -setBalanacerBandwidth newbandwidth".
 * This class is to define the command which sends the new bandwidth value to
 * each datanode.
 */

/**
 * Balancer bandwidth command instructs each datanode to change its value for
 * the max amount of network bandwidth it may use during the block balancing
 * operation.
 * 
 * The Balancer Bandwidth Command contains the new bandwidth value as its
 * payload. The bandwidth value is in bytes per second.
 */
public class BalancerBandwidthCommand extends DatanodeCommand {
  private final static long BBC_DEFAULTBANDWIDTH = 0L;

  private final long bandwidth;

  /**
   * Balancer Bandwidth Command constructor. Sets bandwidth to 0.
   */
  BalancerBandwidthCommand() {
    this(BBC_DEFAULTBANDWIDTH);
  }

  /**
   * Balancer Bandwidth Command constructor.
   *
   * @param bandwidth Blanacer bandwidth in bytes per second.
   */
  public BalancerBandwidthCommand(long bandwidth) {
    super(DatanodeProtocol.DNA_BALANCERBANDWIDTHUPDATE);
    this.bandwidth = bandwidth;
  }

  /**
   * Get current value of the max balancer bandwidth in bytes per second.
   *
   * @return bandwidth Blanacer bandwidth in bytes per second for this datanode.
   */
  public long getBalancerBandwidthValue() {
    return this.bandwidth;
  }
}
