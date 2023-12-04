package org.apache.hadoop.io;

import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.hadoop.thirdparty.com.google.common.collect.ComparisonChain;

import java.nio.ByteBuffer;
import java.util.Map;
import java.util.TreeMap;

/**
 * This is a simple ByteBufferPool which just creates ByteBuffers as needed.
 * It also caches ByteBuffers after they're released.  It will always return
 * the smallest cached buffer with at least the capacity you request.
 * We don't try to do anything clever here like try to limit the maximum cache
 * size.
 */
public final class ElasticByteBufferPool implements ByteBufferPool {
  private static final class Key implements Comparable<Key> {
    private final int capacity;
    private final long insertionTime;

    Key(int capacity, long insertionTime) {
      this.capacity = capacity;
      this.insertionTime = insertionTime;
    }

    @Override
    public int compareTo(Key other) {
      return ComparisonChain.start().
          compare(capacity, other.capacity).
          compare(insertionTime, other.insertionTime).
          result();
    }

    @Override
    public boolean equals(Object rhs) {
      if (rhs == null) {
        return false;
      }
      try {
        Key o = (Key) rhs;
        return (compareTo(o) == 0);
      } catch (ClassCastException e) {
        return false;
      }
    }

    @Override
    public int hashCode() {
      return new HashCodeBuilder().
          append(capacity).
          append(insertionTime).
          toHashCode();
    }
  }

  private final TreeMap<Key, ByteBuffer> buffers =
      new TreeMap<Key, ByteBuffer>();

  private final TreeMap<Key, ByteBuffer> directBuffers =
      new TreeMap<Key, ByteBuffer>();

  private final TreeMap<Key, ByteBuffer> getBufferTree(boolean direct) {
    return direct ? directBuffers : buffers;
  }

  @Override
  public synchronized ByteBuffer getBuffer(boolean direct, int length) {
    TreeMap<Key, ByteBuffer> tree = getBufferTree(direct);
    Map.Entry<Key, ByteBuffer> entry =
        tree.ceilingEntry(new Key(length, 0));
    if (entry == null) {
      return direct ? ByteBuffer.allocateDirect(length) :
          ByteBuffer.allocate(length);
    }
    tree.remove(entry.getKey());
    entry.getValue().clear();
    return entry.getValue();
  }

  @Override
  public synchronized void putBuffer(ByteBuffer buffer) {
    buffer.clear();
    TreeMap<Key, ByteBuffer> tree = getBufferTree(buffer.isDirect());
    while (true) {
      Key key = new Key(buffer.capacity(), System.nanoTime());
      if (!tree.containsKey(key)) {
        tree.put(key, buffer);
        return;
      }
      // Buffers are indexed by (capacity, time).
      // If our key is not unique on the first try, we try again, since the
      // time will be different.  Since we use nanoseconds, it's pretty
      // unlikely that we'll loop even once, unless the system clock has a
      // poor granularity.
    }
  }

  /**
   * Get the size of the buffer pool, for the specified buffer type.
   *
   * @param direct Whether the size is returned for direct buffers
   * @return The size
   */
  public int size(boolean direct) {
    return getBufferTree(direct).size();
  }
}
