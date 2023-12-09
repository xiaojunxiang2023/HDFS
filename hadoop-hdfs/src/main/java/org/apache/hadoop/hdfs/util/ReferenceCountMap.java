package org.apache.hadoop.hdfs.util;

import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;
import org.apache.hadoop.thirdparty.com.google.common.collect.ImmutableList;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * Class for de-duplication of instances. <br>
 * Hold the references count to a single instance. If there are no references
 * then the entry will be removed.<br>
 * Type E should implement {@link ReferenceCounter}<br>
 * Note: This class is NOT thread-safe.
 */
public class ReferenceCountMap<E extends ReferenceCountMap.ReferenceCounter> {

  private Map<E, E> referenceMap = new ConcurrentHashMap<>();

  /**
   * Add the reference. If the instance already present, just increase the
   * reference count.
   *
   * @param key Key to put in reference map
   * @return Referenced instance
   */
  public E put(E key) {
    E value = referenceMap.putIfAbsent(key, key);
    if (value == null) {
      value = key;
    }
    value.incrementAndGetRefCount();
    return value;
  }

  /**
   * Delete the reference. Decrease the reference count for the instance, if
   * any. On all references removal delete the instance from the map.
   *
   * @param key Key to remove the reference.
   */
  public void remove(E key) {
    E value = referenceMap.get(key);
    if (value != null && value.decrementAndGetRefCount() == 0) {
      referenceMap.remove(key);
    }
  }

  /**
   * Get entries in the reference Map.
   *
   * @return
   */
  
  public ImmutableList<E> getEntries() {
    return new ImmutableList.Builder<E>().addAll(referenceMap.keySet()).build();
  }

  /**
   * Get the reference count for the key
   */
  public long getReferenceCount(E key) {
    ReferenceCounter counter = referenceMap.get(key);
    if (counter != null) {
      return counter.getRefCount();
    }
    return 0;
  }

  /**
   * Get the number of unique elements
   */
  public int getUniqueElementsSize() {
    return referenceMap.size();
  }

  /**
   * Clear the contents
   */
  
  public void clear() {
    referenceMap.clear();
  }

  /**
   * Interface for the reference count holder
   */
  public static interface ReferenceCounter {
    public int getRefCount();

    public int incrementAndGetRefCount();

    public int decrementAndGetRefCount();
  }
}
