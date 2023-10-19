package org.apache.hadoop.crypto.key;

import java.io.IOException;
import java.net.URI;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.classification.InterfaceStability;
import org.apache.hadoop.security.token.DelegationTokenIssuer;

/**
 * File systems that support Encryption Zones have to implement this interface.
 */
@InterfaceAudience.Private
@InterfaceStability.Unstable
public interface KeyProviderTokenIssuer extends DelegationTokenIssuer {

  KeyProvider getKeyProvider() throws IOException;

  URI getKeyProviderUri() throws IOException;

}