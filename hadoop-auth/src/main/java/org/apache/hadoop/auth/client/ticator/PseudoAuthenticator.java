package org.apache.hadoop.auth.client.ticator;

import org.apache.hadoop.auth.client.AuthenticatedURL;
import org.apache.hadoop.auth.client.ConnectionConfigurator;
import org.apache.hadoop.auth.util.micro.AuthenticationException;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 * The {@link PseudoAuthenticator} implementation provides an authentication equivalent to Hadoop's
 * Simple authentication, it trusts the value of the 'user.name' Java System property.
 * <p>
 * The 'user.name' value is propagated using an additional query string parameter {@link #USER_NAME} ('user.name').
 */
public class PseudoAuthenticator implements Authenticator {

  /**
   * Name of the additional parameter that carries the 'user.name' value.
   */
  public static final String USER_NAME = "user.name";

  private static final String USER_NAME_EQ = USER_NAME + "=";

  private ConnectionConfigurator connConfigurator;

  /**
   * Sets a {@link ConnectionConfigurator} instance to use for
   * configuring connections.
   *
   * @param configurator the {@link ConnectionConfigurator} instance.
   */
  @Override
  public void setConnectionConfigurator(ConnectionConfigurator configurator) {
    connConfigurator = configurator;
  }

  /**
   * Performs simple authentication against the specified URL.
   * <p>
   * If a token is given it does a NOP and returns the given token.
   * <p>
   * If no token is given, it will perform an HTTP <code>OPTIONS</code> request injecting an additional
   * parameter {@link #USER_NAME} in the query string with the value returned by the {@link #getUserName()}
   * method.
   * <p>
   * If the response is successful it will update the authentication token.
   *
   * @param url the URl to authenticate against.
   * @param token the authentication token being used for the user.
   *
   * @throws IOException if an IO error occurred.
   * @throws AuthenticationException if an authentication error occurred.
   */
  @Override
  public void authenticate(URL url, AuthenticatedURL.Token token) throws IOException, AuthenticationException {
    String strUrl = url.toString();
    String paramSeparator = (strUrl.contains("?")) ? "&" : "?";
    strUrl += paramSeparator + USER_NAME_EQ + getUserName();
    url = new URL(strUrl);
    HttpURLConnection conn = token.openConnection(url, connConfigurator);
    conn.setRequestMethod("OPTIONS");
    conn.connect();
    AuthenticatedURL.extractToken(conn, token);
  }

  /**
   * Returns the current user name.
   * <p>
   * This implementation returns the value of the Java system property 'user.name'
   *
   * @return the current user name.
   */
  protected String getUserName() {
    return System.getProperty("user.name");
  }
}
