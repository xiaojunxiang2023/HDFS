package org.apache.hadoop.security.authorize;

import java.security.Permission;

/**
 * An abstract definition of <em>service</em> as related to 
 * Service Level Authorization for Hadoop.
 *
 * Each service defines it's configuration key and also the necessary
 * {@link Permission} required to access the service.
 */
public class Service {
  private String key;
  private Class<?> protocol;

  public Service(String key, Class<?> protocol) {
    this.key = key;
    this.protocol = protocol;
  }

  /**
   * Get the configuration key for the service.
   * @return the configuration key for the service
   */
  public String getServiceKey() {
    return key;
  }

  /**
   * Get the protocol for the service
   * @return the {@link Class} for the protocol
   */
  public Class<?> getProtocol() {
    return protocol;
  }
}
