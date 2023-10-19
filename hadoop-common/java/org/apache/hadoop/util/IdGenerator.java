package org.apache.hadoop.util;

import org.apache.hadoop.classification.InterfaceAudience;

/**
 * Generic ID generator
 * used for generating various types of number sequences.
 */
@InterfaceAudience.Private
public interface IdGenerator {

  /** Increment and then return the next value. */
  public long nextValue();
}
