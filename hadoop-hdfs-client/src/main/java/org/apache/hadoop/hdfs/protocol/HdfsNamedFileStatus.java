package org.apache.hadoop.hdfs.protocol;

import org.apache.hadoop.fs.FileEncryptionInfo;
import org.apache.hadoop.fs.FileStatus;
import org.apache.hadoop.fs.Path;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.hdfs.DFSUtilClient;

import java.io.IOException;
import java.util.Set;

/**
 * HDFS metadata for an entity in the filesystem without locations. Note that
 * symlinks and directories are returned as {@link HdfsLocatedFileStatus} for
 * backwards compatibility.
 */
public class HdfsNamedFileStatus extends FileStatus implements HdfsFileStatus {

  // local name of the inode that's encoded in java UTF8
  private byte[] uPath;
  private byte[] uSymlink; // symlink target encoded in java UTF8/null
  private final long fileId;
  private final FileEncryptionInfo feInfo;

  // Used by dir, not including dot and dotdot. Always zero for a regular file.
  private final int childrenNum;
  private final byte storagePolicy;

  /**
   * Constructor.
   * @param length the number of bytes the file has
   * @param isdir if the path is a directory
   * @param replication the replication factor
   * @param blocksize the block size
   * @param mtime modification time
   * @param atime access time
   * @param permission permission
   * @param owner the owner of the path
   * @param group the group of the path
   * @param symlink symlink target encoded in java UTF8 or null
   * @param path the local name in java UTF8 encoding the same as that in-memory
   * @param fileId the file id
   * @param childrenNum the number of children. Used by directory.
   * @param feInfo the file's encryption info
   * @param storagePolicy ID which specifies storage policy
   */
  HdfsNamedFileStatus(long length, boolean isdir, int replication,
                      long blocksize, long mtime, long atime,
                      FsPermission permission, Set<Flags> flags,
                      String owner, String group,
                      byte[] symlink, byte[] path, long fileId,
                      int childrenNum, FileEncryptionInfo feInfo,
                      byte storagePolicy) {
    super(length, isdir, replication, blocksize, mtime, atime,
        HdfsFileStatus.convert(isdir, symlink != null, permission, flags),
        owner, group, null, null,
        HdfsFileStatus.convert(flags));
    this.uSymlink = symlink;
    this.uPath = path;
    this.fileId = fileId;
    this.childrenNum = childrenNum;
    this.feInfo = feInfo;
    this.storagePolicy = storagePolicy;
  }

  @Override
  public void setOwner(String owner) {
    super.setOwner(owner);
  }

  @Override
  public void setGroup(String group) {
    super.setOwner(group);
  }

  @Override
  public boolean isSymlink() {
    return uSymlink != null && uSymlink.length > 0;
  }

  @Override
  public Path getSymlink() throws IOException {
    if (isSymlink()) {
      return new Path(DFSUtilClient.bytes2String(getSymlinkInBytes()));
    }
    throw new IOException("Path " + getPath() + " is not a symbolic link");
  }

  @Override
  public void setPermission(FsPermission permission) {
    super.setPermission(permission);
  }

  /**
   * Get the Java UTF8 representation of the local name.
   *
   * @return the local name in java UTF8
   */
  @Override
  public byte[] getLocalNameInBytes() {
    return uPath;
  }

  @Override
  public void setSymlink(Path sym) {
    uSymlink = DFSUtilClient.string2Bytes(sym.toString());
  }

  /**
   * Opaque referant for the symlink, to be resolved at the client.
   */
  @Override
  public byte[] getSymlinkInBytes() {
    return uSymlink;
  }

  @Override
  public long getFileId() {
    return fileId;
  }

  @Override
  public FileEncryptionInfo getFileEncryptionInfo() {
    return feInfo;
  }


  @Override
  public int getChildrenNum() {
    return childrenNum;
  }

  /** @return the storage policy id */
  @Override
  public byte getStoragePolicy() {
    return storagePolicy;
  }

  @Override
  public boolean equals(Object o) {
    // satisfy findbugs
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    // satisfy findbugs
    return super.hashCode();
  }

}
