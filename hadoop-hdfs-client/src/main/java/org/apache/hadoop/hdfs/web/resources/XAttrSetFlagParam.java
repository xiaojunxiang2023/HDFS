package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.fs.XAttrSetFlag;

import java.util.EnumSet;

public class XAttrSetFlagParam extends EnumSetParam<XAttrSetFlag> {
  /** Parameter name. */
  public static final String NAME = "flag";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain<XAttrSetFlag> DOMAIN = new Domain<>(
      NAME, XAttrSetFlag.class);

  public XAttrSetFlagParam(final EnumSet<XAttrSetFlag> flag) {
    super(DOMAIN, flag);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public XAttrSetFlagParam(final String str) {
    super(DOMAIN, DOMAIN.parse(str));
  }

  @Override
  public String getName() {
    return NAME;
  }

  public EnumSet<XAttrSetFlag> getFlag() {
    return getValue();
  }
}
