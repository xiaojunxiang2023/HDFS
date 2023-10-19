package org.apache.hadoop.security.authorize;

import java.security.Policy;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;

/**
 * {@link PolicyProvider} provides the {@link Service} definitions to the
 * security {@link Policy} in effect for Hadoop.
 *
 */
@InterfaceAudience.LimitedPrivate({"HDFS", "MapReduce"})
@InterfaceStability.Evolving
public abstract class PolicyProvider {

  /**
   * Configuration key for the {@link PolicyProvider} implementation.
   */
  public static final String POLICY_PROVIDER_CONFIG = 
    "hadoop.security.authorization.policyprovider";
  
  /**
   * A default {@link PolicyProvider} without any defined services.
   */
  public static final PolicyProvider DEFAULT_POLICY_PROVIDER =
    new PolicyProvider() {
    @Override
    public Service[] getServices() {
      return null;
    }
  };
  
  /**
   * Get the {@link Service} definitions from the {@link PolicyProvider}.
   * @return the {@link Service} definitions
   */
  public abstract Service[] getServices();
}
