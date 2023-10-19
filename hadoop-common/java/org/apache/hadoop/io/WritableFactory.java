package org.apache.hadoop.io;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/** A factory for a class of Writable.
 * @see WritableFactories
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public interface WritableFactory {
  /** Return a new instance. */
  Writable newInstance();
}

