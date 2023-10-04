package org.apache.hadoop.hdfs.shortcircuit;

import org.apache.hadoop.security.token.SecretManager.InvalidToken;

public final class ShortCircuitReplicaInfo {
  private final ShortCircuitReplica replica;
  private final InvalidToken exc;

  public ShortCircuitReplicaInfo() {
    this.replica = null;
    this.exc = null;
  }

  public ShortCircuitReplicaInfo(ShortCircuitReplica replica) {
    this.replica = replica;
    this.exc = null;
  }

  public ShortCircuitReplicaInfo(InvalidToken exc) {
    this.replica = null;
    this.exc = exc;
  }

  public ShortCircuitReplica getReplica() {
    return replica;
  }

  public InvalidToken getInvalidTokenException() {
    return exc;
  }

  public String toString() {
    StringBuilder builder = new StringBuilder();
    String prefix = "";
    builder.append("ShortCircuitReplicaInfo{");
    if (replica != null) {
      builder.append(prefix).append(replica);
      prefix = ", ";
    }
    if (exc != null) {
      builder.append(prefix).append(exc);
    }
    builder.append("}");
    return builder.toString();
  }
}
