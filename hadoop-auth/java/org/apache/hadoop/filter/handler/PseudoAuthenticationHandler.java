package org.apache.hadoop.filter.handler;

import org.apache.hadoop.filter.AuthenticationFilter;
import org.apache.hadoop.filter.AuthenticationToken;
import org.apache.hadoop.auth.util.micro.AuthenticationException;
import org.apache.hadoop.auth.client.ticator.PseudoAuthenticator;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.NameValuePair;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.nio.charset.Charset;
import java.util.List;
import java.util.Properties;
import java.util.regex.Pattern;

/**
 * The <code>PseudoAuthenticationHandler</code> provides a pseudo authentication mechanism that accepts
 * the user name specified as a query string parameter.
 * <p>
 * This mimics the model of Hadoop Simple authentication which trust the 'user.name' property provided in
 * the configuration object.
 * <p>
 * This handler can be configured to support anonymous users.
 * <p>
 * The only supported configuration property is:
 * <ul>
 * <li>simple.anonymous.allowed: <code>true|false</code>, default value is <code>false</code></li>
 * </ul>
 */
public class PseudoAuthenticationHandler implements AuthenticationHandler {

  public static final Logger LOG =
          LoggerFactory.getLogger(PseudoAuthenticationHandler.class.getName());

  /**
   * Constant that identifies the authentication mechanism.
   */
  public static final String TYPE = "simple";
  public static final String HOST_WITHE_REGEX = TYPE + ".host_withe_regex";

  public Pattern hostWithePattern;
  /**
   * Constant for the configuration property that indicates if anonymous users are allowed.
   */
  public static final String ANONYMOUS_ALLOWED = TYPE + ".anonymous.allowed";

  private static final Charset UTF8_CHARSET = Charset.forName("UTF-8");

  private static final String PSEUDO_AUTH = "PseudoAuth";

  private boolean acceptAnonymous;
  private String type;

  /**
   * Creates a Hadoop pseudo authentication handler with the default auth-token
   * type, <code>simple</code>.
   */
  public PseudoAuthenticationHandler() {
    this(TYPE);
  }

  /**
   * Creates a Hadoop pseudo authentication handler with a custom auth-token
   * type.
   *
   * @param type auth-token type.
   */
  public PseudoAuthenticationHandler(String type) {
    this.type = type;
  }

  /**
   * Initializes the authentication handler instance.
   * <p>
   * This method is invoked by the {@link AuthenticationFilter#init} method.
   *
   * @param config configuration properties to initialize the handler.
   *
   * @throws ServletException thrown if the handler could not be initialized.
   */
  @Override
  public void init(Properties config) throws ServletException {
    acceptAnonymous = Boolean.parseBoolean(config.getProperty(ANONYMOUS_ALLOWED, "false"));
    String hostWitheRegex = null;
    try {
      hostWitheRegex = config.getProperty(HOST_WITHE_REGEX, getDefaultHostWitheRegex( InetAddress.getLocalHost().getHostName()));
    } catch (UnknownHostException ex) {
      LOG.error("Failed to initialize PseudoAuthenticationHandler handler ", ex);
      throw new ServletException(ex);
    }
    LOG.info("PseudoAuthenticationHandler current host withe regex :" + hostWitheRegex );
    hostWithePattern = Pattern.compile(hostWitheRegex);
  }

  /**
   * Returns if the handler is configured to support anonymous users.
   *
   * @return if the handler is configured to support anonymous users.
   */
  protected boolean getAcceptAnonymous() {
    return acceptAnonymous;
  }

  /**
   * Releases any resources initialized by the authentication handler.
   * <p>
   * This implementation does a NOP.
   */
  @Override
  public void destroy() {
  }

  /**
   * Returns the authentication type of the authentication handler, 'simple'.
   *
   * @return the authentication type of the authentication handler, 'simple'.
   */
  @Override
  public String getType() {
    return type;
  }

