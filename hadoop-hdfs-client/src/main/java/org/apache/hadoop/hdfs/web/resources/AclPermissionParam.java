package org.apache.hadoop.hdfs.web.resources;

import org.apache.hadoop.fs.permission.AclEntry;
import org.apache.hadoop.thirdparty.com.google.common.annotations.VisibleForTesting;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import static org.apache.hadoop.hdfs.client.HdfsClientConfigKeys.DFS_WEBHDFS_ACL_PERMISSION_PATTERN_DEFAULT;

/** AclPermission parameter. */
public class AclPermissionParam extends StringParam {
  /** Parameter name. */
  public static final String NAME = "aclspec";
  /** Default parameter value. */
  public static final String DEFAULT = "";

  private static Domain DOMAIN = new Domain(NAME,
      Pattern.compile(DFS_WEBHDFS_ACL_PERMISSION_PATTERN_DEFAULT));

  /**
   * Constructor.
   *
   * @param str a string representation of the parameter value.
   */
  public AclPermissionParam(final String str) {
    super(DOMAIN, str == null || str.equals(DEFAULT) ? null : str);
  }

  public AclPermissionParam(List<AclEntry> acl) {
    super(DOMAIN, parseAclSpec(acl).equals(DEFAULT) ? null : parseAclSpec(acl));
  }

  @VisibleForTesting
  public static Domain getAclPermissionPattern() {
    return DOMAIN;
  }

  @VisibleForTesting
  public static void setAclPermissionPattern(Domain dm) {
    DOMAIN = dm;
  }

  public static void setAclPermissionPattern(String pattern) {
    DOMAIN = new Domain(NAME, Pattern.compile(pattern));
  }

  @Override
  public String getName() {
    return NAME;
  }

  public List<AclEntry> getAclPermission(boolean includePermission) {
    final String v = getValue();
    return (v != null ? AclEntry.parseAclSpec(v, includePermission) : AclEntry
        .parseAclSpec(DEFAULT, includePermission));
  }

  /**
   * @return parse {@code aclEntry} and return aclspec
   */
  private static String parseAclSpec(List<AclEntry> aclEntries) {
    if (aclEntries == null) {
      return null;
    }
    if (aclEntries.isEmpty()) {
      return "";
    }
    if (aclEntries.size() == 1) {
      AclEntry entry = aclEntries.get(0);
      return entry == null ? "" : entry.toStringStable();
    }
    StringBuilder sb = new StringBuilder();
    Iterator<AclEntry> iter = aclEntries.iterator();
    sb.append(iter.next().toStringStable());
    while (iter.hasNext()) {
      AclEntry entry = iter.next();
      sb.append(',').append(entry == null ? "" : entry.toStringStable());
    }
    return sb.toString();
  }
}
