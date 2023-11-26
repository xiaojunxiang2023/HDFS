package org.apache.hadoop.hdfs.server.protocol;

/**
 * Base class for a server command.
 * Issued by the name-node to notify other servers what should be done.
 * Commands are defined by actions defined in respective protocols.
 * 
 * @see DatanodeProtocol
 * @see NamenodeProtocol
 */
public abstract class ServerCommand {
  private final int action;

  /**
   * Create a command for the specified action.
   * Actions are protocol specific.
   * 
   * @see DatanodeProtocol
   * @see NamenodeProtocol
   * @param action protocol specific action
   */
  public ServerCommand(int action) {
    this.action = action;
  }

  /**
   * Get server command action.
   * @return action code.
   */
  public int getAction() {
    return this.action;
  }

  public String toString() {
    final StringBuilder sb = new StringBuilder();
    sb.append(getClass().getSimpleName())
        .append("/")
        .append(action);
    return sb.toString();
  }
}
