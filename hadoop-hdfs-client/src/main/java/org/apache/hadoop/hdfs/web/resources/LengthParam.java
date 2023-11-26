package org.apache.hadoop.hdfs.web.resources;

/** Length parameter. */
public class LengthParam extends LongParam {
  /** Parameter name. */
  public static final String NAME = "length";
  /** Default parameter value. */
  public static final String DEFAULT = NULL;

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public LengthParam(final Long value) {
    super(DOMAIN, value, 0L, null);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public LengthParam(final String str) {
    this(DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }

  public long getLength() {
    Long v = getValue();
    return v == null ? -1 : v;
  }
}
