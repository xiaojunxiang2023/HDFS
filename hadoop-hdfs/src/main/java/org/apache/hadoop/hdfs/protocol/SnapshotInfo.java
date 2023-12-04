package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.hdfs.protocol.proto.AclProtos.FsPermissionProto;

/**
 * SnapshotInfo maintains information for a snapshot
 */
public class SnapshotInfo {
  private final String snapshotName;
  private final String snapshotRoot;
  private final String createTime;
  private final FsPermissionProto permission;
  private final String owner;
  private final String group;

  public SnapshotInfo(String sname, String sroot, String ctime,
                      FsPermissionProto permission, String owner, String group) {
    this.snapshotName = sname;
    this.snapshotRoot = sroot;
    this.createTime = ctime;
    this.permission = permission;
    this.owner = owner;
    this.group = group;
  }

  final public String getSnapshotName() {
    return snapshotName;
  }

  final public String getSnapshotRoot() {
    return snapshotRoot;
  }

  final public String getCreateTime() {
    return createTime;
  }

  final public FsPermissionProto getPermission() {
    return permission;
  }

  final public String getOwner() {
    return owner;
  }

  final public String getGroup() {
    return group;
  }

  @Override
  public String toString() {
    return getClass().getSimpleName()
        + "{snapshotName=" + snapshotName
        + "; snapshotRoot=" + snapshotRoot
        + "; createTime=" + createTime
        + "; permission=" + permission
        + "; owner=" + owner
        + "; group=" + group
        + "}";
  }

  public static class Bean {
    private final String snapshotID;
    private final String snapshotDirectory;
    private final long modificationTime;

    public Bean(String snapshotID, String snapshotDirectory,
                long modificationTime) {
      this.snapshotID = snapshotID;
      this.snapshotDirectory = snapshotDirectory;
      this.modificationTime = modificationTime;
    }

    public String getSnapshotID() {
      return snapshotID;
    }

    public String getSnapshotDirectory() {
      return snapshotDirectory;
    }

    public long getModificationTime() {
      return modificationTime;
    }
  }
}
