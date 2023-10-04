package org.apache.hadoop.hdfs.tools.offlineImageViewer;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * Utility class for tracking descent into the structure of the
 * Visitor class (ImageVisitor, EditsVisitor etc.)
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
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

