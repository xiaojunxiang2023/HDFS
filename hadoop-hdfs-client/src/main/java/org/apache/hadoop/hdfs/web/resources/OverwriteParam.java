package org.apache.hadoop.hdfs.web.resources;

/** Overwrite parameter. */
public class OverwriteParam extends BooleanParam {
  /** Parameter name. */
  public static final String NAME = "overwrite";
  /** Default parameter value. */
  public static final String DEFAULT = FALSE;

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public OverwriteParam(final Boolean value) {
    super(DOMAIN, value);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public OverwriteParam(final String str) {
    super(DOMAIN, DOMAIN.parse(str == null ? DEFAULT : str));
  }

  @Override
  public String getName() {
    return NAME;
  }
}
