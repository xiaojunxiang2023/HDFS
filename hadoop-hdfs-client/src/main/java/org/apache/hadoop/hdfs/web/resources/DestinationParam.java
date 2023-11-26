package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.fs.Path;

/** Destination path parameter. */
public class DestinationParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "destination";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain DOMAIN = new Domain(NAME, null);

  private static String validate(final String str) {
    if (str == null || str.equals(DEFAULT)) {
      return null;
    }
    if (!str.startsWith(Path.SEPARATOR)) {
      throw new IllegalArgumentException("Invalid parameter value: " + NAME
          + " = \"" + str + "\" is not an absolute path.");
    }
    return new Path(str).toUri().getPath();
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public DestinationParam(final String str) {
    super(DOMAIN, validate(str));
  }

  @Override
  public String getName() {
    return NAME;
  }
}
