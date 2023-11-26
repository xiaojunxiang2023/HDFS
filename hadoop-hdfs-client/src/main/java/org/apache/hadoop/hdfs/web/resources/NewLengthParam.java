package org.apache.hadoop.hdfs.web.resources;

/** NewLength parameter. */
public class NewLengthParam extends LongParam {
  /** Parameter name. */
  public static final String NAME = "newlength";
  /** Default parameter value. */
  public static final String DEFAULT = NULL;

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public NewLengthParam(final Long value) {
    super(DOMAIN, value, 0L, null);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public NewLengthParam(final String str) {
    this(DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }
}
