package org.apache.hadoop.net;

import java.util.List;


public interface InnerNode extends Node {
  interface Factory<N extends InnerNode> {
    /** Construct an InnerNode from a path-like string */
    N newInnerNode(String path);
  }

  /** Add node <i>n</i> to the subtree of this node
   * @param n node to be added
   * @return true if the node is added; false otherwise
   */
  boolean add(Node n);

  // 得到这个节点的绝对路径
  Node getLoc(String loc);

  /** @return its children */
  List<Node> getChildren();

  /** @return the number of children this node has. */
  int getNumOfChildren();

  /** @return the number of leave nodes. */
  int getNumOfLeaves();

  /** Remove node <i>n</i> from the subtree of this node
   * @param n node to be deleted
   * @return true if the node is deleted; false otherwise
   */
  boolean remove(Node n);

  /** get <i>leafIndex</i> leaf of this subtree
   * if it is not in the <i>excludedNode</i>
   *
   * @param leafIndex an indexed leaf of the node
   * @param excludedNode an excluded node (can be null)
   * @return the leaf node corresponding to the given index.
   */
  Node getLeaf(int leafIndex, Node excludedNode);
}
