package org.apache.hadoop.hdfs.server.blockmanagement.az;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.AddBlockFlag;
import org.apache.hadoop.hdfs.protocol.BlockStoragePolicy;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.hdfs.server.blockmanagement.*;
import org.apache.hadoop.net.NetworkTopology;
import org.apache.hadoop.net.Node;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;

/**
 * @Author: hellosrc
 * @Date: 2023/12/01日  13:07分
 * @Description: AZ副本放置策略
 */
public class BlockPlacementPolicyAz extends BlockPlacementPolicy {
  private Logger LOG = LoggerFactory.getLogger(BlockPlacementPolicyAz.class);
  private volatile boolean excludeSlowNodesEnabled;

  @Override
  public DatanodeStorageInfo[] chooseTarget(String srcPath, int numOfReplicas, Node writer, List<DatanodeStorageInfo> chosen, boolean returnChosenNodes, Set<Node> excludedNodes, long blocksize, BlockStoragePolicy storagePolicy, EnumSet<AddBlockFlag> flags) {
    AzExpression azExpression = AzUtils.getAZExpression(new Path(srcPath));
    AzStrategy azStrategy = AzUtils.analyzeAzStrategy(azExpression);
    switch (azStrategy) {
      case NATIVE_WRITE:
        return chooseTarget_NativeWrite(srcPath, numOfReplicas, writer, chosen, returnChosenNodes, excludedNodes, blocksize, storagePolicy, flags);
      case NONE:
        return chooseTarget_None(srcPath, numOfReplicas, writer, chosen, returnChosenNodes, excludedNodes, blocksize, storagePolicy, flags);
      case POLICIES:
        return chooseTarget_Policies(srcPath, numOfReplicas, writer, chosen, returnChosenNodes, excludedNodes, blocksize, storagePolicy, flags);
    }
    return new DatanodeStorageInfo[0];
  }

  private DatanodeStorageInfo[] chooseTarget_NativeWrite(String srcPath, int numOfReplicas, Node writer, List<DatanodeStorageInfo> chosen, boolean returnChosenNodes, Set<Node> excludedNodes, long blocksize, BlockStoragePolicy storagePolicy, EnumSet<AddBlockFlag> flags) {
    String az = AzUtils.getAz(writer);
    if (AzUtils.existAz(az)) {
      return chooseAllOneAz(writer, new Path(srcPath), az);
    } else if (AzUtils.existMainAz()) {
      return chooseAllOneAz(writer, new Path(srcPath), AzUtils.getMainAz());
    } else {
      // TODO 异常
      return null;
    }
  }

  private DatanodeStorageInfo[] chooseTarget_None(String srcPath, int numOfReplicas, Node writer, List<DatanodeStorageInfo> chosen, boolean returnChosenNodes, Set<Node> excludedNodes, long blocksize, BlockStoragePolicy storagePolicy, EnumSet<AddBlockFlag> flags) {
    if (AzUtils.existMainAz()) {
      return chooseAllOneAz(writer, new Path(srcPath), AzUtils.getMainAz());
    } else {
      // TODO 异常
      return null;
    }
  }

  private DatanodeStorageInfo[] chooseTarget_Policies(String srcPath, int numOfReplicas, Node writer, List<DatanodeStorageInfo> chosen, boolean returnChosenNodes, Set<Node> excludedNodes, long blocksize, BlockStoragePolicy storagePolicy, EnumSet<AddBlockFlag> flags) {
    String az = AzUtils.getAz(writer);
    Path path = new Path(srcPath);
    AzExpression azExpression = AzUtils.getAZExpression(path);

    // 第一个副本 TODO: 表达式待定
    if (numOfReplicas == 0) {
      if (AzUtils.existAz(az) && AzUtils.isInPolicy(azExpression, az)) {
        return chooseAllOneAz(writer, path, az);
      } else {
        return chooseInPolicy(writer, path, azExpression);
      }
    } else {
      return chooseInPolicy(writer, path, azExpression);
    }
  }

  private DatanodeStorageInfo[] chooseInPolicy(Node writer, Path path, AzExpression azExpression) {
    int length = azExpression.policies.length;
    if (length == 0) {
      return null;
    }

    String policy = azExpression.policies[0];

    // TODO: 表达式待定
    if (true) {
      System.arraycopy(azExpression.policies, 1,
          azExpression.policies, 0, length - 1);
    }
    return null;
  }

  private DatanodeStorageInfo[] chooseAllOneAz(Node write, Path file, String az) {
    return null;
  }

  @Override
  public BlockPlacementStatus verifyBlockPlacement(DatanodeInfo[] candidates, int numOfReplicas) {
    return null;
  }

  @Override
  public List<DatanodeStorageInfo> chooseReplicasToDelete(Collection<DatanodeStorageInfo> availableReplicas, Collection<DatanodeStorageInfo> delCandidates, int expectedNumOfReplicas, List<StorageType> excessTypes, DatanodeDescriptor addedNode, DatanodeDescriptor delNodeHint) {
    return null;
  }

  @Override
  protected void initialize(Configuration conf, FSClusterStats stats, NetworkTopology clusterMap, Host2NodesMap host2datanodeMap) {

  }


  /*
    Balance相关的，先不看
   */
  @Override
  public boolean isMovable(Collection<DatanodeInfo> candidates, DatanodeInfo source, DatanodeInfo target) {
    if (!AzUtils.isSameAZ(source, target)) {
      return false;
    }
    final Map<AzInfo, List<DatanodeInfo>> azMap = new HashMap<>();
    final List<DatanodeInfo> moreThanOne = new ArrayList<>();
    final List<DatanodeInfo> exactlyOne = new ArrayList<>();
    splitNodesWithAZInfo(candidates, candidates, azMap, moreThanOne, exactlyOne);
    return notReduceNumOfGroups(moreThanOne, source, target);
  }

  public <T> void splitNodesWithAZInfo(Iterable<T> availableSet, Collection<T> candidates,
                                       Map<AzInfo, List<T>> azMap, List<T> moreThanOne, List<T> exactlyOne) {
    for (T s : availableSet) {
      final AzInfo azInfo = AzUtils.getAzInfo(getDatanodeInfo(s));
      List<T> storageList = azMap.get(azInfo);
      if (storageList == null) {
        storageList = new ArrayList<>();
        azMap.put(azInfo, storageList);
      }
      storageList.add(s);
    }
    for (T candidate : candidates) {
      final String rackName = getRack(getDatanodeInfo(candidate));
      if (azMap.get(rackName).size() == 1) {
        exactlyOne.add(candidate);
      } else {
        moreThanOne.add(candidate);
      }
    }
  }

  <T> boolean notReduceNumOfGroups(List<T> moreThanOne, T source, T target) {
    if (moreThanOne.contains(source)) {
      return true;
    } else {
      return target != null && !moreThanOne.contains(target);
    }
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
