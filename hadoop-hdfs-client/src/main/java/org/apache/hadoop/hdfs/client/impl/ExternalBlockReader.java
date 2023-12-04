package org.apache.hadoop.hdfs.client.impl;

import org.apache.hadoop.fs.ReadOption;
import org.apache.hadoop.hdfs.BlockReader;
import org.apache.hadoop.hdfs.ReplicaAccessor;
import org.apache.hadoop.hdfs.shortcircuit.ClientMmap;
import org.apache.hadoop.util.DataChecksum;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.EnumSet;

/**
 * An ExternalBlockReader uses pluggable ReplicaAccessor objects to read from
 * replicas.
 */
public final class ExternalBlockReader implements BlockReader {
  private final ReplicaAccessor accessor;
  private final long visibleLength;
  private long pos;

  ExternalBlockReader(ReplicaAccessor accessor, long visibleLength,
                      long startOffset) {
    this.accessor = accessor;
    this.visibleLength = visibleLength;
    this.pos = startOffset;
  }

  @Override
  public int read(byte[] buf, int off, int len) throws IOException {
    int nread = accessor.read(pos, buf, off, len);
    if (nread < 0) {
      return nread;
    }
    pos += nread;
    return nread;
  }

  @Override
  public int read(ByteBuffer buf) throws IOException {
    int nread = accessor.read(pos, buf);
    if (nread < 0) {
      return nread;
    }
    pos += nread;
    return nread;
  }

  @Override
  public long skip(long n) throws IOException {
    // You cannot skip backwards
    if (n <= 0) {
      return 0;
    }
    // You can't skip past the last offset that we want to read with this
    // block reader.
    long oldPos = pos;
    pos += n;
    if (pos > visibleLength) {
      pos = visibleLength;
    }
    return pos - oldPos;
  }

  @Override
  public int available() {
    // We return the amount of bytes between the current offset and the visible
    // length.  Some of the other block readers return a shorter length than
    // that.  The only advantage to returning a shorter length is that the
    // DFSInputStream will trash your block reader and create a new one if
    // someone tries to seek() beyond the available() region.
    long diff = visibleLength - pos;
    if (diff > Integer.MAX_VALUE) {
      return Integer.MAX_VALUE;
    } else {
      return (int) diff;
    }
  }

  @Override
  public void close() throws IOException {
    accessor.close();
  }

  @Override
  public void readFully(byte[] buf, int offset, int len) throws IOException {
    BlockReaderUtil.readFully(this, buf, offset, len);
  }

  @Override
  public int readAll(byte[] buf, int offset, int len) throws IOException {
    return BlockReaderUtil.readAll(this, buf, offset, len);
  }

  @Override
  public boolean isShortCircuit() {
    return accessor.isShortCircuit();
  }

  @Override
  public ClientMmap getClientMmap(EnumSet<ReadOption> opts) {
    // For now, pluggable ReplicaAccessors do not support zero-copy.
    return null;
  }

  @Override
  public DataChecksum getDataChecksum() {
    return null;
  }

  @Override
  public int getNetworkDistance() {
    return accessor.getNetworkDistance();
  }
}
