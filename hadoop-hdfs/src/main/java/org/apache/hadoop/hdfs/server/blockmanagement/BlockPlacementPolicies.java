package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.protocol.BlockType;
import org.apache.hadoop.net.NetworkTopology;
import org.apache.hadoop.util.ReflectionUtils;

public class BlockPlacementPolicies {

  private final BlockPlacementPolicy replicationPolicy;
  private final BlockPlacementPolicy ecPolicy;

  public BlockPlacementPolicies(Configuration conf, FSClusterStats stats,
                                NetworkTopology clusterMap,
                                Host2NodesMap host2datanodeMap) {
    final Class<? extends BlockPlacementPolicy> replicatorClass = conf
        .getClass(DFSConfigKeys.DFS_BLOCK_REPLICATOR_CLASSNAME_KEY,
            DFSConfigKeys.DFS_BLOCK_REPLICATOR_CLASSNAME_DEFAULT,
            BlockPlacementPolicy.class);
    replicationPolicy = ReflectionUtils.newInstance(replicatorClass, conf);
    replicationPolicy.initialize(conf, stats, clusterMap, host2datanodeMap);
    final Class<? extends BlockPlacementPolicy> blockPlacementECClass =
        conf.getClass(DFSConfigKeys.DFS_BLOCK_PLACEMENT_EC_CLASSNAME_KEY,
            DFSConfigKeys.DFS_BLOCK_PLACEMENT_EC_CLASSNAME_DEFAULT,
            BlockPlacementPolicy.class);
    ecPolicy = ReflectionUtils.newInstance(blockPlacementECClass, conf);
    ecPolicy.initialize(conf, stats, clusterMap, host2datanodeMap);
  }

  public BlockPlacementPolicy getPolicy(BlockType blockType) {
    switch (blockType) {
      case CONTIGUOUS:
        return replicationPolicy;
      case STRIPED:
        return ecPolicy;
      default:
        throw new IllegalArgumentException(
            "getPolicy received a BlockType that isn't supported.");
    }
  }
}
