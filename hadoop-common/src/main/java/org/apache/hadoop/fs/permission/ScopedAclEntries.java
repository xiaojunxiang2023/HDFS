package org.apache.hadoop.fs.permission;

import java.util.Collections;
import java.util.List;
import org.apache.hadoop.fs.permission.AclEntry;
import org.apache.hadoop.fs.permission.AclEntryScope;

/**
 * Groups a list of ACL entries into separate lists for access entries vs.
 * default entries.
 */
// MapReduce也可见
public final class ScopedAclEntries {
  private static final int PIVOT_NOT_FOUND = -1;

  private final List<AclEntry> accessEntries;
  private final List<AclEntry> defaultEntries;

  /**
   * Creates a new ScopedAclEntries from the given list.  It is assumed that the
   * list is already sorted such that all access entries precede all default
   * entries.
   *
   * @param aclEntries List&lt;AclEntry&gt; to separate
   */
  public ScopedAclEntries(List<AclEntry> aclEntries) {
    int pivot = calculatePivotOnDefaultEntries(aclEntries);
    if (pivot != PIVOT_NOT_FOUND) {
      accessEntries = pivot != 0 ? aclEntries.subList(0, pivot) :
        Collections.<AclEntry>emptyList();
      defaultEntries = aclEntries.subList(pivot, aclEntries.size());
    } else {
      accessEntries = aclEntries;
      defaultEntries = Collections.emptyList();
    }
  }

  /**
   * Returns access entries.
   *
   * @return List&lt;AclEntry&gt; containing just access entries, or an empty
   * list if there are no access entries
   */
  public List<AclEntry> getAccessEntries() {
    return accessEntries;
  }

  /**
   * Returns default entries.
   *
   * @return List&lt;AclEntry&gt; containing just default entries, or an empty
   * list if there are no default entries
   */
  public List<AclEntry> getDefaultEntries() {
    return defaultEntries;
  }

  /**
   * Returns the pivot point in the list between the access entries and the
   * default entries.  This is the index of the first element in the list that
   * is a default entry.
   *
   * @param aclBuilder ArrayList<AclEntry> containing entries to build
   * @return int pivot point, or -1 if list contains no default entries
   */
  private static int calculatePivotOnDefaultEntries(List<AclEntry> aclBuilder) {
    for (int i = 0; i < aclBuilder.size(); ++i) {
      if (aclBuilder.get(i).getScope() == AclEntryScope.DEFAULT) {
        return i;
      }
    }
    return PIVOT_NOT_FOUND;
  }
}
