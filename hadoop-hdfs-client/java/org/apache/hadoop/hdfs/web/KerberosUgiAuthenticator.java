package org.apache.hadoop.hdfs.web;

import java.io.IOException;

import org.apache.hadoop.security.UserGroupInformation;
import org.apache.hadoop.security.authentication.client.Authenticator;
import org.apache.hadoop.security.authentication.client.KerberosAuthenticator;
import org.apache.hadoop.security.authentication.client.PseudoAuthenticator;

/**
 * Use UserGroupInformation as a fallback authenticator
 * if the server does not use Kerberos SPNEGO HTTP authentication.
 */
public class KerberosUgiAuthenticator extends KerberosAuthenticator {
  @Override
  protected Authenticator getFallBackAuthenticator() {
    return new PseudoAuthenticator() {
      @Override
      protected String getUserName() {
        try {
          return UserGroupInformation.getLoginUser().getUserName();
        } catch (IOException e) {
          throw new SecurityException("Failed to obtain current username", e);
        }
      }
    };
  }
}
