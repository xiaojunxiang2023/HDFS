package org.apache.hadoop.security.token.delegation.web;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.filter.handler.AuthenticationHandler;
import org.apache.hadoop.filter.handler.KerberosAuthenticationHandler;
import org.apache.hadoop.filter.handler.PseudoAuthenticationHandler;

/**
 * An {@link AuthenticationHandler} that implements Kerberos SPNEGO mechanism
 * for HTTP and supports Delegation Token functionality.
 * <p>
 * In addition to the {@link KerberosAuthenticationHandler} configuration
 * properties, this handler supports:
 * <ul>
 * <li>simple.delegation-token.token-kind: the token kind for generated tokens
 * (no default, required property).</li>
 * <li>simple.delegation-token.update-interval.sec: secret manager master key
 * update interval in seconds (default 1 day).</li>
 * <li>simple.delegation-token.max-lifetime.sec: maximum life of a delegation
 * token in seconds (default 7 days).</li>
 * <li>simple.delegation-token.renewal-interval.sec: renewal interval for
 * delegation tokens in seconds (default 1 day).</li>
 * <li>simple.delegation-token.removal-scan-interval.sec: delegation tokens
 * removal scan interval in seconds (default 1 hour).</li>
 * </ul>
 */
@InterfaceAudience.Private
@InterfaceStability.Evolving
public class PseudoDelegationTokenAuthenticationHandler
    extends DelegationTokenAuthenticationHandler {

  public PseudoDelegationTokenAuthenticationHandler() {
    super(new PseudoAuthenticationHandler(PseudoAuthenticationHandler.TYPE +
        TYPE_POSTFIX));
  }

}
