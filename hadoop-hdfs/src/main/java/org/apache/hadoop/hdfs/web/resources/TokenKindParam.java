package org.apache.hadoop.hdfs.web.resources;

public class TokenKindParam extends StringParam {

  /** Parameter name */
  public static final String NAME = "kind";
  /** Default parameter value. */
  public static final String DEFAULT = NULL;

  private static final StringParam.Domain DOMAIN = new StringParam.Domain(NAME, null);

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public TokenKindParam(final String str) {
    super(DOMAIN, str == null || str.equals(DEFAULT) ? null : str);
  }

  @Override
  public String getName() {
    return NAME;
  }
}
