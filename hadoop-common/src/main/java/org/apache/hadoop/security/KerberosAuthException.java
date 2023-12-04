package org.apache.hadoop.security;

import java.io.IOException;

import static org.apache.hadoop.security.UGIExceptionMessages.*;

/**
 * Thrown when {@link UserGroupInformation} failed with an unrecoverable error,
 * such as failure in kerberos login/logout, invalid subject etc.
 *
 * Caller should not retry when catching this exception.
 */
public class KerberosAuthException extends IOException {
  static final long serialVersionUID = 31L;

  private String user;
  private String principal;
  private String keytabFile;
  private String ticketCacheFile;
  private String initialMessage;

  public KerberosAuthException(String msg) {
    super(msg);
  }

  public KerberosAuthException(Throwable cause) {
    super(cause);
  }

  public KerberosAuthException(String initialMsg, Throwable cause) {
    this(cause);
    initialMessage = initialMsg;
  }

  public void setUser(final String u) {
    user = u;
  }

  public void setPrincipal(final String p) {
    principal = p;
  }

  public void setKeytabFile(final String k) {
    keytabFile = k;
  }

  public void setTicketCacheFile(final String t) {
    ticketCacheFile = t;
  }

  /** @return The initial message, or null if not set. */
  public String getInitialMessage() {
    return initialMessage;
  }

  /** @return The keytab file path, or null if not set. */
  public String getKeytabFile() {
    return keytabFile;
  }

  /** @return The principal, or null if not set. */
  public String getPrincipal() {
    return principal;
  }

  /** @return The ticket cache file path, or null if not set. */
  public String getTicketCacheFile() {
    return ticketCacheFile;
  }

  /** @return The user, or null if not set. */
  public String getUser() {
    return user;
  }

  @Override
  public String getMessage() {
    final StringBuilder sb = new StringBuilder();
    if (initialMessage != null) {
      sb.append(initialMessage);
    }
    if (user != null) {
      sb.append(FOR_USER + user);
    }
    if (principal != null) {
      sb.append(FOR_PRINCIPAL + principal);
    }
    if (keytabFile != null) {
      sb.append(FROM_KEYTAB + keytabFile);
    }
    if (ticketCacheFile != null) {
      sb.append(USING_TICKET_CACHE_FILE + ticketCacheFile);
    }
    sb.append(" " + super.getMessage());
    return sb.toString();
  }
}