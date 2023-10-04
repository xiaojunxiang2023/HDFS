package org.apache.hadoop.hdfs.server.federation.resolver.order;

import org.apache.commons.collections.CollectionUtils;
import org.apache.hadoop.hdfs.server.federation.resolver.PathLocation;
import org.apache.hadoop.thirdparty.com.google.common.collect.Iterables;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Set;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Order the destinations randomly.
 */
public class RandomResolver implements OrderedResolver {

  private static final Logger LOG =
      LoggerFactory.getLogger(RandomResolver.class);

  /**
   * Get a random name space from the path.
   *
   * @param path Path ignored by this policy.
   * @param loc Federated location with multiple destinations.
   * @return Random name space.
   */
  public String getFirstNamespace(final String path, final PathLocation loc) {
    final Set<String> namespaces = (loc == null) ? null : loc.getNamespaces();
    if (CollectionUtils.isEmpty(namespaces)) {
      LOG.error("Cannot get namespaces for {}", loc);
      return null;
    }
    final int index = ThreadLocalRandom.current().nextInt(namespaces.size());
    return Iterables.get(namespaces, index);
  }
}