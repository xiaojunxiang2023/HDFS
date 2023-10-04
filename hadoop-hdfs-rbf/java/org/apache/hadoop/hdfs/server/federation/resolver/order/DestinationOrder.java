package org.apache.hadoop.hdfs.server.federation.resolver.order;

import java.util.EnumSet;

/**
 * Order of the destinations when we have multiple of them. When the resolver
 * of files to subclusters (FileSubclusterResolver) has multiple destinations,
 * this determines which location should be checked first.
 */
public enum DestinationOrder {
  HASH, // Follow consistent hashing in the first folder level
  LOCAL, // Local first
  RANDOM, // Random order
  HASH_ALL, // Follow consistent hashing
  SPACE; // Available space based order

  /** Approaches that write folders in all subclusters. */
  public static final EnumSet<DestinationOrder> FOLDER_ALL = EnumSet.of(
      HASH_ALL,
      RANDOM,
      SPACE);
}