package org.apache.hadoop.hdfs.server.namenode;

import java.util.List;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.fs.XAttr;
import org.apache.hadoop.hdfs.XAttrHelper;
import org.apache.hadoop.security.AccessControlException;

import org.apache.hadoop.thirdparty.com.google.common.collect.Lists;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;

import static org.apache.hadoop.hdfs.server.common.HdfsServerConstants.SECURITY_XATTR_UNREADABLE_BY_SUPERUSER;

/**
 * There are four types of extended attributes &lt;XAttr&gt; defined by the
 * following namespaces:
 * <br>
 * USER - extended user attributes: these can be assigned to files and
 * directories to store arbitrary additional information. The access
 * permissions for user attributes are defined by the file permission
 * bits. For sticky directories, only the owner and privileged user can 
 * write attributes.
 * <br>
 * TRUSTED - trusted extended attributes: these are visible/accessible
 * only to/by the super user.
 * <br>
 * SECURITY - extended security attributes: these are used by the HDFS
 * core for security purposes and are not available through admin/user
 * API.
 * <br>
 * SYSTEM - extended system attributes: these are used by the HDFS
 * core and are not available through admin/user API.
 * <br>
 * RAW - extended system attributes: these are used for internal system
 *   attributes that sometimes need to be exposed. Like SYSTEM namespace
 *   attributes they are not visible to the user except when getXAttr/getXAttrs
 *   is called on a file or directory in the /.reserved/raw HDFS directory
 *   hierarchy. These attributes can only be accessed by the user who have
 *   read access.
 * <br>
 */
@InterfaceAudience.Private
public class XAttrPermissionFilter {
  
  static void checkPermissionForApi(FSPermissionChecker pc, XAttr xAttr,
      boolean isRawPath)
      throws AccessControlException {
    final boolean isSuperUser = pc.isSuperUser();
    if (xAttr.getNameSpace() == XAttr.NameSpace.USER || 
        (xAttr.getNameSpace() == XAttr.NameSpace.TRUSTED && isSuperUser)) {
      return;
    }
    if (xAttr.getNameSpace() == XAttr.NameSpace.RAW && isRawPath) {
      return;
    }
    if (XAttrHelper.getPrefixedName(xAttr).
        equals(SECURITY_XATTR_UNREADABLE_BY_SUPERUSER)) {
      if (xAttr.getValue() != null) {
        throw new AccessControlException("Attempt to set a value for '" +
            SECURITY_XATTR_UNREADABLE_BY_SUPERUSER +
            "'. Values are not allowed for this xattr.");
      }
      return;
    }
    throw new AccessControlException("User doesn't have permission for xattr: "
        + XAttrHelper.getPrefixedName(xAttr));
  }

  static void checkPermissionForApi(FSPermissionChecker pc,
      List<XAttr> xAttrs, boolean isRawPath) throws AccessControlException {
    Preconditions.checkArgument(xAttrs != null);
    if (xAttrs.isEmpty()) {
      return;
    }

    for (XAttr xAttr : xAttrs) {
      checkPermissionForApi(pc, xAttr, isRawPath);
    }
  }

  static List<XAttr> filterXAttrsForApi(FSPermissionChecker pc,
      List<XAttr> xAttrs, boolean isRawPath) {
    assert xAttrs != null : "xAttrs can not be null";
    if (xAttrs.isEmpty()) {
      return xAttrs;
    }
    
    List<XAttr> filteredXAttrs = Lists.newArrayListWithCapacity(xAttrs.size());
    final boolean isSuperUser = pc.isSuperUser();
    for (XAttr xAttr : xAttrs) {
      if (xAttr.getNameSpace() == XAttr.NameSpace.USER) {
        filteredXAttrs.add(xAttr);
      } else if (xAttr.getNameSpace() == XAttr.NameSpace.TRUSTED && 
          isSuperUser) {
        filteredXAttrs.add(xAttr);
      } else if (xAttr.getNameSpace() == XAttr.NameSpace.RAW && isRawPath) {
        filteredXAttrs.add(xAttr);
      } else if (XAttrHelper.getPrefixedName(xAttr).
          equals(SECURITY_XATTR_UNREADABLE_BY_SUPERUSER)) {
        filteredXAttrs.add(xAttr);
      }
    }
    return filteredXAttrs;
  }
}
