package org.apache.hadoop.hdfs.server.namenode.ha;

import org.apache.hadoop.conf.Configuration;

import java.net.URI;

import static org.apache.hadoop.hdfs.client.HdfsClientConfigKeys.DFS_PROVIDED_ALIASMAP_INMEMORY_RPC_ADDRESS;

/**
 * A {@link ConfiguredFailoverProxyProvider} implementation used to connect
 * to an InMemoryAliasMap.
 */
public class InMemoryAliasMapFailoverProxyProvider<T>
    extends ConfiguredFailoverProxyProvider<T> {

  public InMemoryAliasMapFailoverProxyProvider(
      Configuration conf, URI uri, Class<T> xface, HAProxyFactory<T> factory) {
    super(conf, uri, xface, factory,
        DFS_PROVIDED_ALIASMAP_INMEMORY_RPC_ADDRESS);
  }
}
