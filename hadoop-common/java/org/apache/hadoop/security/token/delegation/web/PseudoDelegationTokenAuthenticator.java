package org.apache.hadoop.security.token.delegation.web;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.auth.client.ticator.PseudoAuthenticator;

import java.io.IOException;

/**
 * The <code>PseudoDelegationTokenAuthenticator</code> provides support for
 * Hadoop's pseudo authentication mechanism that accepts
 * the user name specified as a query string parameter and support for Hadoop
 * Delegation Token operations.
 * <p>
 * This mimics the model of Hadoop Simple authentication trusting the
 * {@link UserGroupInformation#getCurrentUser()} value.
 */
@InterfaceAudience.Public
@InterfaceStability.Evolving
public class PseudoDelegationTokenAuthenticator
    extends DelegationTokenAuthenticator {

  public PseudoDelegationTokenAuthenticator() {
    super(new PseudoAuthenticator() {
      @Override
      protected String getUserName() {
        try {
          return UserGroupInformation.getCurrentUser().getShortUserName();
        } catch (IOException ex) {
          throw new RuntimeException(ex);
        }
      }
    });
  }

}
