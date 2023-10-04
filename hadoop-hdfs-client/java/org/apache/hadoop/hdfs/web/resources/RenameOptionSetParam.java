package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.fs.Options;

/** Rename option set parameter. */
public class RenameOptionSetParam extends EnumSetParam<Options.Rename> {
  /** Parameter name. */
  public static final String NAME = "renameoptions";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain<Options.Rename> DOMAIN = new Domain<>(
      NAME, Options.Rename.class);

  /**
   * Constructor.
   * @param options rename options.
   */
  public RenameOptionSetParam(final Options.Rename... options) {
    super(DOMAIN, toEnumSet(Options.Rename.class, options));
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public RenameOptionSetParam(final String str) {
    super(DOMAIN, DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }
}
