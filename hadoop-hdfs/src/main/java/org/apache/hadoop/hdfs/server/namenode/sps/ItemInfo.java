package org.apache.hadoop.hdfs.server.namenode.sps;

/**
 * ItemInfo is a file info object for which need to satisfy the policy.
 */
public class ItemInfo {
  private long startPathId;
  private long fileId;
  private int retryCount;

  public ItemInfo(long startPathId, long fileId) {
    this.startPathId = startPathId;
    this.fileId = fileId;
    // set 0 when item is getting added first time in queue.
    this.retryCount = 0;
  }

  public ItemInfo(final long startPathId, final long fileId,
      final int retryCount) {
    this.startPathId = startPathId;
    this.fileId = fileId;
    this.retryCount = retryCount;
  }

  /**
   * Returns the start path of the current file. This indicates that SPS
   * was invoked on this path.
   */
  public long getStartPath() {
    return startPathId;
  }

  /**
   * Returns the file for which needs to satisfy the policy.
   */
  public long getFile() {
    return fileId;
  }

  /**
   * Returns true if the tracking path is a directory, false otherwise.
   */
  public boolean isDir() {
    return !(startPathId == fileId);
  }

  /**
   * Get the attempted retry count of the block for satisfy the policy.
   */
  public int getRetryCount() {
    return retryCount;
  }

  /**
   * Increments the retry count.
   */
  public void increRetryCount() {
    this.retryCount++;
  }
}