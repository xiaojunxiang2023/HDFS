package org.apache.hadoop.hdfs.server.diskbalancer.planner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.apache.hadoop.hdfs.server.diskbalancer.datamodel
    .DiskBalancerDataNode;

/**
 * Returns a planner based on the user defined tags.
 */
public final class PlannerFactory {
  private static final Logger LOG =
      LoggerFactory.getLogger(PlannerFactory.class);

  public static final String GREEDY_PLANNER = "greedyPlanner";

  /**
   *  Gets a planner object.
   * @param plannerName - name of the planner.
   * @param node - Datanode.
   * @param threshold - percentage
   * @return Planner
   */
  public static Planner getPlanner(String plannerName,
      DiskBalancerDataNode node, double threshold) {
    if (plannerName.equals(GREEDY_PLANNER)) {
      if (LOG.isDebugEnabled()) {
        String message = String
            .format("Creating a %s for Node : %s IP : %s ID : %s",
                GREEDY_PLANNER, node.getDataNodeName(), node.getDataNodeIP(),
                node.getDataNodeUUID());
        LOG.debug(message);
      }
      return new GreedyPlanner(threshold, node);
    }

    throw new IllegalArgumentException("Unrecognized planner name : " +
        plannerName);
  }

  private PlannerFactory() {
    // Never constructed
  }
}
