package org.apache.hadoop.hdfs.server.namenode;

import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;

/**
 * Thrown when there's a failure to read an edit log op from disk when loading
 * edits.
 */
@InterfaceAudience.Private
public class EditLogInputException extends IOException {

  private static final long serialVersionUID = 1L;
  
  private final long numEditsLoaded;
  
  public EditLogInputException(String message, Throwable cause,
      long numEditsLoaded) {
    super(message, cause);
    this.numEditsLoaded = numEditsLoaded;
  }
  
  public long getNumEditsLoaded() {
    return numEditsLoaded;
  }

}
