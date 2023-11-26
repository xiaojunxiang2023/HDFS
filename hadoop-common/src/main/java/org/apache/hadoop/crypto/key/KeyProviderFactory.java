package org.apache.hadoop.crypto.key;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;
import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.fs.CommonConfigurationKeysPublic;

/**
 * A factory to create a list of KeyProvider based on the path given in a
 * Configuration. It uses a service loader interface to find the available
 * KeyProviders and create them based on the list of URIs.
 */
public abstract class KeyProviderFactory {
  public static final String KEY_PROVIDER_PATH =
      CommonConfigurationKeysPublic.HADOOP_SECURITY_KEY_PROVIDER_PATH;

  public abstract KeyProvider createProvider(URI providerName,
                                             Configuration conf
                                             ) throws IOException;

  private static final ServiceLoader<KeyProviderFactory> serviceLoader =
      ServiceLoader.load(KeyProviderFactory.class,
          KeyProviderFactory.class.getClassLoader());

  // Iterate through the serviceLoader to avoid lazy loading.
  // Lazy loading would require synchronization in concurrent use cases.
  static {
    Iterator<KeyProviderFactory> iterServices = serviceLoader.iterator();
    while (iterServices.hasNext()) {
      iterServices.next();
    }
  }
  
  public static List<KeyProvider> getProviders(Configuration conf
                                               ) throws IOException {
    List<KeyProvider> result = new ArrayList<KeyProvider>();
    for(String path: conf.getStringCollection(KEY_PROVIDER_PATH)) {
      try {
        URI uri = new URI(path);
        KeyProvider kp = get(uri, conf);
        if (kp != null) {
          result.add(kp);
        } else {
          throw new IOException("No KeyProviderFactory for " + uri + " in " +
              KEY_PROVIDER_PATH);
        }
      } catch (URISyntaxException error) {
        throw new IOException("Bad configuration of " + KEY_PROVIDER_PATH +
            " at " + path, error);
      }
    }
    return result;
  }

  /**
   * Create a KeyProvider based on a provided URI.
   *
   * @param uri key provider URI
   * @param conf configuration to initialize the key provider
   * @return the key provider for the specified URI, or <code>NULL</code> if
   *         a provider for the specified URI scheme could not be found.
   * @throws IOException thrown if the provider failed to initialize.
   */
  public static KeyProvider get(URI uri, Configuration conf)
      throws IOException {
    KeyProvider kp = null;
    for (KeyProviderFactory factory : serviceLoader) {
      kp = factory.createProvider(uri, conf);
      if (kp != null) {
        break;
      }
    }
    return kp;
  }

}
