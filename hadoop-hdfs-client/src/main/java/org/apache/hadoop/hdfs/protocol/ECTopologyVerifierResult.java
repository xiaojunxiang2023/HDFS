package org.apache.hadoop.hdfs.protocol;

/**
 * Result of the verification whether the current cluster setup can
 * support all enabled EC policies.
 */
public class ECTopologyVerifierResult {

  private final String resultMessage;
  private final boolean isSupported;

  public ECTopologyVerifierResult(boolean isSupported,
                                  String resultMessage) {
    this.resultMessage = resultMessage;
    this.isSupported = isSupported;
  }

  public String getResultMessage() {
    return resultMessage;
  }

  public boolean isSupported() {
    return isSupported;
  }
}
