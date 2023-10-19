package org.apache.hadoop.auth.client;

import org.apache.hadoop.auth.client.ticator.Authenticator;
import org.apache.hadoop.auth.client.ticator.KerberosAuthenticator;
import org.apache.hadoop.filter.AuthenticationFilter;
import org.apache.hadoop.auth.util.micro.AuthenticationException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.CookieHandler;
import java.net.HttpCookie;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The {@link AuthenticatedURL} class enables the use of the JDK {@link URL} class
 * against HTTP endpoints protected with the {@link AuthenticationFilter}.
 * <p>
 * The authentication mechanisms supported by default are Hadoop Simple  authentication
 * (also known as pseudo authentication) and Kerberos SPNEGO authentication.
 * <p>
 * Additional authentication mechanisms can be supported via {@link Authenticator} implementations.
 * <p>
 * The default {@link Authenticator} is the {@link KerberosAuthenticator} class which supports
 * automatic fallback from Kerberos SPNEGO to Hadoop Simple authentication.
 * <p>
 * <code>AuthenticatedURL</code> instances are not thread-safe.
 * <p>
 * The usage pattern of the {@link AuthenticatedURL} is:
 * <pre>
 *
 * // establishing an initial connection
 *
 * URL url = new URL("http://foo:8080/bar");
 * AuthenticatedURL.Token token = new AuthenticatedURL.Token();
 * AuthenticatedURL aUrl = new AuthenticatedURL();
 * HttpURLConnection conn = new AuthenticatedURL().openConnection(url, token);
 * ....
 * // use the 'conn' instance
 * ....
 *
 * // establishing a follow up connection using a token from the previous connection
 *
 * HttpURLConnection conn = new AuthenticatedURL().openConnection(url, token);
 * ....
 * // use the 'conn' instance
 * ....
 *
 * </pre>
 */
// 内部类有 AuthCookieHandler、Token
public class AuthenticatedURL {
  private static final Logger LOG = LoggerFactory.getLogger(AuthenticatedURL.class);

  // cookie 名称
  public static final String AUTH_COOKIE = "hadoop.auth";

  private static class AuthCookieHandler extends CookieHandler {
    private HttpCookie authCookie;
    private Map<String, List<String>> cookieHeaders = Collections.emptyMap();

    // 获得 cookieHeaders
    @Override
    public synchronized Map<String, List<String>> get(URI uri,
        Map<String, List<String>> requestHeaders) throws IOException {
      getAuthCookie();
      return cookieHeaders;
    }

    // 根据 header提取出 cookie并写入（会忽略掉解析出错的 header）
    @Override
    public void put(URI uri, Map<String, List<String>> responseHeaders) {
      List<String> headers = responseHeaders.get("Set-Cookie");
      if (headers != null) {
        for (String header : headers) {
          List<HttpCookie> cookies;
          try {
            // parse header得到 cookies
            cookies = HttpCookie.parse(header);
          } catch (IllegalArgumentException iae) {
            LOG.debug("Cannot parse cookie header, header = {}, reason = {} ",
                header, iae.getMessage());
            continue;
          }
          for (HttpCookie cookie : cookies) {
            if (AUTH_COOKIE.equals(cookie.getName())) {
              // setAuthCookie
              setAuthCookie(cookie);
            }
          }
        }
      }
    }

    private synchronized HttpCookie getAuthCookie() {
      // authCookie过期的话，则设置为 null
      if (authCookie != null && authCookie.hasExpired()) {
        setAuthCookie(null);
      }
      return authCookie;
    }

    private synchronized void setAuthCookie(HttpCookie cookie) {
      // will redefine if new cookie is valid.
      authCookie = null;
      cookieHeaders = Collections.emptyMap();
      boolean valid = cookie != null && !cookie.getValue().isEmpty() &&
          !cookie.hasExpired();
      if (valid) {
        // decrease lifetime to avoid using a cookie soon to expire.
        // allows authenticators to pre-emptively reauthenticate to
        // prevent clients unnecessarily receiving a 401.
        long maxAge = cookie.getMaxAge();
        if (maxAge != -1) {
          cookie.setMaxAge(maxAge * 9/10);
          valid = !cookie.hasExpired();
        }
      }
      if (valid) {
        // v0 cookies value aren't quoted by default but tomcat demands
        // quoting.
        if (cookie.getVersion() == 0) {
          String value = cookie.getValue();
          if (!value.startsWith("\"")) {
            value = "\"" + value + "\"";
            cookie.setValue(value);
          }
        }
        authCookie = cookie;
        cookieHeaders = new HashMap<>();
        cookieHeaders.put("Cookie", Collections.singletonList(cookie.toString()));
      }
    }

