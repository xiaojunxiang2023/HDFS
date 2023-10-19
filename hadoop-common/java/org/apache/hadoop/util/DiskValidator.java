package org.apache.hadoop.util;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.util.DiskChecker.DiskErrorException;

import java.io.File;

/**
 * A interface for disk validators.
 *
 * The {@link #checkStatus(File)} operation checks status of a file/dir.
 *
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
public interface DiskValidator {
  /**
   * Check the status of a file/dir.
   * @param dir a file/dir
   * @throws DiskErrorException if any disk error
   */
  void checkStatus(File dir) throws DiskErrorException;
}
