package org.apache.hadoop.security.token.delegation.web;
import org.apache.hadoop.security.UserGroupInformation;

import javax.servlet.http.HttpServletRequest;

/**
 * Util class that returns the remote {@link UserGroupInformation} in scope
 * for the HTTP request.
 */
public class HttpUserGroupInformation {

  /**
   * Returns the remote {@link UserGroupInformation} in context for the current
   * HTTP request, taking into account proxy user requests.
   *
   * @return the remote {@link UserGroupInformation}, <code>NULL</code> if none.
   */
  public static UserGroupInformation get() {
    return DelegationTokenAuthenticationFilter.
        getHttpUserGroupInformationInContext();
  }

}
