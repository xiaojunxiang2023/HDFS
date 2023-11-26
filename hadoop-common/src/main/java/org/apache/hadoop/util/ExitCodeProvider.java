package org.apache.hadoop.util;

/**
 * Get the exit code of an exception.
 * Making it an interface makes
 * it possible to retrofit exit codes onto existing classes,
 * and add exit code providers under all parts of the Exception tree.
 */

public interface ExitCodeProvider {

  /**
   * Method to get the exit code.
   * @return the exit code
   */
  int getExitCode();
}
