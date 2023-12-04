package org.apache.hadoop.hdfs.server.balancer;

import org.apache.hadoop.fs.StorageType;
import org.apache.hadoop.hdfs.server.protocol.DatanodeStorageReport;
import org.apache.hadoop.hdfs.server.protocol.StorageReport;
import org.apache.hadoop.hdfs.util.EnumCounters;
import org.apache.hadoop.hdfs.util.EnumDoubles;

/**
 * Balancing policy.
 * Since a datanode may contain multiple block pools,
 * {@link Pool} implies {@link Node}
 * but NOT the other way around
 */
abstract class BalancingPolicy {
  final EnumCounters<StorageType> totalCapacities
      = new EnumCounters<StorageType>(StorageType.class);
  final EnumCounters<StorageType> totalUsedSpaces
      = new EnumCounters<StorageType>(StorageType.class);
  final EnumDoubles<StorageType> avgUtilizations
      = new EnumDoubles<StorageType>(StorageType.class);

  /** Get all {@link BalancingPolicy} instances*/
  static BalancingPolicy parse(String s) {
    final BalancingPolicy[] all = {BalancingPolicy.Node.INSTANCE,
        BalancingPolicy.Pool.INSTANCE};
    for (BalancingPolicy p : all) {
      if (p.getName().equalsIgnoreCase(s))
        return p;
    }
    throw new IllegalArgumentException("Cannot parse string \"" + s + "\"");
  }

  void reset() {
    totalCapacities.reset();
    totalUsedSpaces.reset();
    avgUtilizations.reset();
  }

  /** Get the policy name. */
  abstract String getName();

  /** Accumulate used space and capacity. */
  abstract void accumulateSpaces(DatanodeStorageReport r);

  void initAvgUtilization() {
    for (StorageType t : StorageType.asList()) {
      final long capacity = totalCapacities.get(t);
      if (capacity > 0L) {
        final double avg = totalUsedSpaces.get(t) * 100.0 / capacity;
        avgUtilizations.set(t, avg);
      }
    }
  }

  double getAvgUtilization(StorageType t) {
    return avgUtilizations.get(t);
  }

  /** @return the utilization of a particular storage type of a datanode;
   *          or return null if the datanode does not have such storage type.
   */
  abstract Double getUtilization(DatanodeStorageReport r, StorageType t);

  @Override
  public String toString() {
    return BalancingPolicy.class.getSimpleName()
        + "." + getClass().getSimpleName();
  }

  /**
   * Cluster is balanced if each node is balanced.
   */
  static class Node extends BalancingPolicy {
    static final Node INSTANCE = new Node();

    private Node() {
    }

    @Override
    String getName() {
      return "datanode";
    }

    @Override
    void accumulateSpaces(DatanodeStorageReport r) {
      for (StorageReport s : r.getStorageReports()) {
        final StorageType t = s.getStorage().getStorageType();
        totalCapacities.add(t, s.getCapacity());
        totalUsedSpaces.add(t, s.getDfsUsed());
      }
    }

    @Override
    Double getUtilization(DatanodeStorageReport r, final StorageType t) {
      long capacity = 0L;
      long dfsUsed = 0L;
      for (StorageReport s : r.getStorageReports()) {
        if (s.getStorage().getStorageType() == t) {
          capacity += s.getCapacity();
          dfsUsed += s.getDfsUsed();
        }
      }
      return capacity == 0L ? null : dfsUsed * 100.0 / capacity;
    }
  }

  /**
   * Cluster is balanced if each pool in each node is balanced.
   */
  static class Pool extends BalancingPolicy {
    static final Pool INSTANCE = new Pool();

    private Pool() {
    }

    @Override
    String getName() {
      return "blockpool";
    }

    @Override
    void accumulateSpaces(DatanodeStorageReport r) {
      for (StorageReport s : r.getStorageReports()) {
        final StorageType t = s.getStorage().getStorageType();
        totalCapacities.add(t, s.getCapacity());
        totalUsedSpaces.add(t, s.getBlockPoolUsed());
      }
    }

    @Override
    Double getUtilization(DatanodeStorageReport r, final StorageType t) {
      long capacity = 0L;
      long blockPoolUsed = 0L;
      for (StorageReport s : r.getStorageReports()) {
        if (s.getStorage().getStorageType() == t) {
          capacity += s.getCapacity();
          blockPoolUsed += s.getBlockPoolUsed();
        }
      }
      return capacity == 0L ? null : blockPoolUsed * 100.0 / capacity;
    }
  }
}
