package org.apache.hadoop.hdfs;

import org.apache.hadoop.hdfs.protocol.LocatedBlock;

import java.io.IOException;

/**
 * This exception is thrown when the length of a LocatedBlock instance
 * can not be obtained.
 */
public class CannotObtainBlockLengthException extends IOException {
  private static final long serialVersionUID = 1L;

  public CannotObtainBlockLengthException() {
    super();
  }

  public CannotObtainBlockLengthException(String message) {
    super(message);
  }

  /**
   * Constructs an {@code CannotObtainBlockLengthException} with the
   * specified LocatedBlock that failed to obtain block length.
   *
   * @param locatedBlock
   *        The LocatedBlock instance which block length can not be obtained
   */
  public CannotObtainBlockLengthException(LocatedBlock locatedBlock) {
    super("Cannot obtain block length for " + locatedBlock);
  }

  /**
   * Constructs an {@code CannotObtainBlockLengthException} with the
   * specified LocatedBlock and file that failed to obtain block length.
   *
   * @param locatedBlock
   *        The LocatedBlock instance which block length can not be obtained
   * @param src The file which include this block
   */
  public CannotObtainBlockLengthException(LocatedBlock locatedBlock,
                                          String src) {
    super("Cannot obtain block length for " + locatedBlock + " of " + src);
  }
}
