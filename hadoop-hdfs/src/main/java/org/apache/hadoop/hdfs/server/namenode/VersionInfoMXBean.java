package org.apache.hadoop.hdfs.server.namenode;
public interface VersionInfoMXBean {
  /**
   * @return the compilation information which contains date, user and branch
   */
  public String getCompileInfo();

  /**
   * @return the software version
   */
  public String getSoftwareVersion();
}
