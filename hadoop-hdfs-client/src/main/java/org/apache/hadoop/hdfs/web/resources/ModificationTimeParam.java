package org.apache.hadoop.hdfs.web.resources;

/** Modification time parameter. */
public class ModificationTimeParam extends LongParam {
  /** Parameter name. */
  public static final String NAME = "modificationtime";
  /** Default parameter value. */
  public static final String DEFAULT = "-1";

  private static final Domain DOMAIN = new Domain(NAME);

  /**
   * Constructor.
   * @param value the parameter value.
   */
  public ModificationTimeParam(final Long value) {
    super(DOMAIN, value, -1L, null);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public ModificationTimeParam(final String str) {
    this(DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }
}
