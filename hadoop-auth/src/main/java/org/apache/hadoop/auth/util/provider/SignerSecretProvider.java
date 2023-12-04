package org.apache.hadoop.auth.util.provider;

import javax.servlet.ServletContext;
import java.util.Properties;

/**
 * The SignerSecretProvider is an abstract way to provide a secret to be used
 * by the Signer so that we can have different implementations that potentially
 * do more complicated things in the backend.
 * See the RolloverSignerSecretProvider class for an implementation that
 * supports rolling over the secret at a regular interval.
 */

public abstract class SignerSecretProvider {

  /**
   * Initialize the SignerSecretProvider
   * @param config configuration properties
   * @param servletContext servlet context
   * @param tokenValidity The amount of time a token is valid for
   * @throws Exception thrown if an error occurred
   */
  public abstract void init(Properties config, ServletContext servletContext,
                            long tokenValidity) throws Exception;

  /**
   * Will be called on shutdown; subclasses should perform any cleanup here.
   */
  public void destroy() {
  }

  /**
   * Returns the current secret to be used by the Signer for signing new
   * cookies.  This should never return null.
   * <p>
   * Callers should be careful not to modify the returned value.
   * @return the current secret
   */
  public abstract byte[] getCurrentSecret();

  /**
   * Returns all secrets that a cookie could have been signed with and are still
   * valid; this should include the secret returned by getCurrentSecret().
   * <p>
   * Callers should be careful not to modify the returned value.
   * @return the secrets
   */
  public abstract byte[][] getAllSecrets();
}
