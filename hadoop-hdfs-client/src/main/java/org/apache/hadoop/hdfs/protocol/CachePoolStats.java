package org.apache.hadoop.hdfs.protocol;

/**
 * CachePoolStats describes cache pool statistics.
 */
public class CachePoolStats {
  public static class Builder {
    private long bytesNeeded;
    private long bytesCached;
    private long bytesOverlimit;
    private long filesNeeded;
    private long filesCached;

    public Builder() {
    }

    public Builder setBytesNeeded(long bytesNeeded) {
      this.bytesNeeded = bytesNeeded;
      return this;
    }

    public Builder setBytesCached(long bytesCached) {
      this.bytesCached = bytesCached;
      return this;
    }

    public Builder setBytesOverlimit(long bytesOverlimit) {
      this.bytesOverlimit = bytesOverlimit;
      return this;
    }

    public Builder setFilesNeeded(long filesNeeded) {
      this.filesNeeded = filesNeeded;
      return this;
    }

    public Builder setFilesCached(long filesCached) {
      this.filesCached = filesCached;
      return this;
    }

    public CachePoolStats build() {
      return new CachePoolStats(bytesNeeded, bytesCached, bytesOverlimit,
          filesNeeded, filesCached);
    }
  }

  private final long bytesNeeded;
  private final long bytesCached;
  private final long bytesOverlimit;
  private final long filesNeeded;
  private final long filesCached;

  private CachePoolStats(long bytesNeeded, long bytesCached,
                         long bytesOverlimit, long filesNeeded, long filesCached) {
    this.bytesNeeded = bytesNeeded;
    this.bytesCached = bytesCached;
    this.bytesOverlimit = bytesOverlimit;
    this.filesNeeded = filesNeeded;
    this.filesCached = filesCached;
  }

  public long getBytesNeeded() {
    return bytesNeeded;
  }

  public long getBytesCached() {
    return bytesCached;
  }

  public long getBytesOverlimit() {
    return bytesOverlimit;
  }

  public long getFilesNeeded() {
    return filesNeeded;
  }

  public long getFilesCached() {
    return filesCached;
  }

  public String toString() {
    return "{" + "bytesNeeded:" + bytesNeeded
        + ", bytesCached:" + bytesCached
        + ", bytesOverlimit:" + bytesOverlimit
        + ", filesNeeded:" + filesNeeded
        + ", filesCached:" + filesCached + "}";
  }
}
