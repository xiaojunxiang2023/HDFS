package org.apache.hadoop.hdfs.web.resources;


/** Exclude datanodes param */
public class ExcludeDatanodesParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "excludedatanodes";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain DOMAIN = new Domain(NAME, null);

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public ExcludeDatanodesParam(final String str) {
    super(DOMAIN, str == null || str.equals(DEFAULT)? null: DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }
}
