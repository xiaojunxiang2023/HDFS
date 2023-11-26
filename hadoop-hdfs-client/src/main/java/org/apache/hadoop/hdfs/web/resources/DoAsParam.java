package org.apache.hadoop.hdfs.web.resources;

/** DoAs parameter for proxy user. */
public class DoAsParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "doas";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain DOMAIN = new Domain(NAME, null);

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public DoAsParam(final String str) {
    super(DOMAIN, str == null || str.equals(DEFAULT)? null: str);
  }

  @Override
  public String getName() {
    return NAME;
  }
}
