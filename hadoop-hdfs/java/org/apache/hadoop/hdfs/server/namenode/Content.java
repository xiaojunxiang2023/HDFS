package org.apache.hadoop.hdfs.server.namenode;

/**
 * The content types such as file, directory and symlink to be computed.
 */
public enum Content {
  /** The number of files. */
  FILE,
  /** The number of directories. */
  DIRECTORY,
  /** The number of symlinks. */
  SYMLINK,

  /** The total of file length in bytes. */
  LENGTH,
  /** The total of disk space usage in bytes including replication. */
  DISKSPACE,

  /** The number of snapshots. */
  SNAPSHOT,
  /** The number of snapshottable directories. */
  SNAPSHOTTABLE_DIRECTORY;
}
