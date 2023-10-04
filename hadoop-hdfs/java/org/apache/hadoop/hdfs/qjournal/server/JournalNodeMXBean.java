package org.apache.hadoop.hdfs.qjournal.server;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

import java.util.Collections;
import java.util.List;

/**
 * This is the JMX management interface for JournalNode information
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public interface JournalNodeMXBean {
  
  /**
   * Get status information (e.g., whether formatted) of JournalNode's journals.
   * 
   * @return A string presenting status for each journal
   */
  String getJournalsStatus();

  /**
   * Get host and port of JournalNode.
   *
   * @return colon separated host and port.
   */
  default String getHostAndPort() {
    return "";
  }

  /**
   * Get list of the clusters of JournalNode's journals
   * as one JournalNode may support multiple clusters.
   *
   * @return list of clusters.
   */
  default List<String> getClusterIds() {
    return Collections.emptyList() ;
  }

  /**
   * Gets the version of Hadoop.
   *
   * @return the version of Hadoop.
   */
  default String getVersion() {
    return "";
  }
}
