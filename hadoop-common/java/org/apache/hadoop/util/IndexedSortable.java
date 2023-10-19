package org.apache.hadoop.util;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Interface for collections capable of being sorted by {@link IndexedSorter}
 * algorithms.
 */
@InterfaceAudience.LimitedPrivate({"MapReduce"})
@InterfaceStability.Unstable
public interface IndexedSortable {

  /**
   * Compare items at the given addresses consistent with the semantics of
   * {@link java.util.Comparator#compare(Object, Object)}.
   */
  int compare(int i, int j);

  /**
   * Swap items at the given addresses.
   */
  void swap(int i, int j);
}
