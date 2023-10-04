package org.apache.hadoop.hdfs.web.resources;

/** Overwrite parameter. */
public class NoRedirectParam extends BooleanParam {
  /** Parameter name. */
  public static final String NAME = "noredirect";
  /** Default parameter value. */
  public static final String DEFAULT = FALSE;

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public NoRedirectParam(final Boolean value) {
    super(DOMAIN, value);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public NoRedirectParam(final String str) {
    this(DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }
}