package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.hdfs.DFSUtilClient;

import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.EnumSet;

/**
 * Metadata about a snapshottable directory
 */
public class SnapshottableDirectoryStatus {
  /** Compare the statuses by full paths. */
  public static final Comparator<SnapshottableDirectoryStatus> COMPARATOR =
      new Comparator<SnapshottableDirectoryStatus>() {
        @Override
        public int compare(SnapshottableDirectoryStatus left,
                           SnapshottableDirectoryStatus right) {
          int d = DFSUtilClient.compareBytes(left.parentFullPath,
              right.parentFullPath);
          return d != 0 ? d
              : DFSUtilClient.compareBytes(left.dirStatus.getLocalNameInBytes(),
              right.dirStatus.getLocalNameInBytes());
        }
      };

  /** Basic information of the snapshottable directory */
  private final HdfsFileStatus dirStatus;

  /** Number of snapshots that have been taken*/
  private final int snapshotNumber;

  /** Number of snapshots allowed. */
  private final int snapshotQuota;

  /** Full path of the parent. */
  private final byte[] parentFullPath;

  public SnapshottableDirectoryStatus(long modification_time, long access_time,
                                      FsPermission permission, EnumSet<HdfsFileStatus.Flags> flags,
                                      String owner, String group, byte[] localName, long inodeId,
                                      int childrenNum, int snapshotNumber, int snapshotQuota,
                                      byte[] parentFullPath) {
    this.dirStatus = new HdfsFileStatus.Builder()
        .isdir(true)
        .mtime(modification_time)
        .atime(access_time)
        .perm(permission)
        .flags(flags)
        .owner(owner)
        .group(group)
        .path(localName)
        .fileId(inodeId)
        .children(childrenNum)
        .build();
    this.snapshotNumber = snapshotNumber;
    this.snapshotQuota = snapshotQuota;
    this.parentFullPath = parentFullPath;
  }

  public SnapshottableDirectoryStatus(HdfsFileStatus dirStatus,
                                      int snapshotNumber, int snapshotQuota, byte[] parentFullPath) {
    this.dirStatus = dirStatus;
    this.snapshotNumber = snapshotNumber;
    this.snapshotQuota = snapshotQuota;
    this.parentFullPath = parentFullPath;
  }

  /**
   * @return Number of snapshots that have been taken for the directory
   */
  public int getSnapshotNumber() {
    return snapshotNumber;
  }

  /**
   * @return Number of snapshots allowed for the directory
   */
  public int getSnapshotQuota() {
    return snapshotQuota;
  }

  /**
   * @return Full path of the parent
   */
  public byte[] getParentFullPath() {
    return parentFullPath;
  }

  /**
   * @return The basic information of the directory
   */
  public HdfsFileStatus getDirStatus() {
    return dirStatus;
  }

  /**
   * @return Full path of the file
   */
  public Path getFullPath() {
    String parentFullPathStr =
        (parentFullPath == null || parentFullPath.length == 0) ?
            null : DFSUtilClient.bytes2String(parentFullPath);
    if (parentFullPathStr == null
        && dirStatus.getLocalNameInBytes().length == 0) {
      // root
      return new Path("/");
    } else {
      return parentFullPathStr == null ? new Path(dirStatus.getLocalName())
          : new Path(parentFullPathStr, dirStatus.getLocalName());
    }
  }

  /**
   * Print a list of {@link SnapshottableDirectoryStatus} out to a given stream.
   * @param stats The list of {@link SnapshottableDirectoryStatus}
   * @param out The given stream for printing.
   */
  public static void print(SnapshottableDirectoryStatus[] stats,
                           PrintStream out) {
    if (stats == null || stats.length == 0) {
      out.println();
      return;
    }
    int maxRepl = 0, maxLen = 0, maxOwner = 0, maxGroup = 0;
    int maxSnapshotNum = 0, maxSnapshotQuota = 0;
    for (SnapshottableDirectoryStatus status : stats) {
      maxRepl = maxLength(maxRepl, status.dirStatus.getReplication());
      maxLen = maxLength(maxLen, status.dirStatus.getLen());
      maxOwner = maxLength(maxOwner, status.dirStatus.getOwner());
      maxGroup = maxLength(maxGroup, status.dirStatus.getGroup());
      maxSnapshotNum = maxLength(maxSnapshotNum, status.snapshotNumber);
      maxSnapshotQuota = maxLength(maxSnapshotQuota, status.snapshotQuota);
    }

    String lineFormat = "%s%s " // permission string
        + "%" + maxRepl + "s "
        + (maxOwner > 0 ? "%-" + maxOwner + "s " : "%s")
        + (maxGroup > 0 ? "%-" + maxGroup + "s " : "%s")
        + "%" + maxLen + "s "
        + "%s " // mod time
        + "%" + maxSnapshotNum + "s "
        + "%" + maxSnapshotQuota + "s "
        + "%s"; // path

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

    for (SnapshottableDirectoryStatus status : stats) {
      String line = String.format(lineFormat, "d",
          status.dirStatus.getPermission(),
          status.dirStatus.getReplication(),
          status.dirStatus.getOwner(),
          status.dirStatus.getGroup(),
          String.valueOf(status.dirStatus.getLen()),
          dateFormat.format(new Date(status.dirStatus.getModificationTime())),
          status.snapshotNumber, status.snapshotQuota,
          status.getFullPath().toString()
      );
      out.println(line);
    }
  }

  private static int maxLength(int n, Object value) {
    return Math.max(n, String.valueOf(value).length());
  }

  public static class Bean {
    private final String path;
    private final int snapshotNumber;
    private final int snapshotQuota;
    private final long modificationTime;
    private final short permission;
    private final String owner;
    private final String group;

    public Bean(String path, int snapshotNumber, int snapshotQuota,
                long modificationTime, short permission, String owner, String group) {
      this.path = path;
      this.snapshotNumber = snapshotNumber;
      this.snapshotQuota = snapshotQuota;
      this.modificationTime = modificationTime;
      this.permission = permission;
      this.owner = owner;
      this.group = group;
    }

    public String getPath() {
      return path;
    }

    public int getSnapshotNumber() {
      return snapshotNumber;
    }

    public int getSnapshotQuota() {
      return snapshotQuota;
    }

    public long getModificationTime() {
      return modificationTime;
    }

    public short getPermission() {
      return permission;
    }

    public String getOwner() {
      return owner;
    }

    public String getGroup() {
      return group;
    }
  }
}
