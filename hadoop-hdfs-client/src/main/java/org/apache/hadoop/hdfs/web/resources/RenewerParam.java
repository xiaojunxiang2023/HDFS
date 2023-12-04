package org.apache.hadoop.hdfs.web.resources;

/** Renewer parameter. */
public class RenewerParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "renewer";
  /** Default parameter value. */
  public static final String DEFAULT = NULL;

  private static final Domain DOMAIN = new Domain(NAME, null);

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public RenewerParam(final String str) {
    super(DOMAIN, str == null || str.equals(DEFAULT) ? null : str);
  }

  @Override
  public String getName() {
    return NAME;
  }
}
