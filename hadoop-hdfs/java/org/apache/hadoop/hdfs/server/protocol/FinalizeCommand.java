package org.apache.hadoop.hdfs.server.protocol;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * A BlockCommand is an instruction to a datanode to register with the namenode.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class FinalizeCommand extends DatanodeCommand {
  String blockPoolId;
  private FinalizeCommand() {
    super(DatanodeProtocol.DNA_FINALIZE);
  }
  
  public FinalizeCommand(String bpid) {
    super(DatanodeProtocol.DNA_FINALIZE);
    blockPoolId = bpid;
  }
  
  public String getBlockPoolId() {
    return blockPoolId;
  }
}