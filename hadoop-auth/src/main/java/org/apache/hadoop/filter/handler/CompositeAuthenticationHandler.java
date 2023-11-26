package org.apache.hadoop.filter.handler;

import java.util.Collection;

/**
 * Interface to support multiple authentication mechanisms simultaneously.
 *
 */
public interface CompositeAuthenticationHandler extends AuthenticationHandler {
  /**
   * This method returns the token types supported by this authentication
   * handler.
   *
   * @return the token types supported by this authentication handler.
   */
  Collection<String> getTokenTypes();
}
