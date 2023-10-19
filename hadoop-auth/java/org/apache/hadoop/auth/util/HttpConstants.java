package org.apache.hadoop.auth.util;

/**
 * This class defines constants used for HTTP protocol entities (such as
 * headers, methods and their values).
 */
public final class HttpConstants {

  /**
   * This class defines the HTTP protocol constants. Hence it is not intended
   * to be instantiated.
   */
  private HttpConstants() {
  }

  /**
   * HTTP header used by the server endpoint during an authentication sequence.
   */
  public static final String WWW_AUTHENTICATE_HEADER = "WWW-Authenticate";

  /**
   * HTTP header used by the client endpoint during an authentication sequence.
   */
  public static final String AUTHORIZATION_HEADER = "Authorization";

  /**
   * HTTP header prefix used by the SPNEGO client/server endpoints during an
   * authentication sequence.
   */
  public static final String NEGOTIATE = "Negotiate";

  /**
   * HTTP header prefix used during the Basic authentication sequence.
   */
  public static final String BASIC = "Basic";

  /**
   * HTTP header prefix used during the Basic authentication sequence.
   */
  public static final String DIGEST = "Digest";

}
