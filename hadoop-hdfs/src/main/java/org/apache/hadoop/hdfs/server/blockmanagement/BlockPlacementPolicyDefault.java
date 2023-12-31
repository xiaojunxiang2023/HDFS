package org.apache.hadoop.hdfs.server.blockmanagement;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.AddBlockFlag;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.net.DFSNetworkTopology;
import org.apache.hadoop.hdfs.protocol.BlockStoragePolicy;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.net.NetworkTopology;
import org.apache.hadoop.net.Node;
import org.apache.hadoop.net.NodeBase;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

import java.util.*;
import java.util.concurrent.TimeUnit;

import static org.apache.hadoop.hdfs.DFSConfigKeys.*;
import static org.apache.hadoop.util.Time.monotonicNow;

// 默认的三副本机制
public class BlockPlacementPolicyDefault extends BlockPlacementPolicy {

  private static final String enableDebugLogging =
      "For more information, please enable DEBUG log level on "
          + BlockPlacementPolicy.class.getName() + " and "
          + NetworkTopology.class.getName();

  private static final ThreadLocal<StringBuilder> debugLoggingBuilder
      = ThreadLocal.withInitial(() -> new StringBuilder());

  private static final ThreadLocal<HashMap<NodeNotChosenReason, Integer>>
      CHOOSE_RANDOM_REASONS = ThreadLocal.withInitial(HashMap::new);

  private static final BlockPlacementStatus ONE_RACK_PLACEMENT =
      new BlockPlacementStatusDefault(1, 1, 1);

  private enum NodeNotChosenReason {
    NOT_IN_SERVICE("the node is not in service"),
    NODE_STALE("the node is stale"),
    NODE_TOO_BUSY("the node is too busy"),
    TOO_MANY_NODES_ON_RACK("the rack has too many chosen nodes"),
    NOT_ENOUGH_STORAGE_SPACE("not enough storage space to place the block"),
    NO_REQUIRED_STORAGE_TYPE("required storage types are unavailable"),
    NODE_SLOW("the node is too slow");

    private final String text;

    NodeNotChosenReason(final String logText) {
      text = logText;
    }

    private String getText() {
      return text;
    }
  }

  // 集群状态
  private FSClusterStats stats;
  // 网络拓扑
  protected NetworkTopology clusterMap;
  // host -> node
  protected Host2NodesMap host2datanodeMap;


  // 默认为 true，考虑目标节点的负载
  protected boolean considerLoad;
  protected double considerLoadFactor;
  // 默认为 false，不考虑目标相对于存储类型的负载 
  private boolean considerLoadByStorageType;

  // 默认为 true，优先选择客户端正在运行的节点来存储第一个副本
  private boolean preferLocalNode;

  // 默认为 false，关闭跟踪 DataNode 对等统计信息的开关。
  private boolean dataNodePeerStatsEnabled;

  // 默认为 false，不排除慢节点
  private volatile boolean excludeSlowNodesEnabled;

  protected long heartbeatInterval;   // interval for DataNode heartbeats
  private long staleInterval;   // interval used to identify stale DataNodes

  // 对于副本删除策略来说，可以容忍如此多的心跳丢失。
  protected int tolerateHeartbeatMultiplier;

  @Override
  public void initialize(Configuration conf, FSClusterStats stats,
                         NetworkTopology clusterMap,
                         Host2NodesMap host2datanodeMap) {
    this.considerLoad = conf.getBoolean(
        DFSConfigKeys.DFS_NAMENODE_REDUNDANCY_CONSIDERLOAD_KEY,
        DFSConfigKeys.DFS_NAMENODE_REDUNDANCY_CONSIDERLOAD_DEFAULT);
    this.considerLoadFactor = conf.getDouble(
        DFSConfigKeys.DFS_NAMENODE_REDUNDANCY_CONSIDERLOAD_FACTOR,
        DFSConfigKeys.DFS_NAMENODE_REDUNDANCY_CONSIDERLOAD_FACTOR_DEFAULT);
    this.considerLoadByStorageType = conf.getBoolean(
        DFS_NAMENODE_REDUNDANCY_CONSIDERLOADBYSTORAGETYPE_KEY,
        DFS_NAMENODE_REDUNDANCY_CONSIDERLOADBYSTORAGETYPE_DEFAULT);
    this.stats = stats;
    this.clusterMap = clusterMap;
    this.host2datanodeMap = host2datanodeMap;
    this.heartbeatInterval = conf.getTimeDuration(
        DFSConfigKeys.DFS_HEARTBEAT_INTERVAL_KEY,
        DFSConfigKeys.DFS_HEARTBEAT_INTERVAL_DEFAULT,
        TimeUnit.SECONDS, TimeUnit.MILLISECONDS);
    this.tolerateHeartbeatMultiplier = conf.getInt(
        DFSConfigKeys.DFS_NAMENODE_TOLERATE_HEARTBEAT_MULTIPLIER_KEY,
        DFSConfigKeys.DFS_NAMENODE_TOLERATE_HEARTBEAT_MULTIPLIER_DEFAULT);
    this.staleInterval = conf.getLong(
        DFSConfigKeys.DFS_NAMENODE_STALE_DATANODE_INTERVAL_KEY,
        DFSConfigKeys.DFS_NAMENODE_STALE_DATANODE_INTERVAL_DEFAULT);
    this.preferLocalNode = conf.getBoolean(
        DFSConfigKeys.
            DFS_NAMENODE_BLOCKPLACEMENTPOLICY_DEFAULT_PREFER_LOCAL_NODE_KEY,
        DFSConfigKeys.
            DFS_NAMENODE_BLOCKPLACEMENTPOLICY_DEFAULT_PREFER_LOCAL_NODE_DEFAULT);
    this.dataNodePeerStatsEnabled = conf.getBoolean(
        DFSConfigKeys.DFS_DATANODE_PEER_STATS_ENABLED_KEY,
        DFSConfigKeys.DFS_DATANODE_PEER_STATS_ENABLED_DEFAULT);
    this.excludeSlowNodesEnabled = conf.getBoolean(
        DFS_NAMENODE_BLOCKPLACEMENTPOLICY_EXCLUDE_SLOW_NODES_ENABLED_KEY,
        DFS_NAMENODE_BLOCKPLACEMENTPOLICY_EXCLUDE_SLOW_NODES_ENABLED_DEFAULT);
  }

