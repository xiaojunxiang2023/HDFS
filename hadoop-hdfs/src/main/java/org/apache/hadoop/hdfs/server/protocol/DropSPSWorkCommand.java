package org.apache.hadoop.hdfs.server.protocol;

/**
 * A DropSPSWorkCommand is an instruction to a datanode to drop the SPSWorker's
 * pending block storage movement queues.
 */
public class DropSPSWorkCommand extends DatanodeCommand {
  public static final DropSPSWorkCommand DNA_DROP_SPS_WORK_COMMAND =
      new DropSPSWorkCommand();

  public DropSPSWorkCommand() {
    super(DatanodeProtocol.DNA_DROP_SPS_WORK_COMMAND);
  }
}
