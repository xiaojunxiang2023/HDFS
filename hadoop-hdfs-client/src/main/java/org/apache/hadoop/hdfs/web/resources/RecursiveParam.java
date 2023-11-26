package org.apache.hadoop.hdfs.web.resources;

/** Recursive parameter. */
public class RecursiveParam extends BooleanParam {
  /** Parameter name. */
  public static final String NAME = "recursive";
  /** Default parameter value. */
  public static final String DEFAULT = FALSE;

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public RecursiveParam(final Boolean value) {
    super(DOMAIN, value);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public RecursiveParam(final String str) {
    this(DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }
}
