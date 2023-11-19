package org.apache.hadoop.fs.viewfs;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.fs.Path;

/**
 * NotInMountpointException extends the UnsupportedOperationException.
 * Exception class used in cases where the given path is not mounted 
 * through viewfs.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving /*Evolving for a release,to be changed to Stable */
@SuppressWarnings("serial")
public class NotInMountpointException extends UnsupportedOperationException {
    final String msg;

    public NotInMountpointException(Path path, String operation) {
      msg = operation + " on path `" + path + "' is not within a mount point";
    }

    public NotInMountpointException(String operation) {
      msg = operation + " on empty path is invalid";
    }

    @Override
    public String getMessage() {
      return msg;
    }
}
