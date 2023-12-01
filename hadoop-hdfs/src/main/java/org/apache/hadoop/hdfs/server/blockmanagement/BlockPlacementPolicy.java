package org.apache.hadoop.hdfs.server.blockmanagement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hdfs.AddBlockFlag;
import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.protocol.BlockStoragePolicy;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.net.NetworkTopology;
import org.apache.hadoop.net.Node;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// 副本放置策略
public abstract class BlockPlacementPolicy {
  public static final Logger LOG = LoggerFactory.getLogger(
      BlockPlacementPolicy.class);
  
  public static class NotEnoughReplicasException extends Exception {
    private static final long serialVersionUID = 1L;
    NotEnoughReplicasException(String msg) {
      super(msg);
    }
  }
    
  // chooseTarget
  public abstract DatanodeStorageInfo[] chooseTarget(String srcPath,
                                             int numOfReplicas,
                                             Node writer,
                                             List<DatanodeStorageInfo> chosen,
                                             boolean returnChosenNodes,
                                             Set<Node> excludedNodes,
                                             long blocksize,
                                             BlockStoragePolicy storagePolicy,
                                             EnumSet<AddBlockFlag> flags);
  // chooseTarget favoredNodes
  DatanodeStorageInfo[] chooseTarget(String src,
      int numOfReplicas, Node writer,
      Set<Node> excludedNodes,
      long blocksize,
      List<DatanodeDescriptor> favoredNodes,
      BlockStoragePolicy storagePolicy,
      EnumSet<AddBlockFlag> flags) {
    return chooseTarget(src, numOfReplicas, writer,
            new ArrayList<>(numOfReplicas), false,
        excludedNodes, blocksize, storagePolicy, flags);
  }

  // chooseTarget storageTypes
  public DatanodeStorageInfo[] chooseTarget(String srcPath, int numOfReplicas,
      Node writer, List<DatanodeStorageInfo> chosen, boolean returnChosenNodes,
      Set<Node> excludedNodes, long blocksize, BlockStoragePolicy storagePolicy,
      EnumSet<AddBlockFlag> flags, EnumMap<StorageType, Integer> storageTypes) {
    return chooseTarget(srcPath, numOfReplicas, writer, chosen,
        returnChosenNodes, excludedNodes, blocksize, storagePolicy, flags);
  }

  // 校验副本的放置策略是否合理
  public abstract BlockPlacementStatus verifyBlockPlacement(
      DatanodeInfo[] locs, int numOfReplicas);

  // 选择一个待删除的副本
  // 如果不是纠删码场景，则 delCandidates等同于 availableReplicas，否则是其子集
  public abstract List<DatanodeStorageInfo> chooseReplicasToDelete(
      Collection<DatanodeStorageInfo> availableReplicas,
      Collection<DatanodeStorageInfo> delCandidates, int expectedNumOfReplicas,
      List<StorageType> excessTypes, DatanodeDescriptor addedNode,
      DatanodeDescriptor delNodeHint);

  protected abstract void initialize(Configuration conf,  FSClusterStats stats,
                                     NetworkTopology clusterMap, 
                                     Host2NodesMap host2datanodeMap);

  // Balance时，isMovable
  public abstract boolean isMovable(Collection<DatanodeInfo> candidates,
      DatanodeInfo source, DatanodeInfo target);

  // moreThanOne 是具有该数据块副本的节点，且不止一个副本（rack范围内）
  public void adjustSetsWithChosenReplica(
      final Map<String, List<DatanodeStorageInfo>> rackMap,
      final List<DatanodeStorageInfo> moreThanOne,
      final List<DatanodeStorageInfo> exactlyOne,
      final DatanodeStorageInfo cur) {
    
    final String rack = getRack(cur.getDatanodeDescriptor());
    final List<DatanodeStorageInfo> storages = rackMap.get(rack);
    storages.remove(cur);
    if (storages.isEmpty()) {
      rackMap.remove(rack);
    }
    if (moreThanOne.remove(cur)) {
      if (storages.size() == 1) {
        final DatanodeStorageInfo remaining = storages.get(0);
        if (moreThanOne.remove(remaining)) {
          exactlyOne.add(remaining);
        }
      }
    } else {
      exactlyOne.remove(cur);
    }
  }

  protected <T> DatanodeInfo getDatanodeInfo(T datanode) {
    Preconditions.checkArgument(
        datanode instanceof DatanodeInfo ||
        datanode instanceof DatanodeStorageInfo,
        "class " + datanode.getClass().getName() + " not allowed");
    if (datanode instanceof DatanodeInfo) {
      return ((DatanodeInfo)datanode);
    } else {
      return ((DatanodeStorageInfo)datanode).getDatanodeDescriptor();
    }
  }

  
  protected String getRack(final DatanodeInfo datanode) {
    return datanode.getNetworkLocation();
  }

  // 根据 rack的副本数，进行划分出：moreThanOne 和 exactlyOne两个子集合
  public <T> void splitNodesWithRack(
      final Iterable<T> availableSet,
      final Collection<T> candidates,
      final Map<String, List<T>> rackMap,
      final List<T> moreThanOne,
      final List<T> exactlyOne) {
    for(T s: availableSet) {
      final String rackName = getRack(getDatanodeInfo(s));
      List<T> storageList = rackMap.get(rackName);
      if (storageList == null) {
        storageList = new ArrayList<>();
        rackMap.put(rackName, storageList);
      }
      storageList.add(s);
    }
    for (T candidate : candidates) {
      final String rackName = getRack(getDatanodeInfo(candidate));
      if (rackMap.get(rackName).size() == 1) {
        // exactlyOne contains nodes on rack with only one replica
        exactlyOne.add(candidate);
      } else {
        // moreThanOne contains nodes on rack with more than one replica
        moreThanOne.add(candidate);
      }
    }
  }

  
  public abstract void setExcludeSlowNodesEnabled(boolean enable);
  public abstract boolean getExcludeSlowNodesEnabled();
}
