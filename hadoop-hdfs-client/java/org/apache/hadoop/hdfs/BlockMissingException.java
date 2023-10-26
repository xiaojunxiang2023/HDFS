package org.apache.hadoop.hdfs;

import java.io.IOException;

/**
  * This exception is thrown when a read encounters a block that has no
  * locations associated with it.
  */
public class BlockMissingException extends IOException {

  private static final long serialVersionUID = 1L;

  private final String filename;
  private final long   offset;

  /**
   * An exception that indicates that file was corrupted.
   * @param filename name of corrupted file
   * @param description a description of the corruption details
   */
  public BlockMissingException(String filename, String description,
      long offset) {
    super(description);
    this.filename = filename;
    this.offset = offset;
  }

  /**
   * Returns the name of the corrupted file.
   * @return name of corrupted file
   */
  public String getFile() {
    return filename;
  }

  /**
   * Returns the offset at which this file is corrupted
   * @return offset of corrupted file
   */
  public long getOffset() {
    return offset;
  }
}
