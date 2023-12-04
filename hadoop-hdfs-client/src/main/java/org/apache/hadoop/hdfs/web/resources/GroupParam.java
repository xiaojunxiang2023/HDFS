package org.apache.hadoop.hdfs.web.resources;

/** Group parameter. */
public class GroupParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "group";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain DOMAIN = new Domain(NAME, null);

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public GroupParam(final String str) {
    super(DOMAIN, str == null || str.equals(DEFAULT) ? null : str);
  }

  @Override
  public String getName() {
    return NAME;
  }
}
