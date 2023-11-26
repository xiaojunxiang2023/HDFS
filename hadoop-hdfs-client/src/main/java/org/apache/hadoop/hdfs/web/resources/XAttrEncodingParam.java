package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.fs.XAttrCodec;

public class XAttrEncodingParam extends EnumParam<XAttrCodec> {
  /** Parameter name. */
  public static final String NAME = "encoding";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static final Domain<XAttrCodec> DOMAIN =
      new Domain<>(NAME, XAttrCodec.class);

  public XAttrEncodingParam(final XAttrCodec encoding) {
    super(DOMAIN, encoding);
  }

  /**
   * Constructor.
   * @param str a string representation of the parameter value.
   */
  public XAttrEncodingParam(final String str) {
    super(DOMAIN, str != null && !str.isEmpty() ? DOMAIN.parse(str) : null);
  }

  @Override
  public String getName() {
    return NAME;
  }

  @Override
  public String getValueString() {
    return value.toString();
  }

  public XAttrCodec getEncoding() {
    return getValue();
  }
}
