package org.apache.hadoop.hdfs.web.resources;

/** Access time parameter. */
public class AccessTimeParam extends LongParam {
  /** Parameter name. */
  public static final String NAME = "accesstime";
  /** Default parameter value. */
  public static final String DEFAULT = "-1";

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public AccessTimeParam(final Long value) {
    super(DOMAIN, value, -1L, null);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public AccessTimeParam(final String str) {
    this(DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }
}
