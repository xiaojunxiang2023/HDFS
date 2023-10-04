package org.apache.hadoop.hdfs.web.resources;

import java.io.IOException;

import org.apache.hadoop.fs.XAttrCodec;

public class XAttrValueParam extends StringParam {
  /** Parameter name. **/
  public static final String NAME = "xattr.value";
  /** Default parameter value. **/
  public static final String DEFAULT = "";

  private static Domain DOMAIN = new Domain(NAME, null);

  public XAttrValueParam(final String str) {
    super(DOMAIN, str == null || str.equals(DEFAULT) ? null : str);
  }

  @Override
  public String getName() {
    return NAME;
  }

  public byte[] getXAttrValue() throws IOException {
    final String v = getValue();
    return XAttrCodec.decodeValue(v);
  }
}
