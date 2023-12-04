package org.apache.hadoop.hdfs.protocol;

import java.io.IOException;

/**
 * The exception that happens when you ask to get a non existing XAttr.
 */
public class XAttrNotFoundException extends IOException {
  private static final long serialVersionUID = -6506239904158794057L;
  public static final String DEFAULT_EXCEPTION_MSG =
      "At least one of the attributes provided was not found.";

  public XAttrNotFoundException() {
    this(DEFAULT_EXCEPTION_MSG);
  }

  public XAttrNotFoundException(String msg) {
    super(msg);
  }
}
