package org.apache.hadoop.hdfs.server.protocol;

/**
 * A RegisterCommand is an instruction to a datanode to register with the namenode.
 * This command can't be combined with other commands in the same response.
 * This is because after the datanode processes RegisterCommand, it will skip
 * the rest of the DatanodeCommands in the same HeartbeatResponse.
 */
public class RegisterCommand extends DatanodeCommand {
  
  public static final DatanodeCommand REGISTER = new RegisterCommand();

  public RegisterCommand() {
    super(DatanodeProtocol.DNA_REGISTER);
  }
}