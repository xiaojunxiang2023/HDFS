package org.apache.hadoop.hdfs.web.resources;

/** Offset parameter. */
public class OffsetParam extends LongParam {
  /** Parameter name. */
  public static final String NAME = "offset";
  /** Default parameter value. */
  public static final String DEFAULT = "0";

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public OffsetParam(final Long value) {
    super(DOMAIN, value, 0L, null);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public OffsetParam(final String str) {
    this(DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }

  public Long getOffset() {
    Long offset = getValue();
    return (offset == null) ? Long.valueOf(0) : offset;
  }
}