    private void setAuthCookieValue(String value) {
      HttpCookie c = null;
      if (value != null) {
        c = new HttpCookie(AUTH_COOKIE, value);
      }
      setAuthCookie(c);
    }
  }

  // 客户端侧的 Token
  public static class Token {

    private final AuthCookieHandler cookieHandler = new AuthCookieHandler();

    public Token() {
    }

    /**
     * Creates a token using an existing string representation of the token.
     *
     * @param tokenStr string representation of the tokenStr.
     */
    public Token(String tokenStr) {
      if (tokenStr == null) {
        throw new IllegalArgumentException("tokenStr cannot be null");
      }
      set(tokenStr);
    }

    public boolean isSet() {
      return cookieHandler.getAuthCookie() != null;
    }

    void set(String tokenStr) {
      cookieHandler.setAuthCookieValue(tokenStr);
    }

    public HttpURLConnection openConnection(URL url,
           ConnectionConfigurator connConfigurator) throws IOException {
      final HttpURLConnection conn;
      synchronized(CookieHandler.class) {
        CookieHandler.setDefault(cookieHandler);
        try {
          // url.openConnection()
          conn = (HttpURLConnection)url.openConnection();
        } finally {
          CookieHandler.setDefault(CookieHandler.getDefault());
        }
      }
      if (connConfigurator != null) {
        connConfigurator.configure(conn);
      }
      return conn;
    }

    @Override
    public String toString() {
      String value = "";
      HttpCookie authCookie = cookieHandler.getAuthCookie();
      if (authCookie != null) {
        value = authCookie.getValue();
        if (value.startsWith("\"")) { // tests don't want the quotes.
          value = value.substring(1, value.length()-1);
        }
      }
      return value;
    }

  }

  private static Class<? extends Authenticator> DEFAULT_AUTHENTICATOR = KerberosAuthenticator.class;

  private final Authenticator authenticator;
  private final ConnectionConfigurator connConfigurator;

  public AuthenticatedURL(Authenticator authenticator) {
    this(authenticator, null);
  }

  public AuthenticatedURL(Authenticator authenticator,
                          ConnectionConfigurator connConfigurator) {
    try {
      this.authenticator = (authenticator != null) ? authenticator : DEFAULT_AUTHENTICATOR.newInstance();
    } catch (Exception ex) {
      throw new RuntimeException(ex);
    }
    this.connConfigurator = connConfigurator;
    this.authenticator.setConnectionConfigurator(connConfigurator);
  }

  protected Authenticator getAuthenticator() {
    return authenticator;
  }

  // authenticator.authenticate(url, token) 验证下，然后 openConnection一个 http连接
  public HttpURLConnection openConnection(URL url, Token token) throws IOException, AuthenticationException {
    // authenticate
    authenticator.authenticate(url, token);
    // openConnection
    return token.openConnection(url, connConfigurator);
  }


  // 从 conn中提取数据赋值给 token
  public static void extractToken(HttpURLConnection conn, Token token) throws IOException, AuthenticationException {
    int respCode = conn.getResponseCode();
    if (respCode == HttpURLConnection.HTTP_OK
        || respCode == HttpURLConnection.HTTP_CREATED
        || respCode == HttpURLConnection.HTTP_ACCEPTED) {
      // 赋值
      token.cookieHandler.put(null, conn.getHeaderFields());
    } else if (respCode == HttpURLConnection.HTTP_NOT_FOUND) {
      LOG.trace("Setting token value to null ({}), resp={}", token, respCode);
      token.set(null);
      throw new FileNotFoundException(conn.getURL().toString());
    } else {
      LOG.trace("Setting token value to null ({}), resp={}", token, respCode);
      token.set(null);
      throw new AuthenticationException("Authentication failed" +
          ", URL: " + conn.getURL() +
          ", status: " + conn.getResponseCode() +
          ", message: " + conn.getResponseMessage());
    }
  }

}
