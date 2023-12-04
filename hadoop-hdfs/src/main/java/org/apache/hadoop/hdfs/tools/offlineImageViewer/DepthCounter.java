package org.apache.hadoop.hdfs.tools.offlineImageViewer;

/**
 * Utility class for tracking descent into the structure of the
 * Visitor class (ImageVisitor, EditsVisitor etc.)
 */
public class DepthCounter {
  private int depth = 0;

  public void incLevel() {
    depth++;
  }

  public void decLevel() {
    if (depth >= 1) depth--;
  }

  public int getLevel() {
    return depth;
  }
}

