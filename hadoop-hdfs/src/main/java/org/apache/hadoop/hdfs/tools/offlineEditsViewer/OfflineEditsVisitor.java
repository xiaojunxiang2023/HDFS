package org.apache.hadoop.hdfs.tools.offlineEditsViewer;

import org.apache.hadoop.hdfs.server.namenode.FSEditLogOp;

import java.io.IOException;

/**
 * An implementation of OfflineEditsVisitor can traverse the structure of an
 * Hadoop edits log and respond to each of the structures within the file.
 */
abstract public interface OfflineEditsVisitor {
  /**
   * Begin visiting the edits log structure.  Opportunity to perform
   * any initialization necessary for the implementing visitor.
   *
   * @param version     Edit log version
   */
  abstract void start(int version) throws IOException;

  /**
   * Finish visiting the edits log structure.  Opportunity to perform any
   * clean up necessary for the implementing visitor.
   *
   * @param error        If the visitor was closed because of an 
   *                     unrecoverable error in the input stream, this 
   *                     is the exception.
   */
  abstract void close(Throwable error) throws IOException;

  /**
   * Begin visiting an element that encloses another element, such as
   * the beginning of the list of blocks that comprise a file.
   *
   * @param op Token being visited
   */
  abstract void visitOp(FSEditLogOp op)
      throws IOException;
}
