package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.fs.permission.FsAction;

import java.util.regex.Pattern;

/** {@link FsAction} Parameter */
public class FsActionParam extends StringParam {

  /** Parameter name. */
  public static final String NAME = "fsaction";

  /** Default parameter value. */
  public static final String DEFAULT = NULL;

  private static String FS_ACTION_PATTERN = "[r-][w-][x-]";

  private static final Domain DOMAIN = new Domain(NAME,
      Pattern.compile(FS_ACTION_PATTERN));

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public FsActionParam(final String str) {
    super(DOMAIN, str == null || str.equals(DEFAULT) ? null : str);
  }

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public FsActionParam(final FsAction value) {
    super(DOMAIN, value == null ? null : value.SYMBOL);
  }

  @Override
  public String getName() {
    return NAME;
  }
}
