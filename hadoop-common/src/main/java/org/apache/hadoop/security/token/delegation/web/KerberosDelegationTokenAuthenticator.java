package org.apache.hadoop.security.token.delegation.web;
import org.apache.hadoop.auth.client.ticator.Authenticator;
import org.apache.hadoop.auth.client.ticator.KerberosAuthenticator;

/**
 * The <code>KerberosDelegationTokenAuthenticator</code> provides support for
 * Kerberos SPNEGO authentication mechanism and support for Hadoop Delegation
 * Token operations.
 * <p>
 * It falls back to the {@link PseudoDelegationTokenAuthenticator} if the HTTP
 * endpoint does not trigger a SPNEGO authentication
 */
public class KerberosDelegationTokenAuthenticator
    extends DelegationTokenAuthenticator {

  public KerberosDelegationTokenAuthenticator() {
    super(new KerberosAuthenticator() {
      @Override
      protected Authenticator getFallBackAuthenticator() {
        return new PseudoDelegationTokenAuthenticator();
      }
    });
  }
}