  // chooseTarget的实现，Redundancy的入口
  @Override
  public DatanodeStorageInfo[] chooseTarget(String srcPath,
                                            int numOfReplicas,
                                            Node writer,
                                            List<DatanodeStorageInfo> chosenNodes,
                                            boolean returnChosenNodes,
                                            Set<Node> excludedNodes,
                                            long blocksize,
                                            final BlockStoragePolicy storagePolicy,
                                            EnumSet<AddBlockFlag> flags) {
    return chooseTarget(numOfReplicas, writer, chosenNodes, returnChosenNodes,
        excludedNodes, blocksize, storagePolicy, flags, null);
  }


  // chooseTarget favoredNodes的实现，正常写文件的入口
  // 基于 numOfReplicas去创建 results 或者 chosenNodes，结果都会写到这块内存里
  @Override
  DatanodeStorageInfo[] chooseTarget(String src,  // 源地址
                                     int numOfReplicas, // 目标要选择的副本数
                                     Node writer,  // Client
                                     Set<Node> excludedNodes,
                                     long blocksize,
                                     List<DatanodeDescriptor> favoredNodes,
                                     BlockStoragePolicy storagePolicy,
                                     EnumSet<AddBlockFlag> flags) {  // flags一般为空
    // 不考虑 favoredNodes, 则转到了 "chooseTarget的实现，Redundancy的入口"
    return chooseTarget(src, numOfReplicas, writer,
        new ArrayList<>(numOfReplicas), false,
        excludedNodes, blocksize, storagePolicy, flags);
  }


  protected void chooseFavouredNodes(String src, int numOfReplicas,
                                     List<DatanodeDescriptor> favoredNodes,
                                     Set<Node> favoriteAndExcludedNodes, long blocksize, int maxNodesPerRack,
                                     List<DatanodeStorageInfo> results, boolean avoidStaleNodes,
                                     EnumMap<StorageType, Integer> storageTypes)
      throws NotEnoughReplicasException {
//    for (int i = 0; i < favoredNodes.size() && results.size() < numOfReplicas;
//         i++) {
//      DatanodeDescriptor favoredNode = favoredNodes.get(i);
//      // Choose a single node which is local to favoredNode.
//      // 'results' is updated within chooseLocalNode
//      final DatanodeStorageInfo target = chooseLocalOrFavoredStorage(
//          favoredNode, true, favoriteAndExcludedNodes, blocksize,
//          maxNodesPerRack, results, avoidStaleNodes, storageTypes);
//
//      if (target == null) {
//        LOG.warn("Could not find a target for file " + src
//            + " with favored node " + favoredNode);
//        continue;
//      }
//      favoriteAndExcludedNodes.add(target.getDatanodeDescriptor());
//    }
  }

  // chooseTarget的实现 
  private DatanodeStorageInfo[] chooseTarget(int numOfReplicas,
                                             Node writer,
                                             List<DatanodeStorageInfo> chosenStorage,
                                             boolean returnChosenNodes,
                                             Set<Node> excludedNodes,
                                             long blocksize,
                                             final BlockStoragePolicy storagePolicy,
                                             EnumSet<AddBlockFlag> addBlockFlags,
                                             EnumMap<StorageType, Integer> sTypes) {
    int[] result = getMaxNodesPerRack(chosenStorage.size(), numOfReplicas);
    numOfReplicas = result[0];
    int maxNodesPerRack = result[1];

    // 已经选择过的 DN，就不要再选择了，所以添加到 excludedNodes
    for (DatanodeStorageInfo storage : chosenStorage) {
      addToExcludedNodes(storage.getDatanodeDescriptor(), excludedNodes);
    }

    List<DatanodeStorageInfo> results;
    Node localNode;
    boolean avoidStaleNodes = (stats != null && stats.isAvoidingStaleDataNodesForWrite());

    results = new ArrayList<>(chosenStorage);
    // 真正执行的地方
    localNode = chooseTarget(numOfReplicas, writer, excludedNodes,
        blocksize, maxNodesPerRack, results, avoidStaleNodes,
        storagePolicy, EnumSet.noneOf(StorageType.class), results.isEmpty(),
        sTypes);

    if (!returnChosenNodes) {
      results.removeAll(chosenStorage);
    }

    // 对节点进行排序返回 pipeline
    return getPipeline((writer instanceof DatanodeDescriptor) ? writer : localNode,
        results.toArray(DatanodeStorageInfo.EMPTY_ARRAY));
  }

