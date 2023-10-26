package org.apache.hadoop.hdfs.server.namenode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Map object to serial number.
 * 
 * <p>It allows to get the serial number of an object, if the object doesn't
 * exist in the map, a new serial number increased by 1 is generated to
 * map to the object. The mapped object can also be got through the serial
 * number.
 * 
 * <p>The map is thread-safe.
 */
public class SerialNumberMap<T> {
  private String name;
  private final int max;
  private final AtomicInteger current = new AtomicInteger(1);
  private final ConcurrentMap<T, Integer> t2i =
      new ConcurrentHashMap<T, Integer>();
  private final ConcurrentMap<Integer, T> i2t =
      new ConcurrentHashMap<Integer, T>();

  SerialNumberMap(SerialNumberManager snm) {
    this(snm.name(), snm.getLength());
  }

  SerialNumberMap(String name, int bitLength) {
    this.name = name;
    this.max = (1 << bitLength) - 1;
  }

  public int get(T t) {
    if (t == null) {
      return 0;
    }
    Integer sn = t2i.get(t);
    if (sn == null) {
      sn = current.getAndIncrement();
      if (sn > max) {
        current.getAndDecrement();
        throw new IllegalStateException(name + ": serial number map is full");
      }
      Integer old = t2i.putIfAbsent(t, sn);
      if (old != null) {
        return old;
      }
      i2t.put(sn, t);
    }
    return sn;
  }

  public T get(int i) {
    if (i == 0) {
      return null;
    }
    T t = i2t.get(i);
    if (t == null) {
      throw new IllegalStateException(
          name + ": serial number " + i + " does not exist");
    }
    return t;
  }

  int getMax() {
    return max;
  }

  Set<Map.Entry<Integer, T>> entrySet() {
    return new HashSet<>(i2t.entrySet());
  }

  public int size() {
    return i2t.size();
  }

  @Override
  public String toString() {
    return "current=" + current + ",\n" +
           "max=" + max + ",\n  t2i=" + t2i + ",\n  i2t=" + i2t;
  }
}