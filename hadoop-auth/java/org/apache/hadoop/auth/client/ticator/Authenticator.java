package org.apache.hadoop.auth.client.ticator;


import org.apache.hadoop.auth.client.AuthenticatedURL;
import org.apache.hadoop.auth.client.ConnectionConfigurator;
import org.apache.hadoop.auth.util.micro.AuthenticationException;

import java.io.IOException;
import java.net.URL;

/**
 * Interface for client authentication mechanisms.
 * <p>
 * Implementations are use-once instances, they don't need to be thread safe.
 */
public interface Authenticator {

  /**
   * Sets a {@link ConnectionConfigurator} instance to use for
   * configuring connections.
   *
   * @param configurator the {@link ConnectionConfigurator} instance.
   */
  public void setConnectionConfigurator(ConnectionConfigurator configurator);

  /**
   * Authenticates against a URL and returns a {@link AuthenticatedURL.Token} to be
   * used by subsequent requests.
   *
   * @param url the URl to authenticate against.
   * @param token the authentication token being used for the user.
   *
   * @throws IOException if an IO error occurred.
   * @throws AuthenticationException if an authentication error occurred.
   */
  void authenticate(URL url, AuthenticatedURL.Token token) throws Exception;

}