  // numOfChosen是已经具有了的副本，numOfReplicas是期待 是还需要的副本
  // results[0]=除了已经选择的节点之外，允许分配的节点数。
  // results[1]=每个 rack允许的最大节点数。这与所选节点的数量无关，因为它是使用目标副本数量计算的。
  protected int[] getMaxNodesPerRack(int numOfChosen, int numOfReplicas) {
    int clusterSize = clusterMap.getNumOfLeaves();
    int totalNumOfReplicas = numOfChosen + numOfReplicas;
    if (totalNumOfReplicas > clusterSize) {
      // 即 numOfReplicas = clusterSize - numOfChosen
      // totalNumOfReplicas = clusterSize;
      numOfReplicas -= (totalNumOfReplicas - clusterSize);
      totalNumOfReplicas = clusterSize;
    }

    int numOfRacks = clusterMap.getNumOfRacks();
    if (numOfRacks <= 1 || totalNumOfReplicas <= 1) {
      // // 第一次 put文件会走这里，因为 totalNumOfReplicas = 1
      return new int[]{numOfReplicas, totalNumOfReplicas};
    } else {
      int maxNodesPerRack = (totalNumOfReplicas - 1) / numOfRacks + 2;
      // 1) maxNodesPerRack >= 2
      // 2) (maxNodesPerRack-1) * numOfRacks > totalNumOfReplicas  when numOfRacks > 1
      if (maxNodesPerRack == totalNumOfReplicas) {
        maxNodesPerRack--;
      }
      return new int[]{numOfReplicas, maxNodesPerRack};
    }
  }

  private EnumMap<StorageType, Integer> getRequiredStorageTypes(
      List<StorageType> types) {
    EnumMap<StorageType, Integer> map = new EnumMap<>(StorageType.class);
    for (StorageType type : types) {
      if (!map.containsKey(type)) {
        map.put(type, 1);
      } else {
        int num = map.get(type);
        map.put(type, num + 1);
      }
    }
    return map;
  }

  private Node chooseTarget(final int numOfReplicas,
                            Node writer,
                            final Set<Node> excludedNodes,
                            final long blocksize,
                            final int maxNodesPerRack,
                            final List<DatanodeStorageInfo> results,
                            final boolean avoidStaleNodes,
                            final BlockStoragePolicy storagePolicy,
                            final EnumSet<StorageType> unavailableStorages,
                            final boolean newBlock,
                            EnumMap<StorageType, Integer> storageTypes) {
    if (numOfReplicas == 0 || clusterMap.getNumOfLeaves() == 0) {
      return (writer instanceof DatanodeDescriptor) ? writer : null;
    }
    final int numOfResults = results.size();
    final int totalReplicasExpected = numOfReplicas + numOfResults;
    // 如果 Client不是 DataNode节点，并且不是新的 Block, 则返回首个 DataNode节点
    if ((!(writer instanceof DatanodeDescriptor)) && !newBlock) {
      writer = results.get(0).getDatanodeDescriptor();
    }

    // Keep a copy of original excludedNodes
    final Set<Node> oldExcludedNodes = new HashSet<>(excludedNodes);

    // choose storage types; use fallbacks for unavailable storages
    final List<StorageType> requiredStorageTypes = storagePolicy
        .chooseStorageTypes((short) totalReplicasExpected,
            DatanodeStorageInfo.toStorageTypes(results),
            unavailableStorages, newBlock);
    if (storageTypes == null) {
      storageTypes = getRequiredStorageTypes(requiredStorageTypes);
    }
    LOG.trace("storageTypes={}", storageTypes);

    try {
      if (requiredStorageTypes.size() == 0) { // 没有能存储的节点 甚至是类型了
        throw new NotEnoughReplicasException(
            "All required storage types are unavailable: "
                + " unavailableStorages=" + unavailableStorages
                + ", storagePolicy=" + storagePolicy);
      }
      writer = chooseTargetInOrder(numOfReplicas, writer, excludedNodes, blocksize,
          maxNodesPerRack, results, avoidStaleNodes, newBlock, storageTypes);
    } catch (NotEnoughReplicasException e) {
      final String message = "Failed to place enough replicas, still in need of "
          + (totalReplicasExpected - results.size()) + " to reach "
          + totalReplicasExpected
          + " (unavailableStorages=" + unavailableStorages
          + ", storagePolicy=" + storagePolicy
          + ", newBlock=" + newBlock + ")";

      LOG.trace(message, e);
      LOG.warn(message + " " + e.getMessage());

      if (avoidStaleNodes) {
        // Retry chooseTarget again, this time not avoiding stale nodes.

        // excludedNodes contains the initial excludedNodes and nodes that were
        // not chosen because they were stale, decommissioned, etc.
        // We need to additionally exclude the nodes that were added to the 
        // result list in the successful calls to choose*() above.
        for (DatanodeStorageInfo resultStorage : results) {
          addToExcludedNodes(resultStorage.getDatanodeDescriptor(), oldExcludedNodes);
        }
        // Set newNumOfReplicas, since it can get out of sync with the result list
        // if the NotEnoughReplicasException was thrown in chooseRandom().
        int newNumOfReplicas = totalReplicasExpected - results.size();
        return chooseTarget(newNumOfReplicas, writer, oldExcludedNodes, blocksize,
            maxNodesPerRack, results, false, storagePolicy, unavailableStorages,
            newBlock, null);
      }

      boolean retry = false;
      // simply add all the remaining types into unavailableStorages and give
      // another try. No best effort is guaranteed here.
      for (StorageType type : storageTypes.keySet()) {
        if (!unavailableStorages.contains(type)) {
          unavailableStorages.add(type);
          retry = true;
        }
      }
      if (retry) {
        for (DatanodeStorageInfo resultStorage : results) {
          addToExcludedNodes(resultStorage.getDatanodeDescriptor(),
              oldExcludedNodes);
        }
        int newNumOfReplicas = totalReplicasExpected - results.size();
        // 递归，但是参数值更新为了 newNumOfReplicas
        return chooseTarget(newNumOfReplicas, writer, oldExcludedNodes, blocksize,
            maxNodesPerRack, results, false, storagePolicy, unavailableStorages,
            newBlock, null);
      }
    }
    return writer;
  }

