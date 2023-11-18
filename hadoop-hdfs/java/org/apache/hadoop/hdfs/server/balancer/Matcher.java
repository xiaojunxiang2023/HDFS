package org.apache.hadoop.hdfs.server.balancer;

import org.apache.hadoop.net.NetworkTopology;
import org.apache.hadoop.net.Node;

// 判断两个 DataNode的拓扑相邻关系
public interface Matcher {
    /** Match datanodes in the same node group. */
    Matcher SAME_NODE_GROUP = new Matcher() {
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
    Matcher SAME_RACK = new Matcher() {
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
    Matcher ANY_OTHER = new Matcher() {
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
    boolean match(NetworkTopology cluster, Node left, Node right);
}