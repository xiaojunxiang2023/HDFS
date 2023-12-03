package org.apache.hadoop.hdfs.server.blockmanagement.az;

import org.apache.commons.lang3.StringUtils;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.HdfsConfiguration;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;
import org.apache.hadoop.net.Node;

import java.io.IOException;
import java.util.Map;

/**
 * @Author: hellosrc
 * @Date: 2023/12/01日  14:31分
 * @Description:
 */
public class AzUtils {
  private static FileSystem fs;
  private static Configuration conf = new HdfsConfiguration();
  private static AzNetworkTopology topology = new AzNetworkTopology();

  static {
    try {
      fs = FileSystem.get(conf);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static AzExpression getAZExpression(Path path) {
    return getAZExpression(path, false);
  }

  private static AzExpression getAZExpression(Path path, boolean recursive) {
    try {
      Map<String, byte[]> xAttrs = fs.getXAttrs(path);
      if (xAttrs.size() == 0) {
        if (path.isRoot()) {
          // 默认表达式
          return AzExpression.defaultAzExpression;
        } else if (recursive) {
          getAZExpression(path.getParent(), true);
        }
      }
      return new AzExpression(xAttrs.get(AzConstant.POLICIES),
          xAttrs.get(AzConstant.MAIN_AZ),
          xAttrs.get(AzConstant.NATIVE_WRITE),
          xAttrs.get(AzConstant.ADAPT_NOW)
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static void setAZExpression(Path path) throws IOException {
    setAZExpression(path, null);
  }

  public static void setAZExpression(Path path, AzExpression azExpression) throws IOException {

    if (azExpression == null) {
      if (!path.isRoot()) {
        azExpression = getAZExpression(path.getParent(), true);
      } else {
        azExpression = AzExpression.defaultAzExpression;
      }
    }

    fs.setXAttr(path, AzConstant.POLICIES,
        StringUtils.join(",", azExpression.policies).getBytes());

    fs.setXAttr(path, AzConstant.MAIN_AZ, azExpression.mainAz.getBytes());
    fs.setXAttr(path, AzConstant.NATIVE_WRITE,
        String.valueOf(azExpression.nativeWrite).getBytes());
    fs.setXAttr(path, AzConstant.ADAPT_NOW,
        String.valueOf(azExpression.adaptNow).getBytes());
  }

  public static boolean isSameAZ(DatanodeInfo source, DatanodeInfo target) {
    AzInfo sourceAzInfo = topology.getAzInfo(source);
    AzInfo targetAzInfo = topology.getAzInfo(target);
    return sourceAzInfo.az.equals(targetAzInfo.az);
  }

  public static boolean isAzEnable(Configuration conf) {
    String placementClass = conf.get(DFSConfigKeys.DFS_BLOCK_REPLICATOR_CLASSNAME_KEY);
    return "org.apache.hadoop.hdfs.server.blockmanagement.az.BlockPlacementPolicyAz".equals(placementClass);
  }

  public static AzStrategy analyzeAzStrategy(AzExpression azExpression) {
    if (azExpression.nativeWrite) {
      return AzStrategy.POLICIES;
    } else if (azExpression.policies == null) {
      return AzStrategy.NONE;
    } else {
      return AzStrategy.NATIVE_WRITE;
    }
  }

  public static String getAz(Node writer) {
    return getAzInfo(writer).az;
  }

  public static AzInfo getAzInfo(Node writer) {
    return topology.getAzInfo(writer);
  }

  public static boolean existAz(String az) {
    return !az.isEmpty();
  }

  // TODO
  public static boolean isAzAvailable(String az) {
    return false;
  }

  public static boolean existMainAz() {
    return StringUtils.isNotEmpty(getMainAz());
  }

  public static String getMainAz() {
    return conf.get(DFSConfigKeys.DEFAULT_MAIN_AZ_KEY);
  }

  public static boolean isInPolicy(AzExpression azExpression, String az) {
    for (String policy : azExpression.policies) {
      if (policy.equals(az)) {
        return true;
      }
    }
    return false;
  }
  
}
