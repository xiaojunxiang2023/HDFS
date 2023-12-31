package org.apache.hadoop.fs.permission;

/**
 * Specifies the type of an ACL entry.
 */
public enum AclEntryType {
  /**
   * An ACL entry applied to a specific user.  These ACL entries can be unnamed,
   * which applies to the file owner, or named, which applies to the specific
   * named user.
   */
  USER,

  /**
   * An ACL entry applied to a specific group.  These ACL entries can be
   * unnamed, which applies to the file's group, or named, which applies to the
   * specific named group.
   */
  GROUP,

  /**
   * An ACL mask entry.  Mask entries are unnamed.  During permission checks,
   * the mask entry interacts with all ACL entries that are members of the group
   * class.  This consists of all named user entries, the unnamed group entry,
   * and all named group entries.  For each such entry, any permissions that are
   * absent from the mask entry are removed from the effective permissions used
   * during the permission check.
   */
  MASK,

  /**
   * An ACL entry that applies to all other users that were not covered by one
   * of the more specific ACL entry types.
   */
  OTHER;

  @Override
  public String toString() {
    // This currently just delegates to the stable string representation, but it
    // is permissible for the output of this method to change across versions.
    return toStringStable();
  }

  /**
   * Returns a string representation guaranteed to be stable across versions to
   * satisfy backward compatibility requirements, such as for shell command
   * output or serialization.
   *
   * @return stable, backward compatible string representation
   */
  public String toStringStable() {
    // The base implementation uses the enum value names, which are public API
    // and therefore stable.
    return super.toString();
  }
}
