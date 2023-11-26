package org.apache.hadoop.hdfs.server.namenode.metrics;

/**
 * This interface defines the methods to get status pertaining to blocks of type
 * {@link org.apache.hadoop.hdfs.protocol.BlockType#CONTIGUOUS} in FSNamesystem
 * of a NameNode. It is also used for publishing via JMX.
 * <p>
 * Aggregated status of all blocks is reported in
 * @see FSNamesystemMBean
 * Name Node runtime activity statistic info is reported in
 * @see org.apache.hadoop.hdfs.server.namenode.metrics.NameNodeMetrics
 */
public interface ReplicatedBlocksMBean {
  /**
   * Return low redundancy blocks count.
   */
  long getLowRedundancyReplicatedBlocks();

  /**
   * Return corrupt blocks count.
   */
  long getCorruptReplicatedBlocks();

  /**
   * Return missing blocks count.
   */
  long getMissingReplicatedBlocks();

  /**
   * Return count of missing blocks with replication factor one.
   */
  long getMissingReplicationOneBlocks();

  /**
   * Return total bytes of future blocks.
   */
  long getBytesInFutureReplicatedBlocks();

  /**
   * Return count of blocks that are pending deletion.
   */
  long getPendingDeletionReplicatedBlocks();

  /**
   * Return total number of replicated blocks.
   */
  long getTotalReplicatedBlocks();
}
