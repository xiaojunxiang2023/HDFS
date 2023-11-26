package org.apache.hadoop.hdfs.server.namenode.snapshot;

import org.apache.hadoop.hdfs.protocol.SnapshotInfo;
import org.apache.hadoop.hdfs.protocol.SnapshottableDirectoryStatus;

/**
 * This is an interface used to retrieve statistic information related to
 * snapshots
 */
public interface SnapshotStatsMXBean {

  /**
   * Return the list of snapshottable directories
   *
   * @return the list of snapshottable directories
   */
  public SnapshottableDirectoryStatus.Bean[] getSnapshottableDirectories();

  /**
   * Return the list of snapshots
   *
   * @return the list of snapshots
   */
  public SnapshotInfo.Bean[] getSnapshots();

}
