package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.protocol.BlockType;
import org.apache.hadoop.net.NetworkTopology;
import org.apache.hadoop.util.ReflectionUtils;

public class BlockPlacementPolicies {

  private final BlockPlacementPolicy replicationPolicy;

  public BlockPlacementPolicies(Configuration conf, FSClusterStats stats,
                                NetworkTopology clusterMap,
                                Host2NodesMap host2datanodeMap) {
    final Class<? extends BlockPlacementPolicy> replicatorClass = conf
        .getClass(DFSConfigKeys.DFS_BLOCK_REPLICATOR_CLASSNAME_KEY,
            DFSConfigKeys.DFS_BLOCK_REPLICATOR_CLASSNAME_DEFAULT,
            BlockPlacementPolicy.class);
    replicationPolicy = ReflectionUtils.newInstance(replicatorClass, conf);
    replicationPolicy.initialize(conf, stats, clusterMap, host2datanodeMap);
  }

  public BlockPlacementPolicy getPolicy(BlockType blockType) {
    switch (blockType) {
      case CONTIGUOUS:
        return replicationPolicy;
      default:
        throw new IllegalArgumentException(
            "getPolicy received a BlockType that isn't supported.");
    }
  }
}
