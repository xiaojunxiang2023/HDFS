package org.apache.hadoop.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/**
 * A {@link GSet} implementation by {@link HashMap}.
 */
public class GSetByHashMap<K, E extends K> implements GSet<K, E> {
  private final HashMap<K, E> m;

  public GSetByHashMap(int initialCapacity, float loadFactor) {
    m = new HashMap<K, E>(initialCapacity, loadFactor);
  }

  @Override
  public int size() {
    return m.size();
  }

  @Override
  public boolean contains(K k) {
    return m.containsKey(k);
  }

  @Override
  public E get(K k) {
    return m.get(k);
  }

  @Override
  public E put(E element) {
    if (element == null) {
      throw new UnsupportedOperationException("Null element is not supported.");
    }
    return m.put(element, element);
  }

  @Override
  public E remove(K k) {
    return m.remove(k);
  }

  @Override
  public Iterator<E> iterator() {
    return m.values().iterator();
  }

  @Override
  public void clear() {
    m.clear();
  }

  @Override
  public Collection<E> values() {
    return m.values();
  }
}
