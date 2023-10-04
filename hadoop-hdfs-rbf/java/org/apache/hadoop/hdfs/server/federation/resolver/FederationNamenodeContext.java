package org.apache.hadoop.hdfs.server.federation.resolver;

/**
 * Interface for a discovered NN and its current server endpoints.
 */
public interface FederationNamenodeContext {

  /**
   * Get the RPC server address of the namenode.
   *
   * @return RPC server address in the form of host:port.
   */
  String getRpcAddress();

  /**
   * Get the Service RPC server address of the namenode.
   *
   * @return Service RPC server address in the form of host:port.
   */
  String getServiceAddress();

  /**
   * Get the Lifeline RPC server address of the namenode.
   *
   * @return Lifeline RPC server address in the form of host:port.
   */
  String getLifelineAddress();

  /**
   * Get the Scheme of web address of the namenode.
   *
   * @return Scheme of web address (HTTP/HTTPS).
   */
  String getWebScheme();

  /**
   * Get the HTTP(s) server address of the namenode.
   *
   * @return HTTP(s) address in the form of host:port.
   */
  String getWebAddress();

  /**
   * Get the unique key representing the namenode.
   *
   * @return Combination of the nameservice and the namenode IDs.
   */
  String getNamenodeKey();

  /**
   * Identifier for the nameservice/namespace.
   *
   * @return Namenode nameservice identifier.
   */
  String getNameserviceId();

  /**
   * Identifier for the namenode.
   *
   * @return String
   */
  String getNamenodeId();

  /**
   * The current state of the namenode (active, standby, etc).
   *
   * @return FederationNamenodeServiceState State of the namenode.
   */
  FederationNamenodeServiceState getState();

  /**
   * The update date.
   *
   * @return Long with the update date.
   */
  long getDateModified();
}
