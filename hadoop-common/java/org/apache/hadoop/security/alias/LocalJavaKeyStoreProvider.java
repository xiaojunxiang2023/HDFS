package org.apache.hadoop.security.alias;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.conf.Configuration;

import java.io.IOException;
import java.net.URI;

/**
 * CredentialProvider based on Java's KeyStore file format. The file may be
 * stored only on the local filesystem using the following name mangling:
 * localjceks://file/home/larry/creds.jceks {@literal ->}
 * file:///home/larry/creds.jceks
 */
@InterfaceAudience.Private
public final class LocalJavaKeyStoreProvider extends
    LocalKeyStoreProvider {
  public static final String SCHEME_NAME = "localjceks";
  public static final String KEYSTORE_TYPE = "jceks";
  public static final String ALGORITHM = "AES";

  private LocalJavaKeyStoreProvider(URI uri, Configuration conf)
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
   * The factory to create JksProviders, which is used by the ServiceLoader.
   */
  public static class Factory extends CredentialProviderFactory {
    @Override
    public CredentialProvider createProvider(URI providerName,
        Configuration conf) throws IOException {
      if (SCHEME_NAME.equals(providerName.getScheme())) {
        return new LocalJavaKeyStoreProvider(providerName, conf);
      }
      return null;
    }
  }
}
