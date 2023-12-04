package org.apache.hadoop.security.alias;

import org.apache.hadoop.conf.Configuration;

import java.io.IOException;
import java.net.URI;

/**
 * CredentialProvider based on bouncy castle FIPS KeyStore file format.
 * The file may be stored only on the local filesystem using the
 * following name mangling:
 * localbcfks://file/home/larry/creds.bcfks {@literal ->}
 * file:///home/larry/creds.bcfks
 */
public final class LocalBouncyCastleFipsKeyStoreProvider extends
    LocalKeyStoreProvider {
  public static final String SCHEME_NAME = "localbcfks";
  public static final String KEYSTORE_TYPE = "bcfks";
  public static final String ALGORITHM = "HMACSHA512";

  private LocalBouncyCastleFipsKeyStoreProvider(URI uri, Configuration conf)
      throws IOException {
    super(uri, conf);
  }

  @Override
  protected String getSchemeName() {
    return SCHEME_NAME;
  }

  @Override
  protected String getKeyStoreType() {
    return KEYSTORE_TYPE;
  }

  @Override
  protected String getAlgorithm() {
    return ALGORITHM;
  }

  /**
   * The factory to create KeyStore Providers, which is used by the
   * ServiceLoader.
   */
  public static class Factory extends CredentialProviderFactory {
    @Override
    public CredentialProvider createProvider(URI providerName,
                                             Configuration conf) throws IOException {
      if (SCHEME_NAME.equals(providerName.getScheme())) {
        return new LocalBouncyCastleFipsKeyStoreProvider(providerName, conf);
      }
      return null;
    }
  }
}