  protected Node chooseTargetInOrder(int numOfReplicas,
                                     Node writer,
                                     final Set<Node> excludedNodes,
                                     final long blocksize,
                                     final int maxNodesPerRack,
                                     final List<DatanodeStorageInfo> results,
                                     final boolean avoidStaleNodes,
                                     final boolean newBlock,
                                     EnumMap<StorageType, Integer> storageTypes)
      throws NotEnoughReplicasException {  // 核心方法
    final int numOfResults = results.size();
    if (numOfResults == 0) {
      DatanodeStorageInfo storageInfo = chooseLocalStorage(writer,
          excludedNodes, blocksize, maxNodesPerRack, results, avoidStaleNodes,
          storageTypes, true);

      writer = (storageInfo != null) ? storageInfo.getDatanodeDescriptor() : null;

      if (--numOfReplicas == 0) {
        return writer;
      }
    }
    final DatanodeDescriptor dn0 = results.get(0).getDatanodeDescriptor();
    if (numOfResults <= 1) {
      chooseRemoteRack(dn0, excludedNodes, blocksize, maxNodesPerRack,
          results, avoidStaleNodes, storageTypes);
      if (--numOfReplicas == 0) {
        return writer;
      }
    }
    if (numOfResults <= 2) {
      final DatanodeDescriptor dn1 = results.get(1).getDatanodeDescriptor();
      if (clusterMap.isOnSameRack(dn0, dn1)) {
        chooseRemoteRack(dn0, excludedNodes, blocksize, maxNodesPerRack,
            results, avoidStaleNodes, storageTypes);
      } else if (newBlock) {
        chooseLocalRack(dn1, excludedNodes, blocksize, maxNodesPerRack,
            results, avoidStaleNodes, storageTypes);
      } else {
        chooseLocalRack(writer, excludedNodes, blocksize, maxNodesPerRack,
            results, avoidStaleNodes, storageTypes);
      }
      if (--numOfReplicas == 0) {
        return writer;
      }
    }
    chooseRandom(numOfReplicas, NodeBase.ROOT, excludedNodes, blocksize,
        maxNodesPerRack, results, avoidStaleNodes, storageTypes);
    return writer;
  }

  protected DatanodeStorageInfo chooseLocalStorage(Node localMachine,
                                                   Set<Node> excludedNodes, long blocksize, int maxNodesPerRack,
                                                   List<DatanodeStorageInfo> results, boolean avoidStaleNodes,
                                                   EnumMap<StorageType, Integer> storageTypes)
      throws NotEnoughReplicasException {
    return chooseLocalOrFavoredStorage(localMachine, false,
        excludedNodes, blocksize, maxNodesPerRack, results, avoidStaleNodes,
        storageTypes);
  }

  protected DatanodeStorageInfo chooseLocalOrFavoredStorage(
      Node localOrFavoredNode, boolean isFavoredNode, Set<Node> excludedNodes,
      long blocksize, int maxNodesPerRack, List<DatanodeStorageInfo> results,
      boolean avoidStaleNodes, EnumMap<StorageType, Integer> storageTypes)
      throws NotEnoughReplicasException {
    // if no local machine, randomly choose one node
    if (localOrFavoredNode == null) {
      return chooseRandom(NodeBase.ROOT, excludedNodes, blocksize,
          maxNodesPerRack, results, avoidStaleNodes, storageTypes);
    }
    if ((preferLocalNode || isFavoredNode)
        && localOrFavoredNode instanceof DatanodeDescriptor
        && clusterMap.contains(localOrFavoredNode)) {
      DatanodeDescriptor localDatanode =
          (DatanodeDescriptor) localOrFavoredNode;
      // otherwise try local machine first
      if (excludedNodes.add(localOrFavoredNode) // was not in the excluded list
          && isGoodDatanode(localDatanode, maxNodesPerRack, false,
          results, avoidStaleNodes)) {
        for (Iterator<Map.Entry<StorageType, Integer>> iter = storageTypes
            .entrySet().iterator(); iter.hasNext(); ) {
          Map.Entry<StorageType, Integer> entry = iter.next();
          DatanodeStorageInfo localStorage = chooseStorage4Block(
              localDatanode, blocksize, results, entry.getKey());
          if (localStorage != null) {
            // add node and related nodes to excludedNode
            addToExcludedNodes(localDatanode, excludedNodes);
            int num = entry.getValue();
            if (num == 1) {
              iter.remove();
            } else {
              entry.setValue(num - 1);
            }
            return localStorage;
          }
        }
      }
    }
    return null;
  }

  protected DatanodeStorageInfo chooseLocalStorage(Node localMachine,
                                                   Set<Node> excludedNodes, long blocksize, int maxNodesPerRack,
                                                   List<DatanodeStorageInfo> results, boolean avoidStaleNodes,
                                                   EnumMap<StorageType, Integer> storageTypes, boolean fallbackToLocalRack)
      throws NotEnoughReplicasException {
    DatanodeStorageInfo localStorage = chooseLocalStorage(localMachine,
        excludedNodes, blocksize, maxNodesPerRack, results,
        avoidStaleNodes, storageTypes);
    if (localStorage != null) {
      return localStorage;
    }

    if (!fallbackToLocalRack) {
      return null;
    }
    // fallback到 chooseLocalRack
    return chooseLocalRack(localMachine, excludedNodes, blocksize,
        maxNodesPerRack, results, avoidStaleNodes, storageTypes);
  }

  protected void addToExcludedNodes(DatanodeDescriptor localMachine,
                                    Set<Node> excludedNodes) {
    excludedNodes.add(localMachine);
  }

