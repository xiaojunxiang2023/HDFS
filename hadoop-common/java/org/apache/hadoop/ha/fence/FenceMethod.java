package org.apache.hadoop.ha.fence;

import org.apache.hadoop.ha.HAServiceTarget;
import org.apache.hadoop.ha.micro.BadFencingConfigurationException;

public interface FenceMethod {
  
  void checkArgs(String args) throws BadFencingConfigurationException;
  
  boolean tryFence(HAServiceTarget target, String args) throws BadFencingConfigurationException;

}
