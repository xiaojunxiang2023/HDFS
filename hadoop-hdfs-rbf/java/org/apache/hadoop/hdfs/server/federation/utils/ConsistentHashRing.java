package org.apache.hadoop.hdfs.server.federation.utils;

import org.apache.hadoop.io.MD5Hash;

import java.util.*;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// 哈希环，一种负载均衡算法，一致性哈希
public class ConsistentHashRing {
  private static final String SEPARATOR = "/";
  private static final String VIRTUAL_NODE_FORMAT = "%s" + SEPARATOR + "%d";

  /** Hash ring. */
  private SortedMap<String, String> ring = new TreeMap<String, String>();
  /** Entry -> num virtual nodes on ring. */
  private Map<String, Integer> entryToVirtualNodes =
      new HashMap<String, Integer>();

  /** Synchronization. */
  private final ReadWriteLock readWriteLock = new ReentrantReadWriteLock();
  private final Lock readLock = readWriteLock.readLock();
  private final Lock writeLock = readWriteLock.writeLock();

  public ConsistentHashRing(Set<String> locations) {
    for (String location : locations) {
      addLocation(location);
    }
  }

  /**
   * Add entry to consistent hash ring.
   *
   * @param location Node to add to the ring.
   */
  public void addLocation(String location) {
    addLocation(location, 100);
  }

  /**
   * Add entry to consistent hash ring.
   *
   * @param location Node to add to the ring.
   * @param numVirtualNodes Number of virtual nodes to add.
   */
  public void addLocation(String location, int numVirtualNodes) {
    writeLock.lock();
    try {
      entryToVirtualNodes.put(location, numVirtualNodes);
      for (int i = 0; i < numVirtualNodes; i++) {
        String key = String.format(VIRTUAL_NODE_FORMAT, location, i);
        String hash = getHash(key);
        ring.put(hash, key);
      }
    } finally {
      writeLock.unlock();
    }
  }

  /**
   * Remove specified entry from hash ring.
   *
   * @param location Node to remove from the ring.
   */
  public void removeLocation(String location) {
    writeLock.lock();
    try {
      Integer numVirtualNodes = entryToVirtualNodes.remove(location);
      for (int i = 0; i < numVirtualNodes; i++) {
        String key = String.format(VIRTUAL_NODE_FORMAT, location, i);
        String hash = getHash(key);
        ring.remove(hash);
      }
    } finally {
      writeLock.unlock();
    }
  }

  /**
   * Return location (owner) of specified item. Owner is the next
   * entry on the hash ring (with a hash value &gt; hash value of item).
   * @param item Item to look for.
   * @return The location of the item.
   */
  public String getLocation(String item) {
    readLock.lock();
    try {
      if (ring.isEmpty()) {
        return null;
      }
      String hash = getHash(item);
      if (!ring.containsKey(hash)) {
        SortedMap<String, String> tailMap = ring.tailMap(hash);
        hash = tailMap.isEmpty() ? ring.firstKey() : tailMap.firstKey();
      }
      String virtualNode = ring.get(hash);
      int index = virtualNode.lastIndexOf(SEPARATOR);
      if (index >= 0) {
        return virtualNode.substring(0, index);
      } else {
        return virtualNode;
      }
    } finally {
      readLock.unlock();
    }
  }

  public String getHash(String key) {
    return MD5Hash.digest(key).toString();
  }

  /**
   * Get the locations in the ring.
   * @return Set of locations in the ring.
   */
  public Set<String> getLocations() {
    return entryToVirtualNodes.keySet();
  }
}
