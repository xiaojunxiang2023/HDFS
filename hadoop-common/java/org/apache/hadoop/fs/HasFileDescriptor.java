package org.apache.hadoop.fs;

import java.io.FileDescriptor;
import java.io.IOException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Having a FileDescriptor
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public interface HasFileDescriptor {

  /**
   * @return the FileDescriptor
   * @throws IOException
   */
  public FileDescriptor getFileDescriptor() throws IOException;

}
