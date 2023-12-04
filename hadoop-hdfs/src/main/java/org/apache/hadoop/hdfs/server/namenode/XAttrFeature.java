package org.apache.hadoop.hdfs.server.namenode;

import org.apache.hadoop.fs.XAttr;
import org.apache.hadoop.hdfs.XAttrHelper;
import org.apache.hadoop.thirdparty.com.google.common.collect.ImmutableList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Feature for extended attributes.
 */
public class XAttrFeature implements INode.Feature {
  static final int PACK_THRESHOLD = 1024;

  /** The packed bytes for small size XAttrs. */
  private byte[] attrs;

  /**
   * List to store large size XAttrs.
   * Typically XAttr value size is small, so this
   * list is null usually.
   */
  private ImmutableList<XAttr> xAttrs;

  public XAttrFeature(List<XAttr> xAttrs) {
    if (xAttrs != null && !xAttrs.isEmpty()) {
      List<XAttr> toPack = new ArrayList<XAttr>();
      ImmutableList.Builder<XAttr> b = null;
      for (XAttr attr : xAttrs) {
        if (attr.getValue() == null ||
            attr.getValue().length <= PACK_THRESHOLD) {
          toPack.add(attr);
        } else {
          if (b == null) {
            b = ImmutableList.builder();
          }
          b.add(attr);
        }
      }
      this.attrs = XAttrFormat.toBytes(toPack);
      if (b != null) {
        this.xAttrs = b.build();
      }
    }
  }

  /**
   * Get the XAttrs.
   * @return the XAttrs
   */
  public List<XAttr> getXAttrs() {
    if (xAttrs == null) {
      return XAttrFormat.toXAttrs(attrs);
    } else {
      if (attrs == null) {
        return xAttrs;
      } else {
        List<XAttr> result = new ArrayList<>();
        result.addAll(XAttrFormat.toXAttrs(attrs));
        result.addAll(xAttrs);
        return result;
      }
    }
  }

  @Override
  public boolean equals(Object o) {
    if (o == null) {
      return false;
    }
    if (getClass() != o.getClass()) {
      return false;
    }
    return getXAttrs().equals(((XAttrFeature) o).getXAttrs());
  }

  @Override
  public int hashCode() {
    return Arrays.hashCode(getXAttrs().toArray());
  }

  /**
   * Get XAttr by name with prefix.
   * @param prefixedName xAttr name with prefix
   * @return the XAttr
   */
  public XAttr getXAttr(String prefixedName) {
    XAttr attr = XAttrFormat.getXAttr(attrs, prefixedName);
    if (attr == null && xAttrs != null) {
      XAttr toFind = XAttrHelper.buildXAttr(prefixedName);
      for (XAttr a : xAttrs) {
        if (a.equalsIgnoreValue(toFind)) {
          attr = a;
          break;
        }
      }
    }
    return attr;
  }
}
