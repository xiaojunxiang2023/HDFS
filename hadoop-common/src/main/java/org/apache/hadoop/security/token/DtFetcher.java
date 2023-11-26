package org.apache.hadoop.security.token;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.security.Credentials;

/**
 *  DtFetcher is an interface which permits the abstraction and separation of
 *  delegation token fetch implementaions across different packages and
 *  compilation units.  Resolution of fetcher impl will be done at runtime.
 */
public interface DtFetcher {
  /** Return a key used to identify the object/service implementation. */
  Text getServiceName();

  /** Used to allow the service API to indicate whether a token is required. */
  boolean isTokenRequired();

  /** Add any number of delegation tokens to Credentials object and return
   *  a token instance that is appropriate for aliasing, or null if none. */
  Token<?> addDelegationTokens(Configuration conf, Credentials creds,
                               String renewer, String url) throws Exception;
}
