package org.apache.hadoop.fs;

/**
 * Standard strings to use in exception messages in filesystems
 * HDFS is used as the reference source of the strings
 */
public class FSExceptionMessages {

  /**
   * The operation failed because the stream is closed: {@value}
   */
  public static final String STREAM_IS_CLOSED = "Stream is closed!";

  /**
   * Negative offset seek forbidden : {@value}
   */
  public static final String NEGATIVE_SEEK =
    "Cannot seek to a negative offset";

  /**
   * Seeks : {@value}
   */
  public static final String CANNOT_SEEK_PAST_EOF =
      "Attempted to seek or read past the end of the file";

  public static final String EOF_IN_READ_FULLY =
      "End of file reached before reading fully.";

  public static final String TOO_MANY_BYTES_FOR_DEST_BUFFER
      = "Requested more bytes than destination buffer size";

  public static final String PERMISSION_DENIED = "Permission denied";

  public static final String PERMISSION_DENIED_BY_STICKY_BIT =
      "Permission denied by sticky bit";

  /**
   * A call was made to abort(), but it is not supported.
   */
  public static final String ABORTABLE_UNSUPPORTED =
      "Abortable.abort() is not supported";
}
