package org.apache.hadoop.hdfs.web.resources;

/** Create Parent parameter. */
public class CreateParentParam extends BooleanParam {
  /** Parameter name. */
  public static final String NAME = "createparent";
  /** Default parameter value. */
  public static final String DEFAULT = TRUE;

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public CreateParentParam(final Boolean value) {
    super(DOMAIN, value);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public CreateParentParam(final String str) {
    this(DOMAIN.parse(str == null ? DEFAULT : str));
  }

  @Override
  public String getName() {
    return NAME;
  }
}