  /**
   * Choose one node from the rack that <i>localMachine</i> is on.
   * if no such node is available, choose one node from the rack where
   * a second replica is on.
   * if still no such node is available, choose a random node 
   * in the cluster.
   * @return the chosen node
   */
  protected DatanodeStorageInfo chooseLocalRack(Node localMachine,
                                                Set<Node> excludedNodes,
                                                long blocksize,
                                                int maxNodesPerRack,
                                                List<DatanodeStorageInfo> results,
                                                boolean avoidStaleNodes,
                                                EnumMap<StorageType, Integer> storageTypes)
      throws NotEnoughReplicasException {
    // no local machine, so choose a random machine
    if (localMachine == null) {
      return chooseRandom(NodeBase.ROOT, excludedNodes, blocksize,
          maxNodesPerRack, results, avoidStaleNodes, storageTypes);
    }
    final String localRack = localMachine.getNetworkLocation();

    try {
      // choose one from the local rack
      return chooseRandom(localRack, excludedNodes,
          blocksize, maxNodesPerRack, results, avoidStaleNodes, storageTypes);
    } catch (NotEnoughReplicasException e) {
      // fallback 到任意
      for (DatanodeStorageInfo resultStorage : results) {
        DatanodeDescriptor nextNode = resultStorage.getDatanodeDescriptor();
        if (nextNode != localMachine) {
          if (LOG.isDebugEnabled()) {
            LOG.debug("Failed to choose from local rack (location = " + localRack
                + "), retry with the rack of the next replica (location = "
                + nextNode.getNetworkLocation() + ")", e);
          }
          return chooseFromNextRack(nextNode, excludedNodes, blocksize,
              maxNodesPerRack, results, avoidStaleNodes, storageTypes);
        }
      }

      LOG.debug("Failed to choose from local rack (location = {}); the second"
          + " replica is not found, retry choosing randomly", localRack, e);

      return chooseRandom(NodeBase.ROOT, excludedNodes, blocksize,
          maxNodesPerRack, results, avoidStaleNodes, storageTypes);
    }
  }

  private DatanodeStorageInfo chooseFromNextRack(Node next,
                                                 Set<Node> excludedNodes,
                                                 long blocksize,
                                                 int maxNodesPerRack,
                                                 List<DatanodeStorageInfo> results,
                                                 boolean avoidStaleNodes,
                                                 EnumMap<StorageType, Integer> storageTypes) throws NotEnoughReplicasException {
    final String nextRack = next.getNetworkLocation();
    try {
      return chooseRandom(nextRack, excludedNodes, blocksize, maxNodesPerRack,
          results, avoidStaleNodes, storageTypes);
    } catch (NotEnoughReplicasException e) {
      LOG.debug("Failed to choose from the next rack (location = {}), "
          + "retry choosing randomly", nextRack, e);
      // fallback 到任意
      return chooseRandom(NodeBase.ROOT, excludedNodes, blocksize,
          maxNodesPerRack, results, avoidStaleNodes, storageTypes);
    }
  }

  /**
   * Choose <i>numOfReplicas</i> nodes from the racks 
   * that <i>localMachine</i> is NOT on.
   * If not enough nodes are available, choose the remaining ones
   * from the local rack
   */
  protected void chooseRemoteRack(DatanodeDescriptor localMachine,
                                  Set<Node> excludedNodes,
                                  long blocksize,
                                  int maxReplicasPerRack,
                                  List<DatanodeStorageInfo> results,
                                  boolean avoidStaleNodes,
                                  EnumMap<StorageType, Integer> storageTypes)
      throws NotEnoughReplicasException {
    int oldNumOfReplicas = results.size();
    // randomly choose one node from remote racks
    try {
      chooseRandom(1, "~" + localMachine.getNetworkLocation(),
          excludedNodes, blocksize, maxReplicasPerRack, results,
          avoidStaleNodes, storageTypes);
    } catch (NotEnoughReplicasException e) {
      if (LOG.isDebugEnabled()) {
        LOG.debug("Failed to choose remote rack (location = ~"
            + localMachine.getNetworkLocation() + "), fallback to local rack", e);
      }
      // fallback 到 localRack
      chooseRandom(1 - (results.size() - oldNumOfReplicas),
          localMachine.getNetworkLocation(), excludedNodes, blocksize,
          maxReplicasPerRack, results, avoidStaleNodes, storageTypes);
    }
  }

  /**
   * Randomly choose one target from the given <i>scope</i>.
   * @return the chosen storage, if there is any.
   */
  protected DatanodeStorageInfo chooseRandom(String scope,
                                             Set<Node> excludedNodes,
                                             long blocksize,
                                             int maxNodesPerRack,
                                             List<DatanodeStorageInfo> results,
                                             boolean avoidStaleNodes,
                                             EnumMap<StorageType, Integer> storageTypes)
      throws NotEnoughReplicasException {
    return chooseRandom(1, scope, excludedNodes, blocksize, maxNodesPerRack,
        results, avoidStaleNodes, storageTypes);
  }

