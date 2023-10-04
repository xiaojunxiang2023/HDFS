package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

@InterfaceAudience.Private
@InterfaceStability.Evolving
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
