package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.fs.permission.FsPermission;

/** Permission parameter, use a Short to represent a FsPermission. */
public class PermissionParam extends ShortParam {
  /** Parameter name. */
  public static final String NAME = "permission";
  /** Default parameter value. */
  public static final String DEFAULT = NULL;

  private static final Domain DOMAIN = new Domain(NAME, 8);

  private static final short DEFAULT_DIR_PERMISSION = 0755;

  private static final short DEFAULT_FILE_PERMISSION = 0644;

  private static final short DEFAULT_SYMLINK_PERMISSION = 0777;

  /** @return the default FsPermission for directory. */
  public static FsPermission getDefaultDirFsPermission() {
    return new FsPermission(DEFAULT_DIR_PERMISSION);
  }

  /** @return the default FsPermission for file. */
  public static FsPermission getDefaultFileFsPermission() {
    return new FsPermission(DEFAULT_FILE_PERMISSION);
  }

  /** @return the default FsPermission for symlink. */
  public static FsPermission getDefaultSymLinkFsPermission() {
    return new FsPermission(DEFAULT_SYMLINK_PERMISSION);
  }

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public PermissionParam(final FsPermission value) {
    this(DOMAIN, value == null ? null : value.toShort(), null, null);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public PermissionParam(final String str) {
    this(DOMAIN, DOMAIN.parse(str), (short) 0, (short) 01777);
  }

  PermissionParam(final Domain domain, final Short value, final Short min,
                  final Short max) {
    super(domain, value, min, max);
  }

  @Override
  public String getName() {
    return NAME;
  }

  /** @return the represented FsPermission. */
  public FsPermission getFileFsPermission() {
    return this.getFsPermission(DEFAULT_FILE_PERMISSION);
  }

  /** @return the represented FsPermission. */
  public FsPermission getDirFsPermission() {
    return this.getFsPermission(DEFAULT_DIR_PERMISSION);
  }

  private FsPermission getFsPermission(short defaultPermission) {
    final Short v = getValue();
    return new FsPermission(v != null ? v : defaultPermission);
  }

}
