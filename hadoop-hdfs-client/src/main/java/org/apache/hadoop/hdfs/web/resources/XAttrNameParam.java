package org.apache.hadoop.hdfs.web.resources;

import java.util.regex.Pattern;

public class XAttrNameParam extends StringParam {
  /** Parameter name. **/
  public static final String NAME = "xattr.name";
  /** Default parameter value. **/
  public static final String DEFAULT = "";

  private static Domain DOMAIN = new Domain(NAME, Pattern.compile(".*"));

  public XAttrNameParam(final String str) {
    super(DOMAIN, str == null || str.equals(DEFAULT) ? null : str);
  }

  @Override
  public String getName() {
    return NAME;
  }

  public String getXAttrName() {
    return getValue();
  }
}
