package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * A DropSPSWorkCommand is an instruction to a datanode to drop the SPSWorker's
 * pending block storage movement queues.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class DropSPSWorkCommand extends DatanodeCommand {
  public static final DropSPSWorkCommand DNA_DROP_SPS_WORK_COMMAND =
      new DropSPSWorkCommand();

  public DropSPSWorkCommand() {
    super(DatanodeProtocol.DNA_DROP_SPS_WORK_COMMAND);
  }
}
