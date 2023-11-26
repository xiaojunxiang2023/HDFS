package org.apache.hadoop.hdfs.server.datanode.fsdataset.impl;
import org.apache.hadoop.hdfs.server.datanode.DNConf;
import org.apache.hadoop.io.nativeio.NativeIO;

/**
 * Creates MappableBlockLoader.
 */
public final class MappableBlockLoaderFactory {

    private MappableBlockLoaderFactory() {
        // Prevent instantiation
    }

    /**
     * Create a specific cache loader according to the configuration.
     * If persistent memory volume is not configured, return a cache loader
     * for DRAM cache. Otherwise, return a cache loader for pmem cache.
     */
    public static MappableBlockLoader createCacheLoader(DNConf conf) {
        if (conf.getPmemVolumes() == null || conf.getPmemVolumes().length == 0) {
            return new MemoryMappableBlockLoader();
        }
        if (NativeIO.isAvailable() && NativeIO.POSIX.isPmdkAvailable()) {
            return new NativePmemMappableBlockLoader();
        }
        return new PmemMappableBlockLoader();
    }
}
