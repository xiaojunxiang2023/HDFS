package org.apache.hadoop.ha.fence;

import org.apache.hadoop.ha.micro.BadFencingConfigurationException;
import org.apache.hadoop.ha.status.HAServiceTarget;

public interface FenceMethod {

  void checkArgs(String args) throws BadFencingConfigurationException;

  boolean tryFence(HAServiceTarget target, String args) throws BadFencingConfigurationException;

}
