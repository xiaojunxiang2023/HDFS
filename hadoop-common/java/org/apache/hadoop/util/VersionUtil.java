package org.apache.hadoop.util;

/**
 * A wrapper class to maven's ComparableVersion class, to comply
 * with maven's version name string convention 
 */
public abstract class VersionUtil {
  /**
   * Compares two version name strings using maven's ComparableVersion class.
   *
   * @param version1
   *          the first version to compare
   * @param version2
   *          the second version to compare
   * @return a negative integer if version1 precedes version2, a positive
   *         integer if version2 precedes version1, and 0 if and only if the two
   *         versions are equal.
   */
  public static int compareVersions(String version1, String version2) {
    ComparableVersion v1 = new ComparableVersion(version1);
    ComparableVersion v2 = new ComparableVersion(version2);
    return v1.compareTo(v2);
  }
}