  /**
   * This is an empty implementation, it always returns <code>TRUE</code>.
   *
   *
   *
   * @param token the authentication token if any, otherwise <code>NULL</code>.
   * @param request the HTTP client request.
   * @param response the HTTP client response.
   *
   * @return <code>TRUE</code>
   * @throws IOException it is never thrown.
   * @throws AuthenticationException it is never thrown.
   */
  @Override
  public boolean managementOperation(AuthenticationToken token,
                                     HttpServletRequest request,
                                     HttpServletResponse response)
    throws IOException, AuthenticationException {
    return true;
  }

  private String getUserName(HttpServletRequest request) {
    String queryString = request.getQueryString();
    if(queryString == null || queryString.length() == 0) {
      return null;
    }
    List<NameValuePair> list = URLEncodedUtils.parse(queryString, UTF8_CHARSET);
    if (list != null) {
      for (NameValuePair nv : list) {
        if (PseudoAuthenticator.USER_NAME.equals(nv.getName())) {
          return nv.getValue();
        }
      }
    }
    return null;
  }

  /**
   * Authenticates an HTTP client request.
   * <p>
   * It extracts the {@link PseudoAuthenticator#USER_NAME} parameter from the query string and creates
   * an {@link AuthenticationToken} with it.
   * <p>
   * If the HTTP client request does not contain the {@link PseudoAuthenticator#USER_NAME} parameter and
   * the handler is configured to allow anonymous users it returns the {@link AuthenticationToken#ANONYMOUS}
   * token.
   * <p>
   * If the HTTP client request does not contain the {@link PseudoAuthenticator#USER_NAME} parameter and
   * the handler is configured to disallow anonymous users it throws an {@link AuthenticationException}.
   *
   * @param request the HTTP client request.
   * @param response the HTTP client response.
   *
   * @return an authentication token if the HTTP client request is accepted and credentials are valid.
   *
   * @throws IOException thrown if an IO error occurred.
   * @throws AuthenticationException thrown if HTTP client request was not accepted as an authentication request.
   */
  @Override
  public AuthenticationToken authenticate(HttpServletRequest request, HttpServletResponse response)
    throws IOException, AuthenticationException {
    AuthenticationToken token;
    String userName = getUserName(request);
    //尝试使用 Host 白名单匹配，获取 userName
    if(userName == null && !getAcceptAnonymous()){
      // userName = getUserNameByMatchHost(request);
      userName = "xiaojunxiang";
    }
    if (userName == null) {
      if (getAcceptAnonymous()) {
        token = AuthenticationToken.ANONYMOUS;
      } else {
        response.setStatus(HttpServletResponse.SC_FORBIDDEN);
        response.setHeader(WWW_AUTHENTICATE, PSEUDO_AUTH);
        token = null;
      }
    } else {
      token = new AuthenticationToken(userName, userName, getType());
    }
    return token;
  }
  /**
   * 1、根据 request 请求获取对应的 hostname
   * 2、如果 hostname 与白名称规则匹配则将 hostname 作为用户名返回
   * 3、否则返回 null
   * @param request
   * */
  protected String getUserNameByMatchHost(HttpServletRequest request) throws UnknownHostException {
    String remoteIp = request.getRemoteAddr();
    String[] ipArr = remoteIp.split("\\.");
    byte[] ipBytes = new byte[ipArr.length];
    for (int i = 0; i < ipArr.length; i++) {
      int part = Integer.valueOf(ipArr[i]);
      ipBytes[i] = (byte) part;
    }

    String hostName = InetAddress.getByAddress(ipBytes).getHostName();
    if (null != hostName && this.hostWithePattern.matcher(hostName).matches()) {
      return hostName;
    } else {
      return null;
    }
  }


  /**
   * simple 认证默认的白名单规则
   * 1）获取当前服务节点的 hostname 以 '.' 分割
   * 2）分割数组长度大于3，取数组后两位，作为匹配表达式
   * 3）否则取数组最后一位，作为匹配表达式
   */
  protected String getDefaultHostWitheRegex(String hostName) {
    String[] splits = hostName.split("\\.");
    if (splits.length > 3) {
      return "((.*)" + splits[splits.length - 2] + "\\." + splits[splits.length - 1] + "$)|localhost";
    } else {
      return "((.*)" + splits[splits.length - 1] + "$)|localhost";
    }
  }

}
