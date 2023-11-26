package org.apache.hadoop.ipc;

import org.apache.hadoop.security.UserGroupInformation;

/**
 * The UserIdentityProvider creates uses the username as the
 * identity. All jobs launched by a user will be grouped together.
 */
public class UserIdentityProvider implements IdentityProvider {
  public String makeIdentity(Schedulable obj) {
    UserGroupInformation ugi = obj.getUserGroupInformation();
    if (ugi == null) {
      return null;
    }

    return ugi.getShortUserName();
  }
}