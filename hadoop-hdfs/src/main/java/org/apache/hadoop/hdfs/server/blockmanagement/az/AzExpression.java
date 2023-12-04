package org.apache.hadoop.hdfs.server.blockmanagement.az;

import org.apache.hadoop.hdfs.DFSConfigKeys;

/**
 * @Author: hellosrc
 * @Date: 2023/11/30日  16:37分
 * @Description:
 */
public class AzExpression {

  // 表达式列表
  public String[] policies;
  public String mainAz;
  public boolean nativeWrite;
  public boolean adaptNow;

  public static AzExpression defaultAzExpression = new AzExpression(
      null, DFSConfigKeys.DEFAULT_MAIN_AZ_DEFAULT, false, false
  );

  public AzExpression(byte[] policies) {
    this(policies, DFSConfigKeys.DEFAULT_MAIN_AZ_DEFAULT.getBytes());
  }

  public AzExpression(byte[] policies, byte[] mainAz) {
    this.policies = new String(policies).split(",");
    this.mainAz = new String(mainAz);
  }

  public AzExpression(byte[] policies, byte[] mainAz, byte[] nativeWrite, byte[] adaptNow) {
    this.policies = new String(policies).split(",");
    this.mainAz = new String(mainAz);
    this.nativeWrite = Boolean.parseBoolean(new String(nativeWrite));
    this.adaptNow = Boolean.parseBoolean(new String(adaptNow));
  }

  public AzExpression(String[] policies, String mainAz, boolean nativeWrite, boolean adaptNow) {
    this.policies = policies;
    this.mainAz = mainAz;
    this.nativeWrite = nativeWrite;
    this.adaptNow = adaptNow;
  }

}