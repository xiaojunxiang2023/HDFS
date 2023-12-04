package org.apache.hadoop.hdfs.server.common;

import java.io.IOException;

/**
 * The exception is thrown when external version does not match 
 * current version of the application.
 *
 */
public class IncorrectVersionException extends IOException {
  private static final long serialVersionUID = 1L;

  public IncorrectVersionException(String message) {
    super(message);
  }

  public IncorrectVersionException(String minimumVersion, String reportedVersion,
                                   String remoteDaemon, String thisDaemon) {
    this("The reported " + remoteDaemon + " version is too low to communicate" +
        " with this " + thisDaemon + ". " + remoteDaemon + " version: '" +
        reportedVersion + "' Minimum " + remoteDaemon + " version: '" +
        minimumVersion + "'");
  }

  public IncorrectVersionException(int currentLayoutVersion,
                                   int versionReported, String ofWhat) {
    this(versionReported, ofWhat, currentLayoutVersion);
  }

  public IncorrectVersionException(int versionReported,
                                   String ofWhat,
                                   int versionExpected) {
    this("Unexpected version "
        + (ofWhat == null ? "" : "of " + ofWhat) + ". Reported: "
        + versionReported + ". Expecting = " + versionExpected + ".");
  }

}
