package org.apache.hadoop.net;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeysPublic;
import org.apache.hadoop.thirdparty.com.google.common.base.Preconditions;
import org.apache.hadoop.util.ReflectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.function.Consumer;

public class NetworkTopology {
  public final static String DEFAULT_RACK = "/default-rack";
  public static final Logger LOG = LoggerFactory.getLogger(NetworkTopology.class);

  private static final char PATH_SEPARATOR = '/';
  private static final String PATH_SEPARATOR_STR = "/";
  private static final String ROOT = "/";
  private static final AtomicReference<Random> RANDOM_REF = new AtomicReference<>();

  public static class InvalidTopologyException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public InvalidTopologyException(String msg) {
      super(msg);
    }
  }

  // dfs.net.topology.impl=org.apache.hadoop.hdfs.net.DFSNetworkTopology
  public static NetworkTopology getInstance(Configuration conf) {
    return getInstance(conf, InnerNodeImpl.FACTORY);
  }

  public static NetworkTopology getInstance(Configuration conf,
                                            InnerNode.Factory factory) {
    NetworkTopology nt = ReflectionUtils.newInstance(
        conf.getClass(CommonConfigurationKeysPublic.NET_TOPOLOGY_IMPL_KEY,
            NetworkTopology.class, NetworkTopology.class), conf);
    return nt.init(factory);
  }

  protected NetworkTopology init(InnerNode.Factory factory) {
    if (!factory.equals(this.factory)) {
      // the constructor has initialized the factory to default. So only init
      // again if another factory is specified.
      this.factory = factory;
      this.clusterMap = factory.newInnerNode(NodeBase.ROOT);
    }
    return this;
  }

  InnerNode.Factory factory;

  // 其实就是个树，rack也是节点
  InnerNode clusterMap;

  private int depthOfAllLeaves = -1;

  protected int numOfRacks = 0;

  private boolean clusterEverBeenMultiRack = false;

  protected ReadWriteLock netlock = new ReentrantReadWriteLock(true);

  public void add(Node node) {
    if (node == null) return;
    int newDepth = NodeBase.locationToDepth(node.getNetworkLocation()) + 1;
    netlock.writeLock().lock();
    try {
      if (node instanceof InnerNode) {
        throw new IllegalArgumentException(
            "Not allow to add an inner node: " + NodeBase.getPath(node));
      }
      if ((depthOfAllLeaves != -1) && (depthOfAllLeaves != newDepth)) {
        LOG.error("Error: can't add leaf node {} at depth {} to topology:{}\n",
            NodeBase.getPath(node), newDepth, this);
        throw new InvalidTopologyException("Failed to add " + NodeBase.getPath(node) +
            ": You cannot have a rack and a non-rack node at the same " +
            "level of the network topology.");
      }
      Node rack = getNodeForNetworkLocation(node);
      if (rack != null && !(rack instanceof InnerNode)) {
        throw new IllegalArgumentException("Unexpected data node "
            + node.toString()
            + " at an illegal network location");
      }
      if (clusterMap.add(node)) {
        LOG.info("Adding a new node: " + NodeBase.getPath(node));
        if (rack == null) {
          incrementRacks();
        }
        if (depthOfAllLeaves == -1) {
          depthOfAllLeaves = node.getLevel();
        }
      }
      LOG.debug("NetworkTopology became:\n{}", this);
    } finally {
      netlock.writeLock().unlock();
    }
  }

  protected void incrementRacks() {
    numOfRacks++;
    if (!clusterEverBeenMultiRack && numOfRacks > 1) {
      clusterEverBeenMultiRack = true;
    }
  }

  /**
   * Return a reference to the node given its string representation.
   * Default implementation delegates to {@link #getNode(String)}.
   *
   * <p>To be overridden in subclasses for specific NetworkTopology 
   * implementations, as alternative to overriding the full {@link #add(Node)}
   *  method.
   *
   * @param node The string representation of this node's network location is
   * used to retrieve a Node object. 
   * @return a reference to the node; null if the node is not in the tree
   *
   * @see #add(Node)
   * @see #getNode(String)
   */
  protected Node getNodeForNetworkLocation(Node node) {
    return getNode(node.getNetworkLocation());
  }

  /**
   * Given a string representation of a rack, return its children
   * @param loc a path-like string representation of a rack
   * @return a newly allocated list with all the node's children
   */
  public List<Node> getDatanodesInRack(String loc) {
    netlock.readLock().lock();
    try {
      loc = NodeBase.normalize(loc);
      if (!NodeBase.ROOT.equals(loc)) {
        loc = loc.substring(1);
      }
      InnerNode rack = (InnerNode) clusterMap.getLoc(loc);
      if (rack == null) {
        return null;
      }
      return new ArrayList<Node>(rack.getChildren());
    } finally {
      netlock.readLock().unlock();
    }
  }

  /** Remove a node
   * Update node counter and rack counter if necessary
   * @param node node to be removed; can be null
   */
  public void remove(Node node) {
    if (node == null) return;
    if (node instanceof InnerNode) {
      throw new IllegalArgumentException(
          "Not allow to remove an inner node: " + NodeBase.getPath(node));
    }
    LOG.info("Removing a node: " + NodeBase.getPath(node));
    netlock.writeLock().lock();
    try {
      if (clusterMap.remove(node)) {
        InnerNode rack = (InnerNode) getNode(node.getNetworkLocation());
        if (rack == null) {
          numOfRacks--;
        }
      }
      LOG.debug("NetworkTopology became:\n{}", this);
    } finally {
      netlock.writeLock().unlock();
    }
  }

  public boolean contains(Node node) {
    if (node == null) return false;
    netlock.readLock().lock();
    try {
      Node parent = node.getParent();
      for (int level = node.getLevel(); parent != null && level > 0;
           parent = parent.getParent(), level--) {
        if (parent == clusterMap) {
          return true;
        }
      }
    } finally {
      netlock.readLock().unlock();
    }
    return false;
  }

  public Node getNode(String loc) {
    netlock.readLock().lock();
    try {
      loc = NodeBase.normalize(loc);
      if (!NodeBase.ROOT.equals(loc))
        loc = loc.substring(1);
      return clusterMap.getLoc(loc);
    } finally {
      netlock.readLock().unlock();
    }
  }

  public boolean hasClusterEverBeenMultiRack() {
    return clusterEverBeenMultiRack;
  }

  public String getRack(String loc) {
    return loc;
  }

  public int getNumOfRacks() {
    return numOfRacks;
  }

  public int getNumOfLeaves() {
    return clusterMap.getNumOfLeaves();
  }

  // 核心方法 getDistance
  public int getDistance(Node node1, Node node2) {
    if ((node1 != null && node1.equals(node2)) ||
        (node1 == null && node2 == null)) {
      return 0;
    }
    if (node1 == null || node2 == null) {
      LOG.warn("One of the nodes is a null pointer");
      return Integer.MAX_VALUE;
    }
    Node n1 = node1, n2 = node2;
    int dis = 0;
    netlock.readLock().lock();
    try {
      int level1 = node1.getLevel(), level2 = node2.getLevel();
      while (n1 != null && level1 > level2) {
        n1 = n1.getParent();
        level1--;
        dis++;
      }
      while (n2 != null && level2 > level1) {
        n2 = n2.getParent();
        level2--;
        dis++;
      }
      while (n1 != null && n2 != null && n1.getParent() != n2.getParent()) {
        n1 = n1.getParent();
        n2 = n2.getParent();
        dis += 2;
      }
    } finally {
      netlock.readLock().unlock();
    }
    if (n1 == null) {
      LOG.warn("The cluster does not contain node: " + NodeBase.getPath(node1));
      return Integer.MAX_VALUE;
    }
    if (n2 == null) {
      LOG.warn("The cluster does not contain node: " + NodeBase.getPath(node2));
      return Integer.MAX_VALUE;
    }
    return dis + 2;
  }

  // 核心方法 getDistance? getDistanceByPath
  static public int getDistanceByPath(Node node1, Node node2) {
    if (node1 == null && node2 == null) {
      return 0;
    }
    if (node1 == null || node2 == null) {
      LOG.warn("One of the nodes is a null pointer");
      return Integer.MAX_VALUE;
    }
    String[] paths1 = NodeBase.getPathComponents(node1);
    String[] paths2 = NodeBase.getPathComponents(node2);
    int dis = 0;
    int index = 0;
    int minLevel = Math.min(paths1.length, paths2.length);
    while (index < minLevel) {
      if (!paths1[index].equals(paths2[index])) {
        // Once the path starts to diverge,  compute the distance that include
        // the rest of paths.
        dis += 2 * (minLevel - index);
        break;
      }
      index++;
    }
    dis += Math.abs(paths1.length - paths2.length);
    return dis;
  }

  public boolean isOnSameRack(Node node1, Node node2) {
    if (node1 == null || node2 == null) {
      return false;
    }

    return isSameParents(node1, node2);
  }

  public boolean isNodeGroupAware() {
    return false;
  }

  public boolean isOnSameNodeGroup(Node node1, Node node2) {
    return false;
  }

  // isSameParents
  protected boolean isSameParents(Node node1, Node node2) {
    return node1.getParent() == node2.getParent();
  }

  void setRandomSeed(long seed) {
    RANDOM_REF.set(new Random(seed));
  }

  Random getRandom() {
    Random random = RANDOM_REF.get();
    return (random == null) ? ThreadLocalRandom.current() : random;
  }

  // chooseRandom
  public Node chooseRandom(final String scope) {
    return chooseRandom(scope, null);
  }

  // scope是选择区间，~ 是取反
  public Node chooseRandom(final String scope,
                           final Collection<Node> excludedNodes) {
    netlock.readLock().lock();
    try {
      if (scope.startsWith("~")) {
        return chooseRandom(NodeBase.ROOT, scope.substring(1), excludedNodes);
      } else {
        return chooseRandom(scope, null, excludedNodes);
      }
    } finally {
      netlock.readLock().unlock();
    }
  }

  protected Node chooseRandom(final String scope, String excludedScope,
                              final Collection<Node> excludedNodes) {
    if (excludedScope != null) {
      if (scope.startsWith(excludedScope)) {
        return null;
      }
      if (!excludedScope.startsWith(scope)) {
        excludedScope = null;
      }
    }
    Node node = getNode(scope);
    if (!(node instanceof InnerNode)) {
      return excludedNodes != null && excludedNodes.contains(node) ?
          null : node;
    }
    InnerNode innerNode = (InnerNode) node;
    int numOfDatanodes = innerNode.getNumOfLeaves();
    if (excludedScope == null) {
      node = null;
    } else {
      node = getNode(excludedScope);
      if (!(node instanceof InnerNode)) {
        numOfDatanodes -= 1;
      } else {
        numOfDatanodes -= ((InnerNode) node).getNumOfLeaves();
      }
    }
    if (numOfDatanodes <= 0) {
      LOG.debug("Failed to find datanode (scope=\"{}\" excludedScope=\"{}\")."
              + " numOfDatanodes={}",
          scope, excludedScope, numOfDatanodes);
      return null;
    }
    final int availableNodes;
    if (excludedScope == null) {
      availableNodes = countNumOfAvailableNodes(scope, excludedNodes);
    } else {
      netlock.readLock().lock();
      try {
        availableNodes = countNumOfAvailableNodes(scope, excludedNodes) -
            countNumOfAvailableNodes(excludedScope, excludedNodes);
      } finally {
        netlock.readLock().unlock();
      }
    }
    LOG.debug("Choosing random from {} available nodes on node {},"
            + " scope={}, excludedScope={}, excludeNodes={}. numOfDatanodes={}.",
        availableNodes, innerNode, scope, excludedScope, excludedNodes,
        numOfDatanodes);
    Node ret = null;
    if (availableNodes > 0) {
      ret = chooseRandom(innerNode, node, excludedNodes, numOfDatanodes,
          availableNodes);
    }
    LOG.debug("chooseRandom returning {}", ret);
    return ret;
  }

  /**
   * Randomly choose one node under <i>parentNode</i>, considering the exclude
   * nodes and scope. Should be called with {@link #netlock}'s readlock held.
   *
   * @param parentNode        the parent node
   * @param excludedScopeNode the node corresponding to the exclude scope.
   * @param excludedNodes     a collection of nodes to be excluded from
   * @param totalInScopeNodes total number of nodes under parentNode, excluding
   *                          the excludedScopeNode
   * @param availableNodes    number of available nodes under parentNode that
   *                          could be chosen, excluding excludedNodes
   * @return the chosen node, or null if none can be chosen
   */
  private Node chooseRandom(final InnerNode parentNode,
                            final Node excludedScopeNode, final Collection<Node> excludedNodes,
                            final int totalInScopeNodes, final int availableNodes) {
    if (totalInScopeNodes < availableNodes) {
      LOG.warn("Total Nodes in scope : {} are less than Available Nodes : {}",
          totalInScopeNodes, availableNodes);
      return null;
    }
    Random r = getRandom();
    if (excludedNodes == null || excludedNodes.isEmpty()) {
      // if there are no excludedNodes, randomly choose a node
      final int index = r.nextInt(totalInScopeNodes);
      return parentNode.getLeaf(index, excludedScopeNode);
    }

    // excludedNodes non empty.
    // Choose the nth VALID node, where n is random. VALID meaning it can be
    // returned, after considering exclude scope and exclude nodes.
    // The probability of being chosen should be equal for all VALID nodes.
    // Notably, we do NOT choose nth node, and find the next valid node
    // if n is excluded - this will make the probability of the node immediately
    // after an excluded node higher.
    //
    // Start point is always 0 and that's fine, because the nth valid node
    // logic provides equal randomness.
    //
    // Consider this example, where 1,3,5 out of the 10 nodes are excluded:
    // 1 2 3 4 5 6 7 8 9 10
    // x   x   x
    // We will randomly choose the nth valid node where n is [0,6].
    // We do NOT choose a random number n and just use the closest valid node,
    // for example both n=3 and n=4 will choose 4, making it a 2/10 probability,
    // higher than the expected 1/7
    // totalInScopeNodes=10 and availableNodes=7 in this example.
    int nthValidToReturn = r.nextInt(availableNodes);
    LOG.debug("nthValidToReturn is {}", nthValidToReturn);
    Node ret =
        parentNode.getLeaf(r.nextInt(totalInScopeNodes), excludedScopeNode);
    if (!excludedNodes.contains(ret)) {
      // return if we're lucky enough to get a valid node at a random first pick
      LOG.debug("Chosen node {} from first random", ret);
      return ret;
    } else {
      ret = null;
    }
    Node lastValidNode = null;
    for (int i = 0; i < totalInScopeNodes; ++i) {
      ret = parentNode.getLeaf(i, excludedScopeNode);
      if (!excludedNodes.contains(ret)) {
        if (nthValidToReturn == 0) {
          break;
        }
        --nthValidToReturn;
        lastValidNode = ret;
      } else {
        LOG.debug("Node {} is excluded, continuing.", ret);
        ret = null;
      }
    }
    if (ret == null && lastValidNode != null) {
      LOG.error("BUG: Found lastValidNode {} but not nth valid node. "
              + "parentNode={}, excludedScopeNode={}, excludedNodes={}, "
              + "totalInScopeNodes={}, availableNodes={}, nthValidToReturn={}.",
          lastValidNode, parentNode, excludedScopeNode, excludedNodes,
          totalInScopeNodes, availableNodes, nthValidToReturn);
      ret = lastValidNode;
    }
    return ret;
  }

  public List<Node> getLeaves(String scope) {
    Node node = getNode(scope);
    List<Node> leafNodes = new ArrayList<>();
    if (!(node instanceof InnerNode)) {
      leafNodes.add(node);
    } else {
      InnerNode innerNode = (InnerNode) node;
      for (int i = 0; i < innerNode.getNumOfLeaves(); i++) {
        leafNodes.add(innerNode.getLeaf(i, null));
      }
    }
    return leafNodes;
  }

  public int countNumOfAvailableNodes(String scope,
                                      Collection<Node> excludedNodes) {
    boolean isExcluded = false;
    if (scope.startsWith("~")) {
      isExcluded = true;
      scope = scope.substring(1);
    }
    scope = NodeBase.normalize(scope);
    int excludedCountInScope = 0; // the number of nodes in both scope & excludedNodes
    int excludedCountOffScope = 0; // the number of nodes outside scope & excludedNodes
    netlock.readLock().lock();
    try {
      if (excludedNodes != null) {
        for (Node node : excludedNodes) {
          node = getNode(NodeBase.getPath(node));
          if (node == null) {
            continue;
          }
          if ((NodeBase.getPath(node) + NodeBase.PATH_SEPARATOR_STR)
              .startsWith(scope + NodeBase.PATH_SEPARATOR_STR)) {
            if (node instanceof InnerNode) {
              excludedCountInScope += ((InnerNode) node).getNumOfLeaves();
            } else {
              excludedCountInScope++;
            }
          } else {
            excludedCountOffScope++;
          }
        }
      }
      Node n = getNode(scope);
      int scopeNodeCount = 0;
      if (n != null) {
        scopeNodeCount++;
      }
      if (n instanceof InnerNode) {
        scopeNodeCount = ((InnerNode) n).getNumOfLeaves();
      }
      if (isExcluded) {
        return clusterMap.getNumOfLeaves() - scopeNodeCount
            - excludedCountOffScope;
      } else {
        return scopeNodeCount - excludedCountInScope;
      }
    } finally {
      netlock.readLock().unlock();
    }
  }

  // tree.toString()
  @Override
  public String toString() {
    // print the number of racks
    StringBuilder tree = new StringBuilder();
    tree.append("Number of racks: ")
        .append(numOfRacks)
        .append("\n");
    // print the number of leaves
    int numOfLeaves = getNumOfLeaves();
    tree.append("Expected number of leaves:")
        .append(numOfLeaves)
        .append("\n");
    // print nodes
    for (int i = 0; i < numOfLeaves; i++) {
      tree.append(NodeBase.getPath(clusterMap.getLeaf(i, null)))
          .append("\n");
    }
    return tree.toString();
  }

  // split lastIndexOf(",") [0]
  public static String getFirstHalf(String networkLocation) {
    int index = networkLocation.lastIndexOf(NodeBase.PATH_SEPARATOR_STR);
    return networkLocation.substring(0, index);
  }

  // split lastIndexOf(",") [1]
  public static String getLastHalf(String networkLocation) {
    int index = networkLocation.lastIndexOf(NodeBase.PATH_SEPARATOR_STR);
    return networkLocation.substring(index);
  }

  // 获得两个节点间的相对权重, local 0, same rack 2
  // reader是将要被读取数据的节点，此方法里 reader是一个 DataNode节点
  protected int getWeight(Node reader, Node node) {
    int weight = Integer.MAX_VALUE;
    if (reader != null && node != null) {
      if (reader.equals(node)) {
        return 0;
      }
      int maxReaderLevel = reader.getLevel();
      int maxNodeLevel = node.getLevel();
      int currentLevelToCompare = Math.min(maxReaderLevel, maxNodeLevel);
      Node r = reader;
      Node n = node;
      weight = 0;
      while (r != null && r.getLevel() > currentLevelToCompare) {
        r = r.getParent();
        weight++;
      }
      while (n != null && n.getLevel() > currentLevelToCompare) {
        n = n.getParent();
        weight++;
      }
      while (r != null && n != null && !r.equals(n)) {
        r = r.getParent();
        n = n.getParent();
        weight += 2;
      }
    }
    return weight;
  }

  // 如果 reader不是 DataNode的话，则走此方法
  protected static int getWeightUsingNetworkLocation(Node reader, Node node) {
    //Start off by initializing to Integer.MAX_VALUE
    int weight = Integer.MAX_VALUE;
    if (reader != null && node != null) {
      String readerPath = normalizeNetworkLocationPath(
          reader.getNetworkLocation());
      String nodePath = normalizeNetworkLocationPath(
          node.getNetworkLocation());

      //same rack
      if (readerPath.equals(nodePath)) {
        if (reader.getName().equals(node.getName())) {
          weight = 0;
        } else {
          weight = 2;
        }
      } else {
        String[] readerPathToken = readerPath.split(PATH_SEPARATOR_STR);
        String[] nodePathToken = nodePath.split(PATH_SEPARATOR_STR);
        int maxLevelToCompare = Math.min(readerPathToken.length, nodePathToken.length);
        int currentLevel = 1;
        //traverse through the path and calculate the distance
        while (currentLevel < maxLevelToCompare) {
          if (!readerPathToken[currentLevel]
              .equals(nodePathToken[currentLevel])) {
            break;
          }
          currentLevel++;
        }
        // +2 to correct the weight between reader and node rather than
        // between parent of reader and parent of node.
        weight = (readerPathToken.length - currentLevel) +
            (nodePathToken.length - currentLevel) + 2;
      }
    }
    return weight;
  }

  // 对路径做处理
  private static String normalizeNetworkLocationPath(String path) {
    if (path == null || path.length() == 0) {
      return ROOT;
    }

    if (path.charAt(0) != PATH_SEPARATOR) {
      throw new IllegalArgumentException("Network Location"
          + "path doesn't start with " + PATH_SEPARATOR + ": " + path);
    }

    int len = path.length();
    if (path.charAt(len - 1) == PATH_SEPARATOR) {
      return path.substring(0, len - 1);
    }
    return path;
  }

  // 根据和 reader的网络距离 来排序
  public void sortByDistance(Node reader, Node[] nodes, int activeLen) {
    /*
     * This method is called if the reader is a datanode,
     * so nonDataNodeReader flag is set to false.
     */
    sortByDistance(reader, nodes, activeLen, null);
  }

  public <T extends Node> void sortByDistance(Node reader, T[] nodes,
                                              int activeLen, Consumer<List<T>> secondarySort) {
    sortByDistance(reader, nodes, activeLen, secondarySort, false);
  }

  public void sortByDistanceUsingNetworkLocation(Node reader, Node[] nodes,
                                                 int activeLen) {
    /*
     * This method is called if the reader is not a datanode,
     * so nonDataNodeReader flag is set to true.
     */
    sortByDistanceUsingNetworkLocation(reader, nodes, activeLen, null);
  }

  public <T extends Node> void sortByDistanceUsingNetworkLocation(Node reader,
                                                                  T[] nodes, int activeLen, Consumer<List<T>> secondarySort) {
    sortByDistance(reader, nodes, activeLen, secondarySort, true);
  }

  private <T extends Node> void sortByDistance(Node reader, T[] nodes,
                                               int activeLen, Consumer<List<T>> secondarySort,
                                               boolean nonDataNodeReader) {
    /** Sort weights for the nodes array */
    TreeMap<Integer, List<T>> weightedNodeTree =
        new TreeMap<>();
    int nWeight;
    for (int i = 0; i < activeLen; i++) {
      if (nonDataNodeReader) {
        nWeight = getWeightUsingNetworkLocation(reader, nodes[i]);
      } else {
        nWeight = getWeight(reader, nodes[i]);
      }
      weightedNodeTree.computeIfAbsent(
          nWeight, k -> new ArrayList<>(1)).add(nodes[i]);
    }
    int idx = 0;
    // Sort nodes which have the same weight using secondarySort.
    for (List<T> nodesList : weightedNodeTree.values()) {
      Collections.shuffle(nodesList, getRandom());
      if (secondarySort != null) {
        // a secondary sort breaks the tie between nodes.
        secondarySort.accept(nodesList);
      }
      for (T n : nodesList) {
        nodes[idx++] = n;
      }
    }
    Preconditions.checkState(idx == activeLen,
        "Sorted the wrong number of nodes!");
  }
}