package org.apache.hadoop.crypto.key;

import org.apache.hadoop.security.token.DelegationTokenIssuer;

import java.io.IOException;
import java.net.URI;

/**
 * File systems that support Encryption Zones have to implement this interface.
 */
public interface KeyProviderTokenIssuer extends DelegationTokenIssuer {

  KeyProvider getKeyProvider() throws IOException;

  URI getKeyProviderUri() throws IOException;

}