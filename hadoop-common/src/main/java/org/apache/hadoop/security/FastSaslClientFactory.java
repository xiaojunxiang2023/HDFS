package org.apache.hadoop.security;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.security.auth.callback.CallbackHandler;
import javax.security.sasl.Sasl;
import javax.security.sasl.SaslClient;
import javax.security.sasl.SaslClientFactory;
import javax.security.sasl.SaslException;

/**
 * Class for dealing with caching SASL client factories.
 */
// MapReduce 也可见
public class FastSaslClientFactory implements SaslClientFactory {
  private final Map<String, List<SaslClientFactory>> factoryCache =
      new HashMap<String, List<SaslClientFactory>>();

  public FastSaslClientFactory(Map<String, ?> props) {
    final Enumeration<SaslClientFactory> factories =
        Sasl.getSaslClientFactories();
    while (factories.hasMoreElements()) {
      SaslClientFactory factory = factories.nextElement();
      for (String mech : factory.getMechanismNames(props)) {
        if (!factoryCache.containsKey(mech)) {
          factoryCache.put(mech, new ArrayList<SaslClientFactory>());
        }
        factoryCache.get(mech).add(factory);
      }
    }
  }

  @Override
  public String[] getMechanismNames(Map<String, ?> props) {
    return factoryCache.keySet().toArray(new String[0]);
  }

  @Override
  public SaslClient createSaslClient(String[] mechanisms,
      String authorizationId, String protocol, String serverName,
      Map<String, ?> props, CallbackHandler cbh) throws SaslException {
    for (String mechanism : mechanisms) {
      List<SaslClientFactory> factories = factoryCache.get(mechanism);
      if (factories != null) {
        for (SaslClientFactory factory : factories) {
          SaslClient saslClient =
              factory.createSaslClient(new String[] {mechanism},
                  authorizationId, protocol, serverName, props, cbh);
          if (saslClient != null) {
            return saslClient;
          }
        }
      }
    }
    return null;
  }
}