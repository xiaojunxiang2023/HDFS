package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * JMX information of the secondary NameNode
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public interface SecondaryNameNodeInfoMXBean extends VersionInfoMXBean {
  /**
   * Gets the host and port colon separated.
   */
  public String getHostAndPort();

  /**
   * Gets if security is enabled.
   *
   * @return true, if security is enabled.
   */
  boolean isSecurityEnabled();

  /**
   * @return the timestamp of when the SNN starts
   */
  public long getStartTime();

  /**
   * @return the timestamp of the last checkpoint
   */
  public long getLastCheckpointTime();

  /**
   * @return the number of msec since the last checkpoint, or -1 if no
   * checkpoint has been done yet.
   */
  public long getLastCheckpointDeltaMs();

  /**
   * @return the directories that store the checkpoint images
   */
  public String[] getCheckpointDirectories();
  /**
   * @return the directories that store the edit logs
   */
  public String[] getCheckpointEditlogDirectories();
}
