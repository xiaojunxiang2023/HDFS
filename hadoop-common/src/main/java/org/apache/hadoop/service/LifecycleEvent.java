package org.apache.hadoop.service;

import java.io.Serializable;

import org.apache.hadoop.classification.InterfaceAudience.Public;
import org.apache.hadoop.classification.InterfaceStability.Evolving;

/**
 * A serializable lifecycle event: the time a state
 * transition occurred, and what state was entered.
 */
@Public
@Evolving
public class LifecycleEvent implements Serializable {
  
  private static final long serialVersionUID = 1648576996238247836L;

  /**
   * Local time in milliseconds when the event occurred
   */
  public long time;
  /**
   * new state
   */
  public Service.STATE state;
}
