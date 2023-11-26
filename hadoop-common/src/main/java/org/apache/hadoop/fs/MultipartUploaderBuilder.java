package org.apache.hadoop.fs;

import javax.annotation.Nonnull;
import java.io.IOException;

import org.apache.hadoop.fs.permission.FsPermission;

/**
 * Builder interface for Multipart readers.
 * @param <S>
 * @param <B>
 */
public interface MultipartUploaderBuilder<S extends MultipartUploader, B extends MultipartUploaderBuilder<S, B>>
    extends FSBuilder<S, B> {

  /**
   * Set permission for the file.
   */
  B permission(@Nonnull FsPermission perm);

  /**
   * Set the size of the buffer to be used.
   */
  B bufferSize(int bufSize);

  /**
   * Set replication factor.
   */
  B replication(short replica);

  /**
   * Set block size.
   */
  B blockSize(long blkSize);

  /**
   * Create an FSDataOutputStream at the specified path.
   */
  B create();

  /**
   * Set to true to overwrite the existing file.
   * Set it to false, an exception will be thrown when calling {@link #build()}
   * if the file exists.
   */
  B overwrite(boolean overwrite);

  /**
   * Append to an existing file (optional operation).
   */
  B append();

  /**
   * Set checksum opt.
   */
  B checksumOpt(@Nonnull Options.ChecksumOpt chksumOpt);

  /**
   * Create the FSDataOutputStream to write on the file system.
   *
   * @throws IllegalArgumentException if the parameters are not valid.
   * @throws IOException on errors when file system creates or appends the file.
   */
  S build() throws IllegalArgumentException, IOException;
}
