package org.apache.hadoop.fs.permission;

import org.apache.hadoop.thirdparty.com.google.common.collect.Lists;

import java.util.Iterator;
import java.util.List;

/**
 * AclUtil contains utility methods for manipulating ACLs.
 */
public final class AclUtil {

  /**
   * Given permissions and extended ACL entries, returns the full logical ACL.
   *
   * @param perm FsPermission containing permissions
   * @param entries List&lt;AclEntry&gt; containing extended ACL entries
   * @return List&lt;AclEntry&gt; containing full logical ACL
   */
  public static List<AclEntry> getAclFromPermAndEntries(FsPermission perm,
                                                        List<AclEntry> entries) {
    List<AclEntry> acl = Lists.newArrayListWithCapacity(entries.size() + 3);

    // Owner entry implied by owner permission bits.
    acl.add(new AclEntry.Builder()
        .setScope(AclEntryScope.ACCESS)
        .setType(AclEntryType.USER)
        .setPermission(perm.getUserAction())
        .build());

    // All extended access ACL entries.
    boolean hasAccessAcl = false;
    Iterator<AclEntry> entryIter = entries.iterator();
    AclEntry curEntry = null;
    while (entryIter.hasNext()) {
      curEntry = entryIter.next();
      if (curEntry.getScope() == AclEntryScope.DEFAULT) {
        break;
      }
      hasAccessAcl = true;
      acl.add(curEntry);
    }

    // Mask entry implied by group permission bits, or group entry if there is
    // no access ACL (only default ACL).
    acl.add(new AclEntry.Builder()
        .setScope(AclEntryScope.ACCESS)
        .setType(hasAccessAcl ? AclEntryType.MASK : AclEntryType.GROUP)
        .setPermission(perm.getGroupAction())
        .build());

    // Other entry implied by other bits.
    acl.add(new AclEntry.Builder()
        .setScope(AclEntryScope.ACCESS)
        .setType(AclEntryType.OTHER)
        .setPermission(perm.getOtherAction())
        .build());

    // Default ACL entries.
    if (curEntry != null && curEntry.getScope() == AclEntryScope.DEFAULT) {
      acl.add(curEntry);
      while (entryIter.hasNext()) {
        acl.add(entryIter.next());
      }
    }

    return acl;
  }

  /**
   * Translates the given permission bits to the equivalent minimal ACL.
   *
   * @param perm FsPermission to translate
   * @return List&lt;AclEntry&gt; containing exactly 3 entries representing the
   *         owner, group and other permissions
   */
  public static List<AclEntry> getMinimalAcl(FsPermission perm) {
    return Lists.newArrayList(
        new AclEntry.Builder()
            .setScope(AclEntryScope.ACCESS)
            .setType(AclEntryType.USER)
            .setPermission(perm.getUserAction())
            .build(),
        new AclEntry.Builder()
            .setScope(AclEntryScope.ACCESS)
            .setType(AclEntryType.GROUP)
            .setPermission(perm.getGroupAction())
            .build(),
        new AclEntry.Builder()
            .setScope(AclEntryScope.ACCESS)
            .setType(AclEntryType.OTHER)
            .setPermission(perm.getOtherAction())
            .build());
  }

  /**
   * Checks if the given entries represent a minimal ACL (contains exactly 3
   * entries).
   *
   * @param entries List&lt;AclEntry&gt; entries to check
   * @return boolean true if the entries represent a minimal ACL
   */
  public static boolean isMinimalAcl(List<AclEntry> entries) {
    return entries.size() == 3;
  }

  /**
   * There is no reason to instantiate this class.
   */
  private AclUtil() {
  }
}