  /**
   * Randomly choose <i>numOfReplicas</i> targets from the given <i>scope</i>.
   * @return the first chosen node, if there is any.
   */
  protected DatanodeStorageInfo chooseRandom(int numOfReplicas,
                                             String scope,
                                             Set<Node> excludedNodes,
                                             long blocksize,
                                             int maxNodesPerRack,
                                             List<DatanodeStorageInfo> results,
                                             boolean avoidStaleNodes,
                                             EnumMap<StorageType, Integer> storageTypes)
      throws NotEnoughReplicasException {
    StringBuilder builder = debugLoggingBuilder.get();
    if (LOG.isDebugEnabled()) {
      builder.setLength(0);
      builder.append("[");
    }
    CHOOSE_RANDOM_REASONS.get().clear();
    boolean badTarget = false;
    DatanodeStorageInfo firstChosen = null;
    while (numOfReplicas > 0) {
      // the storage type that current node has
      StorageType includeType = null;
      DatanodeDescriptor chosenNode = null;
      if (clusterMap instanceof DFSNetworkTopology) {
        for (StorageType type : storageTypes.keySet()) {
          chosenNode = chooseDataNode(scope, excludedNodes, type);

          if (chosenNode != null) {
            includeType = type;
            break;
          }
          logNodeIsNotChosen(null,
              NodeNotChosenReason.NO_REQUIRED_STORAGE_TYPE,
              " for storage type " + type);
        }
      } else {
        chosenNode = chooseDataNode(scope, excludedNodes);
      }

      if (chosenNode == null) {
        break;
      }
      Preconditions.checkState(excludedNodes.add(chosenNode), "chosenNode "
          + chosenNode + " is already in excludedNodes " + excludedNodes);
      if (LOG.isDebugEnabled()) {
        builder.append("\nNode ").append(NodeBase.getPath(chosenNode))
            .append(" [");
      }
      DatanodeStorageInfo storage = null;
      if (isGoodDatanode(chosenNode, maxNodesPerRack, considerLoad,
          results, avoidStaleNodes)) {
        for (Iterator<Map.Entry<StorageType, Integer>> iter = storageTypes
            .entrySet().iterator(); iter.hasNext(); ) {
          Map.Entry<StorageType, Integer> entry = iter.next();

          // If there is one storage type the node has already contained,
          // then no need to loop through other storage type.
          if (includeType != null && entry.getKey() != includeType) {
            continue;
          }

          storage = chooseStorage4Block(
              chosenNode, blocksize, results, entry.getKey());
          if (storage != null) {
            numOfReplicas--;
            if (firstChosen == null) {
              firstChosen = storage;
            }
            // add node (subclasses may also add related nodes) to excludedNode
            addToExcludedNodes(chosenNode, excludedNodes);
            int num = entry.getValue();
            if (num == 1) {
              iter.remove();
            } else {
              entry.setValue(num - 1);
            }
            break;
          }
        }

        if (LOG.isDebugEnabled()) {
          builder.append("\n]");
        }

        // If no candidate storage was found on this DN then set badTarget.
        badTarget = (storage == null);
      }
    }
    if (numOfReplicas > 0) {
      String detail = enableDebugLogging;
      if (LOG.isDebugEnabled()) {
        detail = builder.toString();
        if (badTarget) {
          builder.setLength(0);
        } else {
          if (detail.length() > 1) {
            // only log if there's more than "[", which is always appended at
            // the beginning of this method.
            LOG.debug(detail);
          }
          detail = "";
        }
      }
      final HashMap<NodeNotChosenReason, Integer> reasonMap =
          CHOOSE_RANDOM_REASONS.get();
      if (!reasonMap.isEmpty()) {
        LOG.info("Not enough replicas was chosen. Reason: {}", reasonMap);
      }
      throw new NotEnoughReplicasException(detail);
    }

    return firstChosen;
  }

  // 在给定的 scope间随机选取 DataNode
  protected DatanodeDescriptor chooseDataNode(final String scope,
                                              final Collection<Node> excludedNodes) {
    return (DatanodeDescriptor) clusterMap.chooseRandom(scope, excludedNodes);
  }

  // 在给定的 scope间随机选取 DataNode，同时考虑存储类型
  protected DatanodeDescriptor chooseDataNode(final String scope,
                                              final Collection<Node> excludedNodes, StorageType type) {
    return (DatanodeDescriptor) ((DFSNetworkTopology) clusterMap)
        .chooseRandomWithStorageTypeTwoTrial(scope, excludedNodes, type);
  }

  DatanodeStorageInfo chooseStorage4Block(DatanodeDescriptor dnd,
                                          long blockSize,
                                          List<DatanodeStorageInfo> results,
                                          StorageType storageType) {
    DatanodeStorageInfo storage =
        dnd.chooseStorage4Block(storageType, blockSize);
    if (storage != null) {
      results.add(storage);
    } else {
      logNodeIsNotChosen(dnd, NodeNotChosenReason.NOT_ENOUGH_STORAGE_SPACE,
          " for storage type " + storageType);
    }
    return storage;
  }

  private static void logNodeIsNotChosen(DatanodeDescriptor node,
                                         NodeNotChosenReason reason) {
    logNodeIsNotChosen(node, reason, null);
  }

  private static void logNodeIsNotChosen(DatanodeDescriptor node,
                                         NodeNotChosenReason reason, String reasonDetails) {
    assert reason != null;
    if (LOG.isDebugEnabled()) {
      // build the error message for later use.
      debugLoggingBuilder.get()
          .append("\n  Datanode ").append((node == null) ? "None" : node)
          .append(" is not chosen since ").append(reason.getText());
      if (reasonDetails != null) {
        debugLoggingBuilder.get().append(" ").append(reasonDetails);
      }
      debugLoggingBuilder.get().append(".");
    }
    // always populate reason map to log high level reasons.
    final HashMap<NodeNotChosenReason, Integer> reasonMap =
        CHOOSE_RANDOM_REASONS.get();
    Integer base = reasonMap.get(reason);
    if (base == null) {
      base = 0;
    }
    reasonMap.put(reason, base + 1);
  }

  // 根据负载来判断此 DataNode是否应该被排除 
  boolean excludeNodeByLoad(DatanodeDescriptor node) {
    double inServiceXceiverCount = getInServiceXceiverAverage(node);
    final double maxLoad = considerLoadFactor * inServiceXceiverCount;

    final int nodeLoad = node.getXceiverCount();
    if ((nodeLoad > maxLoad) && (maxLoad > 0)) {
      logNodeIsNotChosen(node, NodeNotChosenReason.NODE_TOO_BUSY,
          "(load: " + nodeLoad + " > " + maxLoad + ")");
      return true;
    }
    return false;
  }

  private double getInServiceXceiverAverage(DatanodeDescriptor node) {
    double inServiceXceiverCount;
    if (considerLoadByStorageType) {
      inServiceXceiverCount =
          getInServiceXceiverAverageByStorageType(node.getStorageTypes());
    } else {
      inServiceXceiverCount = stats.getInServiceXceiverAverage();
    }
    return inServiceXceiverCount;
  }

