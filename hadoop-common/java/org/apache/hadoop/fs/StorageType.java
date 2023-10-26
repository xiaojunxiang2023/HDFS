package org.apache.hadoop.fs;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import org.apache.hadoop.util.StringUtils;

/**
 * Defines the types of supported storage media. The default storage
 * medium is assumed to be DISK.
 */
public enum StorageType {
  // sorted by the speed of the storage types, from fast to slow
  RAM_DISK(true),
  SSD(false),
  DISK(false),
  ARCHIVE(false),
  PROVIDED(false);

  private final boolean isTransient;

  public static final StorageType DEFAULT = DISK;

  public static final StorageType[] EMPTY_ARRAY = {};

  private static final StorageType[] VALUES = values();

  StorageType(boolean isTransient) {
    this.isTransient = isTransient;
  }

  public boolean isTransient() {
    return isTransient;
  }

  public boolean supportTypeQuota() {
    return !isTransient;
  }

  public boolean isMovable() {
    return !isTransient;
  }

  public static List<StorageType> asList() {
    return Arrays.asList(VALUES);
  }

  public static List<StorageType> getMovableTypes() {
    return getNonTransientTypes();
  }

  public static List<StorageType> getTypesSupportingQuota() {
    return getNonTransientTypes();
  }

  public static StorageType parseStorageType(int i) {
    return VALUES[i];
  }

  public static StorageType parseStorageType(String s) {
    return StorageType.valueOf(StringUtils.toUpperCase(s));
  }

  private static List<StorageType> getNonTransientTypes() {
    List<StorageType> nonTransientTypes = new ArrayList<>();
    for (StorageType t : VALUES) {
      if ( t.isTransient == false ) {
        nonTransientTypes.add(t);
      }
    }
    return nonTransientTypes;
  }
}