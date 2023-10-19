package org.apache.hadoop.security.alias;

import org.apache.hadoop.classification.InterfaceAudience;
import org.apache.hadoop.conf.Configuration;

import java.io.IOException;
import java.net.URI;

/**
 * CredentialProvider based on Bouncy Castle FIPS KeyStore file format.
 * The file may be stored in any Hadoop FileSystem using the following
 * name mangling:
 * bcfks://hdfs@nn1.example.com/my/creds.bcfks {@literal ->}
 * hdfs://nn1.example.com/my/creds.bcfks bcfks://file/home/larry/creds.bcfks
 * {@literal ->} file:///home/user1/creds.bcfks
 */
@InterfaceAudience.Private
public final class BouncyCastleFipsKeyStoreProvider extends KeyStoreProvider {
  public static final String SCHEME_NAME = "bcfks";
  public static final String KEYSTORE_TYPE = "bcfks";
  public static final String ALGORITHM = "HMACSHA512";

  private BouncyCastleFipsKeyStoreProvider(URI uri, Configuration conf)
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
        return new BouncyCastleFipsKeyStoreProvider(providerName, conf);
      }
      return null;
    }
  }
}