  private double getInServiceXceiverAverageByStorageType(
      Set<StorageType> storageTypes) {
    double avgLoad = 0;
    final Map<StorageType, StorageTypeStats> storageStats =
        stats.getStorageTypeStats();
    int numNodes = 0;
    int numXceiver = 0;
    for (StorageType s : storageTypes) {
      StorageTypeStats storageTypeStats = storageStats.get(s);
      numNodes += storageTypeStats.getNodesInService();
      numXceiver += storageTypeStats.getNodesInServiceXceiverCount();
    }
    if (numNodes != 0) {
      avgLoad = (double) numXceiver / numNodes;
    }

    return avgLoad;
  }

  boolean isGoodDatanode(DatanodeDescriptor node,
                         int maxTargetPerRack, boolean considerLoad,
                         List<DatanodeStorageInfo> results,
                         boolean avoidStaleNodes) {
    // check if the node is (being) decommissioned
    if (!node.isInService()) {
      logNodeIsNotChosen(node, NodeNotChosenReason.NOT_IN_SERVICE);
      return false;
    }

    if (avoidStaleNodes) {
      if (node.isStale(this.staleInterval)) {
        logNodeIsNotChosen(node, NodeNotChosenReason.NODE_STALE);
        return false;
      }
    }

    // check the communication traffic of the target machine
    if (considerLoad) {
      if (excludeNodeByLoad(node)) {
        return false;
      }
    }

    // check if the target rack has chosen too many nodes
    String rackname = node.getNetworkLocation();
    int counter = 1;
    for (DatanodeStorageInfo resultStorage : results) {
      if (rackname.equals(
          resultStorage.getDatanodeDescriptor().getNetworkLocation())) {
        counter++;
      }
    }
    if (counter > maxTargetPerRack) {
      logNodeIsNotChosen(node, NodeNotChosenReason.TOO_MANY_NODES_ON_RACK);
      return false;
    }

    // check if the target is a slow node
    if (dataNodePeerStatsEnabled && excludeSlowNodesEnabled) {
      Set<String> slowNodesUuidSet = DatanodeManager.getSlowNodesUuidSet();
      if (slowNodesUuidSet.contains(node.getDatanodeUuid())) {
        logNodeIsNotChosen(node, NodeNotChosenReason.NODE_SLOW);
        return false;
      }
    }

    return true;
  }

  private DatanodeStorageInfo[] getPipeline(Node writer,
                                            DatanodeStorageInfo[] storages) {
    if (storages.length == 0) {
      return storages;
    }

    synchronized (clusterMap) {
      int index = 0;
      if (writer == null || !clusterMap.contains(writer)) {
        writer = storages[0].getDatanodeDescriptor();
      }
      for (; index < storages.length; index++) {
        DatanodeStorageInfo shortestStorage = storages[index];
        int shortestDistance = clusterMap.getDistance(writer,
            shortestStorage.getDatanodeDescriptor());
        int shortestIndex = index;
        for (int i = index + 1; i < storages.length; i++) {
          int currentDistance = clusterMap.getDistance(writer,
              storages[i].getDatanodeDescriptor());
          if (shortestDistance > currentDistance) {
            shortestDistance = currentDistance;
            shortestStorage = storages[i];
            shortestIndex = i;
          }
        }
        //switch position index & shortestIndex
        if (index != shortestIndex) {
          storages[shortestIndex] = storages[index];
          storages[index] = shortestStorage;
        }
        writer = shortestStorage.getDatanodeDescriptor();
      }
    }
    return storages;
  }

  @Override
  public BlockPlacementStatus verifyBlockPlacement(DatanodeInfo[] locs,
                                                   int numberOfReplicas) {
    if (locs == null) {
      locs = DatanodeDescriptor.EMPTY_ARRAY;
    }
    if (!clusterMap.hasClusterEverBeenMultiRack()) {
      // only one rack
      return ONE_RACK_PLACEMENT;
    }
    final int minRacks = Math.min(2, numberOfReplicas);
    // 1. Check that all locations are different.
    // 2. Count locations on different racks.
    final long rackCount = Arrays.stream(locs)
        .map(DatanodeInfo::getNetworkLocation).distinct().count();

    return new BlockPlacementStatusDefault(Math.toIntExact(rackCount),
        minRacks, clusterMap.getNumOfRacks());
  }

  public DatanodeStorageInfo chooseReplicaToDelete(
      Collection<DatanodeStorageInfo> moreThanOne,
      Collection<DatanodeStorageInfo> exactlyOne,
      final List<StorageType> excessTypes,
      Map<String, List<DatanodeStorageInfo>> rackMap) {
    long oldestHeartbeat =
        monotonicNow() - heartbeatInterval * tolerateHeartbeatMultiplier;
    DatanodeStorageInfo oldestHeartbeatStorage = null;
    long minSpace = Long.MAX_VALUE;
    DatanodeStorageInfo minSpaceStorage = null;

    // Pick the node with the oldest heartbeat or with the least free space,
    // if all hearbeats are within the tolerable heartbeat interval
    for (DatanodeStorageInfo storage : pickupReplicaSet(moreThanOne,
        exactlyOne, rackMap)) {
      if (!excessTypes.contains(storage.getStorageType())) {
        continue;
      }

      final DatanodeDescriptor node = storage.getDatanodeDescriptor();
      long free = storage.getRemaining();
      long lastHeartbeat = node.getLastUpdateMonotonic();
      if (lastHeartbeat < oldestHeartbeat) {
        oldestHeartbeat = lastHeartbeat;
        oldestHeartbeatStorage = storage;
      }
      if (minSpace > free) {
        minSpace = free;
        minSpaceStorage = storage;
      }
    }

    final DatanodeStorageInfo storage;
    if (oldestHeartbeatStorage != null) {
      storage = oldestHeartbeatStorage;
    } else if (minSpaceStorage != null) {
      storage = minSpaceStorage;
    } else {
      return null;
    }
    excessTypes.remove(storage.getStorageType());
    return storage;
  }

