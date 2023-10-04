package org.apache.hadoop.hdfs.server.balancer;

import org.apache.hadoop.net.NetworkTopology;
import org.apache.hadoop.net.Node;

/** A matcher interface for matching nodes. */
public interface Matcher {
    /** Match datanodes in the same node group. */
    public static final Matcher SAME_NODE_GROUP = new Matcher() {
        @Override
        public boolean match(NetworkTopology cluster, Node left, Node right) {
            return cluster.isOnSameNodeGroup(left, right);
        }

        @Override
        public String toString() {
            return "SAME_NODE_GROUP";
        }
    };
    /** Match datanodes in the same rack. */
    public static final Matcher SAME_RACK = new Matcher() {
        @Override
        public boolean match(NetworkTopology cluster, Node left, Node right) {
            return cluster.isOnSameRack(left, right);
        }

        @Override
        public String toString() {
            return "SAME_RACK";
        }
    };
    /** Match any datanode with any other datanode. */
    public static final Matcher ANY_OTHER = new Matcher() {
        @Override
        public boolean match(NetworkTopology cluster, Node left, Node right) {
            return left != right;
        }

        @Override
        public String toString() {
            return "ANY_OTHER";
        }
    };

    /** Given the cluster topology, does the left node match the right node? */
    public boolean match(NetworkTopology cluster, Node left, Node right);
}