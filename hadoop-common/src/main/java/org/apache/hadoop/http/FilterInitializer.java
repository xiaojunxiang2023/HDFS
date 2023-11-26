package org.apache.hadoop.http;

import org.apache.hadoop.conf.Configuration;

/**
 * Initialize a javax.servlet.Filter. 
 */
public abstract class FilterInitializer {
  /**
   * Initialize a Filter to a FilterContainer.
   * @param container The filter container
   * @param conf Configuration for run-time parameters
   */
  public abstract void initFilter(FilterContainer container, Configuration conf);
}