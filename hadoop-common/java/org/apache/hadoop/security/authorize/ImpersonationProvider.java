package org.apache.hadoop.security.authorize;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.conf.Configurable;
import org.apache.hadoop.security.UserGroupInformation;

@InterfaceStability.Unstable
@InterfaceAudience.Public
public interface ImpersonationProvider  extends Configurable {


  /**
   * Specifies the configuration prefix for the proxy user properties and
   * initializes the provider.
   *
   * @param configurationPrefix the configuration prefix for the proxy user
   * properties
   */
  public void init(String configurationPrefix);

  /**
   * Authorize the superuser which is doing doAs.
   * {@link #authorize(UserGroupInformation, InetAddress)} should
   *             be preferred to avoid possibly re-resolving the ip address.
   * @param user ugi of the effective or proxy user which contains a real user.
   * @param remoteAddress the ip address of client.
   * @throws AuthorizationException
   */
  default void authorize(UserGroupInformation user, String remoteAddress)
      throws AuthorizationException {
    try {
      authorize(user, InetAddress.getByName(remoteAddress));
    } catch (UnknownHostException e) {
      throw new AuthorizationException(e);
    }
  }

  /**
   * Authorize the superuser which is doing doAs.
   *
   * @param user ugi of the effective or proxy user which contains a real user
   * @param remoteAddress the ip address of client
   * @throws AuthorizationException
   */
  void authorize(UserGroupInformation user, InetAddress remoteAddress)
      throws AuthorizationException;
}