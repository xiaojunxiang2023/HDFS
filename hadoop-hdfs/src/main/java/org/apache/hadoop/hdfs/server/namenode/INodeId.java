package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.util.SequentialNumber;

/**
 * An id which uniquely identifies an inode. Id 1 to 16384 are reserved for
 * potential future usage. The id won't be recycled and is not expected to wrap
 * around in a very long time. Root inode id is always 16385. Id 0 is used for
 * backward compatibility support.
 */
public class INodeId extends SequentialNumber {
  /**
   * The last reserved inode id. InodeIDs are allocated from LAST_RESERVED_ID +
   * 1.
   */
  public static final long LAST_RESERVED_ID = 1 << 14; // 16384
  public static final long ROOT_INODE_ID = LAST_RESERVED_ID + 1; // 16385
  public static final long INVALID_INODE_ID = -1;

  INodeId() {
    super(ROOT_INODE_ID);
  }
}
