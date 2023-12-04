package org.apache.hadoop.hdfs.server.common;

import org.apache.hadoop.security.token.delegation.AbstractDelegationTokenIdentifier;

import java.io.IOException;

/**
 * Interface to verify delegation tokens passed through WebHDFS.
 * Implementations are intercepted by JspHelper that pass delegation token
 * for verification.
 */
public interface TokenVerifier<T extends AbstractDelegationTokenIdentifier> {

  /* Verify delegation token passed through WebHDFS
   * Name node, Router implement this for JspHelper to verify token
   */
  void verifyToken(T t, byte[] password) throws IOException;

}
