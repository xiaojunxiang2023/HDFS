package org.apache.hadoop.crypto.key;

import java.io.IOException;
import java.net.URI;
import org.apache.hadoop.security.token.DelegationTokenIssuer;

/**
 * File systems that support Encryption Zones have to implement this interface.
 */
public interface KeyProviderTokenIssuer extends DelegationTokenIssuer {

  KeyProvider getKeyProvider() throws IOException;

  URI getKeyProviderUri() throws IOException;

}