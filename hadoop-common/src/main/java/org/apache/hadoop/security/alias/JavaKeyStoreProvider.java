package org.apache.hadoop.security.alias;

import org.apache.hadoop.conf.Configuration;

import java.io.IOException;
import java.net.URI;

/**
 * CredentialProvider based on Java's KeyStore file format. The file may be
 * stored in any Hadoop FileSystem using the following name mangling:
 * jceks://hdfs@nn1.example.com/my/creds.jceks {@literal ->}
 * hdfs://nn1.example.com/my/creds.jceks jceks://file/home/larry/creds.jceks
 * {@literal ->} file:///home/larry/creds.jceks
 */
public final class JavaKeyStoreProvider extends KeyStoreProvider {
  public static final String SCHEME_NAME = "jceks";
  public static final String KEYSTORE_TYPE = "jceks";
  public static final String ALGORITHM = "AES";

  private JavaKeyStoreProvider(URI uri, Configuration conf)
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
        return new JavaKeyStoreProvider(providerName, conf);
      }
      return null;
    }
  }
}
