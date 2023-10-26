package org.apache.hadoop.hdfs.server.datanode.metrics;
import org.apache.hadoop.metrics2.MetricsSource;

import java.io.IOException;

/**
 *
 * This Interface defines the methods to get the status of a the FSDataset of
 * a data node.
 * It is also used for publishing via JMX (hence we follow the JMX naming
 * convention.) 
 *  * Note we have not used the MetricsDynamicMBeanBase to implement this
 * because the interface for the FSDatasetMBean is stable and should
 * be published as an interface.
 *
 * <p>
 * Data Node runtime statistic  info is report in another MBean
 * @see org.apache.hadoop.hdfs.server.datanode.metrics.DataNodeMetrics
 *
 */
public interface FSDatasetMBean extends MetricsSource {

    /**
     * Returns the total space (in bytes) used by a block pool
     * @return the total space used by a block pool
     * @throws IOException
     */
    public long getBlockPoolUsed(String bpid) throws IOException;

    /**
     * Returns the total space (in bytes) used by dfs datanode
     * @return the total space used by dfs datanode
     * @throws IOException
     */
    public long getDfsUsed() throws IOException;

    /**
     * Returns total capacity (in bytes) of storage (used and unused)
     * @return total capacity of storage (used and unused)
     * @throws IOException
     */
    public long getCapacity() throws IOException;

    /**
     * Returns the amount of free storage space (in bytes)
     * @return The amount of free storage space
     * @throws IOException
     */
    public long getRemaining() throws IOException;

    /**
     * Returns the storage id of the underlying storage
     */
    public String getStorageInfo();

    /**
     * Returns the number of failed volumes in the datanode.
     * @return The number of failed volumes in the datanode.
     */
    public int getNumFailedVolumes();

    /**
     * Returns each storage location that has failed, sorted.
     * @return each storage location that has failed, sorted
     */
    String[] getFailedStorageLocations();

    /**
     * Returns the date/time of the last volume failure in milliseconds since
     * epoch.
     * @return date/time of last volume failure in milliseconds since epoch
     */
    long getLastVolumeFailureDate();

    /**
     * Returns an estimate of total capacity lost due to volume failures in bytes.
     * @return estimate of total capacity lost in bytes
     */
    long getEstimatedCapacityLostTotal();

    /**
     * Returns the amount of cache used by the datanode (in bytes).
     */
    public long getCacheUsed();

    /**
     * Returns the total cache capacity of the datanode (in bytes).
     */
    public long getCacheCapacity();

    /**
     * Returns the number of blocks cached.
     */
    public long getNumBlocksCached();

    /**
     * Returns the number of blocks that the datanode was unable to cache
     */
    public long getNumBlocksFailedToCache();

    /**
     * Returns the number of blocks that the datanode was unable to uncache
     */
    public long getNumBlocksFailedToUncache();
}
