package org.apache.hadoop.hdfs.web.resources;

/** Represents delegation token used for authentication. */
public class DelegationParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "delegation";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain DOMAIN = new Domain(NAME, null);

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public DelegationParam(final String str) {
    super(DOMAIN, str != null && !str.equals(DEFAULT) ? str : null);
  }

  @Override
  public String getName() {
    return NAME;
  }
}
