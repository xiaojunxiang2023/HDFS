package org.apache.hadoop.hdfs.tools.offlineImageViewer;

import java.util.EnumSet;

/**
 * Class representing a corruption in the PBImageCorruptionDetector processor.
 */
public class PBImageCorruption {
  private static final String WITH = "With";
  private long id;
  private EnumSet<PBImageCorruptionType> type;
  private int numOfCorruptChildren;

  PBImageCorruption(long id, boolean missingChild, boolean corruptNode,
                    int numOfCorruptChildren) {
    if (!missingChild && !corruptNode) {
      throw new IllegalArgumentException(
          "Corruption must have at least one aspect!");
    }
    this.id = id;
    this.type = EnumSet.noneOf(PBImageCorruptionType.class);
    if (missingChild) {
      type.add(PBImageCorruptionType.MISSING_CHILD);
    }
    if (corruptNode) {
      type.add(PBImageCorruptionType.CORRUPT_NODE);
    }
    this.numOfCorruptChildren = numOfCorruptChildren;
  }

  void addMissingChildCorruption() {
    type.add(PBImageCorruptionType.MISSING_CHILD);
  }

  void addCorruptNodeCorruption() {
    type.add(PBImageCorruptionType.CORRUPT_NODE);
  }

  void setNumberOfCorruption(int numOfCorruption) {
    this.numOfCorruptChildren = numOfCorruption;
  }

  long getId() {
    return id;
  }

  String getType() {
    StringBuffer s = new StringBuffer();
    if (type.contains(PBImageCorruptionType.CORRUPT_NODE)) {
      s.append(PBImageCorruptionType.CORRUPT_NODE);
    }
    if (type.contains(PBImageCorruptionType.CORRUPT_NODE) &&
        type.contains(PBImageCorruptionType.MISSING_CHILD)) {
      s.append(WITH);
    }

    if (type.contains(PBImageCorruptionType.MISSING_CHILD)) {
      s.append(PBImageCorruptionType.MISSING_CHILD);
    }
    return s.toString();
  }

  int getNumOfCorruptChildren() {
    return numOfCorruptChildren;
  }

  /**
   * PBImageCorruptionType is a wrapper for getting a string output for
   * different types of corruption. Could be added more cases if
   * other types are revealed. Currently hasMissingChild and
   * isCorruptNode are the relevant cases.
   */
  private enum PBImageCorruptionType {
    CORRUPT_NODE("CorruptNode"),
    MISSING_CHILD("MissingChild");

    private final String name;

    PBImageCorruptionType(String s) {
      name = s;
    }

    @Override
    public String toString() {
      return this.name;
    }
  }

}
