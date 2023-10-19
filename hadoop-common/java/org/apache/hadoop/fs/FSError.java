package org.apache.hadoop.fs;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/** Thrown for unexpected filesystem errors, presumed to reflect disk errors
 * in the native filesystem. */
@InterfaceAudience.Public
@InterfaceStability.Stable
public class FSError extends Error {
  private static final long serialVersionUID = 1L;

  FSError(Throwable cause) {
    super(cause);
  }
}
