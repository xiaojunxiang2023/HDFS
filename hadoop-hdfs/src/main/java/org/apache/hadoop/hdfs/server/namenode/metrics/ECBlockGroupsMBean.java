package org.apache.hadoop.hdfs.server.namenode.metrics;

/**
 * This interface defines the methods to get status pertaining to blocks of type
 * {@link org.apache.hadoop.hdfs.protocol.BlockType#STRIPED} in FSNamesystem
 * of a NameNode. It is also used for publishing via JMX.
 * <p>
 * Aggregated status of all blocks is reported in
 * @see FSNamesystemMBean
 * Name Node runtime activity statistic info is reported in
 * @see org.apache.hadoop.hdfs.server.namenode.metrics.NameNodeMetrics
 *
 */
public interface ECBlockGroupsMBean {
  /**
   * Return count of erasure coded block groups with low redundancy.
   */
  long getLowRedundancyECBlockGroups();

  /**
   * Return count of erasure coded block groups that are corrupt.
   */
  long getCorruptECBlockGroups();

  /**
   * Return count of erasure coded block groups that are missing.
   */
  long getMissingECBlockGroups();

  /**
   * Return total bytes of erasure coded future block groups.
   */
  long getBytesInFutureECBlockGroups();

  /**
   * Return count of erasure coded blocks that are pending deletion.
   */
  long getPendingDeletionECBlocks();

  /**
   * Return total number of erasure coded block groups.
   */
  long getTotalECBlockGroups();

  /**
   * @return the enabled erasure coding policies separated with comma.
   */
  String getEnabledEcPolicies();
}
