package org.apache.hadoop.hdfs.server.protocol;
import org.apache.hadoop.hdfs.protocol.RollingUpgradeStatus;
/**
 * Response to {@link DatanodeProtocol#sendHeartbeat}
 */
public class HeartbeatResponse {
  /** Commands returned from the namenode to the datanode */
  private final DatanodeCommand[] commands;
  
  /** Information about the current HA-related state of the NN */
  private final NNHAStatusHeartbeat haStatus;

  private final RollingUpgradeStatus rollingUpdateStatus;

  private final long fullBlockReportLeaseId;
  
  public HeartbeatResponse(DatanodeCommand[] cmds,
      NNHAStatusHeartbeat haStatus, RollingUpgradeStatus rollingUpdateStatus,
      long fullBlockReportLeaseId) {
    commands = cmds;
    this.haStatus = haStatus;
    this.rollingUpdateStatus = rollingUpdateStatus;
    this.fullBlockReportLeaseId = fullBlockReportLeaseId;
  }
  
  public DatanodeCommand[] getCommands() {
    return commands;
  }
  
  public NNHAStatusHeartbeat getNameNodeHaState() {
    return haStatus;
  }

  public RollingUpgradeStatus getRollingUpdateStatus() {
    return rollingUpdateStatus;
  }

  public long getFullBlockReportLeaseId() {
    return fullBlockReportLeaseId;
  }
}
