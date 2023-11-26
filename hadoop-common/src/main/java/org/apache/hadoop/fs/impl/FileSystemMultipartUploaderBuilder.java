package org.apache.hadoop.fs.impl;

import javax.annotation.Nonnull;
import java.io.IOException;
import java.util.EnumSet;

import org.apache.hadoop.fs.CreateFlag;
import org.apache.hadoop.fs.FileSystem;
import org.apache.hadoop.fs.Options;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.permission.FsPermission;

/**
 * Builder for {@link FileSystemMultipartUploader}.
 */
public class FileSystemMultipartUploaderBuilder extends
    MultipartUploaderBuilderImpl<FileSystemMultipartUploader, FileSystemMultipartUploaderBuilder> {

  public FileSystemMultipartUploaderBuilder(
      @Nonnull final FileSystem fileSystem,
      @Nonnull final Path path) {
    super(fileSystem, path);
  }

  @Override
  public FileSystemMultipartUploaderBuilder getThisBuilder() {
    return this;
  }

  @Override
  public FileSystemMultipartUploader build()
      throws IllegalArgumentException, IOException {
    return new FileSystemMultipartUploader(this, getFS());
  }

  @Override
  public FileSystem getFS() {
    return super.getFS();
  }

  @Override
  public FsPermission getPermission() {
    return super.getPermission();
  }

  @Override
  public int getBufferSize() {
    return super.getBufferSize();
  }

  @Override
  public short getReplication() {
    return super.getReplication();
  }

  @Override
  public EnumSet<CreateFlag> getFlags() {
    return super.getFlags();
  }

  @Override
  public Options.ChecksumOpt getChecksumOpt() {
    return super.getChecksumOpt();
  }

  @Override
  protected long getBlockSize() {
    return super.getBlockSize();
  }


}
