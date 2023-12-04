package org.apache.hadoop.hdfs.server.namenode.snapshot;

import org.apache.hadoop.hdfs.server.namenode.INodeDirectory;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/**
 * Resizable-array implementation of the DiffList interface.
 * @param <T> Type of the object in the list
 */
public class DiffListByArrayList<T extends Comparable<Integer>>
    implements DiffList<T> {
  private final List<T> list;

  DiffListByArrayList(List<T> list) {
    this.list = list;
  }

  public DiffListByArrayList(int initialCapacity) {
    this(new ArrayList<>(initialCapacity));
  }

  @Override
  public T get(int i) {
    return list.get(i);
  }

  @Override
  public boolean isEmpty() {
    return list.isEmpty();
  }

  @Override
  public int size() {
    return list.size();
  }

  @Override
  public T remove(int i) {
    return list.remove(i);
  }

  @Override
  public boolean addLast(T t) {
    return list.add(t);
  }

  @Override
  public void addFirst(T t) {
    list.add(0, t);
  }

  @Override
  public int binarySearch(int i) {
    return Collections.binarySearch(list, i);
  }

  @Override
  public Iterator<T> iterator() {
    return list.iterator();
  }

  @Override
  public List<T> getMinListForRange(int startIndex, int endIndex,
                                    INodeDirectory dir) {
    return list.subList(startIndex, endIndex);
  }
}
