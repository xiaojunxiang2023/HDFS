package org.apache.hadoop.security.ssl;

import org.apache.hadoop.conf.Configurable;

import javax.net.ssl.KeyManager;
import javax.net.ssl.TrustManager;
import java.io.IOException;
import java.security.GeneralSecurityException;

/**
 * Interface that gives access to {@link KeyManager} and {@link TrustManager}
 * implementations.
 */
public interface KeyStoresFactory extends Configurable {

  /**
   * Initializes the keystores of the factory.
   *
   * @param mode if the keystores are to be used in client or server mode.
   * @throws IOException thrown if the keystores could not be initialized due
   * to an IO error.
   * @throws GeneralSecurityException thrown if the keystores could not be
   * initialized due to an security error.
   */
  public void init(SSLFactory.Mode mode) throws IOException, GeneralSecurityException;

  /**
   * Releases any resources being used.
   */
  public void destroy();

  /**
   * Returns the keymanagers for owned certificates.
   *
   * @return the keymanagers for owned certificates.
   */
  public KeyManager[] getKeyManagers();

  /**
   * Returns the trustmanagers for trusted certificates.
   *
   * @return the trustmanagers for trusted certificates.
   */
  public TrustManager[] getTrustManagers();

}
