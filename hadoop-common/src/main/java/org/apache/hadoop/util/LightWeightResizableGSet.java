package org.apache.hadoop.util;

import org.apache.hadoop.util.micro.HadoopIllegalArgumentException;

/**
 * A low memory footprint {@link GSet} implementation,
 * which uses an array for storing the elements
 * and linked lists for collision resolution.
 *
 * If the size of elements exceeds the threshold,
 * the internal array will be resized to double length.
 *
 * This class does not support null element.
 *
 * This class is not thread safe.
 *
 * @param <K> Key type for looking up the elements
 * @param <E> Element type, which must be
 *       (1) a subclass of K, and
 *       (2) implementing {@link LinkedElement} interface.
 */
public class LightWeightResizableGSet<K, E extends K>
    extends LightWeightGSet<K, E> {

  /**
   * The default initial capacity - MUST be a power of two.
   */
  static final int DEFAULT_INITIAL_CAPACITY = 1 << 4;

  /**
   * The load factor used when none specified in constructor.
   */
  static final float DEFAULT_LOAD_FACTOR = 0.75f;

  /** Size of the entry table. */
  private int capacity;

  /**
   * The load factor for the hash set.
   */
  private final float loadFactor;
  private int threshold;

  public LightWeightResizableGSet(int initCapacity, float loadFactor) {
    if (initCapacity < 0) {
      throw new HadoopIllegalArgumentException("Illegal initial capacity: " +
          initCapacity);
    }
    if (loadFactor <= 0 || loadFactor > 1.0f) {
      throw new HadoopIllegalArgumentException("Illegal load factor: " +
          loadFactor);
    }
    this.capacity = actualArrayLength(initCapacity);
    this.hash_mask = capacity - 1;
    this.loadFactor = loadFactor;
    this.threshold = (int) (capacity * loadFactor);

    entries = new LinkedElement[capacity];
  }

  public LightWeightResizableGSet() {
    this(DEFAULT_INITIAL_CAPACITY, DEFAULT_LOAD_FACTOR);
  }

  public LightWeightResizableGSet(int initCapacity) {
    this(initCapacity, DEFAULT_LOAD_FACTOR);
  }

  @Override
  public E put(final E element) {
    E existing = super.put(element);
    expandIfNecessary();
    return existing;
  }

  /**
   * Resize the internal table to given capacity.
   */
  @SuppressWarnings("unchecked")
  protected void resize(int cap) {
    int newCapacity = actualArrayLength(cap);
    if (newCapacity == this.capacity) {
      return;
    }
    this.capacity = newCapacity;
    this.threshold = (int) (capacity * loadFactor);
    this.hash_mask = capacity - 1;
    LinkedElement[] oldEntries = entries;
    entries = new LinkedElement[capacity];
    for (int i = 0; i < oldEntries.length; i++) {
      LinkedElement e = oldEntries[i];
      while (e != null) {
        LinkedElement next = e.getNext();
        int index = getIndex((E) e);
        e.setNext(entries[index]);
        entries[index] = e;
        e = next;
      }
    }
  }

  /**
   * Checks if we need to expand, and expands if necessary.
   */
  protected void expandIfNecessary() {
    if (size > this.threshold && capacity < MAX_ARRAY_LENGTH) {
      resize(capacity * 2);
    }
  }
}