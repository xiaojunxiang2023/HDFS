package org.apache.hadoop.fs.permission;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Specifies the scope or intended usage of an ACL entry.
 */
@InterfaceAudience.Public
@InterfaceStability.Stable
public enum AclEntryScope {
  /**
   * An ACL entry that is inspected during permission checks to enforce
   * permissions.
   */
  ACCESS,

  /**
   * An ACL entry to be applied to a directory's children that do not otherwise
   * have their own ACL defined.  Unlike an access ACL entry, a default ACL
   * entry is not inspected as part of permission enforcement on the directory
   * that owns it.
   */
  DEFAULT;
}
