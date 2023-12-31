package org.apache.hadoop.fs.impl;

import org.apache.hadoop.fs.*;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.util.concurrent.CompletableFuture;

import static java.util.Objects.requireNonNull;
import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_DEFAULT;
import static org.apache.hadoop.fs.CommonConfigurationKeysPublic.IO_FILE_BUFFER_SIZE_KEY;

/**
 * Builder for input streams and subclasses whose return value is
 * actually a completable future: this allows for better asynchronous
 * operation.
 *
 * To be more generic, {@link #opt(String, int)} and {@link #must(String, int)}
 * variants provide implementation-agnostic way to customize the builder.
 * Each FS-specific builder implementation can interpret the FS-specific
 * options accordingly, for example:
 *
 * If the option is not related to the file system, the option will be ignored.
 * If the option is must, but not supported by the file system, a
 * {@link IllegalArgumentException} will be thrown.
 *
 */
public abstract class FutureDataInputStreamBuilderImpl
    extends AbstractFSBuilderImpl<CompletableFuture<FSDataInputStream>, FutureDataInputStreamBuilder>
    implements FutureDataInputStreamBuilder {

  private final FileSystem fileSystem;

  private int bufferSize;

  /**
   * File status passed in through a {@link #withFileStatus(FileStatus)}
   * call; null otherwise.
   */
  private FileStatus status;

  /**
   * Construct from a {@link FileContext}.
   *
   * @param fc FileContext
   * @param path path.
   * @throws IOException failure
   */
  protected FutureDataInputStreamBuilderImpl(@Nonnull FileContext fc,
                                             @Nonnull Path path) throws IOException {
    super(requireNonNull(path, "path"));
    requireNonNull(fc, "file context");
    this.fileSystem = null;
    bufferSize = IO_FILE_BUFFER_SIZE_DEFAULT;
  }

  /**
   * Constructor.
   * @param fileSystem owner FS.
   * @param path path
   */
  protected FutureDataInputStreamBuilderImpl(@Nonnull FileSystem fileSystem,
                                             @Nonnull Path path) {
    super(requireNonNull(path, "path"));
    this.fileSystem = requireNonNull(fileSystem, "fileSystem");
    initFromFS();
  }

  /**
   * Constructor with PathHandle.
   * @param fileSystem owner FS.
   * @param pathHandle path handle
   */
  public FutureDataInputStreamBuilderImpl(@Nonnull FileSystem fileSystem,
                                          @Nonnull PathHandle pathHandle) {
    super(pathHandle);
    this.fileSystem = fileSystem;
    initFromFS();
  }

  /**
   * Initialize from a filesystem.
   */
  private void initFromFS() {
    bufferSize = fileSystem.getConf().getInt(IO_FILE_BUFFER_SIZE_KEY,
        IO_FILE_BUFFER_SIZE_DEFAULT);
  }

  protected FileSystem getFS() {
    requireNonNull(fileSystem, "fileSystem");
    return fileSystem;
  }

  protected int getBufferSize() {
    return bufferSize;
  }

  /**
   * Set the size of the buffer to be used.
   */
  public FutureDataInputStreamBuilder bufferSize(int bufSize) {
    bufferSize = bufSize;
    return getThisBuilder();
  }

  /**
   * Get the builder.
   * This must be used after the constructor has been invoked to create
   * the actual builder: it allows for subclasses to do things after
   * construction.
   */
  public FutureDataInputStreamBuilder builder() {
    return getThisBuilder();
  }

  @Override
  public FutureDataInputStreamBuilder getThisBuilder() {
    return this;
  }

  @Override
  public FutureDataInputStreamBuilder withFileStatus(FileStatus st) {
    this.status = requireNonNull(st, "status");
    return this;
  }

  /**
   * Get any status set in {@link #withFileStatus(FileStatus)}.
   * @return a status value or null.
   */
  protected FileStatus getStatus() {
    return status;
  }
}
