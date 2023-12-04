package org.apache.hadoop.hdfs.server.datanode.fsdataset.impl;

import org.apache.hadoop.hdfs.ExtendedBlockId;
import org.apache.hadoop.io.nativeio.NativeIO;

import java.nio.MappedByteBuffer;

/**
 * Represents an HDFS block that is mapped to memory by the DataNode.
 */
public class MemoryMappedBlock implements MappableBlock {
  private final long length;
  private MappedByteBuffer mmap;

  MemoryMappedBlock(MappedByteBuffer mmap, long length) {
    this.mmap = mmap;
    this.length = length;
    assert length > 0;
  }

  @Override
  public long getLength() {
    return length;
  }

  @Override
  public long getAddress() {
    return -1L;
  }

  @Override
  public ExtendedBlockId getKey() {
    return null;
  }

  @Override
  public void close() {
    if (mmap != null) {
      NativeIO.POSIX.munmap(mmap);
      mmap = null;
    }
  }
}
