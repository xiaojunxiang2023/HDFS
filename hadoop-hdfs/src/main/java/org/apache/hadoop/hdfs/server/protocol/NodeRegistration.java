package org.apache.hadoop.hdfs.server.protocol;

/**
 * Generic class specifying information, which need to be sent to the name-node
 * during the registration process. 
 */
public interface NodeRegistration {
  /**
   * Get address of the server node.
   * @return ipAddr:portNumber
   */
  public String getAddress();

  /**
   * Get registration ID of the server node.
   */
  public String getRegistrationID();

  /**
   * Get layout version of the server node.
   */
  public int getVersion();

  @Override
  public String toString();
}
