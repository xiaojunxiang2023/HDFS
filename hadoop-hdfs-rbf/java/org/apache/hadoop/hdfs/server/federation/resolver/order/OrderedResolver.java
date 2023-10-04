package org.apache.hadoop.hdfs.server.federation.resolver.order;

import org.apache.hadoop.hdfs.server.federation.resolver.PathLocation;


/**
 * Policy that decides which should be the first location accessed given
 * multiple destinations.
 */
public interface OrderedResolver {

  /**
   * Get the first namespace based on this resolver approach.
   *
   * @param path Path to check.
   * @param loc Federated location with multiple destinations.
   * @return First namespace out of the locations.
   */
  String getFirstNamespace(String path, PathLocation loc);
}