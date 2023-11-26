package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.fs.permission.FsPermission;

/**
 * Unmasked permission parameter, use a Short to represent a FsPermission.
 */
public class UnmaskedPermissionParam extends PermissionParam {
  /** Parameter name. */
  public static final String NAME = "unmaskedpermission";

  private static final Domain DOMAIN = new Domain(NAME, 8);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public UnmaskedPermissionParam(final FsPermission value) {
    super(DOMAIN, value == null ? null : value.toShort(), null, null);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public UnmaskedPermissionParam(final String str) {
    super(DOMAIN, DOMAIN.parse(str), (short)0, (short)01777);
  }

  @Override
  public String getName() {
    return NAME;
  }
}