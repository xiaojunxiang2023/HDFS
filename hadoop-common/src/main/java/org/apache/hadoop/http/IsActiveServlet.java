package org.apache.hadoop.http;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Used by Load Balancers to detect the active NameNode/ResourceManager/Router.
 */
public abstract class IsActiveServlet extends HttpServlet {

  /** Default serial identifier. */
  private static final long serialVersionUID = 1L;

  public static final String SERVLET_NAME = "isActive";
  public static final String PATH_SPEC = "/isActive";

  public static final String RESPONSE_ACTIVE =
      "I am Active!";

  public static final String RESPONSE_NOT_ACTIVE =
      "I am not Active!";

  /**
   * Check whether this instance is the Active one.
   * @param req HTTP request
   * @param resp HTTP response to write to
   */
  @Override
  public void doGet(
      final HttpServletRequest req, final HttpServletResponse resp)
      throws IOException {

    // By default requests are persistent. We don't want long-lived connections
    // on server side.
    resp.addHeader("Connection", "close");

    if (!isActive()) {
      // Report not SC_OK
      resp.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED,
          RESPONSE_NOT_ACTIVE);
      return;
    }
    resp.setStatus(HttpServletResponse.SC_OK);
    resp.getWriter().write(RESPONSE_ACTIVE);
    resp.getWriter().flush();
  }

  /**
   * @return true if this instance is in Active HA state.
   */
  protected abstract boolean isActive();
}
