package org.apache.hadoop.hdfs.server.blockmanagement.az;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.hdfs.DFSConfigKeys;
import org.apache.hadoop.hdfs.protocol.DatanodeInfo;

import java.io.IOException;
import java.util.Map;

/**
 * @Author: hellosrc
 * @Date: 2023/12/01日  14:31分
 * @Description:
 */
public class AzUtils {
  private static FileSystem fs;

  static {
    try {
      fs = FileSystem.get(new Configuration());
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static AzExpression getAZExpression(Path path) {
    try {
      Map<String, byte[]> xAttrs = fs.getXAttrs(path);
      if (xAttrs.size() == 0) {
        if (path.isRoot()) {
          // 默认表达式
          return AzExpression.defaultAzExpression;
        } else {
          getAZExpression(path.getParent());
        }
      }
      return new AzExpression(xAttrs.get(AzConstant.TRUST + "policies"),
        xAttrs.get(AzConstant.TRUST + "mainAZ"),
        xAttrs.get(AzConstant.TRUST + "nativeWrite"),
        xAttrs.get(AzConstant.TRUST + "adaptNow")
      );
    } catch (IOException e) {
      e.printStackTrace();
    }
    return null;
  }

  public static AzInfo getAZInfo(DatanodeInfo datanodeInfo) {
    return null;
  }

  public static boolean isSameAZ(DatanodeInfo source, DatanodeInfo target) {
    AzInfo sourceAzInfo = getAZInfo(source);
    AzInfo targetAzInfo = getAZInfo(target);
    return sourceAzInfo.az.equals(targetAzInfo.az);
  }

  public static boolean isAzEnable(Configuration conf) {
    String placementClass = conf.get(DFSConfigKeys.DFS_BLOCK_REPLICATOR_CLASSNAME_KEY);
    return "org.apache.hadoop.hdfs.server.blockmanagement.az.BlockPlacementPolicyAz".equals(placementClass);
  }

}
