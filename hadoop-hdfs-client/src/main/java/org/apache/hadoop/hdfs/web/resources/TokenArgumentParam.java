package org.apache.hadoop.hdfs.web.resources;

/**
 * Represents delegation token parameter as method arguments. This is
 * different from {@link DelegationParam}.
 */
public class TokenArgumentParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "token";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain DOMAIN = new Domain(NAME, null);

  /**
   * Constructor.
   * @param str A string representation of the parameter value.
   */
  public TokenArgumentParam(final String str) {
    super(DOMAIN, str != null && !str.equals(DEFAULT) ? str : null);
  }

  @Override
  public String getName() {
    return NAME;
  }
}
