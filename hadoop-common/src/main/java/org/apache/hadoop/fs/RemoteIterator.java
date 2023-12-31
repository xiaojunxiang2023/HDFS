package org.apache.hadoop.fs;

import java.io.IOException;
import java.util.NoSuchElementException;

/**
 * An iterator over a collection whose elements need to be fetched remotely
 */
public interface RemoteIterator<E> {
  /**
   * Returns <tt>true</tt> if the iteration has more elements.
   *
   * @return <tt>true</tt> if the iterator has more elements.
   * @throws IOException if any IO error occurs
   */
  boolean hasNext() throws IOException;

  /**
   * Returns the next element in the iteration.
   *
   * @return the next element in the iteration.
   * @throws NoSuchElementException iteration has no more elements.
   * @throws IOException if any IO error occurs
   */
  E next() throws IOException;
}
