package org.apache.hadoop.hdfs;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.crypto.key.KeyProvider;
import org.apache.hadoop.fs.CommonConfigurationKeysPublic;
import org.apache.hadoop.thirdparty.com.google.common.cache.Cache;
import org.apache.hadoop.thirdparty.com.google.common.cache.CacheBuilder;
import org.apache.hadoop.thirdparty.com.google.common.cache.RemovalListener;
import org.apache.hadoop.thirdparty.com.google.common.cache.RemovalNotification;
import org.apache.hadoop.util.KMSUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Nonnull;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

public class KeyProviderCache {

  public static final Logger LOG = LoggerFactory.getLogger(
      KeyProviderCache.class);

  private final Cache<URI, KeyProvider> cache;

  public KeyProviderCache(long expiryMs) {
    cache = CacheBuilder.newBuilder()
        .expireAfterAccess(expiryMs, TimeUnit.MILLISECONDS)
        .removalListener(new RemovalListener<URI, KeyProvider>() {
          @Override
          public void onRemoval(
              @Nonnull RemovalNotification<URI, KeyProvider> notification) {
            try {
              assert notification.getValue() != null;
              notification.getValue().close();
            } catch (Throwable e) {
              LOG.error(
                  "Error closing KeyProvider with uri ["
                      + notification.getKey() + "]", e);
            }
          }
        })
        .build();
  }

  public KeyProvider get(final Configuration conf,
                         final URI serverProviderUri) {
    if (serverProviderUri == null) {
      return null;
    }
    try {
      return cache.get(serverProviderUri, new Callable<KeyProvider>() {
        @Override
        public KeyProvider call() throws Exception {
          return KMSUtil.createKeyProviderFromUri(conf, serverProviderUri);
        }
      });
    } catch (Exception e) {
      LOG.error("Could not create KeyProvider for DFSClient !!", e);
      return null;
    }
  }

  private URI createKeyProviderURI(Configuration conf) {
    final String providerUriStr = conf.getTrimmed(
        CommonConfigurationKeysPublic.HADOOP_SECURITY_KEY_PROVIDER_PATH);
    // No provider set in conf
    if (providerUriStr == null || providerUriStr.isEmpty()) {
      LOG.error("Could not find uri with key ["
          + CommonConfigurationKeysPublic.HADOOP_SECURITY_KEY_PROVIDER_PATH
          + "] to create a keyProvider !!");
      return null;
    }
    final URI providerUri;
    try {
      providerUri = new URI(providerUriStr);
    } catch (URISyntaxException e) {
      LOG.error("KeyProvider URI string is invalid [" + providerUriStr
          + "]!!", e.getCause());
      return null;
    }
    return providerUri;
  }


  public void setKeyProvider(Configuration conf, KeyProvider keyProvider) {
    URI uri = createKeyProviderURI(conf);
    assert uri != null;
    cache.put(uri, keyProvider);
  }
}