  @Override
  public List<DatanodeStorageInfo> chooseReplicasToDelete(
      Collection<DatanodeStorageInfo> availableReplicas,
      Collection<DatanodeStorageInfo> delCandidates,
      int expectedNumOfReplicas,
      List<StorageType> excessTypes,
      DatanodeDescriptor addedNode,
      DatanodeDescriptor delNodeHint) {

    List<DatanodeStorageInfo> excessReplicas = new ArrayList<>();

    final Map<String, List<DatanodeStorageInfo>> rackMap = new HashMap<>();

    final List<DatanodeStorageInfo> moreThanOne = new ArrayList<>();
    final List<DatanodeStorageInfo> exactlyOne = new ArrayList<>();

    // split candidate nodes for deletion into two sets
    // moreThanOne contains nodes on rack with more than one replica
    // exactlyOne contains the remaining nodes
    splitNodesWithRack(availableReplicas, delCandidates, rackMap, moreThanOne,
        exactlyOne);

    // pick one node to delete that favors the delete hint
    // otherwise pick one with least space from priSet if it is not empty
    // otherwise one node with least space from remains
    boolean firstOne = true;
    final DatanodeStorageInfo delNodeHintStorage =
        DatanodeStorageInfo.getDatanodeStorageInfo(delCandidates, delNodeHint);
    final DatanodeStorageInfo addedNodeStorage =
        DatanodeStorageInfo.getDatanodeStorageInfo(delCandidates, addedNode);

    while (delCandidates.size() - expectedNumOfReplicas > excessReplicas.size()) {
      final DatanodeStorageInfo cur;
      if (firstOne && useDelHint(delNodeHintStorage, addedNodeStorage,
          moreThanOne, exactlyOne, excessTypes)) {
        cur = delNodeHintStorage;
      } else { // regular excessive replica removal
        cur = chooseReplicaToDelete(moreThanOne, exactlyOne,
            excessTypes, rackMap);
      }
      firstOne = false;
      if (cur == null) {
        LOG.debug(
            "No excess replica can be found. excessTypes: {}. "
                + "moreThanOne: {}. exactlyOne: {}.",
            excessTypes, moreThanOne, exactlyOne);
        break;
      }

      // adjust rackmap, moreThanOne, and exactlyOne
      adjustSetsWithChosenReplica(rackMap, moreThanOne, exactlyOne, cur);
      excessReplicas.add(cur);
    }
    return excessReplicas;
  }

  /** Check if we can use delHint. */
  boolean useDelHint(DatanodeStorageInfo delHint,
                     DatanodeStorageInfo added, List<DatanodeStorageInfo> moreThanOne,
                     Collection<DatanodeStorageInfo> exactlyOne,
                     List<StorageType> excessTypes) {
    if (delHint == null) {
      return false; // no delHint
    } else if (!excessTypes.contains(delHint.getStorageType())) {
      return false; // delHint storage type is not an excess type
    } else {
      // check if removing delHint reduces the number of racks
      return notReduceNumOfGroups(moreThanOne, delHint, added);
    }
  }

  // Check if moving from source to target will reduce the number of
  // groups. The groups could be based on racks or upgrade domains.
  <T> boolean notReduceNumOfGroups(List<T> moreThanOne, T source, T target) {
    if (moreThanOne.contains(source)) {
      return true; // source and some other nodes are under the same group.
    } else return target != null && !moreThanOne.contains(target); // the added node adds a new group.
// removing delHint reduces the number of groups.
  }

  @Override
  public boolean isMovable(Collection<DatanodeInfo> locs,
                           DatanodeInfo source, DatanodeInfo target) {
    final Map<String, List<DatanodeInfo>> rackMap = new HashMap<>();
    final List<DatanodeInfo> moreThanOne = new ArrayList<>();
    final List<DatanodeInfo> exactlyOne = new ArrayList<>();
    splitNodesWithRack(locs, locs, rackMap, moreThanOne, exactlyOne);
    return notReduceNumOfGroups(moreThanOne, source, target);
  }

  /**
   * Pick up replica node set for deleting replica as over-replicated. 
   * First set contains replica nodes on rack with more than one
   * replica while second set contains remaining replica nodes.
   * If only 1 rack, pick all. If 2 racks, pick all that have more than
   * 1 replicas on the same rack; if no such replicas, pick all.
   * If 3 or more racks, pick all.
   */
  protected Collection<DatanodeStorageInfo> pickupReplicaSet(
      Collection<DatanodeStorageInfo> moreThanOne,
      Collection<DatanodeStorageInfo> exactlyOne,
      Map<String, List<DatanodeStorageInfo>> rackMap) {
    Collection<DatanodeStorageInfo> ret = new ArrayList<>();
    if (rackMap.size() == 2) {
      for (List<DatanodeStorageInfo> dsi : rackMap.values()) {
        if (dsi.size() >= 2) {
          ret.addAll(dsi);
        }
      }
    }
    if (ret.isEmpty()) {
      // Return all replicas if rackMap.size() != 2
      // or rackMap.size() == 2 but no shared replicas on any rack
      ret.addAll(moreThanOne);
      ret.addAll(exactlyOne);
    }
    return ret;
  }

  @Override
  public void setExcludeSlowNodesEnabled(boolean enable) {
    this.excludeSlowNodesEnabled = enable;
  }

  @Override
  public boolean getExcludeSlowNodesEnabled() {
    return excludeSlowNodesEnabled;
  }
}

