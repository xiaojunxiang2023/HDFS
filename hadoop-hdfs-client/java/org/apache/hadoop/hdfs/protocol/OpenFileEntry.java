package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * An open file entry for use by DFSAdmin commands.
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class OpenFileEntry {
  private final long id;
  private final String filePath;
  private final String clientName;
  private final String clientMachine;

  public OpenFileEntry(long id, String filePath,
      String clientName, String clientMachine) {
    this.id = id;
    this.filePath = filePath;
    this.clientName = clientName;
    this.clientMachine = clientMachine;
  }

  public long getId() {
    return id;
  }

  public String getFilePath() {
    return filePath;
  }

  public String getClientMachine() {
    return clientMachine;
  }

  public String getClientName() {
    return clientName;
  }
}
