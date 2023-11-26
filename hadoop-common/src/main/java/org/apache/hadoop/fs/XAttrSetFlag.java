package org.apache.hadoop.fs;

import java.io.IOException;
import java.util.EnumSet;

import org.apache.hadoop.util.micro.HadoopIllegalArgumentException;
public enum XAttrSetFlag {
  /**
   * Create a new xattr.
   * If the xattr exists already, exception will be thrown.
   */
  CREATE((short) 0x01),

  /**
   * Replace a existing xattr.
   * If the xattr does not exist, exception will be thrown.
   */
  REPLACE((short) 0x02);

  private final short flag;

  private XAttrSetFlag(short flag) {
    this.flag = flag;
  }

  short getFlag() {
    return flag;
  }

  public static void validate(String xAttrName, boolean xAttrExists,
      EnumSet<XAttrSetFlag> flag) throws IOException {
    if (flag == null || flag.isEmpty()) {
      throw new HadoopIllegalArgumentException("A flag must be specified.");
    }

    if (xAttrExists) {
      if (!flag.contains(REPLACE)) {
        throw new IOException("XAttr: " + xAttrName +
            " already exists. The REPLACE flag must be specified.");
      }
    } else {
      if (!flag.contains(CREATE)) {
        throw new IOException("XAttr: " + xAttrName +
            " does not exist. The CREATE flag must be specified.");
      }
    }
  }
}
