package org.apache.hadoop.util;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * A facility for reporting progress.
 * 
 * <p>Clients and/or applications can use the provided <code>Progressable</code>
 * to explicitly report progress to the Hadoop framework. This is especially
 * important for operations which take significant amount of time since,
 * in-lieu of the reported progress, the framework has to assume that an error
 * has occurred and time-out the operation.</p>
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public interface Progressable {
  /**
   * Report progress to the Hadoop framework.
   */
  public void progress();
}
