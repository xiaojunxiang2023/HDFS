package org.apache.hadoop.hdfs.server.datanode.fsdataset.impl;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.DF;
import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.util.StringUtils;

import java.lang.reflect.Constructor;

import static org.apache.hadoop.hdfs.DFSConfigKeys.*;

/**
 * Used for calculating file system space reserved for non-HDFS data.
 */
public abstract class ReservedSpaceCalculator {

  private final DF usage;
  private final Configuration conf;
  private final StorageType storageType;

  ReservedSpaceCalculator(Configuration conf, DF usage,
                          StorageType storageType) {
    this.usage = usage;
    this.conf = conf;
    this.storageType = storageType;
  }

  private static long getPercentage(long total, long percentage) {
    return (total * percentage) / 100;
  }

  DF getUsage() {
    return usage;
  }

  long getReservedFromConf(String key, long defaultValue) {
    return conf.getLong(key + "." + StringUtils.toLowerCase(
        storageType.toString()), conf.getLongBytes(key, defaultValue));
  }

  /**
   * Return the capacity of the file system space reserved for non-HDFS.
   *
   * @return the number of bytes reserved for non-HDFS.
   */
  abstract long getReserved();

  /**
   * Used for creating instances of ReservedSpaceCalculator.
   */
  public static class Builder {

    private final Configuration conf;

    private DF usage;
    private StorageType storageType;

    public Builder(Configuration conf) {
      this.conf = conf;
    }

    public Builder setUsage(DF newUsage) {
      this.usage = newUsage;
      return this;
    }

    public Builder setStorageType(
        StorageType newStorageType) {
      this.storageType = newStorageType;
      return this;
    }

    ReservedSpaceCalculator build() {
      try {
        Class<? extends ReservedSpaceCalculator> clazz = conf.getClass(
            DFS_DATANODE_DU_RESERVED_CALCULATOR_KEY,
            DFS_DATANODE_DU_RESERVED_CALCULATOR_DEFAULT,
            ReservedSpaceCalculator.class);

        Constructor constructor = clazz.getConstructor(
            Configuration.class, DF.class, StorageType.class);

        return (ReservedSpaceCalculator) constructor.newInstance(
            conf, usage, storageType);
      } catch (Exception e) {
        throw new IllegalStateException(
            "Error instantiating ReservedSpaceCalculator", e);
      }
    }
  }

  /**
   * Based on absolute number of reserved bytes.
   */
  public static class ReservedSpaceCalculatorAbsolute extends
      ReservedSpaceCalculator {

    private final long reservedBytes;

    public ReservedSpaceCalculatorAbsolute(Configuration conf, DF usage,
                                           StorageType storageType) {
      super(conf, usage, storageType);
      this.reservedBytes = getReservedFromConf(DFS_DATANODE_DU_RESERVED_KEY,
          DFS_DATANODE_DU_RESERVED_DEFAULT);
    }

    @Override
    long getReserved() {
      return reservedBytes;
    }
  }

  /**
   * Based on percentage of total capacity in the storage.
   */
  public static class ReservedSpaceCalculatorPercentage extends
      ReservedSpaceCalculator {

    private final long reservedPct;

    public ReservedSpaceCalculatorPercentage(Configuration conf, DF usage,
                                             StorageType storageType) {
      super(conf, usage, storageType);
      this.reservedPct = getReservedFromConf(
          DFS_DATANODE_DU_RESERVED_PERCENTAGE_KEY,
          DFS_DATANODE_DU_RESERVED_PERCENTAGE_DEFAULT);
    }

    @Override
    long getReserved() {
      return getPercentage(getUsage().getCapacity(), reservedPct);
    }
  }

  /**
   * Calculates absolute and percentage based reserved space and
   * picks the one that will yield more reserved space.
   */
  public static class ReservedSpaceCalculatorConservative extends
      ReservedSpaceCalculator {

    private final long reservedBytes;
    private final long reservedPct;

    public ReservedSpaceCalculatorConservative(Configuration conf, DF usage,
                                               StorageType storageType) {
      super(conf, usage, storageType);
      this.reservedBytes = getReservedFromConf(DFS_DATANODE_DU_RESERVED_KEY,
          DFS_DATANODE_DU_RESERVED_DEFAULT);
      this.reservedPct = getReservedFromConf(
          DFS_DATANODE_DU_RESERVED_PERCENTAGE_KEY,
          DFS_DATANODE_DU_RESERVED_PERCENTAGE_DEFAULT);
    }

    long getReservedBytes() {
      return reservedBytes;
    }

    long getReservedPct() {
      return reservedPct;
    }

    @Override
    long getReserved() {
      return Math.max(getReservedBytes(),
          getPercentage(getUsage().getCapacity(), getReservedPct()));
    }
  }

  /**
   * Calculates absolute and percentage based reserved space and
   * picks the one that will yield less reserved space.
   */
  public static class ReservedSpaceCalculatorAggressive extends
      ReservedSpaceCalculator {

    private final long reservedBytes;
    private final long reservedPct;

    public ReservedSpaceCalculatorAggressive(Configuration conf, DF usage,
                                             StorageType storageType) {
      super(conf, usage, storageType);
      this.reservedBytes = getReservedFromConf(DFS_DATANODE_DU_RESERVED_KEY,
          DFS_DATANODE_DU_RESERVED_DEFAULT);
      this.reservedPct = getReservedFromConf(
          DFS_DATANODE_DU_RESERVED_PERCENTAGE_KEY,
          DFS_DATANODE_DU_RESERVED_PERCENTAGE_DEFAULT);
    }

    long getReservedBytes() {
      return reservedBytes;
    }

    long getReservedPct() {
      return reservedPct;
    }

    @Override
    long getReserved() {
      return Math.min(getReservedBytes(),
          getPercentage(getUsage().getCapacity(), getReservedPct()));
    }
  }
}